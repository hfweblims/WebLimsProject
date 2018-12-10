package nc.ui.qcco.qcitemvalue.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.qcco.IQcitemvalueService;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.ui.uif2.model.IAppModelDataManager;
import nc.ui.uif2.model.IQueryAndRefreshManager;
import nc.vo.pub.BusinessException;

public class ItemValueDataManager implements IAppModelDataManager, IQueryAndRefreshManager {
	private BatchBillTableModel model;

	  public ItemValueDataManager()
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
	      List objs = getQueryService().queryAllItemValue();
	      Object[] vos = (objs == null) ? null : objs.toArray();
	      getModel().initModel(vos);
	      getQueryService().queryAllItemValue();
	    }
	    catch (BusinessException e) {
	      throw new BusinessExceptionAdapter(e);
	    }
	  }

	  private IQcitemvalueService getQueryService()
	  {
	    return ((IQcitemvalueService)NCLocator.getInstance().lookup(IQcitemvalueService.class));
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
