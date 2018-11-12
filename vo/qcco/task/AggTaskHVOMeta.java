package nc.vo.qcco.task;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggTaskHVOMeta extends AbstractBillMeta{
	
	public AggTaskHVOMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.qcco.task.TaskHVO.class);
		this.addChildren(nc.vo.qcco.task.TaskBVO.class);
	}
}