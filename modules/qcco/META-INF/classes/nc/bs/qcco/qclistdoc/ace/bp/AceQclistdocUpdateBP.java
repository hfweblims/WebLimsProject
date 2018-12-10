package nc.bs.qcco.qclistdoc.ace.bp;

import nc.bs.qcco.qclistdoc.plugin.bpplugin.QclistdocPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qclistdoc.AggListdocHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQclistdocUpdateBP {

	public AggListdocHVO[] update(AggListdocHVO[] bills,
			AggListdocHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggListdocHVO> bp = new UpdateBPTemplate<AggListdocHVO>(
				QclistdocPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggListdocHVO> processer) {
		// TODO 后规则
		IRule<AggListdocHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggListdocHVO> processer) {
		// TODO 前规则
		IRule<AggListdocHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
