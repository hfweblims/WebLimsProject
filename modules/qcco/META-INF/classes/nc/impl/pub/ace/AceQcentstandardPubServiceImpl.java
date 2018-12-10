package nc.impl.pub.ace;
import nc.bs.qcco.qcentstandard.ace.bp.AceQcentstandardBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qcentstandard.EntstandardVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQcentstandardPubServiceImpl extends SmartServiceImpl {
	public EntstandardVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQcentstandardBP().queryByQueryScheme(querySheme);
	}
}