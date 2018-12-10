package nc.bs.qcco.qctestlist.ace.bp;

import nc.bs.qcco.qctestlist.plugin.bpplugin.QctestlistPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.util.mmpub.dpub.gc.GCInsertBPTemplate;
import nc.vo.qcco.qctestlist.AggTestlistHVO;

/**
 * 标准单据新增BP
 */
public class AceQctestlistInsertBP {

	public AggTestlistHVO[] insert(AggTestlistHVO[] bills) {

		GCInsertBPTemplate<AggTestlistHVO> bp = new GCInsertBPTemplate<AggTestlistHVO>(
				QctestlistPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggTestlistHVO> processor) {
		// TODO 新增后规则
		IRule<AggTestlistHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggTestlistHVO> processer) {
		// TODO 新增前规则
		IRule<AggTestlistHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
