package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcentstandard.EntstandardVO;

public interface IQcentstandardMaintain extends ISmartService{

	 public EntstandardVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}