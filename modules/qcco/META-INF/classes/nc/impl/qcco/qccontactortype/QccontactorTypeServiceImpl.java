package nc.impl.qcco.qccontactortype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQccontactortypeService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;

public class QccontactorTypeServiceImpl implements IQccontactortypeService{

	@Override
	public List<Object> queryAllContactorType() throws BusinessException {
		String con = "dr = 0";
		return queryContactorTypeByCondition(con);
	}

	@Override
	public List<Object> queryContactorTypeByCondition(String con)throws BusinessException{
	if (StringUtil.isEmpty(con)) {
	      con = "1=1 and dr=0 ";
	    }
	    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

	    Collection col = service.queryBillOfVOByCond(ContactorTypeVO.class, con, false, false);
	    return new ArrayList(col);
	}

}
