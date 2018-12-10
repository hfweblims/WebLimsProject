package nc.impl.qcco.qcproductserial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import nc.itf.qcco.IQcproductSerialService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.qcco.qcmodelno.ModelnoVO;
import nc.vo.qcco.qcproductserial.ProductSerialVO;

public class QcproductSerialServiceImpl implements IQcproductSerialService{

	@Override
	public List<Object> queryAllProductSerial() throws BusinessException {
		String con = "dr = 0";
		return queryProductSerialByCondition(con);
	}

	@Override
	public List<Object> queryProductSerialByCondition(String con)
			throws BusinessException {
		if (StringUtil.isEmpty(con)) {
		      con = "1=1 and dr=0 ";
		    }
		    IMDPersistenceQueryService service = MDPersistenceService.lookupPersistenceQueryService();

		    Collection col = service.queryBillOfVOByCond(ProductSerialVO.class, con, false, false);
		    return new ArrayList(col);
	}

}
