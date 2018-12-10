package nc.impl.pub.ace;

import nc.bs.qcco.qctestref.ace.bp.AceQctestrefInsertBP;
import nc.bs.qcco.qctestref.ace.bp.AceQctestrefUpdateBP;
import nc.bs.qcco.qctestref.ace.bp.AceQctestrefDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qctestref.AggTestrefHVO;

public abstract class AceQctestrefPubServiceImpl {
	// 新增
	public AggTestrefHVO[] pubinsertBills(AggTestrefHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggTestrefHVO> transferTool = new BillTransferTool<AggTestrefHVO>(
					vos);
			AggTestrefHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQctestrefInsertBP action = new AceQctestrefInsertBP();
			AggTestrefHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggTestrefHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggTestrefHVO> transferTool = new BillTransferTool<AggTestrefHVO>(
					vos);
			AggTestrefHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQctestrefDeleteBP deleteBP = new AceQctestrefDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggTestrefHVO[] pubupdateBills(AggTestrefHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggTestrefHVO> transTool = new BillTransferTool<AggTestrefHVO>(
					vos);
			// 补全前台VO
			AggTestrefHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggTestrefHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQctestrefUpdateBP bp = new AceQctestrefUpdateBP();
			AggTestrefHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggTestrefHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggTestrefHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggTestrefHVO> query = new BillLazyQuery<AggTestrefHVO>(
					AggTestrefHVO.class);
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