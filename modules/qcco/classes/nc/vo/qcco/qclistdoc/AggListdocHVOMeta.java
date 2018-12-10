package nc.vo.qcco.qclistdoc;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggListdocHVOMeta extends AbstractBillMeta{
	
	public AggListdocHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qclistdoc.ListdocHVO.class);
		this.addChildren(nc.vo.qcco.qclistdoc.ListentryBVO.class);
	}
}