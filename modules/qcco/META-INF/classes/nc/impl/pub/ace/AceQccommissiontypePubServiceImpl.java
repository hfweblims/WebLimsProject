package nc.impl.pub.ace;
import nc.bs.qcco.qccommissiontype.ace.bp.AceQccommissiontypeBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQccommissiontypePubServiceImpl extends SmartServiceImpl {
	public CommissionTypeVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQccommissiontypeBP().queryByQueryScheme(querySheme);
	}
}