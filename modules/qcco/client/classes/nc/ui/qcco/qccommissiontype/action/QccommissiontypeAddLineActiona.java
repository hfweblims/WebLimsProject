package nc.ui.qcco.qccommissiontype.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;
/**
  batch addLine or insLine action autogen
*/
public class QccommissiontypeAddLineActiona extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		CommissionTypeVO singleDocVO = (CommissionTypeVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}