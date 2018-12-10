package nc.bs.qcco.commission.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceCommissionUnApproveBP {

	public AggCommissionHVO[] unApprove(AggCommissionHVO[] clientBills,
			AggCommissionHVO[] originBills) {
		for (AggCommissionHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggCommissionHVO> update = new BillUpdate<AggCommissionHVO>();
		AggCommissionHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}
}
