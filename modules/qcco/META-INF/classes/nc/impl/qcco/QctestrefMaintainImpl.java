package nc.impl.qcco;

import nc.impl.pub.ace.AceQctestrefPubServiceImpl;
import nc.vo.qcco.qctestref.AggTestrefHVO;
import nc.itf.qcco.IQctestrefMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QctestrefMaintainImpl extends AceQctestrefPubServiceImpl implements
		IQctestrefMaintain {

	@Override
	public void delete(AggTestrefHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggTestrefHVO[] insert(AggTestrefHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggTestrefHVO[] update(AggTestrefHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggTestrefHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
