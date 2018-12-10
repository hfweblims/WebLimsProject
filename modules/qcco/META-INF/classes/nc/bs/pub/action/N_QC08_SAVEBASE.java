package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.task.AggTaskHVO;
import nc.itf.qcco.ITaskMaintain;

public class N_QC08_SAVEBASE extends AbstractPfAction<AggTaskHVO> {

	@Override
	protected CompareAroundProcesser<AggTaskHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggTaskHVO> processor = null;
		AggTaskHVO[] clientFullVOs = (AggTaskHVO[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggTaskHVO>(
					TaskPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggTaskHVO>(
					TaskPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggTaskHVO> rule = null;

		return processor;
	}

	@Override
	protected AggTaskHVO[] processBP(Object userObj,
			AggTaskHVO[] clientFullVOs, AggTaskHVO[] originBills) {

		AggTaskHVO[] bills = null;
		try {
			ITaskMaintain operator = NCLocator.getInstance()
					.lookup(ITaskMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs);
			} else {
				bills = operator.insert(clientFullVOs);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
