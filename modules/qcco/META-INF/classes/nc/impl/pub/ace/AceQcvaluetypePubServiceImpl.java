package nc.impl.pub.ace;

import nc.bs.qcco.qcvaluetype.ace.bp.AceQcvaluetypeInsertBP;
import nc.bs.qcco.qcvaluetype.ace.bp.AceQcvaluetypeUpdateBP;
import nc.bs.qcco.qcvaluetype.ace.bp.AceQcvaluetypeDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcvaluetype.AggValueTypeHVO;

public abstract class AceQcvaluetypePubServiceImpl {
	// 新增
	public AggValueTypeHVO[] pubinsertBills(AggValueTypeHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggValueTypeHVO> transferTool = new BillTransferTool<AggValueTypeHVO>(
					vos);
			AggValueTypeHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQcvaluetypeInsertBP action = new AceQcvaluetypeInsertBP();
			AggValueTypeHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggValueTypeHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggValueTypeHVO> transferTool = new BillTransferTool<AggValueTypeHVO>(
					vos);
			AggValueTypeHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQcvaluetypeDeleteBP deleteBP = new AceQcvaluetypeDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggValueTypeHVO[] pubupdateBills(AggValueTypeHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggValueTypeHVO> transTool = new BillTransferTool<AggValueTypeHVO>(
					vos);
			// 补全前台VO
			AggValueTypeHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggValueTypeHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQcvaluetypeUpdateBP bp = new AceQcvaluetypeUpdateBP();
			AggValueTypeHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggValueTypeHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggValueTypeHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggValueTypeHVO> query = new BillLazyQuery<AggValueTypeHVO>(
					AggValueTypeHVO.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

}