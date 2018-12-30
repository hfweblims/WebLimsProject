package nc.ui.qcco.commission.action;

import java.awt.event.ActionEvent;
import java.io.Serializable;

import nc.ui.pubapp.uif2app.AppUiState;
import nc.ui.pubapp.uif2app.components.grand.CardGrandPanelComposite;
import nc.ui.pubapp.uif2app.model.IAppModelEx;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.UIState;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;

import org.apache.commons.lang.SerializationUtils;

public class CommissionCopyAction extends
		nc.ui.pubapp.uif2app.actions.CopyAction {
	private CardGrandPanelComposite billForm;
	private ShowUpableBillForm billFormEditor;
	public ShowUpableBillForm getBillFormEditor() {
		return billFormEditor;
	}

	public void setBillFormEditor(ShowUpableBillForm billFormEditor) {
		this.billFormEditor = billFormEditor;
	}

	public CardGrandPanelComposite getBillForm() {
		return billForm;
	}

	public void setBillForm(CardGrandPanelComposite billForm) {
		this.billForm = billForm;
	}

	public CommissionCopyAction() {
		super();
	}

	public void doAction(ActionEvent e) throws Exception {
		
		Object object = getModel().getSelectedData();
	    if (object instanceof AbstractBill)


	    {
	      AbstractBill aggvo = (AbstractBill)SerializationUtils.clone((Serializable)object);

	      if (getCopyActionProcessor() != null) {
	        getCopyActionProcessor().processVOAfterCopy(aggvo, getModel().getContext());





	      }

	      if (getModel() instanceof IAppModelEx) {
	        getModel().setOtherUiState(UIState.COPY_ADD);
	        getModel().setAppUiState(AppUiState.COPY_ADD);
	      } else {
	        getModel().setUiState(UIState.ADD);





	      }

	      billForm.setValue(aggvo);
	      billFormEditor.setValue(aggvo);
	      
	      getEditor().setBodyStatusNew();
	    } else {
	      throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("pubapp_0", "0pubapp-0126"));



	    }

	    getModel().setOtherUiState(UIState.NOT_EDIT);
	}
}
