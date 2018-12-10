package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IQcproductSerialService {

	public abstract List<Object> queryAllProductSerial()
		    throws BusinessException;

		  public abstract List<Object> queryProductSerialByCondition(String paramString)
		    throws BusinessException;
}

