package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcproductserial.ProductSerialVO;

public interface IQcproductserialMaintain extends ISmartService{

	 public ProductSerialVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}