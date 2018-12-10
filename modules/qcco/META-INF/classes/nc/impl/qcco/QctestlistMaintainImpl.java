package nc.impl.qcco;

import nc.impl.pub.ace.AceQctestlistPubServiceImpl;
import nc.vo.qcco.qctestlist.AggTestlistHVO;
import nc.itf.qcco.IQctestlistMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QctestlistMaintainImpl extends AceQctestlistPubServiceImpl implements
		IQctestlistMaintain {

	@Override
	public void delete(AggTestlistHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggTestlistHVO[] insert(AggTestlistHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggTestlistHVO[] update(AggTestlistHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggTestlistHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
