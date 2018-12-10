package nc.itf.qcco;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;
import nc.vo.pub.BusinessException;

public interface IQcanalyseconditionMaintain {

	public void delete(AggAnalyseConditionHVO[] vos) throws BusinessException;

	public AggAnalyseConditionHVO[] insert(AggAnalyseConditionHVO[] vos) throws BusinessException;

	public AggAnalyseConditionHVO[] update(AggAnalyseConditionHVO[] vos) throws BusinessException;

	public AggAnalyseConditionHVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

}