package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQcentstandardService {
	public abstract List<Object> queryAllCommissonType()
		    throws BusinessException;

		  public abstract List<Object> queryCommissonTypeByCondition(String paramString)
		    throws BusinessException;
}
