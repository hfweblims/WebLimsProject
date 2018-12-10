package nc.vo.qcco.qcanalysecondition;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qcanalysecondition.AnalyseConditionHVO")

public class AggAnalyseConditionHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggAnalyseConditionHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public AnalyseConditionHVO getParentVO(){
	  	return (AnalyseConditionHVO)this.getParent();
	  }
	  
}