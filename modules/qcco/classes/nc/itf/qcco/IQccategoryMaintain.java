package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccategory.ProductCategoryVO;

public interface IQccategoryMaintain extends ISmartService{

	 public ProductCategoryVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}