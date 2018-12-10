package nc.bs.qcco.qcvaluetype.ace.bp;

import nc.bs.qcco.qcvaluetype.plugin.bpplugin.QcvaluetypePluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQcvaluetypeUpdateBP {

	public AggValueTypeHVO[] update(AggValueTypeHVO[] bills,
			AggValueTypeHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggValueTypeHVO> bp = new UpdateBPTemplate<AggValueTypeHVO>(
				QcvaluetypePluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggValueTypeHVO> processer) {
		// TODO 后规则
		IRule<AggValueTypeHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggValueTypeHVO> processer) {
		// TODO 前规则
		IRule<AggValueTypeHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
