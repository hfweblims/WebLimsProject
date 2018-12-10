package nc.impl.pub.ace;
import nc.bs.qcco.qcmodelno.ace.bp.AceQcmodelnoBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qcmodelno.ModelnoVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQcmodelnoPubServiceImpl extends SmartServiceImpl {
	public ModelnoVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQcmodelnoBP().queryByQueryScheme(querySheme);
	}
}