package nc.vo.qcco.qcanalysecondition;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggAnalyseConditionHVOMeta extends AbstractBillMeta{
	
	public AggAnalyseConditionHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qcanalysecondition.AnalyseConditionHVO.class);
		this.addChildren(nc.vo.qcco.qcanalysecondition.ConditionDetailBVO.class);
	}
}