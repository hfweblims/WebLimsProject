package nc.impl.pub.ace;
import nc.bs.qcco.qctestemperature.ace.bp.AceQctestemperatureBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qctestemperature.TestemperatureVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQctestemperaturePubServiceImpl extends SmartServiceImpl {
	public TestemperatureVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQctestemperatureBP().queryByQueryScheme(querySheme);
	}
}