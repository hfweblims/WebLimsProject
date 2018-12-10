package nc.impl.qcco;

import nc.impl.pub.ace.AceQcstructtypePubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcstructtype.StructTypeVO;
import nc.itf.qcco.IQcstructtypeMaintain;

public class QcstructtypeMaintainImpl extends AceQcstructtypePubServiceImpl
		implements IQcstructtypeMaintain {

	@Override
	public StructTypeVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<StructTypeVO> saveAction = new BatchSaveAction<StructTypeVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
