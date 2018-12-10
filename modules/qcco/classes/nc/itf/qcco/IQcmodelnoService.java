package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQcmodelnoService {
	public abstract List<Object> queryAllModelNo()
		    throws BusinessException;

		  public abstract List<Object> queryModelNoByCondition(String paramString)
		    throws BusinessException;
}
