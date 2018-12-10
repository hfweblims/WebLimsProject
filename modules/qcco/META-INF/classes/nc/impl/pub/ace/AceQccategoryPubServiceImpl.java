package nc.impl.pub.ace;
import nc.bs.qcco.qccategory.ace.bp.AceQccategoryBP;
import nc.impl.pubapp.pub.smart.SmartServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.ISuperVO;
import nc.vo.qcco.qccategory.ProductCategoryVO;
import nc.vo.uif2.LoginContext;

public abstract class AceQccategoryPubServiceImpl extends SmartServiceImpl {
	public ProductCategoryVO[] pubquerybasedoc(IQueryScheme querySheme)
			throws nc.vo.pub.BusinessException {
		return new AceQccategoryBP().queryByQueryScheme(querySheme);
	}
}