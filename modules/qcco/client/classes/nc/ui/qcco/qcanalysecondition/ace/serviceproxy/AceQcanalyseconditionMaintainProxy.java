package nc.ui.qcco.qcanalysecondition.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;
import nc.itf.qcco.IQcanalyseconditionMaintain;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceQcanalyseconditionMaintainProxy implements IDataOperationService,
		IQueryService ,ISingleBillService<AggAnalyseConditionHVO>{
	@Override
	public IBill[] insert(IBill[] value) throws BusinessException {
		IQcanalyseconditionMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseconditionMaintain.class);
		AggAnalyseConditionHVO[] vos = operator.insert((AggAnalyseConditionHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] update(IBill[] value) throws BusinessException {
		IQcanalyseconditionMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseconditionMaintain.class);
		AggAnalyseConditionHVO[] vos = operator.update((AggAnalyseConditionHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] delete(IBill[] value) throws BusinessException {
		// 目前的删除并不是走这个方法，由于pubapp不支持从这个服务中执行删除操作
		// 单据的删除实际上使用的是：ISingleBillService<AggSingleBill>的operateBill
		IQcanalyseconditionMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseconditionMaintain.class);
		operator.delete((AggAnalyseConditionHVO[]) value);
		return value;
	}
	
	@Override
	public AggAnalyseConditionHVO operateBill(AggAnalyseConditionHVO bill) throws Exception {
		IQcanalyseconditionMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseconditionMaintain.class);
		operator.delete(new AggAnalyseConditionHVO[] { bill });
		return bill;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IQcanalyseconditionMaintain query = NCLocator.getInstance().lookup(
				IQcanalyseconditionMaintain.class);
		return query.query(queryScheme);
	}

}
