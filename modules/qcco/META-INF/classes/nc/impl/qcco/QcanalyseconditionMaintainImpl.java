package nc.impl.qcco;

import nc.impl.pub.ace.AceQcanalyseconditionPubServiceImpl;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;
import nc.itf.qcco.IQcanalyseconditionMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QcanalyseconditionMaintainImpl extends AceQcanalyseconditionPubServiceImpl implements
		IQcanalyseconditionMaintain {

	@Override
	public void delete(AggAnalyseConditionHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggAnalyseConditionHVO[] insert(AggAnalyseConditionHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggAnalyseConditionHVO[] update(AggAnalyseConditionHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggAnalyseConditionHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
