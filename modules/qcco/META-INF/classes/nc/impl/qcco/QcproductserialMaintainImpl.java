package nc.impl.qcco;

import nc.impl.pub.ace.AceQcproductserialPubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcproductserial.ProductSerialVO;
import nc.itf.qcco.IQcproductserialMaintain;

public class QcproductserialMaintainImpl extends AceQcproductserialPubServiceImpl
		implements IQcproductserialMaintain {

	@Override
	public ProductSerialVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<ProductSerialVO> saveAction = new BatchSaveAction<ProductSerialVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
