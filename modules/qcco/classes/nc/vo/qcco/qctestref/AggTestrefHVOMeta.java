package nc.vo.qcco.qctestref;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggTestrefHVOMeta extends AbstractBillMeta{
	
	public AggTestrefHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qctestref.TestrefHVO.class);
		this.addChildren(nc.vo.qcco.qctestref.TestrefDetailVO.class);
	}
}