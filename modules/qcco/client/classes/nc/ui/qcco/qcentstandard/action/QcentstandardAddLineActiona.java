package nc.ui.qcco.qcentstandard.action;

import nc.ui.pubapp.uif2app.actions.batch.BatchAddLineAction;
import nc.vo.qcco.qcentstandard.EntstandardVO;
/**
  batch addLine or insLine action autogen
*/
public class QcentstandardAddLineActiona extends BatchAddLineAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setDefaultData(Object obj) {
		super.setDefaultData(obj);
		EntstandardVO singleDocVO = (EntstandardVO) obj;
		singleDocVO.setPk_group(this.getModel().getContext().getPk_group());
		singleDocVO.setPk_org(this.getModel().getContext().getPk_org());
	}

}