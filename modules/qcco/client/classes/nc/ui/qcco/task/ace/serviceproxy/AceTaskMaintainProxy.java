package nc.ui.qcco.task.ace.serviceproxy;

import java.util.HashMap;
import java.util.Map;

import nc.bs.framework.common.NCLocator;
import nc.itf.pubapp.uif2app.components.grand.IGrandAggVosQueryService;
import nc.itf.qcco.ITaskMaintain;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.ui.pubapp.uif2app.components.grand.model.AbstractGrandQueryService;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.qcco.task.AggTaskHVO;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceTaskMaintainProxy extends AbstractGrandQueryService implements 
IDataOperationService,
IQueryService  {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		//ICommissionMaintain query = NCLocator.getInstance().lookup(
		//		ICommissionMaintain.class);
		//return query.query(queryScheme);
		IGrandAggVosQueryService query = NCLocator.getInstance().lookup(IGrandAggVosQueryService.class);
		Map<String, CircularlyAccessibleValueObject> relationShip = super.getGrandTabAndVOMap();
		AggTaskHVO[] result = (AggTaskHVO[]) query.query(queryScheme, null, (HashMap<String, CircularlyAccessibleValueObject>)relationShip, AggTaskHVO.class);
		return result;
	}

	 @Override
	    public IBill[] insert(IBill[] value) throws BusinessException {
	        ITaskMaintain operator = NCLocator.getInstance().lookup(ITaskMaintain.class);
	        AggTaskHVO[] vos = (AggTaskHVO[]) operator.insert((AggTaskHVO[]) value);
	        return vos;
	    }
	    @Override
	    public IBill[] update(IBill[] value) throws BusinessException {
	    	ITaskMaintain operator = NCLocator.getInstance().lookup(ITaskMaintain.class);
	        AggTaskHVO[] vos = (AggTaskHVO[]) operator.update((AggTaskHVO[]) value);
	        return vos;
	    }
	    @Override
	    public IBill[] delete(IBill[] value) throws BusinessException {
	       
	    	ITaskMaintain operator = NCLocator.getInstance().lookup(ITaskMaintain.class);
	        operator.delete((AggTaskHVO[]) value);
	        return value;
	    }

		

}