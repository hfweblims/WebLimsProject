package nc.bs.qcco.qctestref.ace.bp;

import nc.bs.qcco.qctestref.plugin.bpplugin.QctestrefPluginPoint;
import nc.vo.qcco.qctestref.AggTestrefHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQctestrefDeleteBP {

	public void delete(AggTestrefHVO[] bills) {

		DeleteBPTemplate<AggTestrefHVO> bp = new DeleteBPTemplate<AggTestrefHVO>(
				QctestrefPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggTestrefHVO> processer) {
		// TODO 前规则
		IRule<AggTestrefHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggTestrefHVO> processer) {
		// TODO 后规则

	}
}
