package nc.ui.qcco.qcvaluetype.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;
import nc.itf.qcco.IQcvaluetypeMaintain;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceQcvaluetypeMaintainProxy implements IDataOperationService,
		IQueryService ,ISingleBillService<AggValueTypeHVO>{
	@Override
	public IBill[] insert(IBill[] value) throws BusinessException {
		IQcvaluetypeMaintain operator = NCLocator.getInstance().lookup(
				IQcvaluetypeMaintain.class);
		AggValueTypeHVO[] vos = operator.insert((AggValueTypeHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] update(IBill[] value) throws BusinessException {
		IQcvaluetypeMaintain operator = NCLocator.getInstance().lookup(
				IQcvaluetypeMaintain.class);
		AggValueTypeHVO[] vos = operator.update((AggValueTypeHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] delete(IBill[] value) throws BusinessException {
		// 目前的删除并不是走这个方法，由于pubapp不支持从这个服务中执行删除操作
		// 单据的删除实际上使用的是：ISingleBillService<AggSingleBill>的operateBill
		IQcvaluetypeMaintain operator = NCLocator.getInstance().lookup(
				IQcvaluetypeMaintain.class);
		operator.delete((AggValueTypeHVO[]) value);
		return value;
	}
	
	@Override
	public AggValueTypeHVO operateBill(AggValueTypeHVO bill) throws Exception {
		IQcvaluetypeMaintain operator = NCLocator.getInstance().lookup(
				IQcvaluetypeMaintain.class);
		operator.delete(new AggValueTypeHVO[] { bill });
		return bill;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IQcvaluetypeMaintain query = NCLocator.getInstance().lookup(
				IQcvaluetypeMaintain.class);
		return query.query(queryScheme);
	}

}
