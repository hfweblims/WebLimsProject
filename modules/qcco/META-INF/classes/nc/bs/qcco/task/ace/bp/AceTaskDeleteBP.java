package nc.bs.qcco.task.ace.bp;

import nc.bs.qcco.task.plugin.bpplugin.TaskPluginPoint;
import nc.vo.qcco.task.AggTaskHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceTaskDeleteBP {

	public void delete(AggTaskHVO[] bills) {

		DeleteBPTemplate<AggTaskHVO> bp = new DeleteBPTemplate<AggTaskHVO>(
				TaskPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggTaskHVO> processer) {
		// TODO 前规则
		IRule<AggTaskHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggTaskHVO> processer) {
		// TODO 后规则

	}
}
