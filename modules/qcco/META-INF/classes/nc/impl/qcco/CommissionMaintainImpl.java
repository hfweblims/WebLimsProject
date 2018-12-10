package nc.impl.qcco;

import nc.impl.pub.ace.AceCommissionPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.itf.qcco.ICommissionMaintain;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public class CommissionMaintainImpl extends AceCommissionPubServiceImpl
		implements ICommissionMaintain {

	

	/*@Override
	public AggCommissionHVO[] insert(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggCommissionHVO[] update(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}
*/
	@Override
	public AggCommissionHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggCommissionHVO[] save(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCommissionHVO[] unsave(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCommissionHVO[] approve(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCommissionHVO[] unapprove(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggCommissionHVO[] insert(AggCommissionHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos,null);
	}

	@Override
	public void delete(AggCommissionHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
		
	}

	@Override
	public AggCommissionHVO[] update(AggCommissionHVO[] vos)
			throws BusinessException {
		return super.pubupdateBills(vos);
	}

	

	/*@Override
	public void delete(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException {
		// TODO Auto-generated method stub
		
	}*/

	

}
