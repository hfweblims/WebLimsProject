package nc.impl.pub.ace;
import nc.bs.qcco.qcitemvalue.ace.bp.AceQcitemvalueBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qcitemvalue.ItemValueVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQcitemvaluePubServiceImpl extends SmartServiceImpl {
	public ItemValueVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQcitemvalueBP().queryByQueryScheme(querySheme);
	}
}