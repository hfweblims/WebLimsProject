package nc.bs.qcco.qclistdoc.ace.bp;

import nc.bs.qcco.qclistdoc.plugin.bpplugin.QclistdocPluginPoint;
import nc.vo.qcco.qclistdoc.AggListdocHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceQclistdocDeleteBP {

	public void delete(AggListdocHVO[] bills) {

		DeleteBPTemplate<AggListdocHVO> bp = new DeleteBPTemplate<AggListdocHVO>(
				QclistdocPluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggListdocHVO> processer) {
		// TODO 前规则
		IRule<AggListdocHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggListdocHVO> processer) {
		// TODO 后规则

	}
}
