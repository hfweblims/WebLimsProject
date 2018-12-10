package nc.ui.qcco.qcentstandard.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.qcco.IQcentstandardService;
import nc.ui.uif2.model.BatchBillTableModel;
import nc.ui.uif2.model.IAppModelDataManager;
import nc.ui.uif2.model.IQueryAndRefreshManager;
import nc.vo.pub.BusinessException;

public class EntStandardDataManager implements IAppModelDataManager, IQueryAndRefreshManager{
	private BatchBillTableModel model;

	  public EntStandardDataManager()
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

	  private IQcentstandardService getQueryService()
	  {
	    return ((IQcentstandardService)NCLocator.getInstance().lookup(IQcentstandardService.class));
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
