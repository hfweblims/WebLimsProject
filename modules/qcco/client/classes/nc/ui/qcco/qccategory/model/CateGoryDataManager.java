package nc.ui.qcco.qccategory.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.qcco.IQccommissiontypeService;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.ui.uif2.model.IAppModelDataManager;
import nc.ui.uif2.model.IQueryAndRefreshManager;
import nc.vo.pub.BusinessException;

public class CateGoryDataManager  implements IAppModelDataManager, IQueryAndRefreshManager{
	private BatchBillTableModel model;

	  public CateGoryDataManager()
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
	      List objs = getQueryService().queryAllCategory();
	      Object[] vos = (objs == null) ? null : objs.toArray();
	      getModel().initModel(vos);
	      getQueryService().queryAllCategory();
	    }
	    catch (BusinessException e) {
	      throw new BusinessExceptionAdapter(e);
	    }
	  }

	  private nc.itf.qcco.IQccategoryService getQueryService()
	  {
	    return ((nc.itf.qcco.IQccategoryService)NCLocator.getInstance().lookup(nc.itf.qcco.IQccategoryService.class));
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
