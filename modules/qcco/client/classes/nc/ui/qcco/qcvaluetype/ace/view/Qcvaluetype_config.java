package nc.ui.qcco.qcvaluetype.ace.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.ui.uif2.factory.AbstractJavaBeanDefinition;

public class Qcvaluetype_config extends AbstractJavaBeanDefinition{
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

public nc.ui.qcco.qcvaluetype.ace.serviceproxy.AceQcvaluetypeMaintainProxy getBmModelModelService(){
 if(context.get("bmModelModelService")!=null)
 return (nc.ui.qcco.qcvaluetype.ace.serviceproxy.AceQcvaluetypeMaintainProxy)context.get("bmModelModelService");
  nc.ui.qcco.qcvaluetype.ace.serviceproxy.AceQcvaluetypeMaintainProxy bean = new nc.ui.qcco.qcvaluetype.ace.serviceproxy.AceQcvaluetypeMaintainProxy();
  context.put("bmModelModelService",bean);
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

public nc.ui.pubapp.uif2app.model.BillManageModel getBmModel(){
 if(context.get("bmModel")!=null)
 return (nc.ui.pubapp.uif2app.model.BillManageModel)context.get("bmModel");
  nc.ui.pubapp.uif2app.model.BillManageModel bean = new nc.ui.pubapp.uif2app.model.BillManageModel();
  context.put("bmModel",bean);
  bean.setContext(getContext());
  bean.setBusinessObjectAdapterFactory(getBOAdapterFactory());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.model.ModelDataManager getBmModelModelDataManager(){
 if(context.get("bmModelModelDataManager")!=null)
 return (nc.ui.pubapp.uif2app.query2.model.ModelDataManager)context.get("bmModelModelDataManager");
  nc.ui.pubapp.uif2app.query2.model.ModelDataManager bean = new nc.ui.pubapp.uif2app.query2.model.ModelDataManager();
  context.put("bmModelModelDataManager",bean);
  bean.setModel(getBmModel());
  bean.setService(getBmModelModelService());
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

public nc.ui.pubapp.uif2app.tangramlayout.UEQueryAreaShell getViewa(){
 if(context.get("viewa")!=null)
 return (nc.ui.pubapp.uif2app.tangramlayout.UEQueryAreaShell)context.get("viewa");
  nc.ui.pubapp.uif2app.tangramlayout.UEQueryAreaShell bean = new nc.ui.pubapp.uif2app.tangramlayout.UEQueryAreaShell();
  context.put("viewa",bean);
  bean.setQueryAreaCreator(getDefaultQueryAction());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.ShowUpableBillListView getBillListView(){
 if(context.get("billListView")!=null)
 return (nc.ui.pubapp.uif2app.view.ShowUpableBillListView)context.get("billListView");
  nc.ui.pubapp.uif2app.view.ShowUpableBillListView bean = new nc.ui.pubapp.uif2app.view.ShowUpableBillListView();
  context.put("billListView",bean);
  bean.setModel(getBmModel());
  bean.setNodekey("bt");
  bean.setMultiSelectionEnable(false);
  bean.setTemplateContainer(getTemplateContainer());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel getViewb(){
 if(context.get("viewb")!=null)
 return (nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel)context.get("viewb");
  nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel bean = new nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel();
  context.put("viewb",bean);
  bean.setModel(getBmModel());
  bean.setTitleAction(getReturnAction());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.UEReturnAction getReturnAction(){
 if(context.get("returnAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.UEReturnAction)context.get("returnAction");
  nc.ui.pubapp.uif2app.actions.UEReturnAction bean = new nc.ui.pubapp.uif2app.actions.UEReturnAction();
  context.put("returnAction",bean);
  bean.setGoComponent(getBillListView());
  bean.setSaveAction(getSaveAction());
  bean.setModel(getBmModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillForm(){
 if(context.get("billForm")!=null)
 return (nc.ui.pubapp.uif2app.view.ShowUpableBillForm)context.get("billForm");
  nc.ui.pubapp.uif2app.view.ShowUpableBillForm bean = new nc.ui.pubapp.uif2app.view.ShowUpableBillForm();
  context.put("billForm",bean);
  bean.setModel(getBmModel());
  bean.setNodekey("bt");
  bean.setBodyLineActions(getManagedList1());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList1(){  List list = new ArrayList();  list.add(getBodyAddLineAction_187d48());  list.add(getBodyInsertLineAction_1c93f91());  list.add(getBodyDelLineAction_16c50af());  return list;}

private nc.ui.pubapp.uif2app.actions.BodyAddLineAction getBodyAddLineAction_187d48(){
 if(context.get("nc.ui.pubapp.uif2app.actions.BodyAddLineAction#187d48")!=null)
 return (nc.ui.pubapp.uif2app.actions.BodyAddLineAction)context.get("nc.ui.pubapp.uif2app.actions.BodyAddLineAction#187d48");
  nc.ui.pubapp.uif2app.actions.BodyAddLineAction bean = new nc.ui.pubapp.uif2app.actions.BodyAddLineAction();
  context.put("nc.ui.pubapp.uif2app.actions.BodyAddLineAction#187d48",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.BodyInsertLineAction getBodyInsertLineAction_1c93f91(){
 if(context.get("nc.ui.pubapp.uif2app.actions.BodyInsertLineAction#1c93f91")!=null)
 return (nc.ui.pubapp.uif2app.actions.BodyInsertLineAction)context.get("nc.ui.pubapp.uif2app.actions.BodyInsertLineAction#1c93f91");
  nc.ui.pubapp.uif2app.actions.BodyInsertLineAction bean = new nc.ui.pubapp.uif2app.actions.BodyInsertLineAction();
  context.put("nc.ui.pubapp.uif2app.actions.BodyInsertLineAction#1c93f91",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.BodyDelLineAction getBodyDelLineAction_16c50af(){
 if(context.get("nc.ui.pubapp.uif2app.actions.BodyDelLineAction#16c50af")!=null)
 return (nc.ui.pubapp.uif2app.actions.BodyDelLineAction)context.get("nc.ui.pubapp.uif2app.actions.BodyDelLineAction#16c50af");
  nc.ui.pubapp.uif2app.actions.BodyDelLineAction bean = new nc.ui.pubapp.uif2app.actions.BodyDelLineAction();
  context.put("nc.ui.pubapp.uif2app.actions.BodyDelLineAction#16c50af",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.TangramContainer getContainer(){
 if(context.get("container")!=null)
 return (nc.ui.uif2.TangramContainer)context.get("container");
  nc.ui.uif2.TangramContainer bean = new nc.ui.uif2.TangramContainer();
  context.put("container",bean);
  bean.setTangramLayoutRoot(getTBNode_55a0da());
  bean.setActions(getManagedList3());
  bean.setEditActions(getManagedList4());
  bean.setModel(getBmModel());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.TBNode getTBNode_55a0da(){
 if(context.get("nc.ui.uif2.tangramlayout.node.TBNode#55a0da")!=null)
 return (nc.ui.uif2.tangramlayout.node.TBNode)context.get("nc.ui.uif2.tangramlayout.node.TBNode#55a0da");
  nc.ui.uif2.tangramlayout.node.TBNode bean = new nc.ui.uif2.tangramlayout.node.TBNode();
  context.put("nc.ui.uif2.tangramlayout.node.TBNode#55a0da",bean);
  bean.setTabs(getManagedList2());
  bean.setName("cardLayout");
  bean.setShowMode("CardLayout");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList2(){  List list = new ArrayList();  list.add(getHSNode_c1beab());  list.add(getVSNode_1a32ecd());  return list;}

private nc.ui.uif2.tangramlayout.node.HSNode getHSNode_c1beab(){
 if(context.get("nc.ui.uif2.tangramlayout.node.HSNode#c1beab")!=null)
 return (nc.ui.uif2.tangramlayout.node.HSNode)context.get("nc.ui.uif2.tangramlayout.node.HSNode#c1beab");
  nc.ui.uif2.tangramlayout.node.HSNode bean = new nc.ui.uif2.tangramlayout.node.HSNode();
  context.put("nc.ui.uif2.tangramlayout.node.HSNode#c1beab",bean);
  bean.setLeft(getCNode_25452e());
  bean.setRight(getCNode_e0e49f());
  bean.setDividerLocation(215.0f);
  bean.setName("¦Cªí");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_25452e(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#25452e")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#25452e");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#25452e",bean);
  bean.setComponent(getViewa());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_e0e49f(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#e0e49f")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#e0e49f");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#e0e49f",bean);
  bean.setComponent(getBillListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.VSNode getVSNode_1a32ecd(){
 if(context.get("nc.ui.uif2.tangramlayout.node.VSNode#1a32ecd")!=null)
 return (nc.ui.uif2.tangramlayout.node.VSNode)context.get("nc.ui.uif2.tangramlayout.node.VSNode#1a32ecd");
  nc.ui.uif2.tangramlayout.node.VSNode bean = new nc.ui.uif2.tangramlayout.node.VSNode();
  context.put("nc.ui.uif2.tangramlayout.node.VSNode#1a32ecd",bean);
  bean.setUp(getCNode_1ccfa13());
  bean.setDown(getCNode_36019a());
  bean.setDividerLocation(43.0f);
  bean.setName("¥d¤ù");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_1ccfa13(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#1ccfa13")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#1ccfa13");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#1ccfa13",bean);
  bean.setComponent(getViewb());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_36019a(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#36019a")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#36019a");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#36019a",bean);
  bean.setComponent(getBillForm());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList3(){  List list = new ArrayList();  list.add(getAddAction());  list.add(getEditAction());  list.add(getDeleteAction());  list.add(getDefaultQueryAction());  list.add(getCopyAction());  list.add(getSeparatorAction());  list.add(getDefaultRefreshAction());  list.add(getSeparatorAction());  list.add(getSeparatorAction());  list.add(getSeparatorAction());  list.add(getMetaDataBasedPrintAction());  list.add(getMetaDataBasedPrintActiona());  list.add(getOutputAction());  list.add(getSeparatorAction());  return list;}

private List getManagedList4(){  List list = new ArrayList();  list.add(getSaveAction());  list.add(getCancelAction());  return list;}

public nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener getInitDataListener(){
 if(context.get("InitDataListener")!=null)
 return (nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener)context.get("InitDataListener");
  nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener bean = new nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener();
  context.put("InitDataListener",bean);
  bean.setModel(getBmModel());
  bean.setContext(getContext());
  bean.setVoClassName("nc.vo.qcco.analysemethod.AggAnalyseMethodHVO");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.common.validateservice.ClosingCheck getClosingListener(){
 if(context.get("ClosingListener")!=null)
 return (nc.ui.pubapp.common.validateservice.ClosingCheck)context.get("ClosingListener");
  nc.ui.pubapp.common.validateservice.ClosingCheck bean = new nc.ui.pubapp.common.validateservice.ClosingCheck();
  context.put("ClosingListener",bean);
  bean.setModel(getBmModel());
  bean.setSaveAction(getSaveAction());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.model.AppEventHandlerMediator getBmModelEventMediator(){
 if(context.get("bmModelEventMediator")!=null)
 return (nc.ui.pubapp.uif2app.model.AppEventHandlerMediator)context.get("bmModelEventMediator");
  nc.ui.pubapp.uif2app.model.AppEventHandlerMediator bean = new nc.ui.pubapp.uif2app.model.AppEventHandlerMediator();
  context.put("bmModelEventMediator",bean);
  bean.setModel(getBmModel());
  bean.setHandlerGroup(getManagedList5());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList5(){  List list = new ArrayList();  list.add(getEventHandlerGroup_12bb617());  list.add(getEventHandlerGroup_1272e52());  return list;}

private nc.ui.pubapp.uif2app.event.EventHandlerGroup getEventHandlerGroup_12bb617(){
 if(context.get("nc.ui.pubapp.uif2app.event.EventHandlerGroup#12bb617")!=null)
 return (nc.ui.pubapp.uif2app.event.EventHandlerGroup)context.get("nc.ui.pubapp.uif2app.event.EventHandlerGroup#12bb617");
  nc.ui.pubapp.uif2app.event.EventHandlerGroup bean = new nc.ui.pubapp.uif2app.event.EventHandlerGroup();
  context.put("nc.ui.pubapp.uif2app.event.EventHandlerGroup#12bb617",bean);
  bean.setEvent("nc.ui.pubapp.uif2app.event.OrgChangedEvent");
  bean.setHandler(getAceOrgChangeHandler_1b3768b());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler getAceOrgChangeHandler_1b3768b(){
 if(context.get("nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler#1b3768b")!=null)
 return (nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler)context.get("nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler#1b3768b");
  nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler bean = new nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler();
  context.put("nc.ui.qcco.qcvaluetype.ace.handler.AceOrgChangeHandler#1b3768b",bean);
  bean.setBillForm(getBillForm());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.event.EventHandlerGroup getEventHandlerGroup_1272e52(){
 if(context.get("nc.ui.pubapp.uif2app.event.EventHandlerGroup#1272e52")!=null)
 return (nc.ui.pubapp.uif2app.event.EventHandlerGroup)context.get("nc.ui.pubapp.uif2app.event.EventHandlerGroup#1272e52");
  nc.ui.pubapp.uif2app.event.EventHandlerGroup bean = new nc.ui.pubapp.uif2app.event.EventHandlerGroup();
  context.put("nc.ui.pubapp.uif2app.event.EventHandlerGroup#1272e52",bean);
  bean.setEvent("nc.ui.pubapp.uif2app.event.billform.AddEvent");
  bean.setHandler(getAceAddHandler_bfa9d6());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler getAceAddHandler_bfa9d6(){
 if(context.get("nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler#bfa9d6")!=null)
 return (nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler)context.get("nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler#bfa9d6");
  nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler bean = new nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler();
  context.put("nc.ui.qcco.qcvaluetype.ace.handler.AceAddHandler#bfa9d6",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader getBillLazilyLoader(){
 if(context.get("billLazilyLoader")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader)context.get("billLazilyLoader");
  nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader bean = new nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader();
  context.put("billLazilyLoader",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager getBmModelLasilyLodadMediator(){
 if(context.get("bmModelLasilyLodadMediator")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager)context.get("bmModelLasilyLodadMediator");
  nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager bean = new nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager();
  context.put("bmModelLasilyLodadMediator",bean);
  bean.setModel(getBmModel());
  bean.setLoader(getBillLazilyLoader());
  bean.setLazilyLoadSupporter(getManagedList6());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList6(){  List list = new ArrayList();  list.add(getCardPanelLazilyLoad_1521871());  list.add(getListPanelLazilyLoad_c2dfea());  return list;}

private nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad getCardPanelLazilyLoad_1521871(){
 if(context.get("nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad#1521871")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad)context.get("nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad#1521871");
  nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad bean = new nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad();
  context.put("nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad#1521871",bean);
  bean.setBillform(getBillForm());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad getListPanelLazilyLoad_c2dfea(){
 if(context.get("nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad#c2dfea")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad)context.get("nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad#c2dfea");
  nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad bean = new nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad();
  context.put("nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad#c2dfea",bean);
  bean.setListView(getBillListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.RowNoMediator getRowNoMediator(){
 if(context.get("rowNoMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.RowNoMediator)context.get("rowNoMediator");
  nc.ui.pubapp.uif2app.view.RowNoMediator bean = new nc.ui.pubapp.uif2app.view.RowNoMediator();
  context.put("rowNoMediator",bean);
  bean.setModel(getBmModel());
  bean.setEditor(getBillForm());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator getMouseClickShowPanelMediator(){
 if(context.get("mouseClickShowPanelMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator)context.get("mouseClickShowPanelMediator");
  nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator bean = new nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator();
  context.put("mouseClickShowPanelMediator",bean);
  bean.setListView(getBillListView());
  bean.setShowUpComponent(getBillForm());
  bean.setHyperLinkColumn("null");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.AddAction getAddAction(){
 if(context.get("addAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.AddAction)context.get("addAction");
  nc.ui.pubapp.uif2app.actions.AddAction bean = new nc.ui.pubapp.uif2app.actions.AddAction();
  context.put("addAction",bean);
  bean.setModel(getBmModel());
  bean.setInterceptor(getCompositeActionInterceptor_1f26e9d());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor getCompositeActionInterceptor_1f26e9d(){
 if(context.get("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#1f26e9d")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor)context.get("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#1f26e9d");
  nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor();
  context.put("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#1f26e9d",bean);
  bean.setInterceptors(getManagedList7());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList7(){  List list = new ArrayList();  list.add(getShowUpComponentInterceptor_1fa93a1());  return list;}

private nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor getShowUpComponentInterceptor_1fa93a1(){
 if(context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#1fa93a1")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor)context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#1fa93a1");
  nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor();
  context.put("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#1fa93a1",bean);
  bean.setShowUpComponent(getBillForm());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.EditAction getEditAction(){
 if(context.get("editAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.EditAction)context.get("editAction");
  nc.ui.pubapp.uif2app.actions.EditAction bean = new nc.ui.pubapp.uif2app.actions.EditAction();
  context.put("editAction",bean);
  bean.setModel(getBmModel());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.DeleteAction getDeleteAction(){
 if(context.get("deleteAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.DeleteAction)context.get("deleteAction");
  nc.ui.pubapp.uif2app.actions.DeleteAction bean = new nc.ui.pubapp.uif2app.actions.DeleteAction();
  context.put("deleteAction",bean);
  bean.setModel(getBmModel());
  bean.setSingleBillService(getBmModelModelService());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.editor.QueryTemplateContainer getDefaultQueryActionQueryTemplateContainer(){
 if(context.get("defaultQueryActionQueryTemplateContainer")!=null)
 return (nc.ui.uif2.editor.QueryTemplateContainer)context.get("defaultQueryActionQueryTemplateContainer");
  nc.ui.uif2.editor.QueryTemplateContainer bean = new nc.ui.uif2.editor.QueryTemplateContainer();
  context.put("defaultQueryActionQueryTemplateContainer",bean);
  bean.setNodeKey("qt");
  bean.setContext(getContext());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction getDefaultQueryAction(){
 if(context.get("defaultQueryAction")!=null)
 return (nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction)context.get("defaultQueryAction");
  nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction bean = new nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction();
  context.put("defaultQueryAction",bean);
  bean.setModel(getBmModel());
  bean.setTemplateContainer(getDefaultQueryActionQueryTemplateContainer());
  bean.setNodeKey("qt");
  bean.setDataManager(getBmModelModelDataManager());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.CopyAction getCopyAction(){
 if(context.get("copyAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.CopyAction)context.get("copyAction");
  nc.ui.pubapp.uif2app.actions.CopyAction bean = new nc.ui.pubapp.uif2app.actions.CopyAction();
  context.put("copyAction",bean);
  bean.setModel(getBmModel());
  bean.setEditor(getBillForm());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction getDefaultRefreshAction(){
 if(context.get("defaultRefreshAction")!=null)
 return (nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction)context.get("defaultRefreshAction");
  nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction bean = new nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction();
  context.put("defaultRefreshAction",bean);
  bean.setModel(getBmModel());
  bean.setDataManager(getBmModelModelDataManager());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction getMetaDataBasedPrintAction(){
 if(context.get("metaDataBasedPrintAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction)context.get("metaDataBasedPrintAction");
  nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction bean = new nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction();
  context.put("metaDataBasedPrintAction",bean);
  bean.setModel(getBmModel());
  bean.setActioncode("Preview");
  bean.setActionname("Ô¤ÀÀ");
  bean.setPreview(true);
  bean.setNodeKey("ot");
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction getMetaDataBasedPrintActiona(){
 if(context.get("metaDataBasedPrintActiona")!=null)
 return (nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction)context.get("metaDataBasedPrintActiona");
  nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction bean = new nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction();
  context.put("metaDataBasedPrintActiona",bean);
  bean.setModel(getBmModel());
  bean.setActioncode("Print");
  bean.setActionname("´òÓ¡");
  bean.setPreview(false);
  bean.setNodeKey("ot");
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.OutputAction getOutputAction(){
 if(context.get("outputAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.OutputAction)context.get("outputAction");
  nc.ui.pubapp.uif2app.actions.OutputAction bean = new nc.ui.pubapp.uif2app.actions.OutputAction();
  context.put("outputAction",bean);
  bean.setModel(getBmModel());
  bean.setEditor(getBillForm());
  bean.setNodeKey("ot");
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.DifferentVOSaveAction getSaveAction(){
 if(context.get("saveAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.DifferentVOSaveAction)context.get("saveAction");
  nc.ui.pubapp.uif2app.actions.DifferentVOSaveAction bean = new nc.ui.pubapp.uif2app.actions.DifferentVOSaveAction();
  context.put("saveAction",bean);
  bean.setModel(getBmModel());
  bean.setEditor(getBillForm());
  bean.setService(getBmModelModelService());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.CancelAction getCancelAction(){
 if(context.get("cancelAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.CancelAction)context.get("cancelAction");
  nc.ui.pubapp.uif2app.actions.CancelAction bean = new nc.ui.pubapp.uif2app.actions.CancelAction();
  context.put("cancelAction",bean);
  bean.setModel(getBmModel());
  bean.setEditor(getBillForm());
  bean.setExceptionHandler(getExceptionHandler());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.funcnode.ui.action.SeparatorAction getSeparatorAction(){
 if(context.get("separatorAction")!=null)
 return (nc.funcnode.ui.action.SeparatorAction)context.get("separatorAction");
  nc.funcnode.ui.action.SeparatorAction bean = new nc.funcnode.ui.action.SeparatorAction();
  context.put("separatorAction",bean);
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

}
