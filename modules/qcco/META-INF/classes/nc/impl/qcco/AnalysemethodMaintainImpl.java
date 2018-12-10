package nc.impl.qcco;

import nc.impl.pub.ace.AceAnalysemethodPubServiceImpl;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;
import nc.itf.qcco.IAnalysemethodMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class AnalysemethodMaintainImpl extends AceAnalysemethodPubServiceImpl implements
		IAnalysemethodMaintain {

	@Override
	public void delete(AggAnalyseMethodHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggAnalyseMethodHVO[] insert(AggAnalyseMethodHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggAnalyseMethodHVO[] update(AggAnalyseMethodHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggAnalyseMethodHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
