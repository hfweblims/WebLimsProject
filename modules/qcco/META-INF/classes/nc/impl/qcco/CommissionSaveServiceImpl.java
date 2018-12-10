package nc.impl.qcco;

import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.validation.IValidationService;
import nc.itf.qcco.ICommissionSaveService;
import nc.itf.qcco.ICommissionMaintain;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.qcco.commission.AggCommissionHVO;
import nc.vo.qcco.commission.CommissionRVO;

public class CommissionSaveServiceImpl implements ICommissionSaveService{
	
	private BaseDAO dao ;
	public BaseDAO getBasedao(){
		if(dao == null){
			return new BaseDAO();
		}
		return dao;
	}
	
	@Override
	public IBill[] save(String stat, Object value, List<CommissionRVO> list) throws BusinessException{
		//±£´æËï±í
		this.getBasedao().insertVOList(list);
		if(stat.equals("add")){
			return NCLocator.getInstance().lookup(ICommissionMaintain.class).insert(new AggCommissionHVO[]{(AggCommissionHVO) value});
		}
		if(stat.equals("edit")){
			return NCLocator.getInstance().lookup(ICommissionMaintain.class).update(new AggCommissionHVO[]{(AggCommissionHVO)value});
		}
		return null;
		
	}
	
}
