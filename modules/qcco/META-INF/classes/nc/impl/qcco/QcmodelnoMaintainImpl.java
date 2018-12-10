package nc.impl.qcco;

import nc.impl.pub.ace.AceQcmodelnoPubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcmodelno.ModelnoVO;
import nc.itf.qcco.IQcmodelnoMaintain;

public class QcmodelnoMaintainImpl extends AceQcmodelnoPubServiceImpl
		implements IQcmodelnoMaintain {

	@Override
	public ModelnoVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<ModelnoVO> saveAction = new BatchSaveAction<ModelnoVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
