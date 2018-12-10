package nc.bs.qcco.qcanalyseresult.ace.bp;

import nc.bs.qcco.qcanalyseresult.plugin.bpplugin.QcanalyseresultPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQcanalyseresultUpdateBP {

	public AggAnalyseResultHVO[] update(AggAnalyseResultHVO[] bills,
			AggAnalyseResultHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggAnalyseResultHVO> bp = new UpdateBPTemplate<AggAnalyseResultHVO>(
				QcanalyseresultPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggAnalyseResultHVO> processer) {
		// TODO 后规则
		IRule<AggAnalyseResultHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggAnalyseResultHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseResultHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
