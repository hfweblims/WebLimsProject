package nc.vo.qcco.qcvaluetype;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggValueTypeHVOMeta extends AbstractBillMeta{
	
	public AggValueTypeHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qcvaluetype.ValueTypeHVO.class);
		this.addChildren(nc.vo.qcco.qcvaluetype.ValueListBVO.class);
	}
}