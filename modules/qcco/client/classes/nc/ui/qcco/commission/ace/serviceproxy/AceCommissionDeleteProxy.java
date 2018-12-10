package nc.ui.qcco.commission.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.qcco.ICommissionMaintain;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.qcco.commission.AggCommissionHVO;

public class AceCommissionDeleteProxy implements ISingleBillService<AggCommissionHVO>{
	@Override
	public AggCommissionHVO operateBill(AggCommissionHVO bill)
			throws Exception {
		ICommissionMaintain operator = NCLocator.getInstance().lookup(
				ICommissionMaintain.class);
		operator.delete(new AggCommissionHVO[] { bill });
		return bill;
	}
}
