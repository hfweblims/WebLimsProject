package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.qcco.qctestlist.AggTestlistHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public interface ICommissionMaintain {

	/*public void delete(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] insert(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] update(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;
*/
	public AggCommissionHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

	public AggCommissionHVO[] save(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] unsave(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] approve(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] unapprove(AggCommissionHVO[] clientFullVOs,
			AggCommissionHVO[] originBills) throws BusinessException;

	public AggCommissionHVO[] insert(AggCommissionHVO[] vos) throws BusinessException;

	public void delete(AggCommissionHVO[] aggCommissionHVOs) throws BusinessException;

	public AggCommissionHVO[] update(AggCommissionHVO[] vos) throws BusinessException;

	
}
