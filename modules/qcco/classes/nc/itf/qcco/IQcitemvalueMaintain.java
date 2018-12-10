package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcitemvalue.ItemValueVO;

public interface IQcitemvalueMaintain extends ISmartService{

	 public ItemValueVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}