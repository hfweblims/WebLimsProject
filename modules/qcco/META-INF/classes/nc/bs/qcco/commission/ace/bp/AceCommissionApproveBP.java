package nc.bs.qcco.commission.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.pub.VOStatus;
import nc.vo.qcco.commission.AggCommissionHVO;

/**
 * 标准单据审核的BP
 */
public class AceCommissionApproveBP {

	/**
	 * 审核动作
	 * 
	 * @param vos
	 * @param script
	 * @return
	 */
	public AggCommissionHVO[] approve(AggCommissionHVO[] clientBills,
			AggCommissionHVO[] originBills) {
		for (AggCommissionHVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggCommissionHVO> update = new BillUpdate<AggCommissionHVO>();
		AggCommissionHVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

}
