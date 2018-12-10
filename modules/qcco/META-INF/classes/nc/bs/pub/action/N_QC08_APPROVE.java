package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.itf.qcco.ITaskMaintain;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.task.AggTaskHVO;

public class N_QC08_APPROVE extends AbstractPfAction<AggTaskHVO> {

	public N_QC08_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggTaskHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggTaskHVO> processor = new CompareAroundProcesser<AggTaskHVO>(
				TaskPluginPoint.APPROVE);
		processor.addBeforeRule(new ApproveStatusCheckRule());
		return processor;
	}

	@Override
	protected AggTaskHVO[] processBP(Object userObj,
			AggTaskHVO[] clientFullVOs, AggTaskHVO[] originBills) {
		AggTaskHVO[] bills = null;
		ITaskMaintain operator = NCLocator.getInstance().lookup(
				ITaskMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
