package nc.ui.qcco.qcproductserial.ace.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.ui.uif2.factory.AbstractJavaBeanDefinition;

public class Qcproductserial_config extends AbstractJavaBeanDefinition{
	private Map<String, Object> context = new HashMap();
public nc.vo.uif2.LoginContext getContext(){
 if(context.get("context")!=null)
 return (nc.vo.uif2.LoginContext)context.get("context");
  nc.vo.uif2.LoginContext bean = new nc.vo.uif2.LoginContext();
  context.put("context",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.smart.SmartBatchAppModelService getBatchModelModelService(){
 if(context.get("batchModelModelService")!=null)
 return (nc.ui.pubapp.pub.smart.SmartBatchAppModelService)context.get("batchModelModelService");
  nc.ui.pubapp.pub.smart.SmartBatchAppModelService bean = new nc.ui.pubapp.pub.smart.SmartBatchAppModelService();
  context.put("batchModelModelService",bean);
  bean.setServiceItf("nc.itf.qcco.IQcproductserialMaintain");
  bean.setVoClass("nc.vo.qcco.qcproductserial.ProductSerialVO");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.vo.bd.meta.GeneralBDObjectAdapterFactory getBOAdapterFactory(){
 if(context.get("BOAdapterFactory")!=null)
 return (nc.vo.bd.meta.GeneralBDObjectAdapterFactory)context.get("BOAdapterFactory");
  nc.vo.bd.meta.GeneralBDObjectAdapterFactory bean = new nc.vo.bd.meta.GeneralBDObjectAdapterFactory();
  context.put("BOAdapterFactory",bean);
  bean.setMode("MD");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.qcco.qcproductserial.model.ProductSerialDataManager getModelDataManager(){
 if(context.get("modelDataManager")!=null)
 return (nc.ui.qcco.qcproductserial.model.ProductSerialDataManager)context.get("modelDataManager");
  nc.ui.qcco.qcproductserial.model.ProductSerialDataManager bean = new nc.ui.qcco.qcproductserial.model.ProductSerialDataManager();
  context.put("modelDataManager",bean);
  bean.setModel(getBatchModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.model.BatchBillTableModel getBatchModel(){
 if(context.get("batchModel")!=null)
 return (nc.ui.pubapp.uif2app.model.BatchBillTableModel)context.get("batchModel");
  nc.ui.pubapp.uif2app.model.BatchBillTableModel bean = new nc.ui.pubapp.uif2app.model.BatchBillTableModel();
  context.put("batchModel",bean);
  bean.setContext(getContext());
  bean.setService(getBatchModelModelService());
  bean.setBusinessObjectAdapterFactory(getBOAdapterFactory());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.qcco.qcproductserial.model.ProductSerialModelDataManager getBatchModelModelDataManager(){
 if(context.get("batchModelModelDataManager")!=null)
 return (nc.ui.qcco.qcproductserial.model.ProductSerialModelDataManager)context.get("batchModelModelDataManager");
  nc.ui.qcco.qcproductserial.model.ProductSerialModelDataManager bean = new nc.ui.qcco.qcproductserial.model.ProductSerialModelDataManager();
  context.put("batchModelModelDataManager",bean);
  bean.setModel(getBatchModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.FunNodeClosingHandler getClosingListener(){
 if(context.get("ClosingListener")!=null)
 return (nc.ui.uif2.FunNodeClosingHandler)context.get("ClosingListener");
  nc.ui.uif2.FunNodeClosingHandler bean = new nc.ui.uif2.FunNodeClosingHandler();
  context.put("ClosingListener",bean);
  bean.setModel(getBatchModel());
  bean.setSaveaction(getBatchSaveAction());
  bean.setCancelaction(getBatchCancelAction());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.TemplateContainer getTemplateContainer(){
 if(context.get("templateContainer")!=null)
 return (nc.ui.pubapp.uif2app.view.TemplateContainer)context.get("templateContainer");
  nc.ui.pubapp.uif2app.view.TemplateContainer bean = new nc.ui.pubapp.uif2app.view.TemplateContainer();
  context.put("templateContainer",bean);
  bean.setContext(getContext());
  bean.setNodeKeies(getManagedList0());
  bean.load();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList0(){  List list = new ArrayList();  list.add("bt");  return list;}

public nc.ui.qcco.qcproductserial.ace.view.ProductSerialEditor getBatchBillTable(){
 if(context.get("batchBillTable")!=null)
 return (nc.ui.qcco.qcproductserial.ace.view.ProductSerialEditor)context.get("batchBillTable");
  nc.ui.qcco.qcproductserial.ace.view.ProductSerialEditor bean = new nc.ui.qcco.qcproductserial.ace.view.ProductSerialEditor();
  context.put("batchBillTable",bean);
  bean.setModel(getBatchModel());
  bean.setNodekey("bt");
  bean.setTemplateContainer(getTemplateContainer());
  bean.setAddLineAction(getBatchAddLineAction());
  bean.setBodyMultiSelectEnable(true);
  bean.setMdUpdOperateCode("edit");
  bean.setResourceCode("C0J00104");
  bean.setVoClassName("nc.vo.qcco.qcproductserial.ProductSerialVO");
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.TangramContainer getContainer(){
 if(context.get("container")!=null)
 return (nc.ui.uif2.TangramContainer)context.get("container");
  nc.ui.uif2.TangramContainer bean = new nc.ui.uif2.TangramContainer();
  context.put("container",bean);
  bean.setConstraints(getManagedList1());
  bean.setActions(getManagedList2());
  bean.setEditActions(getManagedList3());
  bean.setModel(getBatchModel());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList1(){  List list = new ArrayList();  list.add(getTangramLayoutConstraint_1c93f91());  return list;}

private nc.ui.uif2.tangramlayout.TangramLayoutConstraint getTangramLayoutConstraint_1c93f91(){
 if(context.get("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#1c93f91")!=null)
 return (nc.ui.uif2.tangramlayout.TangramLayoutConstraint)context.get("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#1c93f91");
  nc.ui.uif2.tangramlayout.TangramLayoutConstraint bean = new nc.ui.uif2.tangramlayout.TangramLayoutConstraint();
  context.put("nc.ui.uif2.tangramlayout.TangramLayoutConstraint#1c93f91",bean);
  bean.setNewComponent(getBatchBillTable());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList2(){  List list = new ArrayList();  list.add(getBatchEditAction());  list.add(getBatchRefreshAction());  list.add(getBatchAddLineAction());  list.add(getBatchDelLineAction());  return list;}

private List getManagedList3(){  List list = new ArrayList();  list.add(getBatchSaveAction());  list.add(getBatchCancelAction());  list.add(getBatchAddLineActiona());  list.add(getBatchDelLineActiona());  return list;}

public nc.ui.pubapp.uif2app.actions.batch.BatchEditAction getBatchEditAction(){
 if(context.get("batchEditAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchEditAction)context.get("batchEditAction");
  nc.ui.pubapp.uif2app.actions.batch.BatchEditAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchEditAction();
  context.put("batchEditAction",bean);
  bean.setModel(getBatchModel());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.batch.BatchRefreshAction getBatchRefreshAction(){
 if(context.get("batchRefreshAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchRefreshAction)context.get("batchRefreshAction");
  nc.ui.pubapp.uif2app.actions.batch.BatchRefreshAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchRefreshAction();
  context.put("batchRefreshAction",bean);
  bean.setModel(getBatchModel());
  bean.setModelManager(getBatchModelModelDataManager());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineAction getBatchAddLineAction(){
 if(context.get("batchAddLineAction")!=null)
 return (nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineAction)context.get("batchAddLineAction");
  nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineAction bean = new nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineAction();
  context.put("batchAddLineAction",bean);
  bean.setModel(getBatchModel());
  bean.setVoClassName("nc.vo.qcco.qcproductserial.ProductSerialVO");
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction getBatchDelLineAction(){
 if(context.get("batchDelLineAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction)context.get("batchDelLineAction");
  nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction();
  context.put("batchDelLineAction",bean);
  bean.setModel(getBatchModel());
  bean.setBatchBillTable(getBatchBillTable());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.batch.BatchSaveAction getBatchSaveAction(){
 if(context.get("batchSaveAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchSaveAction)context.get("batchSaveAction");
  nc.ui.pubapp.uif2app.actions.batch.BatchSaveAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchSaveAction();
  context.put("batchSaveAction",bean);
  bean.setModel(getBatchModel());
  bean.setEditor(getBatchBillTable());
  bean.setValidationService(getBatchBillTableValidateService());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.batch.BatchCancelAction getBatchCancelAction(){
 if(context.get("batchCancelAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchCancelAction)context.get("batchCancelAction");
  nc.ui.pubapp.uif2app.actions.batch.BatchCancelAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchCancelAction();
  context.put("batchCancelAction",bean);
  bean.setModel(getBatchModel());
  bean.setEditor(getBatchBillTable());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineActiona getBatchAddLineActiona(){
 if(context.get("batchAddLineActiona")!=null)
 return (nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineActiona)context.get("batchAddLineActiona");
  nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineActiona bean = new nc.ui.qcco.qcmodelno.action.QcmodelnoAddLineActiona();
  context.put("batchAddLineActiona",bean);
  bean.setModel(getBatchModel());
  bean.setVoClassName("nc.vo.qcco.qcproductserial.ProductSerialVO");
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction getBatchDelLineActiona(){
 if(context.get("batchDelLineActiona")!=null)
 return (nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction)context.get("batchDelLineActiona");
  nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction bean = new nc.ui.pubapp.uif2app.actions.batch.BatchDelLineAction();
  context.put("batchDelLineActiona",bean);
  bean.setModel(getBatchModel());
  bean.setBatchBillTable(getBatchBillTable());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.DefaultExceptionHanler getExceptionHandler(){
 if(context.get("exceptionHandler")!=null)
 return (nc.ui.uif2.DefaultExceptionHanler)context.get("exceptionHandler");
  nc.ui.uif2.DefaultExceptionHanler bean = new nc.ui.uif2.DefaultExceptionHanler(getContainer());  context.put("exceptionHandler",bean);
  bean.setContext(getContext());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.model.DefaultBatchValidationService getBatchBillTableValidateService(){
 if(context.get("batchBillTableValidateService")!=null)
 return (nc.ui.uif2.model.DefaultBatchValidationService)context.get("batchBillTableValidateService");
  nc.ui.uif2.model.DefaultBatchValidationService bean = new nc.ui.uif2.model.DefaultBatchValidationService();
  context.put("batchBillTableValidateService",bean);
  bean.setEditor(getBatchBillTable());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

}
