package nc.impl.qcco.qcitemvalue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import nc.itf.qcco.IQcitemvalueService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcitemvalue.ItemValueVO;

public class QcitemValueServiceImpl implements IQcitemvalueService{

	@Override
	public List<Object> queryAllItemValue() throws BusinessException {
		String con = " dr = 0 ";
		return queryItemValueByCondition(con);
	}

	@Override
	public List<Object> queryItemValueByCondition(String con)
			throws BusinessException {
		if(StringUtils.isEmpty(con)){
			 con = "1=1 and dr=0 ";
	    }
	    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

	    Collection col = service.queryBillOfVOByCond(ItemValueVO.class, con, false, false);
	    return new ArrayList(col);
	}

}
