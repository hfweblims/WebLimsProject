package nc.bs.pub.wfengine.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.ITimeService;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.ml.NCLangResOnserver;
import nc.bs.pf.pub.PfDataCache;
import nc.bs.pub.pf.IPFClientBizProcessBS;
import nc.bs.pub.pf.IPfBeforeAction;
import nc.bs.pub.pf.PfMessageUtil;
import nc.bs.pub.pf.PfUtilTools;
import nc.bs.pub.pflock.PfBusinessLock;
import nc.bs.pub.pflock.VOConsistenceCheck;
import nc.bs.pub.pflock.VOLockData;
import nc.bs.pub.taskmanager.TaskManagerDMO;
import nc.bs.pub.taskmanager.WfTaskManager;
import nc.bs.pub.workflownote.WorknoteManager;
import nc.bs.wfengine.engine.ActivityInstance;
import nc.bs.wfengine.engine.EngineService;
import nc.bs.wfengine.engine.ProcessInstance;
import nc.bs.wfengine.engine.WfInstancePool;
import nc.bs.wfengine.engine.persistence.EnginePersistence;
import nc.impl.uap.pf.PFConfigImpl;
import nc.impl.uap.pf.WorkflowAdminImpl;
import nc.itf.uap.pf.IPFBusiAction;
import nc.itf.uap.pf.IWorkflowAdmin;
import nc.itf.uap.pf.IWorkflowMachine;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.SQLParameter;
import nc.jdbc.framework.exception.DbException;
import nc.jdbc.framework.processor.BaseProcessor;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.message.attachment.AttachmentReturnExcutor;
import nc.message.vo.AttachmentVO;
import nc.ui.pf.pub.PFClientBizRetObj;
import nc.ui.pub.pf.IPFClientBizProcess;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pf.change.PfUtilBaseTools;
import nc.vo.pf.mobileapp.MobileAppUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.billtype2.Billtype2VO;
import nc.vo.pub.billtype2.ExtendedClassEnum;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.msg.AbstractMsgL10NCallback;
import nc.vo.pub.msg.IMsgL10NCallback;
import nc.vo.pub.pf.AssignableInfo;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.pf.PFClientBizRetVO;
import nc.vo.pub.pf.PfClientBizProcessContext;
import nc.vo.pub.pf.TransitionSelectableInfo;
import nc.vo.pub.pf.workflow.IPFActionName;
import nc.vo.pub.workflownote.WorkflownoteAttVO;
import nc.vo.pub.workflownote.WorkflownoteVO;
import nc.vo.uap.pf.PFBusinessException;
import nc.vo.uap.pf.RetBackWfVo;
import nc.vo.wfengine.core.activity.Activity;
import nc.vo.wfengine.core.parser.XPDLParserException;
import nc.vo.wfengine.core.workflow.WorkflowProcess;
import nc.vo.wfengine.definition.ActivityTypeEnum;
import nc.vo.wfengine.definition.WorkflowTypeEnum;
import nc.vo.wfengine.engine.ExecuteResult;
import nc.vo.wfengine.pub.WFTask;
import nc.vo.wfengine.pub.WfTaskOrInstanceStatus;
import nc.vo.wfengine.pub.WfTaskType;

import org.apache.commons.lang.StringUtils;

/**
 * 工作流引擎服务实现类
 * 
 * @author wzhy 2004-2-21
 * @modifier leijun 2006-4-7 使用动态锁机制不需释放锁了
 * @modifier leijun 2008-8 增加工作流相关处理
 * @modifier leijun 2008-12 根据扩展参数决定是否重新装载VO
 * @modifier guowl 2010-5 6.0不再支持一弃到底的模式
 */
public class WorkflowMachineImpl implements IWorkflowMachine {

	public WorkflowMachineImpl() {
	}

	/**
	 * 是否为触发校验的动作编码
	 * 
	 * @param actionName
	 * @param billType
	 * @return
	 */
	private boolean isCheckAction(String actionName, String billType) {
		if (PfUtilBaseTools.isStartFlowAction(actionName, billType)
				|| PfUtilBaseTools.isSignalFlowAction(actionName, billType))
			return true;
		return false;
	}

	public WorkflownoteVO checkWorkflowActions(String billType,
			String originBillId) throws BusinessException {
		String billid = null;
		try {
			AggregatedValueObject billvo = MobileAppUtil.queryBillEntity(
					billType, originBillId);

			PfParameterVO paraVO = PfUtilBaseTools.getVariableValue(billType,
					IPFActionName.APPROVE, billvo, null, null, null, null,
					new HashMap(), new Hashtable());
			billid = paraVO.m_billVersionPK;
			ActionEnvironment.getInstance().putParaVo(billid, paraVO);

			return new EngineService().checkUnfinishedWorkitem(paraVO,
					WorkflowTypeEnum.Approveflow.getIntValue());
		} catch (Exception e) {
			if (e instanceof BusinessException) {
				throw (BusinessException) e;
			} else {
				throw new BusinessException(e.getMessage(), e);
			}
		} finally {
			ActionEnvironment.getInstance().putParaVo(billid, null);
		}
	}

	public WorkflownoteVO checkWorkFlow(String actionCode, String billType,
			AggregatedValueObject billVO, HashMap hmPfExParams)
			throws BusinessException {
		Logger.init("workflow");
		Logger.debug("*流程检查 EngineService.checkWorkFlow开始");
		Logger.debug("*********************************************");
		Logger.debug("* actionName=" + actionCode);
		Logger.debug("* billType=" + billType);
		Logger.debug("* billEntity=" + billVO);
		Logger.debug("* eParam=" + hmPfExParams);
		Logger.debug("*********************************************");

		long start = System.currentTimeMillis();

		// 先判断动作编码
		if (!isCheckAction(actionCode, billType))
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0000", null,
							new String[] { actionCode })/* 不合法的单据动作编码={0} */);

		PfBusinessLock pfLock = new PfBusinessLock();
		String strBillId = null;
		try {

			if (hmPfExParams != null
					&& hmPfExParams.get(PfUtilBaseTools.PARAM_NOFLOW) != null) {
				// yanke1 2012-9-27 若参数中指定了不走流程
				// 那么直接返回null
				return null;
			}

			// 单据加锁和一致性校验
			// 判定是否需要加锁 leijun+2008-12
			Object paramNoLock = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_NO_LOCK);
			if (paramNoLock == null) {
				pfLock.lock(new VOLockData(billVO, billType),
						new VOConsistenceCheck(billVO, billType));
			}

			// 判定是否需要重新加载VO leijun+2008-12
			Object paramReloadVO = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_RELOAD_VO);
			if (paramReloadVO != null) {
				String billId = billVO.getParentVO().getPrimaryKey();
				billVO = new PFConfigImpl().queryBillDataVO(billType, billId);
				if (billVO == null)
					throw new PFBusinessException(NCLangRes4VoTransl
							.getNCLangRes().getStrByID("pfworkflow",
									"wfMachineImpl-0001", null,
									new String[] { billType, billId })/*
																	 * 根据单据类型{0}和单据
																	 * {
																	 * 1}获取不到单据聚合VO
																	 */);
			}

			// XXX:guowl+2010-5 动作前的业务处理，补全VO
			// 获得bd_billtype.checkclassname注册的业务类实例
			Object checkObj = PfUtilTools.getBizRuleImpl(billType);
			AggregatedValueObject completeVO = billVO;
			if (checkObj instanceof IPfBeforeAction) {
				completeVO = ((IPfBeforeAction) checkObj).beforeAction(billVO,
						null, hmPfExParams);
			}

			Hashtable hashBilltypeToParavo = new Hashtable();
			PfParameterVO paraVO = PfUtilBaseTools.getVariableValue(billType,
					actionCode, completeVO, null, null, null, null,
					hmPfExParams, hashBilltypeToParavo);
			strBillId = paraVO.m_billVersionPK;
			ActionEnvironment.getInstance().putParaVo(strBillId, paraVO);
			// 为流程定义赋值
			Object paramDefPK = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_FLOWPK);
			paraVO.m_flowDefPK = paramDefPK == null ? null : String
					.valueOf(paramDefPK);
			WorkflownoteVO note = null;
			if (PfUtilBaseTools.isSaveAction(actionCode, billType)) {
				// 提交审批流，检查工作项
				note = checkApproveflowWhenSave(paraVO);
				setIsAreadyTracked(paraVO, note);
			} else if (PfUtilBaseTools.isStartAction(actionCode, billType)) {
				// 启动工作流，检查工作项
				note = checkWorkflowWhenStart(paraVO);
				setIsAreadyTracked(paraVO, note);
			} else if (PfUtilBaseTools.isApproveAction(actionCode, billType)) {
				// 审批，检查工作项
				note = new EngineService().checkUnfinishedWorkitem(paraVO,
						WorkflowTypeEnum.Approveflow.getIntValue());
				setIsAreadyTracked(paraVO, note);
			} else if (PfUtilBaseTools.isSignalAction(actionCode, billType)) {
				// 工作流流转，检查工作项
				note = new EngineService().checkUnfinishedWorkitem(paraVO,
						WorkflowTypeEnum.Workflow.getIntValue());
				setIsAreadyTracked(paraVO, note);
			}
			return note;
		} catch (DbException ex) {
			Logger.error(ex.getMessage(), ex);
			throw new PFBusinessException(NCLangResOnserver.getInstance()
					.getStrByID("pfworkflow", "UPPpfworkflow-000004")/*
																	 * 检查工作项时出现数据库异常
																	 * ：
																	 */
					+ ex.getMessage());
		} finally {
			Logger.debug("*流程检查 EngineService.checkWorkFlow结束，耗时"
					+ (System.currentTimeMillis() - start) + "ms");
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(strBillId, null);
			// 释放锁
			if (pfLock != null) {
				pfLock.unLock();
			}
		}
	}

	private void setIsAreadyTracked(PfParameterVO paraVO, WorkflownoteVO note)
			throws BusinessException {
		if (note == null) {
			return;
		}
		String processInsID = note.getTaskInfo() == null ? null : note
				.getTaskInfo().getTask() == null ? null : note.getTaskInfo()
				.getTask().getWfProcessInstancePK();
		if (StringUtils.isNotBlank(processInsID)) {
			IWorkflowAdmin workflowAdmin = NCLocator.getInstance().lookup(
					IWorkflowAdmin.class);
			boolean isTracked = workflowAdmin.isAlreadyTracked(processInsID,
					paraVO.m_operator);
			note.setTrack(isTracked);
		}
	}

	/**
	 * 在动作SAVE 启动审批流时 被调用，查询工作项
	 * 
	 * @param paraVO
	 *            动作执行参数VO
	 * @return 工作流上下文VO
	 * @throws BusinessException
	 */
	private WorkflownoteVO checkApproveflowWhenSave(PfParameterVO paraVO)
			throws BusinessException {
		int status;
		EngineService queryDMO = new EngineService();
		try {
			// 查询单据的五种审批流状态：自由态，提交态，进行中，通过，未通过
			status = queryDMO.queryApproveflowStatus(paraVO.m_billVersionPK,
					paraVO.m_billType);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0002", null,
							new String[] { e.getMessage() })/*
															 * 查询审批流状态出现数据库异常：{0}
															 */);
		}

		if (paraVO.getCustomProperty(PfUtilBaseTools.PARAM_FORCESTART) != null) {
			// 如果指定了FORCESTART参数
			// 那么此处也要强制执行一下
			// 继续往下走
		} else {
			switch (status) {
			case IPfRetCheckInfo.COMMIT:
			case IPfRetCheckInfo.NOSTATE:
			case IPfRetCheckInfo.NOPASS:
				// 继续往下走
				break;

			case IPfRetCheckInfo.GOINGON:
				// 审批进行中,却再次提交,返回空,即不影响流程
				return null;
			default:
				return null;
			}
		}

		return queryApproveflowOnSave(queryDMO, paraVO, status);
	}

	private WorkflownoteVO queryApproveflowOnSave(EngineService queryDMO,
			PfParameterVO paraVo, int status) throws BusinessException {

		try {
			return queryDMO.queryApproveflowOnSave(paraVo, status);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID(
					"pfworkflow", "wfMachineImpl-0003", null,
					new String[] { e.getMessage() })/*
													 * 启动时查询审批流出现数据库异常 ： { 0 }
													 */;
			throw new PFBusinessException(msg, e);
		}

	}

	/**
	 * 在动作START 启动工作流时 被调用，查询工作项
	 * 
	 * @param paraVO
	 * @return
	 * @throws BusinessException
	 * @since 5.5
	 */
	private WorkflownoteVO checkWorkflowWhenStart(PfParameterVO paraVO)
			throws BusinessException {
		int status;
		EngineService queryDMO = new EngineService();
		try {
			// 查询单据的工作流状态：自由态，提交态，进行中，结束（通过）
			status = queryDMO.queryWorkflowStatus(paraVO.m_billVersionPK,
					paraVO.m_billType);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0004", null,
							new String[] { e.getMessage() })/*
															 * 查询工作流状态出现数据库异常：{0}
															 */);
		}

		if (paraVO.getCustomProperty(PfUtilBaseTools.PARAM_FORCESTART) != null) {
			// 如果指派了FORCE_START参数
			// 那么强制启动流程
			// 继续往下走
		} else {
			switch (status) {
			case IPfRetCheckInfo.COMMIT:
			case IPfRetCheckInfo.NOSTATE:
				// 继续往下走
				break;
			case IPfRetCheckInfo.GOINGON:
				// 工作流进行中,却再次启动,返回空,即不影响流程
				return null;
			default:
				return null;
			}
		}

		return queryWorkflowOnSave(queryDMO, paraVO, status);
	}

	private WorkflownoteVO queryWorkflowOnSave(EngineService queryDMO,
			PfParameterVO paraVO, int status) throws BusinessException {
		try {
			return queryDMO.queryWorkflowOnSave(paraVO, status);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);

			String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID(
					"pfworkflow", "wfMachineImpl-0005", null,
					new String[] { e.getMessage() });/*
													 * 启动时查询工作流出现数据库异常 ： { 0 }
													 */
			throw new PFBusinessException(msg, e);
		}
	}

	public RetBackWfVo backCheckFlow(PfParameterVO paraVo)
			throws BusinessException {
		if (PfUtilBaseTools.isUnapproveAction(paraVo.m_actionName,
				paraVo.m_billType))
			// 审批流弃审
			return backWorkflow(paraVo,
					WorkflowTypeEnum.Approveflow.getIntValue());
		else if (PfUtilBaseTools.isRollbackAction(paraVo.m_actionName,
				paraVo.m_billType))
			// 工作流回退
			return backWorkflow(paraVo, WorkflowTypeEnum.Workflow.getIntValue());
		else if (PfUtilBaseTools.isUnSaveAction(paraVo.m_actionName,
				paraVo.m_billType))
			// 审批流收回
			return reCallFlow(paraVo,
					WorkflowTypeEnum.Approveflow.getIntValue());
		else if (PfUtilBaseTools.isRecallAction(paraVo.m_actionName,
				paraVo.m_billType))
			// 工作流取消提交
			return reCallFlow(paraVo, WorkflowTypeEnum.Workflow.getIntValue());
		else
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0006")/* 非法单据动作= */
					+ paraVo.m_actionName);

	}

	/**
	 * 收回、取消提交
	 * 
	 * @param paraVo
	 * @return
	 */
	private RetBackWfVo reCallFlow(PfParameterVO paraVo, int wftype)
			throws BusinessException {
		RetBackWfVo retBackVO = new RetBackWfVo();
		ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
				paraVo);
		try {
			EngineService queryDMO = new EngineService();
			// 只有本人提交的流程才可收回
			ProcessInstance pi = queryDMO.queryProcessInstance(
					paraVo.m_billVersionPK, paraVo.m_billType, wftype);

			if (pi == null) {
				// 判断是否有流程定义
				WorkflowProcess wp = queryDMO.findProcessOfBill(
						paraVo.m_billVersionPK, paraVo.m_billType, wftype);
				if (wp != null)
					throw new PFBusinessException(NCLangRes4VoTransl
							.getNCLangRes().getStrByID("pfworkflow",
									"wfMachineImpl-0007")/* 单据尚未提交，无法取消！ */);
			} else if (!paraVo.m_operator.equals(pi.getBillMaker())
					&& !paraVo.m_operator.equals(pi.getBillCommiter())) {
				throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
						.getStrByID("pfworkflow", "wfMachineImpl-0008")/*
																		 * 只能取消本人提交的单据
																		 * ！
																		 */);
			} else {
				// 查询后续人工活动是否已处理，已处理，则不能收回；
				boolean isFinished = queryDMO.isExistFinishedWorkitem(
						paraVo.m_billVersionPK, paraVo.m_billType, wftype);
				if (isFinished) {
					throw new PFBusinessException(NCLangRes4VoTransl
							.getNCLangRes().getStrByID("pfworkflow",
									"wfMachineImpl-0009")/* 后续活动已经完成，无法取消提交！ */);
				}
			}

			// 终止流程实例，单据变为自由态
			new WorkflowAdminImpl().terminateWorkflow(paraVo, wftype);

			// 任务执行完成后的处理
			// 状态回退为自由态
			retBackVO.setBackState(IPfRetCheckInfo.NOSTATE);
			return retBackVO;
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0010", null,
							new String[] { e.getMessage() })/* 取消提交时发生数据库异常：{0} */);
		} finally {
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
					null);
		}
	}

	/**
	 * ROLLBACK时的工作流回退处理，UNAPPROVE时的审批流弃审处理, 只支持逐级回退
	 * 
	 * @param paraVo
	 * @param i
	 * @return
	 */
	private RetBackWfVo backWorkflow(PfParameterVO paraVo, int wftype)
			throws BusinessException {

		RetBackWfVo retBackVO = new RetBackWfVo();
		ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
				paraVo);
		try {
			EngineService queryDMO = new EngineService();
			// 查询有无 已完成的工作流工作项
			paraVo.m_workFlow = queryDMO.checkFinishedWorkitem(
					paraVo.m_billType, paraVo.m_billVersionPK,
					paraVo.m_operator, wftype);

			// /没有已完成的工作项（也没有未完成的工作流工作项？？，或者有未完成的工作流工作项？？）
			if (paraVo.m_workFlow == null) {
				// 如果没有已完成的工作项，则直接返回
				retBackVO.setIsFinish(UFBoolean.TRUE);
				retBackVO.setBackState(IPfRetCheckInfo.NOSTATE);
				return retBackVO;
			}

			if (wftype == WorkflowTypeEnum.Workflow.getIntValue()) {
				canBackWorkflow(paraVo, wftype);
			}

			// 查流程实例判断是否结束
			boolean isFinished = queryDMO.isFlowFinished(
					paraVo.m_billVersionPK, paraVo.m_billType, wftype);
			if (isFinished) {
				// 当前单据是在流程结束后回退的
				retBackVO.setIsFinish(UFBoolean.TRUE);
			}

			// 执行回退任务
			WFTask currentTask = paraVo.m_workFlow.getTaskInfo().getTask();
			currentTask.setModifyTime(NCLocator.getInstance()
					.lookup(ITimeService.class).getUFDateTime());
			currentTask.setOutObject(paraVo.m_preValueVo);
			currentTask.setOperator(paraVo.m_operator);
			currentTask
					.setStatus(WfTaskOrInstanceStatus.Finished.getIntValue());
			currentTask.setTaskType(WfTaskType.Withdraw.getIntValue());

			WfTaskManager.getInstance().acceptTaskFromBusi(currentTask);

			// 任务执行完成后的处理
			// 查询是否存在一个已处理完成的工作项，如果有表示该流程弃审为"进行中"
			boolean isGoing = queryDMO.isExistFinishedWorkitem(
					paraVo.m_billVersionPK, paraVo.m_billType,
					paraVo.m_workFlow.getWorkflow_type());
			if (isGoing) {
				// 状态回退为进行中
				retBackVO.setBackState(IPfRetCheckInfo.GOINGON);
				retBackVO.setPreCheckMan(paraVo.m_workFlow.getSenderman());
				if (isFinished) {
					// 审批环节多于1个时，最后一个人弃审要通知制单人
					WorknoteManager noteMgr = new WorknoteManager();
					noteMgr.sendMessageToBillMaker(
							new AbstractMsgL10NCallback() {

								@Override
								public String getMessage() {
									// 加入占位符，改为记录多语ID，更具相应多语环境自动翻译
									return "{wfMachineImpl-0011}"/* 流程回退 */;
								}
							}, paraVo);
				}
			} else {
				// 状态回退为提交态
				retBackVO.setBackState(IPfRetCheckInfo.COMMIT);
				WorknoteManager noteMgr = new WorknoteManager();
				noteMgr.sendMessageToBillMaker(new AbstractMsgL10NCallback() {

					@Override
					public String getMessage() {
						// 加入占位符，改为记录多语ID，更具相应多语环境自动翻译
						return "{wfMachineImpl-0011}"/* 流程回退 */;
					}
				}, paraVo);
			}

			return retBackVO;
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0012", null,
							new String[] { e.getMessage() })/* 回退时发生数据库异常：{0} */);
		} finally {
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
					null);
		}
	}

	// /工作流能否回退
	// /工作流回退，要考虑工作流程1：A->B->C->B和工作流程2：A->B->B，假设第一个B已经完成，C已经完成，第二个B代办
	private void canBackWorkflow(PfParameterVO paraVo, int wftype)
			throws BusinessException {
		EngineService queryDMO = new EngineService();
		WorkflownoteVO notFinishedWorkFlow = null;
		try {
			// 查询有无 未完成的工作流工作项
			notFinishedWorkFlow = queryDMO.checkUnfinishedWorkitem(paraVo,
					wftype);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0012", null,
							new String[] { e.getMessage() })/* 回退时发生数据库异常：{0} */);
		} catch (PFBusinessException pfbe) {
		}

		// /工作流回退，有未完成的工作项（没有未完成的工作流工作项？？，或者也有未完成的工作流工作项？？）
		if (notFinishedWorkFlow != null) {
			// 子审批流和子工作审批流，不考虑，子工作流呢？？？？
			if (notFinishedWorkFlow.getWorkflow_type() == WorkflowTypeEnum.SubApproveflow
					.getIntValue()
					|| notFinishedWorkFlow.getWorkflow_type() == WorkflowTypeEnum.SubWorkApproveflow
							.getIntValue()
					|| paraVo.m_workFlow.getWorkflow_type() == WorkflowTypeEnum.SubApproveflow
							.getIntValue()
					|| paraVo.m_workFlow.getWorkflow_type() == WorkflowTypeEnum.SubWorkApproveflow
							.getIntValue())
				return;

			ProcessInstance processInstance = WfInstancePool.getInstance()
					.getProcessInstance(
							notFinishedWorkFlow.getTaskInfo().getTask()
									.getWfProcessInstancePK());
			ActivityInstance activityInstance = processInstance
					.findActivityInstanceByPK(notFinishedWorkFlow.getTaskInfo()
							.getTask().getActivityInstancePK());
			ProcessInstance processInstanceFinished = WfInstancePool
					.getInstance().getProcessInstance(
							paraVo.m_workFlow.getTaskInfo().getTask()
									.getWfProcessInstancePK());
			ActivityInstance activityInstanceFinished = processInstanceFinished
					.findActivityInstanceByPK(paraVo.m_workFlow.getTaskInfo()
							.getTask().getActivityInstancePK());
			Vector srcActivityInstanceGUIDs = activityInstance
					.getSrcActivityInstancePKs();
			boolean back = false;// 没有工作流程2：A->B->B
			for (int i = 0; i < srcActivityInstanceGUIDs.size(); i++) {
				String srcActivityInstanceGUID = (String) srcActivityInstanceGUIDs
						.get(i);
				ActivityInstance actInst = processInstance
						.findActivityInstanceByPK(srcActivityInstanceGUID);
				if (actInst.getActivity().getActivityType() == ActivityTypeEnum.Auto
						.getIntValue()
						|| actInst.getActivity().getActivityType() == ActivityTypeEnum.Route
								.getIntValue()) {
					back = true;
					continue;
				}
				// XXX撤销操作可能导致 ：当前活动实例的来源活动为该活动的已撤销实例？？是不是撤销时活动实例的来源关系设置错误
				if (actInst.getActivityID().equals(
						activityInstance.getActivityID())) {
					back = true;
				}

				if (activityInstanceFinished.getActivityID().equals(
						actInst.getActivityID())) {
					back = true;
				}
			}
			if (!back) {
				throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
						.getStrByID("pfworkflow", "wfMachineImpl-0020")/*
																		 * 当前操作人的工作流工作项未完成
																		 * ，不能回退
																		 */);
			}
		}
	}

	public void deleteCheckFlow(String billType, String billId,
			AggregatedValueObject billVO, String checkMan)
			throws BusinessException {
		int status;
		try {
			// 状态查询
			EngineService es = new EngineService();
			status = es.queryApproveflowStatus(billId, billType);
			// lj@2006-11-3 审批通过后也可把流程实例删除
			switch (status) {
			case IPfRetCheckInfo.NOSTATE:
			case IPfRetCheckInfo.COMMIT:
			case IPfRetCheckInfo.NOPASS:
			case IPfRetCheckInfo.PASSING:
				es.rollbackWorkflow(billId, billType, billVO,
						WorkflowTypeEnum.Approveflow.getIntValue());
				es.deleteWorkflow(billId, billType, false,
						WorkflowTypeEnum.Approveflow.getIntValue());
				break;
			case IPfRetCheckInfo.GOINGON:
				// 删除流程信息
				es.rollbackWorkflow(billId, billType, billVO,
						WorkflowTypeEnum.Approveflow.getIntValue());
				es.deleteWorkflow(billId, billType, false,
						WorkflowTypeEnum.Approveflow.getIntValue());
				// 给所有审批人和制单人发通知消息
				WorknoteManager noteMgr = new WorknoteManager();
				noteMgr.sendAllPersonMessage(new AbstractMsgL10NCallback() {

					@Override
					public String getMessage() {
						return "{UPPpfworkflow-000272}"/*
														 * @res "被删除"
														 */;
					}
				}, null, billId, billType, checkMan);
				break;
			}
		} catch (DbException ex) {
			Logger.error(ex.getMessage(), ex);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0013", null,
							new String[] { ex.getMessage() })/* 删除流程数据出现数据库异常：{0} */);
		}

	}

	public int forwardCheckFlow(PfParameterVO paraVo) throws BusinessException {
		Logger.error("###WorkflowMachineImpl forwardCheckFlow 开始 "
				+ System.currentTimeMillis() + "ms");
		ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
				paraVo);
		WFTask currentTask = paraVo.m_workFlow.getTaskInfo().getTask();
		// 暂时存到ActionEnvironment中
		List<ActivityInstance> lstActIns = null;
		try {
			lstActIns = queryActInsByPrceInsPK(
					currentTask.getWfProcessInstancePK(), new int[] { 0, 1 });
			paraVo.setOldActIns(lstActIns);
		} catch (XPDLParserException e) {
			Logger.error(e.getMessage(), e);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
		}
		// +附件
		// yk1+ 2012-3-8 需求已明确附件不需要发给下游环节
		// currentTask.setAttachmentSetting(getAttachmentOfTask(paraVo.m_workFlow.getPk_wf_task()));

		if (currentTask.getTaskType() == WfTaskType.Backward.getIntValue()) {

			// 1-驳回
			if (paraVo.m_workFlow.getActiontype().endsWith(
					WorkflownoteVO.WORKITEM_ADDAPPROVER_SUFFIX)) {
				throw new PFBusinessException(nc.vo.ml.NCLangRes4VoTransl
						.getNCLangRes().getStrByID("pfworkflow61_0",
								"0pfworkflow61-0087")/* @res "加签的用户无法驳回！" */);
			}
			// 提交态无法驳回

			try {
				int status = new EngineService().queryFlowStatus(
						paraVo.m_billVersionPK, paraVo.m_billType,
						currentTask.getWorkflowType(),
						currentTask.getApproveResult());

				// yanke1 2012-7-18
				// 已跟需求明确过，任何环节都要支持驳回
				// 因此注掉这句判断
				// if(status == IPfRetCheckInfo.COMMIT)
				// throw new
				// PFBusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("pfworkflow61_0","0pfworkflow61-0063")/*@res
				// "流程状态是提交态，驳回无效！"*/);
			} catch (DbException ex) {
				Logger.error(ex.getMessage(), ex);
			}

			// 任务要赋 操作人,修改时间
			currentTask.setModifyTime(NCLocator.getInstance()
					.lookup(ITimeService.class).getUFDateTime());
			currentTask.setOutObject(paraVo.m_preValueVo);
			currentTask.setOperator(paraVo.m_operator);
			currentTask.setNote(paraVo.m_workFlow.getChecknote());
			currentTask
					.setStatus(WfTaskOrInstanceStatus.Finished.getIntValue());
			currentTask.setTaskType(WfTaskType.Backward.getIntValue());

			// FIXME::增加驳回结果?! lj@2005-5-16
			currentTask.setApproveResult("R");
		} else {
			// 3-审批
			// 为任务对象填充 后继活动的参与者指派信息
			fillAssignableInfo(paraVo, currentTask);
			// 为任务对象填充 后继转移的可手工选择信息
			fillTransitionSelectableInfo(paraVo, currentTask);
			// 任务要赋 输出业务数据,操作人,审批结果,修改时间
			currentTask.setOutObject(paraVo.m_preValueVo);
			currentTask.setOperator(paraVo.m_operator);
			if ("Y".equals(paraVo.m_workFlow.getApproveresult())) {
				currentTask.setApproveResult("Y");
			} else {
				currentTask.setApproveResult("N");
			}
			currentTask.setModifyTime(NCLocator.getInstance()
					.lookup(ITimeService.class).getUFDateTime());
			currentTask.setNote(paraVo.m_workFlow.getChecknote());
			currentTask
					.setStatus(WfTaskOrInstanceStatus.Finished.getIntValue());
		}

		// 向引擎发送任务
		Logger.error("###WorkflowMachineImpl call acceptTaskFromBusi 开始 "
				+ System.currentTimeMillis() + "ms");
		WfTaskManager.getInstance().acceptTaskFromBusi(currentTask);
		Logger.error("###WorkflowMachineImpl call forwardCheckFlow 结束 "
				+ System.currentTimeMillis() + "ms");
		// 任务完成后把对应的消息状态置为已处理
		PfMessageUtil.setHandled(paraVo.m_workFlow);

		PfParameterVO tmpparaVo = ActionEnvironment.getInstance().getParaVo(
				paraVo.m_billVersionPK + "@auto");
		if (tmpparaVo == null)
			tmpparaVo = ActionEnvironment.getInstance().getParaVo(
					paraVo.m_billVersionPK);

		// XXX zhouzhenga 引用拷贝，导致paraVO并没有更新
		// 复制前保存原有工作项数据供抄送使用
		WorkflownoteVO curTaskNoteVO = paraVo.m_workFlow;
		// paraVo = tmpparaVo;
		paraVo.m_billType = tmpparaVo.m_billType;
		paraVo.emendEnum = tmpparaVo.emendEnum;
		paraVo.m_actionName = tmpparaVo.m_actionName;
		paraVo.m_autoApproveAfterCommit = tmpparaVo.m_autoApproveAfterCommit;
		paraVo.m_billEntities = tmpparaVo.m_billEntities;
		paraVo.m_billEntity = tmpparaVo.m_billEntity;
		paraVo.m_billId = tmpparaVo.m_billId;
		paraVo.m_billNo = tmpparaVo.m_billNo;
		paraVo.m_billVersionPK = tmpparaVo.m_billVersionPK;
		paraVo.m_businessType = tmpparaVo.m_businessType;
		paraVo.m_flowDefPK = tmpparaVo.m_flowDefPK;
		paraVo.m_makeBillOperator = tmpparaVo.m_makeBillOperator;
		paraVo.m_operator = tmpparaVo.m_operator;
		paraVo.m_pkGroup = tmpparaVo.m_pkGroup;
		paraVo.m_pkOrg = tmpparaVo.m_pkOrg;
		paraVo.m_preValueVo = tmpparaVo.m_preValueVo;
		paraVo.m_preValueVos = tmpparaVo.m_preValueVos;
		paraVo.m_splitValueVos = tmpparaVo.m_splitValueVos;
		paraVo.m_standHeadVo = tmpparaVo.m_standHeadVo;
		paraVo.m_userObj = tmpparaVo.m_userObj;
		paraVo.m_userObjs = tmpparaVo.m_userObjs;
		paraVo.m_workFlow = tmpparaVo.m_workFlow;

		// 根据单据当前流程状态,并进行 无效处理
		int status = -10;
		try {
			EngineService engine = new EngineService();
			int iCurrentWfType = currentTask.getWorkflowType();
			status = engine.queryFlowStatus(paraVo.m_billVersionPK,
					paraVo.m_billType, iCurrentWfType,
					currentTask.getApproveResult());
			if (status == IPfRetCheckInfo.PASSING
					|| status == IPfRetCheckInfo.NOPASS) {
				// 流程结束后将所有未完成的活动实例置为无效
				engine.updateUnfinishedActInstancesToInefficient(
						currentTask.getBillversionPK(),
						currentTask.getBillType(), iCurrentWfType);
			} else if (status == IPfRetCheckInfo.NOSTATE) {
				// 单据回到自由态后将所有活动实例置为无效
				if (!currentTask.isSubmit2RjectTache())
					engine.updateAllActivityInstancesToInefficient(
							currentTask.getBillID(), currentTask.getBillType(),
							iCurrentWfType);
			}

			// XXX:leijun+2010-2 驳回时，也需要回退单据组件
			// if (currentTask.isBackToFirstActivity()) {
			// engine.rollbackWorkflow(paraVo.m_billVersionPK,
			// paraVo.m_billType, paraVo.m_preValueVo, iCurrentWfType);
			// }
			// 拨回到情况处理
			if (currentTask.getTaskType() == WfTaskType.Backward.getIntValue()) {
				engine.rollbackGadgets(paraVo);
			}
			// 发送消息
			WorknoteManager noteMgr = new WorknoteManager();
			IMsgL10NCallback msgStr = null;
			// 处理完成后给相关人发送业务消息（现在主要用于 加签、改派） @2009-06-24 dingxm
			if (!StringUtil.isEmptyWithTrim(paraVo.m_workFlow.getObserver())) {
				String actiontype = paraVo.m_workFlow.getActiontype();
				if (!StringUtil.isEmptyWithTrim(actiontype)) {
					if (actiontype
							.endsWith(WorkflownoteVO.WORKITEM_ADDAPPROVER_SUFFIX)) {
						msgStr = new AbstractMsgL10NCallback() {

							// 加入多语占位符
							@Override
							public String getMessage() {
								return "{wfMachineImpl-0014}"/* 加签工作项已处理 */;
							}
						};
					} else if (actiontype
							.endsWith(WorkflownoteVO.WORKITEM_APPOINT_SUFFIX)) {
						msgStr = new AbstractMsgL10NCallback() {

							// 加入多语占位符
							@Override
							public String getMessage() {
								return "{wfMachineImpl-0015}"/* 改派工作项已处理 */;
							}
						};
					}

					if (msgStr != null) {
						noteMgr.sendMessage(msgStr, paraVo,
								paraVo.m_workFlow.getObserver());
					}
				}
			}

			if (status == IPfRetCheckInfo.PASSING) {
				// 如果审批通过,则给制单人发送非业务消息
				Logger.debug("***流程实例结束之审批通过,则给制单人发送业务消息***");
				final boolean isWorkflow = WorkflowTypeEnum
						.isWorkflowInstance(iCurrentWfType);

				msgStr = new AbstractMsgL10NCallback() {

					@Override
					public String getMessage() {
						return isWorkflow ? "{UPPpfworkflow-000701}"/* "工作流处理完毕" */
						: "{UPPpfworkflow-000273}"/* "审批通过" */;
					}
				};
				noteMgr.sendMessageToBillMaker(msgStr, paraVo);

			} else if (status == IPfRetCheckInfo.NOPASS) {
				// 如果审批不通过,则给参与本次流程的人发送非业务消息
				Logger.debug("***流程实例结束之审批不通过,则给参与本次流程的人发送业务消息***");

				msgStr = new AbstractMsgL10NCallback() {

					@Override
					public String getMessage() {
						return "{UPPpfworkflow-000274}"/* "审批不通过" */;
					}
				};
				noteMgr.sendMessageAfterNoPass(msgStr, paraVo);
			}

			// 2011-7-13 wcj 如果有抄送信息，在此发出
			// yanke1+ 2011-7-14 当前处理人设置流程跟踪
			IWorkflowAdmin wfAdmin = NCLocator.getInstance().lookup(
					IWorkflowAdmin.class);

			// 设置流程跟踪
			boolean isTrack = paraVo.m_workFlow.isTrack();
			wfAdmin.trackWFinstance(paraVo.m_workFlow,
					paraVo.m_workFlow.getCheckman(), isTrack);

			// 发送抄送信息
			Logger.debug("***发抄送信息***");
			String result = currentTask.getApproveResult();
			String title = "";
			if ("Y".equals(result)) {
				title = WorkflowTypeEnum.isWorkflowInstance(iCurrentWfType) ? "{UPPpfworkflow-000701}"/* "工作流处理完毕" */
						: "{UPPpfworkflow-000273}"/* "审批通过" */;
			} else if ("N".equals(result)) {
				title = "{UPPpfworkflow-000274}"/* "审批不通过" */;
			} else if ("R".equals(result)) {
				title = "{UPPpfworkflow-000804}"/* "驳回" */;
			}

			String note = curTaskNoteVO.getChecknote();
			wfAdmin.cpySendByMailAndMsg(curTaskNoteVO, new String[] { title,
					note });

		} catch (DbException ex) {
			Logger.error(ex.getMessage(), ex);
			throw new PFBusinessException(
					NCLangRes4VoTransl.getNCLangRes().getStrByID("pfworkflow",
							"wfMachineImpl-0016", null,
							new String[] { ex.getMessage() })/* 流程流转出现数据库异常：{0} */,
					ex);
		} finally {
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
					null);
			ActionEnvironment.getInstance().putParaVo(
					paraVo.m_billVersionPK + "@auto", null);
		}
		Logger.error("###WorkflowMachineImpl forwardCheckFlow 结束 "
				+ System.currentTimeMillis() + "ms");
		return status;
	}

	private List<AttachmentVO> getAttachmentOfTask(String pk_wf_task)
			throws BusinessException {
		BaseDAO dao = new BaseDAO();
		EnginePersistence persist = new EnginePersistence();

		String sql = null;
		SQLParameter param = null;

		sql = "select pk_wf_instance from pub_wf_task where pk_wf_task=?";
		param = new SQLParameter();
		param.addParam(pk_wf_task);

		String pk_wf_instance = (String) dao.executeQuery(sql, param,
				new ColumnProcessor());

		List<String> instList = new ArrayList<String>();

		while (!StringUtil.isEmptyWithTrim(pk_wf_instance)) {
			instList.add(pk_wf_instance);

			pk_wf_instance = persist
					.findParentProcessInstancePK(pk_wf_instance);
		}

		if (instList.size() == 0) {
			return null;
		}

		param = new SQLParameter();
		param.addParam(WfTaskOrInstanceStatus.Inefficient.getIntValue());
		StringBuffer sb = new StringBuffer();

		for (String pk : instList) {
			sb.append(",?");
			param.addParam(pk);
		}

		sql = "select t.* from pub_workflownote_att t join pub_workflownote n on t.pk_checkflow=n.pk_checkflow join pub_wf_task k on n.pk_wf_task=k.pk_wf_task where n.approvestatus<>? and k.pk_wf_instance in ("
				+ sb.substring(1) + ") order by t.ts desc";

		Collection<WorkflownoteAttVO> col = (Collection<WorkflownoteAttVO>) dao
				.executeQuery(sql, param, new BeanListProcessor(
						WorkflownoteAttVO.class));

		List<AttachmentVO> attList = new ArrayList<AttachmentVO>();

		for (WorkflownoteAttVO noteAttVO : col) {
			AttachmentVO attVO = new AttachmentVO();

			attVO.setPk_file(noteAttVO.getPk_file());
			attVO.setFilename(noteAttVO.getFilename());
			attVO.setFilesize(noteAttVO.getFilesize());

			attList.add(attVO);
		}

		return attList;
	}

	public boolean sendWorkFlowOnSave(PfParameterVO paraVo,
			Hashtable m_methodReturnHas, HashMap hmPfExParams)
			throws BusinessException {
		Logger.debug("BILLNO**********" + paraVo.m_billNo + "**********");
		Logger.debug("BILLID**********" + paraVo.m_billVersionPK + "**********");

		ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
				paraVo);
		ActionEnvironment.getInstance().putMethodReturn(paraVo.m_billVersionPK,
				m_methodReturnHas);
		try {
			boolean isWorkflow = PfUtilBaseTools.isStartAction(
					paraVo.m_actionName, paraVo.m_billType);
			if (!isWorkflow) {
				// 启动审批流
				boolean[] wfRet = startApproveflow(paraVo, hmPfExParams);
				return wfRet[0];
			} else {
				// 启动工作流
				boolean[] wfRet = startWorkflow(paraVo, hmPfExParams);
				return wfRet[0];
			}

		} finally {
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
					null);
			ActionEnvironment.getInstance().putMethodReturn(
					paraVo.m_billVersionPK, null);
		}
	}

	/**
	 * 启动工作流
	 * 
	 * @param paraVo
	 * @param hmPfExParams
	 * @return
	 * @throws BusinessException
	 */
	private boolean[] startWorkflow(PfParameterVO paraVo, HashMap hmPfExParams)
			throws BusinessException {
		Logger.debug("动作编码为" + paraVo.m_actionName + "，启动工作流");

		// 启动时先删除旧流程信息，流程状态为"通过、进行中"的除外
		deleteWhenStartExceptPassOrGoing(paraVo,
				WorkflowTypeEnum.Workflow.getIntValue());

		if (paraVo.m_workFlow == null
				|| paraVo.m_workFlow.getTaskInfo().getTask() == null) {
			// 如果扩展参数中含有流程定义PK，则直接赋值
			Object paramDefPK = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_FLOWPK);
			paraVo.m_flowDefPK = paramDefPK == null ? null : String
					.valueOf(paramDefPK);

			Object noteChecked = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_NOTE_CHECKED);
			// leijun+2009-7 如果前台PfUtilClient.runAction已经检查不出工作项，这里也没有必要再次检查
			if (noteChecked == null)
				paraVo.m_workFlow = checkWorkflowWhenStart(paraVo);
			if (paraVo.m_workFlow == null)
				// 单据的工作流状态处于进行中，已完成
				return new boolean[] { false, false };
		}

		WFTask currentTask = paraVo.m_workFlow.getTaskInfo().getTask();
		// 修正单据号后生成的情况.
		currentTask.setBillNO(paraVo.m_billNo);
		currentTask.setBillID(paraVo.m_billId);
		currentTask.setBillversionPK(paraVo.m_billVersionPK);

		// 为任务对象填充 后继活动的参与者指派信息
		fillAssignableInfo(paraVo, currentTask);
		// 为任务对象填充 后继转移的可手工选择信息
		fillTransitionSelectableInfo(paraVo, currentTask);

		// 任务要赋 输出业务数据,操作人,修改时间
		currentTask.setOutObject(paraVo.m_preValueVo);
		// currentTask.setOperator(paraVo.m_operator);
		currentTask.setOperator(paraVo.m_makeBillOperator); // 制单环节
		currentTask.setModifyTime(NCLocator.getInstance()
				.lookup(ITimeService.class).getUFDateTime());
		currentTask.setStatus(WfTaskOrInstanceStatus.Finished.getIntValue()); // 制单任务已完成

		// 执行任务
		ExecuteResult result = WfTaskManager.getInstance().acceptTaskFromBusi(
				currentTask);
		if (result != null && result.isApprovePass()) {
			// 工作流启动后，随即结束（通过）
			// throw new ApproveAfterCommitException(IPfRetCheckInfo.PASSING,
			// NCLangResOnserver
			// .getInstance().getStrByID("pfworkflow", "UPPpfworkflow-000273")/*
			// 审批通过 */);
			return new boolean[] { true, false };
		} else

			return new boolean[] { true, false };
	}

	/**
	 * 启动时先删除旧流程信息，流程状态为"通过、进行中"的除外 <li>只有自由态，提交态，未通过态，才删除
	 * 
	 * @param paraVo
	 * @param iWorkflowOrApproveflow
	 * @throws BusinessException
	 */
	private void deleteWhenStartExceptPassOrGoing(PfParameterVO paraVo,
			int iWorkflowOrApproveflow) throws BusinessException {
		int status;
		EngineService es = new EngineService();
		try {
			// 查询单据的五种审批流状态：自由态，提交态，进行中，通过，未通过
			status = iWorkflowOrApproveflow == WorkflowTypeEnum.Workflow
					.getIntValue() ? es.queryWorkflowStatus(
					paraVo.m_billVersionPK, paraVo.m_billType) : es
					.queryApproveflowStatus(paraVo.m_billVersionPK,
							paraVo.m_billType);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new PFBusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0017", null,
							new String[] { e.getMessage() })/* 查询流程状态出现数据库异常：{0} */);
		}

		if (paraVo.getCustomProperty(PfUtilBaseTools.PARAM_FORCESTART) != null) {
			// 若参数中指定了forcestart
			// 那么即使在审批完成状态也要删除流程
			// 继续往下走
		} else {
			/*
			 * 启动审批流时，删除旧的审批流信息（但保留审批历史） 1)自由态（驳回或流转到制单环节），重新提交，会走新的审批流定义
			 * 2)提交态、不通过态，重新提交，会走新的审批流定义
			 */
			switch (status) {
			case IPfRetCheckInfo.COMMIT:
			case IPfRetCheckInfo.NOSTATE:
			case IPfRetCheckInfo.NOPASS:
				// 继续往下走
				break;
			default:
				// 返回
				return;
			}
		}

		deleteWorkflow(es, paraVo, iWorkflowOrApproveflow);
	}

	private void deleteWorkflow(EngineService es, PfParameterVO paraVo, int type)
			throws BusinessException {
		try {
			es.rollbackWorkflow(paraVo.m_billVersionPK, paraVo.m_billType,
					paraVo.m_preValueVo, type);
			es.deleteWorkflow(paraVo.m_billVersionPK, paraVo.m_billType, true,
					type);
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);

			String msg = NCLangRes4VoTransl.getNCLangRes().getStrByID(
					"pfworkflow", "wfMachineImpl-0018", null,
					new String[] { e.getMessage() });/* 删除工作流出现数据库异常：{0} */
			throw new PFBusinessException(msg, e);
		}
	}

	/**
	 * 启动审批流
	 * 
	 * @param paraVo
	 * @param hmPfExParams
	 * @return
	 * @throws BusinessException
	 */
	private boolean[] startApproveflow(PfParameterVO paraVo,
			HashMap hmPfExParams) throws BusinessException {
		Logger.debug("动作编码为" + paraVo.m_actionName + "，启动审批流");

		if (paraVo.m_workFlow == null
				|| (paraVo.m_workFlow.getTaskInfo().getTask() != null && StringUtil
						.isEmptyWithTrim(paraVo.m_workFlow.getTaskInfo()
								.getTask().getRejectTacheActivityID())))
			// 启动时先删除旧流程信息，流程状态为"通过、进行中"的除外
			deleteWhenStartExceptPassOrGoing(paraVo,
					WorkflowTypeEnum.Approveflow.getIntValue());

		if (paraVo.m_workFlow == null
				|| paraVo.m_workFlow.getTaskInfo().getTask() == null) {
			// 如果扩展参数中含有流程定义PK，则直接赋值
			Object paramDefPK = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_FLOWPK);
			paraVo.m_flowDefPK = paramDefPK == null ? null : String
					.valueOf(paramDefPK);

			Object noteChecked = hmPfExParams == null ? null : hmPfExParams
					.get(PfUtilBaseTools.PARAM_NOTE_CHECKED);
			// leijun+2009-7 如果前台PfUtilClient.runAction已经检查不出工作项，这里也没有必要再次检查
			if (noteChecked == null)
				paraVo.m_workFlow = checkApproveflowWhenSave(paraVo);
			if (paraVo.m_workFlow == null)
				// 自由态且无可启动的流程定义；审批中、或已通过
				return new boolean[] { false, false };
		}

		WFTask startTask = paraVo.m_workFlow.getTaskInfo().getTask();
		// 修正单据号后生成的情况.
		startTask.setBillNO(paraVo.m_billNo);
		startTask.setBillID(paraVo.m_billId);
		startTask.setBillversionPK(paraVo.m_billVersionPK);

		// 把后继活动的参与者指派信息赋值给任务对象
		fillAssignableInfo(paraVo, startTask);

		// 任务要赋 输出业务数据,操作人,修改时间
		startTask.setOutObject(paraVo.m_preValueVo);

		// yanke1 2013-4-18
		// startTask.setOperator(paraVo.m_operator);
		// 通常task的operator应为当前登录人的pk
		// 但是对于制单活动
		// 我们希望匹配流程、以及后续做上级限定时根据制单人来做
		// 因此这里开一个特例
		// startTask的operator要取制单人
		startTask.setOperator(paraVo.m_makeBillOperator);

		startTask.setModifyTime(NCLocator.getInstance()
				.lookup(ITimeService.class).getUFDateTime());
		startTask.setStatus(WfTaskOrInstanceStatus.Finished.getIntValue()); // 制单任务已完成

		/** 执行任务 */
		ExecuteResult result = WfTaskManager.getInstance().acceptTaskFromBusi(
				startTask);
		if (result != null && result.isApprovePass()) {
			// 提交即审批通过
			return new boolean[] { true, true };
			// xry 2011.6.28 异常方式终止了正常执行流程，而且回滚了事务，导致流程实例信息没有存到数据库
			// throw new ApproveAfterCommitException(IPfRetCheckInfo.PASSING,
			// NCLangResOnserver.getInstance().getStrByID("pfworkflow",
			// "UPPpfworkflow-000273")/* 审批通过 */);
		} else
			return new boolean[] { true, false };
	}

	/**
	 * 把后继活动的参与者指派信息赋值给任务对象
	 * 
	 * @param paraVo
	 * @param currentTask
	 */
	private void fillAssignableInfo(PfParameterVO paraVo, WFTask currentTask) {
		Vector assInfos = paraVo.m_workFlow.getTaskInfo().getAssignableInfos();
		for (int i = 0; i < assInfos.size(); i++) {
			AssignableInfo assInfo = (AssignableInfo) assInfos.get(i);
			currentTask.setAssignNextOperators(
					WFTask.getActAssignID(assInfo.getProcessDefPK(),
							assInfo.getActivityDefId()),
					assInfo.getAssignedOperatorPKs());
		}
	}

	/**
	 * 把后继转移的可手工选择信息赋值给任务对象
	 * 
	 * @param paraVo
	 * @param currentTask
	 */
	private void fillTransitionSelectableInfo(PfParameterVO paraVo,
			WFTask currentTask) {
		Vector tsInfos = paraVo.m_workFlow.getTaskInfo()
				.getTransitionSelectableInfos();
		for (int i = 0; i < tsInfos.size(); i++) {
			TransitionSelectableInfo tsInfo = (TransitionSelectableInfo) tsInfos
					.get(i);
			if (tsInfo.isChoiced()) {
				Vector vec = new Vector();
				vec.add(tsInfo.getTransitionDefId());
				currentTask.setAssignNextTransition(WFTask.getTransAssignID(
						tsInfo.getProcessDefPK(), tsInfo.getTransitionDefId()),
						vec);
			}
		}
	}

	@Override
	public Object processSingleBillFlow_RequiresNew(String actionName,
			String billOrTranstype, WorkflownoteVO workflowVo,
			AggregatedValueObject billvo, Object userObj, HashMap param)
			throws BusinessException {
		try {
			return NCLocator
					.getInstance()
					.lookup(IPFBusiAction.class)
					.processAction(actionName, billOrTranstype, workflowVo,
							billvo, userObj, param);
		} catch (Exception e) {
			throw e;
		} finally {
			new AttachmentReturnExcutor().postProcess();
		}
	}

	@Override
	public boolean[] sendWorkFlowOnSave_RequiresNew(PfParameterVO paraVo,
			Hashtable returnHas, HashMap hmPfExParams) throws BusinessException {
		return sendWorkFlowOnSaveWithFinishJudge(paraVo, returnHas,
				hmPfExParams);
		// Logger.debug("BILLNO**********" + paraVo.m_billNo + "**********");
		// Logger.debug("BILLID**********" + paraVo.m_billVersionPK +
		// "**********");
		//
		// ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
		// paraVo);
		// ActionEnvironment.getInstance().putMethodReturn(paraVo.m_billVersionPK,
		// returnHas);
		// try {
		// boolean isWorkflow = PfUtilBaseTools.isStartAction(
		// paraVo.m_actionName, paraVo.m_billType);
		// if (!isWorkflow)
		// // 启动审批流
		// return startApproveflow(paraVo, hmPfExParams);
		// else
		// // 启动工作流
		// return startWorkflow(paraVo, hmPfExParams);
		//
		// } finally {
		// // XXX::必须移除,否则内存泄漏
		// ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
		// null);
		// ActionEnvironment.getInstance().putMethodReturn(paraVo.m_billVersionPK,
		// null);
		// }
	}

	public RetBackWfVo reCallFlow_RequiresNew(PfParameterVO paraVo, int wftype)
			throws BusinessException {
		Logger.debug("BILLNO**********" + paraVo.m_billNo + "**********");
		Logger.debug("BILLID**********" + paraVo.m_billVersionPK + "**********");

		return reCallFlow(paraVo, wftype);
	}

	public String getBillMaker(String processInstPk) throws BusinessException {
		// FIXME::查询出流程实例的制单人
		EnginePersistence persistenceDmo = new EnginePersistence();
		ProcessInstance instance;
		try {
			instance = persistenceDmo.loadProcessInstance(processInstPk);
			return instance.getBillMaker();
		} catch (DbException e) {
			Logger.error(e.getMessage(), e);
			throw new BusinessException(NCLangRes4VoTransl.getNCLangRes()
					.getStrByID("pfworkflow", "wfMachineImpl-0019")/*
																	 * 获取流程实例的发起人失败！
																	 */);
		}
	}

	@Override
	public String findParentProcessInstancePK(String subProcessInstancePK)
			throws DAOException {
		return new EnginePersistence()
				.findParentProcessInstancePK(subProcessInstancePK);
	}

	@Override
	public boolean[] sendWorkFlowOnSaveWithFinishJudge(PfParameterVO paraVo,
			Hashtable returnHas, HashMap hmPfExParams) throws BusinessException {
		Logger.debug("BILLNO**********" + paraVo.m_billNo + "**********");
		Logger.debug("BILLID**********" + paraVo.m_billVersionPK + "**********");

		ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
				paraVo);
		ActionEnvironment.getInstance().putMethodReturn(paraVo.m_billVersionPK,
				returnHas);
		try {
			boolean isWorkflow = PfUtilBaseTools.isStartAction(
					paraVo.m_actionName, paraVo.m_billType);
			if (!isWorkflow)
				// 启动审批流
				return startApproveflow(paraVo, hmPfExParams);
			else
				// 启动工作流
				return startWorkflow(paraVo, hmPfExParams);

		} finally {
			// XXX::必须移除,否则内存泄漏
			ActionEnvironment.getInstance().putParaVo(paraVo.m_billVersionPK,
					null);
			ActionEnvironment.getInstance().putMethodReturn(
					paraVo.m_billVersionPK, null);
		}
	}

	@Override
	public PFClientBizRetVO executeClientBizProcess(
			AggregatedValueObject billVo, WorkflownoteVO wfVo,
			boolean isMakeBill) throws BusinessException {
		if (wfVo != null && wfVo.getApplicationArgs() != null
				&& wfVo.getApplicationArgs().size() > 0) {
			String billtype = wfVo.getTaskInfo().getTask().getBillType();

			PFClientBizRetVO ret = null;
			Throwable e = null;

			try {
				ret = executeClient(billtype, billVo, wfVo, isMakeBill);

				if (ret != null) {
					return ret;
				}
			} catch (Throwable ex) {
				Logger.error(ex.getMessage(), ex);
				e = ex;
			}

			try {
				Logger.debug("begin execute bs");
				ret = executeBS(billtype, billVo, wfVo, isMakeBill);
				Logger.debug("after execute bs, ret is " + ret);

				if (ret != null) {
					return ret;
				}
			} catch (Exception ex) {
				Logger.error(ex.getMessage(), ex);
				if (ex instanceof BusinessException) {
					throw (BusinessException) ex;
				} else {
					throw new BusinessException(ex.getMessage(), ex);
				}
			}

			// 并不是所有情况下业务组都会实现bs的接口
			// 因此此时应当抛出执行ui接口时的异常，做一个提示
			if (e != null) {
				if (e instanceof BusinessException) {
					throw (BusinessException) e;
				} else {
					throw new BusinessException(e.getMessage(), e);
				}
			}

		}
		Logger.debug("no result for client biz process");
		return null;

	}

	private PFClientBizRetVO executeBS(String billtype,
			AggregatedValueObject billVo, WorkflownoteVO wfVo,
			boolean isMakeBill) throws Exception {
		ArrayList<Billtype2VO> bt2VOs = PfDataCache.getBillType2Info(billtype,
				ExtendedClassEnum.PROC_CLIENT_BS.getIntValue());

		Logger.debug("billtype: " + billtype + " has been registed "
				+ bt2VOs.size() + " IPFClientBizProcessBS implementations");

		// 实例化
		for (Iterator iterator = bt2VOs.iterator(); iterator.hasNext();) {
			Billtype2VO bt2VO = (Billtype2VO) iterator.next();

			Logger.debug("IPFClientBizProcessBS implementation name: "
					+ bt2VO.getClassname());

			Object obj = PfUtilTools.findBizImplOfBilltype(billtype,
					bt2VO.getClassname());
			PfClientBizProcessContext context = new PfClientBizProcessContext();
			context.setBillvo(billVo);
			context.setArgsList(wfVo.getApplicationArgs());
			context.setMakeBill(isMakeBill);
			PFClientBizRetVO retVO = ((IPFClientBizProcessBS) obj)
					.executeBS(context);

			return retVO;
		}

		return null;
	}

	private PFClientBizRetVO executeClient(String billtype,
			AggregatedValueObject billVo, WorkflownoteVO wfVo,
			boolean isMakeBill) throws Exception {
		ArrayList<Billtype2VO> bt2VOs = PfDataCache.getBillType2Info(billtype,
				ExtendedClassEnum.PROC_CLIENT.getIntValue());

		try {
			// 实例化
			for (Iterator iterator = bt2VOs.iterator(); iterator.hasNext();) {
				Billtype2VO bt2VO = (Billtype2VO) iterator.next();

				Object obj = PfUtilTools.findBizImplOfBilltype(billtype,
						bt2VO.getClassname());
				PfClientBizProcessContext context = new PfClientBizProcessContext();
				context.setBillvo(billVo);
				context.setArgsList(wfVo.getApplicationArgs());
				context.setMakeBill(isMakeBill);
				PFClientBizRetObj retObj = ((IPFClientBizProcess) obj).execute(
						null, context);
				PFClientBizRetVO retVO = new PFClientBizRetVO();

				retVO.setShowNoPass(retObj.isShowNoPass());
				retVO.setShowPass(retObj.isShowPass());
				retVO.setShowReject(retObj.isShowReject());
				retVO.setStopFlow(retObj.isStopFlow());
				retVO.setHintMessage(retObj.getHintMessage());

				return retVO;
			}

			return null;
		} catch (Exception e) {
			Logger.error(e.getMessage(), e);
			throw e;
		}
	}

	@Override
	public WFTask getWFTask(String pk_wf_task) throws BusinessException {
		try {
			WFTask task = new TaskManagerDMO().getTaskByPK(pk_wf_task);
			return task;
		} catch (DbException e) {
			throw new BusinessException(e.getMessage(), e);
		}
	}

	@Override
	public WorkflownoteVO checkWorkflowActions(String billType,
			String originBillId, String pk_checkflow) throws BusinessException {
		// TODO Auto-generated method stub
		String billid = null;
		try {
			AggregatedValueObject billvo = MobileAppUtil.queryBillEntity(
					billType, originBillId);

			PfParameterVO paraVO = PfUtilBaseTools.getVariableValue(billType,
					IPFActionName.APPROVE, billvo, null, null, null, null,
					new HashMap(), new Hashtable());
			billid = paraVO.m_billVersionPK;
			ActionEnvironment.getInstance().putParaVo(billid, paraVO);

			return new EngineService().checkUnfinishedWorkitemByPKckeckflow(
					paraVO, WorkflowTypeEnum.Approveflow.getIntValue(),
					pk_checkflow);
		} catch (Exception e) {
			if (e instanceof BusinessException) {
				throw (BusinessException) e;
			} else {
				throw new BusinessException(e.getMessage(), e);
			}
		} finally {
			ActionEnvironment.getInstance().putParaVo(billid, null);
		}
	}

	/**
	 * liningc +20140804
	 * 
	 * @param prceIns
	 * @param states
	 * @return
	 * @throws DbException
	 * @throws XPDLParserException
	 * @throws BusinessException
	 */
	private List<ActivityInstance> queryActInsByPrceInsPK(String prceIns,
			int[] states) throws DbException, XPDLParserException,
			BusinessException {
		PersistenceManager persist = null;
		try {
			persist = PersistenceManager.getInstance();
			JdbcSession jdbc = persist.getJdbcSession();
			String stateIn = "";

			for (int s : states) {
				stateIn = stateIn + "," + s;
			}
			if (stateIn.length() > 0)
				stateIn = stateIn.substring(1);
			SQLParameter para = new SQLParameter();
			String sqlActivityQuery = "select a.activitydefid,a.actstatus,a.createtime,a.modifytime,b.processdefid from pub_wf_actinstance a left join pub_wf_instance b on a.pk_wf_instance=b.pk_wf_instance"
					+ " where a.pk_wf_instance=?";
			para.addParam(prceIns);
			if (!StringUtil.isEmptyWithTrim(stateIn)) {
				sqlActivityQuery += " and a.actstatus in (" + stateIn + ")";
			}
			sqlActivityQuery += " order by a.ts desc";

			List<ActivityInstance> alActInstance = (List<ActivityInstance>) jdbc
					.executeQuery(sqlActivityQuery, para, new BaseProcessor() {
						ArrayList<ActivityInstance> al = new ArrayList<ActivityInstance>();

						@Override
						public Object processResultSet(ResultSet rs)
								throws SQLException {
							while (rs.next()) {
								ActivityInstance ai = new ActivityInstance();
								int index = 1;
								// activitydefid;
								String act_defid = rs.getString(index);
								ai.setActivityID(act_defid == null ? null
										: act_defid.trim());
								// actstatus;
								index++;
								int status = rs.getInt(index);
								ai.setStatus(status);

								// createtime liningc+;
								index++;
								String ct = rs.getString(index);
								UFDateTime createTime = new UFDateTime(ct);
								ai.setCreateTime(createTime);
								// modifytime liningc+;
								index++;
								String mt = rs.getString(index);
								UFDateTime modifyTime = new UFDateTime(mt);
								ai.setModifyTime(modifyTime);

								// processdefid
								index++;
								String wf_defid = rs.getString(index);
								ai.setWfProcessDefPK(wf_defid == null ? null
										: wf_defid.trim());
								al.add(ai);
							}

							return al;
						}
					});

			for (int i = 0; i < alActInstance.size(); i++) {
				ActivityInstance ai = alActInstance.get(i);
				WorkflowProcess wp = PfDataCache.getWorkflowProcess(
						ai.getWfProcessDefPK(), ai.getWfProcessInstancePK());
				Activity act = wp.findActivityByID(ai.getActivityID());
				ai.setActivity(act);
			}

			return alActInstance;
		} finally {
			if (persist != null)
				persist.release();
		}
	}

	public List<WFTask> getWFTasks(List<String> wfTaskpks)
			throws BusinessException {

		List<WFTask> tasks = null;
		try {
			tasks = new TaskManagerDMO().getTaskByPKs(wfTaskpks);
		} catch (DbException e) {
			throw new BusinessException(e.getMessage(), e);
		}

		return tasks;
	}
}