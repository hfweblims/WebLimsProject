package nc.impl.qcco;

import nc.impl.pub.ace.AceTaskPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.task.AggTaskHVO;
import nc.itf.qcco.ITaskMaintain;
import nc.vo.pub.BusinessException;

public class TaskMaintainImpl extends AceTaskPubServiceImpl
		implements ITaskMaintain {

	/*@Override
	public void delete(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggTaskHVO[] insert(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggTaskHVO[] update(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}*/
	@Override
	public AggTaskHVO[] insert(AggTaskHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos,null);
	}

	@Override
	public void delete(AggTaskHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
		
	}

	@Override
	public AggTaskHVO[] update(AggTaskHVO[] vos)
			throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggTaskHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggTaskHVO[] save(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggTaskHVO[] unsave(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggTaskHVO[] approve(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggTaskHVO[] unapprove(AggTaskHVO[] clientFullVOs,
			AggTaskHVO[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

}
