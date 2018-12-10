package nc.ui.qcco.qctestlist.ace.serviceproxy;

import java.util.HashMap;
import java.util.Map;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.components.grand.model.AbstractGrandQueryService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qctestlist.AggTestlistHVO;
import nc.itf.pubapp.uif2app.components.grand.IGrandAggVosQueryService;
import nc.itf.qcco.IQctestlistMaintain;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceQctestlistMaintainProxy extends AbstractGrandQueryService implements 
IDataOperationService,
IQueryService  {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		//IQctestlistMaintain query = NCLocator.getInstance().lookup(
		//		IQctestlistMaintain.class);
		//return query.query(queryScheme);
		IGrandAggVosQueryService query = NCLocator.getInstance().lookup(IGrandAggVosQueryService.class);
		Map<String, CircularlyAccessibleValueObject> relationShip = super.getGrandTabAndVOMap();
		AggTestlistHVO[] result = (AggTestlistHVO[]) query.query(queryScheme, null, (HashMap<String, CircularlyAccessibleValueObject>)relationShip, AggTestlistHVO.class);
		return result;
	}

	 @Override
	    public IBill[] insert(IBill[] value) throws BusinessException {
	        IQctestlistMaintain operator = NCLocator.getInstance().lookup(IQctestlistMaintain.class);
	        AggTestlistHVO[] vos = (AggTestlistHVO[]) operator.insert((AggTestlistHVO[]) value);
	        return vos;
	    }
	    @Override
	    public IBill[] update(IBill[] value) throws BusinessException {
	        IQctestlistMaintain operator = NCLocator.getInstance().lookup(IQctestlistMaintain.class);
	        AggTestlistHVO[] vos = (AggTestlistHVO[]) operator.update((AggTestlistHVO[]) value);
	        return vos;
	    }
	    @Override
	    public IBill[] delete(IBill[] value) throws BusinessException {
	       
	        IQctestlistMaintain operator = NCLocator.getInstance().lookup(IQctestlistMaintain.class);
	        operator.delete((AggTestlistHVO[]) value);
	        return value;
	    }

		
	

}