package nc.impl.qcco;

import nc.impl.pub.ace.AceQcentstandardPubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcentstandard.EntstandardVO;
import nc.itf.qcco.IQcentstandardMaintain;

public class QcentstandardMaintainImpl extends AceQcentstandardPubServiceImpl
		implements IQcentstandardMaintain {

	@Override
	public EntstandardVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<EntstandardVO> saveAction = new BatchSaveAction<EntstandardVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
