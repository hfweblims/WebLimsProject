package nc.vo.qcco.qcanalyseresult;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qcanalyseresult.AnalyseResultHVO")

public class AggAnalyseResultHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggAnalyseResultHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public AnalyseResultHVO getParentVO(){
	  	return (AnalyseResultHVO)this.getParent();
	  }
	  
}