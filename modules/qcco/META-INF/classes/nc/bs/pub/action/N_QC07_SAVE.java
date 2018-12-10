package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.CommitStatusCheckRule;
import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.itf.qcco.ICommissionMaintain;

public class N_QC07_SAVE extends AbstractPfAction<AggCommissionHVO> {

	protected CompareAroundProcesser<AggCommissionHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCommissionHVO> processor = new CompareAroundProcesser<AggCommissionHVO>(
				CommissionPluginPoint.SEND_APPROVE);
		// TODO 在此处添加审核前后规则
		IRule<AggCommissionHVO> rule = new CommitStatusCheckRule();
		processor.addBeforeRule(rule);
		return processor;
	}

	@Override
	protected AggCommissionHVO[] processBP(Object userObj,
			AggCommissionHVO[] clientFullVOs, AggCommissionHVO[] originBills) {
		ICommissionMaintain operator = NCLocator.getInstance().lookup(
				ICommissionMaintain.class);
		AggCommissionHVO[] bills = null;
		try {
			bills = operator.save(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
