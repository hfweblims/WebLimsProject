package nc.vo.qcco.qctestlist;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qctestlist.TestlistHVO")

public class AggTestlistHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggTestlistHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public TestlistHVO getParentVO(){
	  	return (TestlistHVO)this.getParent();
	  }
	  
}