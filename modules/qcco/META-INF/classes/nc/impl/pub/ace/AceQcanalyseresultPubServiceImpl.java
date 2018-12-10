package nc.impl.pub.ace;

import nc.bs.qcco.qcanalyseresult.ace.bp.AceQcanalyseresultInsertBP;
import nc.bs.qcco.qcanalyseresult.ace.bp.AceQcanalyseresultUpdateBP;
import nc.bs.qcco.qcanalyseresult.ace.bp.AceQcanalyseresultDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qcanalyseresult.AggAnalyseResultHVO;

public abstract class AceQcanalyseresultPubServiceImpl {
	// 新增
	public AggAnalyseResultHVO[] pubinsertBills(AggAnalyseResultHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggAnalyseResultHVO> transferTool = new BillTransferTool<AggAnalyseResultHVO>(
					vos);
			AggAnalyseResultHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQcanalyseresultInsertBP action = new AceQcanalyseresultInsertBP();
			AggAnalyseResultHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggAnalyseResultHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggAnalyseResultHVO> transferTool = new BillTransferTool<AggAnalyseResultHVO>(
					vos);
			AggAnalyseResultHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQcanalyseresultDeleteBP deleteBP = new AceQcanalyseresultDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggAnalyseResultHVO[] pubupdateBills(AggAnalyseResultHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggAnalyseResultHVO> transTool = new BillTransferTool<AggAnalyseResultHVO>(
					vos);
			// 补全前台VO
			AggAnalyseResultHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggAnalyseResultHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQcanalyseresultUpdateBP bp = new AceQcanalyseresultUpdateBP();
			AggAnalyseResultHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggAnalyseResultHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggAnalyseResultHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggAnalyseResultHVO> query = new BillLazyQuery<AggAnalyseResultHVO>(
					AggAnalyseResultHVO.class);
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