package nc.bs.qcco.qclistdoc.ace.bp;

import nc.bs.qcco.qclistdoc.plugin.bpplugin.QclistdocPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qclistdoc.AggListdocHVO;

/**
 * 标准单据新增BP
 */
public class AceQclistdocInsertBP {

	public AggListdocHVO[] insert(AggListdocHVO[] bills) {

		InsertBPTemplate<AggListdocHVO> bp = new InsertBPTemplate<AggListdocHVO>(
				QclistdocPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggListdocHVO> processor) {
		// TODO 新增后规则
		IRule<AggListdocHVO> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggListdocHVO> processer) {
		// TODO 新增前规则
		IRule<AggListdocHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
