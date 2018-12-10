package nc.impl.qcco;

import nc.impl.pub.ace.AceQcitemvaluePubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcitemvalue.ItemValueVO;
import nc.itf.qcco.IQcitemvalueMaintain;

public class QcitemvalueMaintainImpl extends AceQcitemvaluePubServiceImpl
		implements IQcitemvalueMaintain {

	@Override
	public ItemValueVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<ItemValueVO> saveAction = new BatchSaveAction<ItemValueVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
