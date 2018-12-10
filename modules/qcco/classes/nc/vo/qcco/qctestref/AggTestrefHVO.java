package nc.vo.qcco.qctestref;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qctestref.TestrefHVO")

public class AggTestrefHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggTestrefHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public TestrefHVO getParentVO(){
	  	return (TestrefHVO)this.getParent();
	  }
	  
}