package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.itf.qcco.ICommissionMaintain;

public class N_QC07_SAVEBASE extends AbstractPfAction<AggCommissionHVO> {

	@Override
	protected CompareAroundProcesser<AggCommissionHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCommissionHVO> processor = null;
		AggCommissionHVO[] clientFullVOs = (AggCommissionHVO[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggCommissionHVO>(
					CommissionPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggCommissionHVO>(
					CommissionPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggCommissionHVO> rule = null;

		return processor;
	}

	@Override
	protected AggCommissionHVO[] processBP(Object userObj,
			AggCommissionHVO[] clientFullVOs, AggCommissionHVO[] originBills) {

		AggCommissionHVO[] bills = null;
		try {
			ICommissionMaintain operator = NCLocator.getInstance()
					.lookup(ICommissionMaintain.class);
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
