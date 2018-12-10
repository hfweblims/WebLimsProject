package nc.ui.qcco.qctestlist.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.qcco.IQctestlistMaintain;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.qcco.qctestlist.AggTestlistHVO;

public class AceQctestlistDeleteProxy implements ISingleBillService<AggTestlistHVO>{
	@Override
	public AggTestlistHVO operateBill(AggTestlistHVO bill)
			throws Exception {
		IQctestlistMaintain operator = NCLocator.getInstance().lookup(
				IQctestlistMaintain.class);
		operator.delete(new AggTestlistHVO[] { bill });
		return bill;
	}

}
