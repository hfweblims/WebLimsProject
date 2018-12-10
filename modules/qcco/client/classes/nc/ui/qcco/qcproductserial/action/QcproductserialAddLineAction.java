package nc.ui.qcco.qcproductserial.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qcproductserial.ProductSerialVO;
/**
  batch addLine or insLine action autogen
*/
public class QcproductserialAddLineAction extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		ProductSerialVO singleDocVO = (ProductSerialVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}