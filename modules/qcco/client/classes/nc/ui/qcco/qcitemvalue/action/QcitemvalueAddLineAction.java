package nc.ui.qcco.qcitemvalue.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qcitemvalue.ItemValueVO;
/**
  batch addLine or insLine action autogen
*/
public class QcitemvalueAddLineAction extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		ItemValueVO singleDocVO = (ItemValueVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}