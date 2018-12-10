package nc.bs.qcco.qcanalysecondition.ace.bp;

import nc.bs.qcco.qcanalysecondition.plugin.bpplugin.QcanalyseconditionPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;

/**
 * 标准单据新增BP
 */
public class AceQcanalyseconditionInsertBP {

	public AggAnalyseConditionHVO[] insert(AggAnalyseConditionHVO[] bills) {

		InsertBPTemplate<AggAnalyseConditionHVO> bp = new InsertBPTemplate<AggAnalyseConditionHVO>(
				QcanalyseconditionPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseConditionHVO> processor) {
		// TODO 新增后规则
		IRule<AggAnalyseConditionHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggAnalyseConditionHVO> processer) {
		// TODO 新增前规则
		IRule<AggAnalyseConditionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
