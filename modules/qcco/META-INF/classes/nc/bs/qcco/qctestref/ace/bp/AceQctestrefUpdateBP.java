package nc.bs.qcco.qctestref.ace.bp;

import nc.bs.qcco.qctestref.plugin.bpplugin.QctestrefPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qctestref.AggTestrefHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQctestrefUpdateBP {

	public AggTestrefHVO[] update(AggTestrefHVO[] bills,
			AggTestrefHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggTestrefHVO> bp = new UpdateBPTemplate<AggTestrefHVO>(
				QctestrefPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggTestrefHVO> processer) {
		// TODO 后规则
		IRule<AggTestrefHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggTestrefHVO> processer) {
		// TODO 前规则
		IRule<AggTestrefHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
