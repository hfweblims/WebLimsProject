package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.ApproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.itf.qcco.ICommissionMaintain;

public class N_QC07_APPROVE extends AbstractPfAction<AggCommissionHVO> {

	public N_QC07_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggCommissionHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCommissionHVO> processor = new CompareAroundProcesser<AggCommissionHVO>(
				CommissionPluginPoint.APPROVE);
		processor.addBeforeRule(new ApproveStatusCheckRule());
		return processor;
	}

	@Override
	protected AggCommissionHVO[] processBP(Object userObj,
			AggCommissionHVO[] clientFullVOs, AggCommissionHVO[] originBills) {
		AggCommissionHVO[] bills = null;
		ICommissionMaintain operator = NCLocator.getInstance().lookup(
				ICommissionMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
