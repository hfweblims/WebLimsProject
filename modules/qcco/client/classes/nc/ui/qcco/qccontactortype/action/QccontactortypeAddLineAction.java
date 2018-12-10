package nc.ui.qcco.qccontactortype.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;
/**
  batch addLine or insLine action autogen
*/
public class QccontactortypeAddLineAction extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		ContactorTypeVO singleDocVO = (ContactorTypeVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}