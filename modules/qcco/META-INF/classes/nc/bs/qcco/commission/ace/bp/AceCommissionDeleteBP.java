package nc.bs.qcco.commission.ace.bp;

import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.vo.qcco.commission.AggCommissionHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceCommissionDeleteBP {

	public void delete(AggCommissionHVO[] bills) {

		DeleteBPTemplate<AggCommissionHVO> bp = new DeleteBPTemplate<AggCommissionHVO>(
				CommissionPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggCommissionHVO> processer) {
		// TODO 前规则
		IRule<AggCommissionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggCommissionHVO> processer) {
		// TODO 后规则

	}
}
