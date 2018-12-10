package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;
import nc.vo.pub.BusinessException;
import nc.vo.uif2.LoginContext;

public interface IQcanalyseresultMaintain {

	public void delete(AggAnalyseResultHVO[] vos) throws BusinessException;

	public AggAnalyseResultHVO[] insert(AggAnalyseResultHVO[] vos) throws BusinessException;

	public AggAnalyseResultHVO[] update(AggAnalyseResultHVO[] vos) throws BusinessException;

	public AggAnalyseResultHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;
	public AggAnalyseResultHVO[] queryByCondition(LoginContext context, String condition) throws BusinessException;
}