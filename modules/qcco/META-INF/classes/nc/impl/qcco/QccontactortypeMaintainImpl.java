package nc.impl.qcco;

import nc.impl.pub.ace.AceQccontactortypePubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;
import nc.itf.qcco.IQccontactortypeMaintain;

public class QccontactortypeMaintainImpl extends AceQccontactortypePubServiceImpl
		implements IQccontactortypeMaintain {

	@Override
	public ContactorTypeVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<ContactorTypeVO> saveAction = new BatchSaveAction<ContactorTypeVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
