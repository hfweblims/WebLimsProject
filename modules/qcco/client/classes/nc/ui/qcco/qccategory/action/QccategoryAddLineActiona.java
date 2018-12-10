package nc.ui.qcco.qccategory.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qccategory.ProductCategoryVO;
/**
  batch addLine or insLine action autogen
*/
public class QccategoryAddLineActiona extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		ProductCategoryVO singleDocVO = (ProductCategoryVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}