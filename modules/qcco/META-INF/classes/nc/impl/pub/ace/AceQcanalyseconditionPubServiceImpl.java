package nc.impl.pub.ace;

import nc.bs.qcco.qcanalysecondition.ace.bp.AceQcanalyseconditionInsertBP;
import nc.bs.qcco.qcanalysecondition.ace.bp.AceQcanalyseconditionUpdateBP;
import nc.bs.qcco.qcanalysecondition.ace.bp.AceQcanalyseconditionDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcanalysecondition.AggAnalyseConditionHVO;

public abstract class AceQcanalyseconditionPubServiceImpl {
	// 新增
	public AggAnalyseConditionHVO[] pubinsertBills(AggAnalyseConditionHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggAnalyseConditionHVO> transferTool = new BillTransferTool<AggAnalyseConditionHVO>(
					vos);
			AggAnalyseConditionHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQcanalyseconditionInsertBP action = new AceQcanalyseconditionInsertBP();
			AggAnalyseConditionHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggAnalyseConditionHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggAnalyseConditionHVO> transferTool = new BillTransferTool<AggAnalyseConditionHVO>(
					vos);
			AggAnalyseConditionHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQcanalyseconditionDeleteBP deleteBP = new AceQcanalyseconditionDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggAnalyseConditionHVO[] pubupdateBills(AggAnalyseConditionHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggAnalyseConditionHVO> transTool = new BillTransferTool<AggAnalyseConditionHVO>(
					vos);
			// 补全前台VO
			AggAnalyseConditionHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggAnalyseConditionHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQcanalyseconditionUpdateBP bp = new AceQcanalyseconditionUpdateBP();
			AggAnalyseConditionHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggAnalyseConditionHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggAnalyseConditionHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggAnalyseConditionHVO> query = new BillLazyQuery<AggAnalyseConditionHVO>(
					AggAnalyseConditionHVO.class);
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