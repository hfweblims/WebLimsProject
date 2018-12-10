package nc.bs.qcco.commission.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceCommissionUnSendApproveBP {

	public AggCommissionHVO[] unSend(AggCommissionHVO[] clientBills,
			AggCommissionHVO[] originBills) {
		// 把VO持久化到数据库中
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggCommissionHVO> update = new BillUpdate<AggCommissionHVO>();
		AggCommissionHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggCommissionHVO[] clientBills) {
		for (AggCommissionHVO clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
