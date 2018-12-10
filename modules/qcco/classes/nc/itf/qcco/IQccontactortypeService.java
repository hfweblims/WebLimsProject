package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQccontactortypeService {
	public abstract List<Object> queryAllContactorType()
		    throws BusinessException;

		  public abstract List<Object> queryContactorTypeByCondition(String paramString)
		    throws BusinessException;
}
