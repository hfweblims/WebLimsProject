package nc.ui.qcco.qcentstandard.ace.view;

import nc.ui.bd.pub.view.BDBatchBillTable;
import nc.ui.pub.bill.BillEditEvent;

public class EntStandardEditor extends BDBatchBillTable{
	private static final long serialVersionUID = 1L;

	  protected void doAfterEdit(BillEditEvent e)
	  {
	    super.doAfterEdit(e);
	    getBillCardPanel().stopEditing();
	  }
}
