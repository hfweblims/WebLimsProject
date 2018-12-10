package nc.bs.qcco.qcanalysecondition.ace.bp;

import nc.bs.qcco.qcanalysecondition.plugin.bpplugin.QcanalyseconditionPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQcanalyseconditionUpdateBP {

	public AggAnalyseConditionHVO[] update(AggAnalyseConditionHVO[] bills,
			AggAnalyseConditionHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggAnalyseConditionHVO> bp = new UpdateBPTemplate<AggAnalyseConditionHVO>(
				QcanalyseconditionPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggAnalyseConditionHVO> processer) {
		// TODO 后规则
		IRule<AggAnalyseConditionHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggAnalyseConditionHVO> processer) {
		// TODO 前规则
		IRule<AggAnalyseConditionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
