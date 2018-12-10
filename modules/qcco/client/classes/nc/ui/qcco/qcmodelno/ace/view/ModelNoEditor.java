package nc.ui.qcco.qcmodelno.ace.view;

import nc.ui.bd.pub.view.BDBatchBillTable;
import nc.ui.pub.bill.BillEditEvent;

public class ModelNoEditor extends BDBatchBillTable{
	private static final long serialVersionUID = 1L;

	  protected void doAfterEdit(BillEditEvent e)
	  {
	    super.doAfterEdit(e);
	    getBillCardPanel().stopEditing();
	  }
}
