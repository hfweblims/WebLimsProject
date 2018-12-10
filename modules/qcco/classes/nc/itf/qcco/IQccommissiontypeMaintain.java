package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;

public interface IQccommissiontypeMaintain extends ISmartService{

	 public CommissionTypeVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}