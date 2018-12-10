package nc.bs.qcco.qcanalyseresult.ace.bp;

import nc.bs.qcco.qcanalyseresult.plugin.bpplugin.QcanalyseresultPluginPoint;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQcanalyseresultDeleteBP {

	public void delete(AggAnalyseResultHVO[] bills) {

		DeleteBPTemplate<AggAnalyseResultHVO> bp = new DeleteBPTemplate<AggAnalyseResultHVO>(
				QcanalyseresultPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggAnalyseResultHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseResultHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseResultHVO> processer) {
		// TODO 后规则

	}
}
