package nc.ui.qcco.qctestemperature.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qctestemperature.TestemperatureVO;
/**
  batch addLine or insLine action autogen
*/
public class QctestemperatureAddLineAction extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		TestemperatureVO singleDocVO = (TestemperatureVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}