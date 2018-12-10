package nc.vo.qcco.qcvaluetype;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qcvaluetype.ValueTypeHVO")

public class AggValueTypeHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggValueTypeHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public ValueTypeHVO getParentVO(){
	  	return (ValueTypeHVO)this.getParent();
	  }
	  
}