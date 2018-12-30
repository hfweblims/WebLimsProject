package nc.bs.qcco.commission.ace.bp;

import nc.bs.qcco.commission.plugin.bpplugin.CommissionPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.util.mmpub.dpub.gc.GCInsertBPTemplate;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.SuperVO;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.qcco.commission.CommissionBVO;
import nc.vo.qcco.commission.CommissionRVO;

/**
 * 标准单据新增BP
 */
public class AceCommissionInsertBP {

	public AggCommissionHVO[] insert(AggCommissionHVO[] bills) {

		GCInsertBPTemplate<AggCommissionHVO> bp = new GCInsertBPTemplate<AggCommissionHVO>(
				CommissionPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		/*for(AggCommissionHVO aggvo : bills){
			SuperVO[] childrenVO = (SuperVO[]) aggvo.getAllChildrenVO();
			for(SuperVO vo : childrenVO){
				CommissionBVO bvo = (CommissionBVO)vo;
				CommissionRVO[] rvos = (CommissionRVO[]) BeanHelper.getProperty(bvo, "pk_commission_r");
			}
		}*/
		
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggCommissionHVO> processor) {
		// TODO 新增后规则
		IRule<AggCommissionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("QC07");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
		processor.addAfterRule(rule);
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggCommissionHVO> processer) {
		// TODO 新增前规则
		IRule<AggCommissionHVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("QC07");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
		processer.addBeforeRule(rule);
	}
}
