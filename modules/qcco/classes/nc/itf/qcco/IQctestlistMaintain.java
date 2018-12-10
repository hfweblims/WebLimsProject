package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qctestlist.AggTestlistHVO;
import nc.vo.pub.BusinessException;

public interface IQctestlistMaintain {

	public void delete(AggTestlistHVO[] vos) throws BusinessException;

	public AggTestlistHVO[] insert(AggTestlistHVO[] vos) throws BusinessException;

	public AggTestlistHVO[] update(AggTestlistHVO[] vos) throws BusinessException;

	public AggTestlistHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}