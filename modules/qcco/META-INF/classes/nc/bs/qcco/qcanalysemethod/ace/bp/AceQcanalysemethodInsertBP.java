package nc.bs.qcco.qcanalysemethod.ace.bp;

import nc.bs.qcco.qcanalysemethod.plugin.bpplugin.QcanalysemethodPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;

/**
 * 标准单据新增BP
 */
public class AceQcanalysemethodInsertBP {

	public AggAnalyseMethodHVO[] insert(AggAnalyseMethodHVO[] bills) {

		InsertBPTemplate<AggAnalyseMethodHVO> bp = new InsertBPTemplate<AggAnalyseMethodHVO>(
				QcanalysemethodPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseMethodHVO> processor) {
		// TODO 新增后规则
		IRule<AggAnalyseMethodHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO 新增前规则
		IRule<AggAnalyseMethodHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
