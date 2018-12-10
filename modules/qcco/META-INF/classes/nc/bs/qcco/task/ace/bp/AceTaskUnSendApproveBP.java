package nc.bs.qcco.task.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.qcco.task.AggTaskHVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceTaskUnSendApproveBP {

	public AggTaskHVO[] unSend(AggTaskHVO[] clientBills,
			AggTaskHVO[] originBills) {
		// 把VO持久化到数据库中
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggTaskHVO> update = new BillUpdate<AggTaskHVO>();
		AggTaskHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggTaskHVO[] clientBills) {
		for (AggTaskHVO clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
