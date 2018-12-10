package nc.impl.qcco;

import nc.impl.pub.ace.AceQctestemperaturePubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qctestemperature.TestemperatureVO;
import nc.itf.qcco.IQctestemperatureMaintain;

public class QctestemperatureMaintainImpl extends AceQctestemperaturePubServiceImpl
		implements IQctestemperatureMaintain {

	@Override
	public TestemperatureVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<TestemperatureVO> saveAction = new BatchSaveAction<TestemperatureVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
