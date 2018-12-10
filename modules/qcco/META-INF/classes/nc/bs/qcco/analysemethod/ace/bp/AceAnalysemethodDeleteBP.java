package nc.bs.qcco.analysemethod.ace.bp;

import nc.bs.qcco.analysemethod.plugin.bpplugin.AnalysemethodPluginPoint;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceAnalysemethodDeleteBP {

	public void delete(AggAnalyseMethodHVO[] bills) {

		DeleteBPTemplate<AggAnalyseMethodHVO> bp = new DeleteBPTemplate<AggAnalyseMethodHVO>(
				AnalysemethodPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseMethodHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO 后规则

	}
}
