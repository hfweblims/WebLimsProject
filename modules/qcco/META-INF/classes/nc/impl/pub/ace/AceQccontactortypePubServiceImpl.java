package nc.impl.pub.ace;
import nc.bs.qcco.qccontactortype.ace.bp.AceQccontactortypeBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQccontactortypePubServiceImpl extends SmartServiceImpl {
	public ContactorTypeVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQccontactortypeBP().queryByQueryScheme(querySheme);
	}
}