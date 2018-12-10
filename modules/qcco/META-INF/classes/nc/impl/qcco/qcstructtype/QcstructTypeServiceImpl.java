package nc.impl.qcco.qcstructtype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQstructTypeService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcstructtype.StructTypeVO;

public class QcstructTypeServiceImpl implements IQstructTypeService{

	@Override
	public List<Object> queryAllStructType() throws BusinessException {
		String con = "dr = 0";
		return queryStructTypeByCondition(con);
	}

	@Override
	public List<Object> queryStructTypeByCondition(String con)
			throws BusinessException {
		if (StringUtil.isEmpty(con)) {
		      con = "1=1 and dr=0 ";
		    }
		    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

		    Collection col = service.queryBillOfVOByCond(StructTypeVO.class, con, false, false);
		    return new ArrayList(col);
	}

}
