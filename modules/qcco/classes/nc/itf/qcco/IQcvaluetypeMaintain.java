package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;
import nc.vo.pub.BusinessException;

public interface IQcvaluetypeMaintain {

	public void delete(AggValueTypeHVO[] vos) throws BusinessException;

	public AggValueTypeHVO[] insert(AggValueTypeHVO[] vos) throws BusinessException;

	public AggValueTypeHVO[] update(AggValueTypeHVO[] vos) throws BusinessException;

	public AggValueTypeHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}