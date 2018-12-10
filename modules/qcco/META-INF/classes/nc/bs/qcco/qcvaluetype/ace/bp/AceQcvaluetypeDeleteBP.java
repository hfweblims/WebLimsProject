package nc.bs.qcco.qcvaluetype.ace.bp;

import nc.bs.qcco.qcvaluetype.plugin.bpplugin.QcvaluetypePluginPoint;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQcvaluetypeDeleteBP {

	public void delete(AggValueTypeHVO[] bills) {

		DeleteBPTemplate<AggValueTypeHVO> bp = new DeleteBPTemplate<AggValueTypeHVO>(
				QcvaluetypePluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggValueTypeHVO> processer) {
		// TODO 前规则
		IRule<AggValueTypeHVO> rule = null;
		/*rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);*/
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggValueTypeHVO> processer) {
		// TODO 后规则

	}
}
