package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public abstract interface IQccategoryService {
	public abstract List<Object> queryAllCategory()
		    throws BusinessException;

		  public abstract List<Object> queryCategoryByCondition(String paramString)
		    throws BusinessException;
}
