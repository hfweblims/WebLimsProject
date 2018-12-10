package nc.impl.qcco;

import nc.hr.frame.persistence.SimpleDocServiceTemplate;
import nc.impl.pub.ace.AceQcanalyseresultPubServiceImpl;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;
import nc.vo.uif2.LoginContext;
import nc.itf.qcco.IQcanalyseresultMaintain;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;

public class QcanalyseresultMaintainImpl extends AceQcanalyseresultPubServiceImpl implements
		IQcanalyseresultMaintain {
	private SimpleDocServiceTemplate serviceTemplate;
	public static final String DOC_NAME = "4b8322b6-8f2e-4727-867b-5664373fd6a0";// 元数据md_class的id
	public SimpleDocServiceTemplate getServiceTemplate() {
		if (serviceTemplate == null) {
			serviceTemplate = new SimpleDocServiceTemplate(DOC_NAME);
		}
		return serviceTemplate;

	}
	@Override
	public void delete(AggAnalyseResultHVO[] vos) throws BusinessException {
		super.pubdeleteBills(vos);
	}

	@Override
	public AggAnalyseResultHVO[] insert(AggAnalyseResultHVO[] vos) throws BusinessException {
		return super.pubinsertBills(vos);
	}

	@Override
	public AggAnalyseResultHVO[] update(AggAnalyseResultHVO[] vos) throws BusinessException {
		return super.pubupdateBills(vos);
	}

	@Override
	public AggAnalyseResultHVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggAnalyseResultHVO[] queryByCondition(LoginContext context,
			String condition) throws BusinessException {
		return getServiceTemplate().queryByContextAndCondWithOrder(context, AggAnalyseResultHVO.class, condition,
				new String[] { "pk_org", "pk_psndoc", "begindate" });
	}

}
