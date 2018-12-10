package nc.bs.qcco.qctestlist.ace.bp;

import nc.bs.qcco.qctestlist.plugin.bpplugin.QctestlistPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.qcco.qctestlist.AggTestlistHVO;

/**
 * 修改保存的BP
 * 
 */
public class AceQctestlistUpdateBP {

	public AggTestlistHVO[] update(AggTestlistHVO[] bills,
			AggTestlistHVO[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggTestlistHVO> bp = new UpdateBPTemplate<AggTestlistHVO>(
				QctestlistPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggTestlistHVO> processer) {
		// TODO 后规则
		IRule<AggTestlistHVO> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggTestlistHVO> processer) {
		// TODO 前规则
		IRule<AggTestlistHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
