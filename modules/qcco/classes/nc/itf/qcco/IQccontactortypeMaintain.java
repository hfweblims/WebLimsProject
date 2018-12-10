package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;

public interface IQccontactortypeMaintain extends ISmartService{

	 public ContactorTypeVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}