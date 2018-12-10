package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQcitemvalueService {
	public abstract List<Object> queryAllItemValue()
		    throws BusinessException;

		  public abstract List<Object> queryItemValueByCondition(String paramString)
		    throws BusinessException;
}
