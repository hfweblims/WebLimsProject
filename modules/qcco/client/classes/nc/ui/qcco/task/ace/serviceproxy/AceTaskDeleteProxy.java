package nc.ui.qcco.task.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.qcco.ITaskMaintain;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.qcco.task.AggTaskHVO;

public class AceTaskDeleteProxy implements ISingleBillService<AggTaskHVO>{
	@Override
	public AggTaskHVO operateBill(AggTaskHVO bill)
			throws Exception {
		ITaskMaintain operator = NCLocator.getInstance().lookup(
				ITaskMaintain.class);
		operator.delete(new AggTaskHVO[] { bill });
		return bill;
	}
}
