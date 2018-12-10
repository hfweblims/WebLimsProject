package nc.bs.qcco.qctestref.ace.bp;

import nc.bs.qcco.qctestref.plugin.bpplugin.QctestrefPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qctestref.AggTestrefHVO;

/**
 * 标准单据新增BP
 */
public class AceQctestrefInsertBP {

	public AggTestrefHVO[] insert(AggTestrefHVO[] bills) {

		InsertBPTemplate<AggTestrefHVO> bp = new InsertBPTemplate<AggTestrefHVO>(
				QctestrefPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggTestrefHVO> processor) {
		// TODO 新增后规则
		IRule<AggTestrefHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggTestrefHVO> processer) {
		// TODO 新增前规则
		IRule<AggTestrefHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
