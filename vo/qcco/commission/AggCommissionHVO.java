package nc.vo.qcco.commission;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.commission.CommissionHVO")

public class AggCommissionHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggCommissionHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public CommissionHVO getParentVO(){
	  	return (CommissionHVO)this.getParent();
	  }
	  
}