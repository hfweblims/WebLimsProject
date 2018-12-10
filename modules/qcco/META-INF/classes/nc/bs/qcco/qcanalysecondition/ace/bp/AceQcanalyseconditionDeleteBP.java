package nc.bs.qcco.qcanalysecondition.ace.bp;

import nc.bs.qcco.qcanalysecondition.plugin.bpplugin.QcanalyseconditionPluginPoint;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQcanalyseconditionDeleteBP {

	public void delete(AggAnalyseConditionHVO[] bills) {

		DeleteBPTemplate<AggAnalyseConditionHVO> bp = new DeleteBPTemplate<AggAnalyseConditionHVO>(
				QcanalyseconditionPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggAnalyseConditionHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseConditionHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseConditionHVO> processer) {
		// TODO 后规则

	}
}
