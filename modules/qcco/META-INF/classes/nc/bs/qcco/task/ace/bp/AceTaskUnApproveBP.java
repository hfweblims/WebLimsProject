package nc.bs.qcco.task.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.qcco.task.AggTaskHVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceTaskUnApproveBP {

	public AggTaskHVO[] unApprove(AggTaskHVO[] clientBills,
			AggTaskHVO[] originBills) {
		for (AggTaskHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggTaskHVO> update = new BillUpdate<AggTaskHVO>();
		AggTaskHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}
}
