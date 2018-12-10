package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qctestemperature.TestemperatureVO;

public interface IQctestemperatureMaintain extends ISmartService{

	 public TestemperatureVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}