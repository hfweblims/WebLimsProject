package nc.impl.qcco;

import nc.impl.pub.ace.AceQccommissiontypePubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;
import nc.itf.qcco.IQccommissiontypeMaintain;

public class QccommissiontypeMaintainImpl extends AceQccommissiontypePubServiceImpl
		implements IQccommissiontypeMaintain {

	@Override
	public CommissionTypeVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<CommissionTypeVO> saveAction = new BatchSaveAction<CommissionTypeVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
