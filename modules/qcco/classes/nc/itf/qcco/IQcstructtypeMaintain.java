package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcstructtype.StructTypeVO;

public interface IQcstructtypeMaintain extends ISmartService{

	 public StructTypeVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}