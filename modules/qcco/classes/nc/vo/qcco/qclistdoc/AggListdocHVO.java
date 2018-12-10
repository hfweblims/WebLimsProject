package nc.vo.qcco.qclistdoc;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.qclistdoc.ListdocHVO")

public class AggListdocHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggListdocHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public ListdocHVO getParentVO(){
	  	return (ListdocHVO)this.getParent();
	  }
	  
}