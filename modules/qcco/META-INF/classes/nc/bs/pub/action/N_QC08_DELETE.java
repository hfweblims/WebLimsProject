package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.task.AggTaskHVO;
import nc.itf.qcco.ITaskMaintain;

public class N_QC08_DELETE extends AbstractPfAction<AggTaskHVO> {

	@Override
	protected CompareAroundProcesser<AggTaskHVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggTaskHVO> processor = new CompareAroundProcesser<AggTaskHVO>(
				TaskPluginPoint.SCRIPT_DELETE);
		// TODO 在此处添加前后规则
		return processor;
	}

	@Override
	protected AggTaskHVO[] processBP(Object userObj,
			AggTaskHVO[] clientFullVOs, AggTaskHVO[] originBills) {
		ITaskMaintain operator = NCLocator.getInstance().lookup(
				ITaskMaintain.class);
		try {
			operator.delete(clientFullVOs);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return clientFullVOs;
	}

}
