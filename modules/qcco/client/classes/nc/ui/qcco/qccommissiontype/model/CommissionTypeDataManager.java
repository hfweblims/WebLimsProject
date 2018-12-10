package nc.ui.qcco.qccommissiontype.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.bd.cust.custaxes.ICusTaxesQueryService;
import nc.itf.qcco.IQccommissiontypeService;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.ui.uif2.model.IAppModelDataManager;
import nc.ui.uif2.model.IQueryAndRefreshManager;
import nc.vo.pub.BusinessException;

public class CommissionTypeDataManager implements IAppModelDataManager, IQueryAndRefreshManager{
	private BatchBillTableModel model;

	  public CommissionTypeDataManager()
	  {
	    this.model = null;
	  }





	  public BatchBillTableModel getModel() {
	    return this.model;
	  }

	  public void setModel(BatchBillTableModel model) {
	    this.model = model;
	  }

	  public void initModel()
	  {
	    try {
	      List objs = getQueryService().queryAllCommissonType();
	      Object[] vos = (objs == null) ? null : objs.toArray();
	      getModel().initModel(vos);
	      getQueryService().queryAllCommissonType();
	    }
	    catch (BusinessException e) {
	      throw new BusinessExceptionAdapter(e);
	    }
	  }

	  private IQccommissiontypeService getQueryService()
	  {
	    return ((IQccommissiontypeService)NCLocator.getInstance().lookup(IQccommissiontypeService.class));
	  }

	  public void refresh()
	  {
	    initModel();
	  }





	@Override
	public void initModelBySqlWhere(String paramString) {
		// TODO Auto-generated method stub
		
	}





	
}
