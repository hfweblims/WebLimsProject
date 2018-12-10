package nc.bs.qcco.commission.ace.bp;

import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.util.mmpub.dpub.gc.GCUpdateBPTemplate;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.SuperVO;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.qcco.commission.CommissionBVO;
import nc.vo.qcco.commission.CommissionRVO;

/**
 * 修改保存的BP
 * 
 */
public class AceCommissionUpdateBP {

	public AggCommissionHVO[] update(AggCommissionHVO[] bills,
			AggCommissionHVO[] originBills) {
		// 调用修改模板
		GCUpdateBPTemplate<AggCommissionHVO> bp = new GCUpdateBPTemplate<AggCommissionHVO>(
				CommissionPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		/*for(AggCommissionHVO aggvo : bills){
			SuperVO[] childrenVO = (SuperVO[]) aggvo.getAllChildrenVO();
			for(SuperVO vo : childrenVO){
				CommissionBVO bvo = (CommissionBVO)vo;
				CommissionRVO[] rvos = (CommissionRVO[]) BeanHelper.getProperty(bvo, "pk_commission_r");
			}
		}*/
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggCommissionHVO> processer) {
		// TODO 后规则
		IRule<AggCommissionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("QC07");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<AggCommissionHVO> processer) {
		// TODO 前规则
		IRule<AggCommissionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		nc.impl.pubapp.pattern.rule.ICompareRule<AggCommissionHVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("QC07");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
	}

}
