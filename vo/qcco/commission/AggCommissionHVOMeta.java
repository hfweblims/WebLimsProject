package nc.vo.qcco.commission;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCommissionHVOMeta extends AbstractBillMeta{
	
	public AggCommissionHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.commission.CommissionHVO.class);
		this.addChildren(nc.vo.qcco.commission.CommissionBVO.class);
	}
}