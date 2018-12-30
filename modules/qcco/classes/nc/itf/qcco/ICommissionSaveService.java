package nc.itf.qcco;

import java.util.List;

import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.qcco.commission.CommissionRVO;

public interface ICommissionSaveService {
	IBill[] save(String stat, Object value, List<CommissionRVO> list) throws BusinessException;
}
