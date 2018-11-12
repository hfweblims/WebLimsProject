package nc.vo.qcco.task;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcco.task.TaskHVO")

public class AggTaskHVO extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggTaskHVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public TaskHVO getParentVO(){
	  	return (TaskHVO)this.getParent();
	  }
	  
}