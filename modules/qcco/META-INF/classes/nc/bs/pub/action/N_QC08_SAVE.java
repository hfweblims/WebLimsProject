package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.task.AggTaskHVO;
import nc.itf.qcco.ITaskMaintain;

public class N_QC08_SAVE extends AbstractPfAction<AggTaskHVO> {

	protected CompareAroundProcesser<AggTaskHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggTaskHVO> processor = new CompareAroundProcesser<AggTaskHVO>(
				TaskPluginPoint.SEND_APPROVE);
		// TODO 在此处添加审核前后规则
		IRule<AggTaskHVO> rule = new CommitStatusCheckRule();
		processor.addBeforeRule(rule);
		return processor;
	}

	@Override
	protected AggTaskHVO[] processBP(Object userObj,
			AggTaskHVO[] clientFullVOs, AggTaskHVO[] originBills) {
		ITaskMaintain operator = NCLocator.getInstance().lookup(
				ITaskMaintain.class);
		AggTaskHVO[] bills = null;
		try {
			bills = operator.save(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
