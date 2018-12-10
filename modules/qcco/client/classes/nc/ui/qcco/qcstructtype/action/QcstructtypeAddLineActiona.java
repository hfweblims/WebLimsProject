package nc.ui.qcco.qcstructtype.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qcstructtype.StructTypeVO;
/**
  batch addLine or insLine action autogen
*/
public class QcstructtypeAddLineActiona extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		StructTypeVO singleDocVO = (StructTypeVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}