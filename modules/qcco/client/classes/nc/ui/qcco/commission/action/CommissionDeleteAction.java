package nc.ui.qcco.commission.action;

import java.awt.event.ActionEvent;

import nc.bs.uif2.IActionCode;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.ui.pubapp.uif2app.components.grand.model.MainGrandModel;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.uif2.IShowMsgConstant;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.actions.ActionInitializer;
import nc.vo.qcco.commission.AggCommissionHVO;

public class CommissionDeleteAction extends nc.ui.pubapp.uif2app.actions.pflow.DeleteScriptAction {

	/**
	 * nc.ui.pubapp.uif2app.actions.DeleteAction
	 */
	private static final long serialVersionUID = -6347211104481801200L;
	private MainGrandModel mainGrandModel;
	private BillManageModel model;
	private ISingleBillService<AggCommissionHVO> singleBillService;
	
	@Override
	public void doAction(ActionEvent e) throws Exception {
		Object value = this.getMainGrandModel().getDeleteAggVO();
		Object object = this.getSingleBillService().operateBill((AggCommissionHVO) value);
		this.getModel().directlyDelete(object);
		this.getMainGrandModel().directlyDelete(object);
		this.showSuccessInfo();
	}
	
	public CommissionDeleteAction() {
		super();
		ActionInitializer.initializeAction(this, IActionCode.DELETE);
	}

	protected void showSuccessInfo() {
		ShowStatusBarMsgUtil.showStatusBarMsg(IShowMsgConstant.getDelSuccessInfo(), getModel().getContext());
	}
	
	public ISingleBillService<AggCommissionHVO> getSingleBillService() {
		return singleBillService;
	}

	public void setSingleBillService(ISingleBillService<AggCommissionHVO> singleBillService) {
		this.singleBillService = singleBillService;
	}

	public MainGrandModel getMainGrandModel() {
		return mainGrandModel;
	}
	public void setMainGrandModel(MainGrandModel mainGrandModel) {
		this.mainGrandModel = mainGrandModel;
	}
	
	public BillManageModel getModel() {
		return model;
	}
	public void setModel(BillManageModel model) {
		this.model = model;
	}
}
