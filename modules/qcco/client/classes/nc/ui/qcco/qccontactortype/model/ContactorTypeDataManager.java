package nc.ui.qcco.qccontactortype.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.qcco.IQccontactortypeService;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.ui.uif2.model.IAppModelDataManager;
import nc.ui.uif2.model.IQueryAndRefreshManager;
import nc.vo.pub.BusinessException;

public class ContactorTypeDataManager implements IAppModelDataManager, IQueryAndRefreshManager {
	private BatchBillTableModel model;

	  public ContactorTypeDataManager()
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
	      List objs = getQueryService().queryAllContactorType();
	      Object[] vos = (objs == null) ? null : objs.toArray();
	      getModel().initModel(vos);
	      getQueryService().queryAllContactorType();
	    }
	    catch (BusinessException e) {
	      throw new BusinessExceptionAdapter(e);
	    }
	  }

	  private IQccontactortypeService getQueryService()
	  {
	    return ((IQccontactortypeService)NCLocator.getInstance().lookup(IQccontactortypeService.class));
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
