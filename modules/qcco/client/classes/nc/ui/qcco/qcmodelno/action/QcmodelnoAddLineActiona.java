package nc.ui.qcco.qcmodelno.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qcmodelno.ModelnoVO;
/**
  batch addLine or insLine action autogen
*/
public class QcmodelnoAddLineActiona extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		ModelnoVO singleDocVO = (ModelnoVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}