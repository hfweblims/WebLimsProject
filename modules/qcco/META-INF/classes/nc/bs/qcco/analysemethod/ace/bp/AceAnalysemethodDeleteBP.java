package nc.bs.qcco.analysemethod.ace.bp;

import nc.bs.qcco.analysemethod.plugin.bpplugin.AnalysemethodPluginPoint;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AceAnalysemethodDeleteBP {

	public void delete(AggAnalyseMethodHVO[] bills) {

		DeleteBPTemplate<AggAnalyseMethodHVO> bp = new DeleteBPTemplate<AggAnalyseMethodHVO>(
				AnalysemethodPluginPoint.DELETE);
		// ����ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ����ִ�к�ҵ�����
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO ǰ����
		IRule<AggAnalyseMethodHVO> rule = null;
		//rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * ɾ����ҵ�����
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggAnalyseMethodHVO> processer) {
		// TODO �����

	}
}