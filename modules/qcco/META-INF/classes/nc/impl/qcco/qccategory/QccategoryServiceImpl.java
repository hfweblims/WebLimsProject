package nc.impl.qcco.qccategory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQccategoryService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qccategory.ProductCategoryVO;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;

public class QccategoryServiceImpl implements IQccategoryService{
	@Override
	public List<Object> queryAllCategory() throws BusinessException {
		String con = "dr = 0";
		return queryCategoryByCondition(con);
	}

	@Override
	public List<Object> queryCategoryByCondition(String con)
			throws BusinessException {
		if (StringUtil.isEmpty(con)) {
		      con = "1=1 and dr=0 ";
		    }
		    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

		    Collection col = service.queryBillOfVOByCond(ProductCategoryVO.class, con, false, false);
		    return new ArrayList(col);
	}
}
