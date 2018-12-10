package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qclistdoc.AggListdocHVO;
import nc.vo.pub.BusinessException;

public interface IQclistdocMaintain {

	public void delete(AggListdocHVO[] vos) throws BusinessException;

	public AggListdocHVO[] insert(AggListdocHVO[] vos) throws BusinessException;

	public AggListdocHVO[] update(AggListdocHVO[] vos) throws BusinessException;

	public AggListdocHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}