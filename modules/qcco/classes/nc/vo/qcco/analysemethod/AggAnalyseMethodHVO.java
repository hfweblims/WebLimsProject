package nc.vo.qcco.analysemethod;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.analysemethod.AnalyseMethodHVO")

public class AggAnalyseMethodHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggAnalyseMethodHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public AnalyseMethodHVO getParentVO(){
	  	return (AnalyseMethodHVO)this.getParent();
	  }
	  
}