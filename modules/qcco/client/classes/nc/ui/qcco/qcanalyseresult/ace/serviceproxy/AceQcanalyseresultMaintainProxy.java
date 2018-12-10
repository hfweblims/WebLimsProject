package nc.ui.qcco.qcanalyseresult.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.pub.task.ISingleBillService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;
import nc.itf.qcco.IQcanalyseresultMaintain;

/**
 * 示例单据的操作代理
 * 
 * @author author
 * @version tempProject version
 */
public class AceQcanalyseresultMaintainProxy implements IDataOperationService,
		IQueryService ,ISingleBillService<AggAnalyseResultHVO>{
	@Override
	public IBill[] insert(IBill[] value) throws BusinessException {
		IQcanalyseresultMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseresultMaintain.class);
		AggAnalyseResultHVO[] vos = operator.insert((AggAnalyseResultHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] update(IBill[] value) throws BusinessException {
		IQcanalyseresultMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseresultMaintain.class);
		AggAnalyseResultHVO[] vos = operator.update((AggAnalyseResultHVO[]) value);
		return vos;
	}

	@Override
	public IBill[] delete(IBill[] value) throws BusinessException {
		// 目前的删除并不是走这个方法，由于pubapp不支持从这个服务中执行删除操作
		// 单据的删除实际上使用的是：ISingleBillService<AggSingleBill>的operateBill
		IQcanalyseresultMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseresultMaintain.class);
		operator.delete((AggAnalyseResultHVO[]) value);
		return value;
	}
	
	@Override
	public AggAnalyseResultHVO operateBill(AggAnalyseResultHVO bill) throws Exception {
		IQcanalyseresultMaintain operator = NCLocator.getInstance().lookup(
				IQcanalyseresultMaintain.class);
		operator.delete(new AggAnalyseResultHVO[] { bill });
		return bill;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IQcanalyseresultMaintain query = NCLocator.getInstance().lookup(
				IQcanalyseresultMaintain.class);
		return query.query(queryScheme);
	}

}
