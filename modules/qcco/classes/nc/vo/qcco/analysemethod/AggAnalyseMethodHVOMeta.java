package nc.vo.qcco.analysemethod;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggAnalyseMethodHVOMeta extends AbstractBillMeta{
	
	public AggAnalyseMethodHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.analysemethod.AnalyseMethodHVO.class);
		this.addChildren(nc.vo.qcco.analysemethod.TestitemBVO.class);
	}
}