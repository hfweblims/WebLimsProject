package nc.ui.qcco.qcproductserial.model;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.BusinessExceptionAdapter;
import nc.itf.qcco.IQcproductSerialService;
import nc.itf.qcco.IQcproductSerialService;
import nc.ui.uif2.IExceptionHandler;
import nc.ui.uif2.model.AbstractUIAppModel;
import nc.ui.uif2.model.IAppModelDataManagerEx;
import nc.vo.pub.BusinessException;

public class ProductSerialModelDataManager  implements IAppModelDataManagerEx{
	private AbstractUIAppModel model;
	  private IQcproductSerialService service;
	  private IExceptionHandler exceptionHandler;

	  public ProductSerialModelDataManager()
	  {
	    this.model = null;

	    this.service = null;

	    this.exceptionHandler = null; }

	  public IExceptionHandler getExceptionHandler() {
	    return this.exceptionHandler;
	  }

	  public void setExceptionHandler(IExceptionHandler exceptionHandler) {
	    this.exceptionHandler = exceptionHandler;
	  }

	  public void initModel()
	  {
	    try {
	      List objs = getProductSerialService().queryAllProductSerial();
	      Object[] vos = (objs == null) ? null : objs.toArray();
	      getModel().initModel(vos);
	    }
	    catch (BusinessException e) {
	      if (this.exceptionHandler != null) {
	        this.exceptionHandler.handlerExeption(e);
	      }
	      else
	        throw new BusinessExceptionAdapter(e);
	    }
	  }

	  public AbstractUIAppModel getModel()
	  {
	    return this.model;
	  }

	  public void setModel(AbstractUIAppModel model) {
	    this.model = model;
	  }


	  public void refresh()
	  {
	    initModel();
	  }












	  private IQcproductSerialService getProductSerialService()
	  {
	    if (this.service == null) {
	      this.service = ((IQcproductSerialService)NCLocator.getInstance().lookup(IQcproductSerialService.class));
	    }
	    return this.service;
	  }

	@Override
	public void initModelBySqlWhere(String paramString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShowSealDataFlag(boolean paramBoolean) {
		// TODO Auto-generated method stub
		
	}
}
