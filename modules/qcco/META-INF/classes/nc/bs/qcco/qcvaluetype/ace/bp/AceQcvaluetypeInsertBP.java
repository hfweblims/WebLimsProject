package nc.bs.qcco.qcvaluetype.ace.bp;

import nc.bs.qcco.qcvaluetype.plugin.bpplugin.QcvaluetypePluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;

/**
 * 标准单据新增BP
 */
public class AceQcvaluetypeInsertBP {

	public AggValueTypeHVO[] insert(AggValueTypeHVO[] bills) {

		InsertBPTemplate<AggValueTypeHVO> bp = new InsertBPTemplate<AggValueTypeHVO>(
				QcvaluetypePluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggValueTypeHVO> processor) {
		// TODO 新增后规则
		IRule<AggValueTypeHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggValueTypeHVO> processer) {
		// TODO 新增前规则
		IRule<AggValueTypeHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
