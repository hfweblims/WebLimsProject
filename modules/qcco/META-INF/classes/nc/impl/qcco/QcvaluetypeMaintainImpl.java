package nc.impl.qcco;

import nc.impl.pub.ace.AceQcvaluetypePubServiceImpl;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;
import nc.itf.qcco.IQcvaluetypeMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QcvaluetypeMaintainImpl extends AceQcvaluetypePubServiceImpl implements
		IQcvaluetypeMaintain {

	@Override
	public void delete(AggValueTypeHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggValueTypeHVO[] insert(AggValueTypeHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggValueTypeHVO[] update(AggValueTypeHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggValueTypeHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

}
