package nc.bs.qcco.qcanalysemethod.ace.bp;

import nc.bs.qcco.qcanalysemethod.plugin.bpplugin.QcanalysemethodPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQcanalysemethodUpdateBP {

	public AggAnalyseMethodHVO[] update(AggAnalyseMethodHVO[] bills,
			AggAnalyseMethodHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggAnalyseMethodHVO> bp = new UpdateBPTemplate<AggAnalyseMethodHVO>(
				QcanalysemethodPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO 后规则
		IRule<AggAnalyseMethodHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseMethodHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
