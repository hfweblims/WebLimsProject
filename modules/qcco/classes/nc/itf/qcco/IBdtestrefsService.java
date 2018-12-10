package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;

public interface IBdtestrefsService {
	public abstract List<Object> queryAllTestRefs()
		    throws BusinessException;

		  public abstract List<Object> queryTestRefsByCondition(String paramString)
		    throws BusinessException;
}
