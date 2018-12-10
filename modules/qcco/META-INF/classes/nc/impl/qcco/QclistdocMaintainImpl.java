package nc.impl.qcco;

import nc.impl.pub.ace.AceQclistdocPubServiceImpl;
import nc.itf.qcco.IQclistdocMaintain;
import nc.vo.qcco.qclistdoc.AggListdocHVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QclistdocMaintainImpl extends AceQclistdocPubServiceImpl implements
		IQclistdocMaintain {

	@Override
	public void delete(AggListdocHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggListdocHVO[] insert(AggListdocHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggListdocHVO[] update(AggListdocHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggListdocHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
