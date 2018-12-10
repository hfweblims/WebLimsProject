package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;
import nc.vo.pub.BusinessException;

public interface IAnalysemethodMaintain {

	public void delete(AggAnalyseMethodHVO[] vos) throws BusinessException;

	public AggAnalyseMethodHVO[] insert(AggAnalyseMethodHVO[] vos) throws BusinessException;

	public AggAnalyseMethodHVO[] update(AggAnalyseMethodHVO[] vos) throws BusinessException;

	public AggAnalyseMethodHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}