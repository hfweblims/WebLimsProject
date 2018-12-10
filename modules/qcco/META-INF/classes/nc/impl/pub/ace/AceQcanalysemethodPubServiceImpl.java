package nc.impl.pub.ace;

import nc.bs.qcco.qcanalysemethod.ace.bp.AceQcanalysemethodInsertBP;
import nc.bs.qcco.qcanalysemethod.ace.bp.AceQcanalysemethodUpdateBP;
import nc.bs.qcco.qcanalysemethod.ace.bp.AceQcanalysemethodDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.analysemethod.AggAnalyseMethodHVO;


public abstract class AceQcanalysemethodPubServiceImpl {
	// 新增
	public AggAnalyseMethodHVO[] pubinsertBills(AggAnalyseMethodHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggAnalyseMethodHVO> transferTool = new BillTransferTool<AggAnalyseMethodHVO>(
					vos);
			AggAnalyseMethodHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQcanalysemethodInsertBP action = new AceQcanalysemethodInsertBP();
			AggAnalyseMethodHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggAnalyseMethodHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggAnalyseMethodHVO> transferTool = new BillTransferTool<AggAnalyseMethodHVO>(
					vos);
			AggAnalyseMethodHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQcanalysemethodDeleteBP deleteBP = new AceQcanalysemethodDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggAnalyseMethodHVO[] pubupdateBills(AggAnalyseMethodHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggAnalyseMethodHVO> transTool = new BillTransferTool<AggAnalyseMethodHVO>(
					vos);
			// 补全前台VO
			AggAnalyseMethodHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggAnalyseMethodHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQcanalysemethodUpdateBP bp = new AceQcanalysemethodUpdateBP();
			AggAnalyseMethodHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggAnalyseMethodHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggAnalyseMethodHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggAnalyseMethodHVO> query = new BillLazyQuery<AggAnalyseMethodHVO>(
					AggAnalyseMethodHVO.class);
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