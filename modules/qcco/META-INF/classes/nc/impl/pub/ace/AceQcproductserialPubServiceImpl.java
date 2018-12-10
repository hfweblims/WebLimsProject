package nc.impl.pub.ace;
import nc.bs.qcco.qcproductserial.ace.bp.AceQcproductserialBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qcproductserial.ProductSerialVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQcproductserialPubServiceImpl extends SmartServiceImpl {
	public ProductSerialVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQcproductserialBP().queryByQueryScheme(querySheme);
	}
}