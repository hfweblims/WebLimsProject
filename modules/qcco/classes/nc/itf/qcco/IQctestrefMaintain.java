package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qctestref.AggTestrefHVO;
import nc.vo.pub.BusinessException;

public interface IQctestrefMaintain {

	public void delete(AggTestrefHVO[] vos) throws BusinessException;

	public AggTestrefHVO[] insert(AggTestrefHVO[] vos) throws BusinessException;

	public AggTestrefHVO[] update(AggTestrefHVO[] vos) throws BusinessException;

	public AggTestrefHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}