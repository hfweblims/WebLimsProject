package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.itf.qcco.ICommissionMaintain;

public class N_QC07_DELETE extends AbstractPfAction<AggCommissionHVO> {

	@Override
	protected CompareAroundProcesser<AggCommissionHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCommissionHVO> processor = new CompareAroundProcesser<AggCommissionHVO>(
				CommissionPluginPoint.SCRIPT_DELETE);
		// TODO 在此处添加前后规则
		return processor;
	}

	@Override
	protected AggCommissionHVO[] processBP(Object userObj,
			AggCommissionHVO[] clientFullVOs, AggCommissionHVO[] originBills) {
		ICommissionMaintain operator = NCLocator.getInstance().lookup(
				ICommissionMaintain.class);
		try {
			operator.delete(clientFullVOs);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return clientFullVOs;
	}

}
