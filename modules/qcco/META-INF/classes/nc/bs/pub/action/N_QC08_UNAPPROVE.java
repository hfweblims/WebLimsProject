package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.task.AggTaskHVO;
import nc.itf.qcco.ITaskMaintain;

public class N_QC08_UNAPPROVE extends AbstractPfAction<AggTaskHVO> {

	@Override
	protected CompareAroundProcesser<AggTaskHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggTaskHVO> processor = new CompareAroundProcesser<AggTaskHVO>(
				TaskPluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
		processor.addBeforeRule(new UnapproveStatusCheckRule());

		return processor;
	}

	@Override
	protected AggTaskHVO[] processBP(Object userObj,
			AggTaskHVO[] clientFullVOs, AggTaskHVO[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggTaskHVO[] bills = null;
		try {
			ITaskMaintain operator = NCLocator.getInstance()
					.lookup(ITaskMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
