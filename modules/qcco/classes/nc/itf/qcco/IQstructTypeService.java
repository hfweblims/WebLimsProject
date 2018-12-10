package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQstructTypeService {
	public abstract List<Object> queryAllStructType()
		    throws BusinessException;

		  public abstract List<Object> queryStructTypeByCondition(String paramString)
		    throws BusinessException;
}
