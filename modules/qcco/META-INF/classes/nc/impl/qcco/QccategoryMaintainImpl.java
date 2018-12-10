package nc.impl.qcco;

import nc.impl.pub.ace.AceQccategoryPubServiceImpl;
import nc.impl.pubapp.pub.smart.BatchSaveAction;
import nc.vo.bd.meta.BatchOperateVO;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccategory.ProductCategoryVO;
import nc.itf.qcco.IQccategoryMaintain;

public class QccategoryMaintainImpl extends AceQccategoryPubServiceImpl
		implements IQccategoryMaintain {

	@Override
	public ProductCategoryVO[] query(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerybasedoc(queryScheme);
	}

	@Override
	public BatchOperateVO batchSave(BatchOperateVO batchVO) throws BusinessException {
		BatchSaveAction<ProductCategoryVO> saveAction = new BatchSaveAction<ProductCategoryVO>();
		BatchOperateVO retData = saveAction.batchSave(batchVO);
		return retData;
	}
}
