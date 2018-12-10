package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQctestemperatureService {

	public abstract List<Object> queryAllTestEmperature()throws BusinessException;
	  public abstract List<Object> queryTestEmperatureByCondition(String paramString)
			    throws BusinessException;
}
