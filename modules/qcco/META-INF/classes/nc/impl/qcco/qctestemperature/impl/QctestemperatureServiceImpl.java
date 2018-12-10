package nc.impl.qcco.qctestemperature.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQctestemperatureService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcmodelno.ModelnoVO;
import nc.vo.qcco.qctestemperature.TestemperatureVO;

public class QctestemperatureServiceImpl implements IQctestemperatureService{

	@Override
	public List<Object> queryAllTestEmperature() throws BusinessException {
		String con = "dr = 0";
		return queryTestEmperatureByCondition(con);
	}

	@Override
	public List<Object> queryTestEmperatureByCondition(String con)
			throws BusinessException {
		if (StringUtil.isEmpty(con)) {
		      con = "1=1 and dr=0 ";
		    }
		    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

		    Collection col = service.queryBillOfVOByCond(TestemperatureVO.class, con, false, false);
		    return new ArrayList(col);
	}

}
