package nc.vo.qcco.qcanalyseresult;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggAnalyseResultHVOMeta extends AbstractBillMeta{
	
	public AggAnalyseResultHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.qcanalyseresult.AnalyseResultHVO.class);
		this.addChildren(nc.vo.qcco.qcanalyseresult.Resultdetail.class);
	}
}