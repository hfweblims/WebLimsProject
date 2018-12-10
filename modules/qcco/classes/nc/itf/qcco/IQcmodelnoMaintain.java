package nc.itf.qcco;

import nc.itf.pubapp.pub.smart.ISmartService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcmodelno.ModelnoVO;

public interface IQcmodelnoMaintain extends ISmartService{

	 public ModelnoVO[] query(IQueryScheme queryScheme)
      throws BusinessException, Exception;
}