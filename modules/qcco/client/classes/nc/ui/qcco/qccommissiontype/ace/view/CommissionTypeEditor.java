package nc.ui.qcco.qccommissiontype.ace.view;

import nc.ui.bd.pub.view.BDBatchBillTable;
import nc.ui.pub.bill.BillEditEvent;

public class CommissionTypeEditor extends BDBatchBillTable{
	private static final long serialVersionUID = 1L;

	  protected void doAfterEdit(BillEditEvent e)
	  {
	    super.doAfterEdit(e);
	    getBillCardPanel().stopEditing();
	  }
}
