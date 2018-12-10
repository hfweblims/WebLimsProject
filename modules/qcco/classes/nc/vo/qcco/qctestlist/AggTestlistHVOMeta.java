package nc.vo.qcco.qctestlist;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggTestlistHVOMeta extends AbstractBillMeta{
	
	public AggTestlistHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qctestlist.TestlistHVO.class);
		this.addChildren(nc.vo.qcco.qctestlist.TestlistcompBVO.class);
	}
}