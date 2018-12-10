package nc.impl.pub.ace;

import nc.bs.qcco.qclistdoc.ace.bp.AceQclistdocInsertBP;
import nc.bs.qcco.qclistdoc.ace.bp.AceQclistdocUpdateBP;
import nc.bs.qcco.qclistdoc.ace.bp.AceQclistdocDeleteBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.qcco.qclistdoc.AggListdocHVO;

public abstract class AceQclistdocPubServiceImpl {
	// 新增
	public AggListdocHVO[] pubinsertBills(AggListdocHVO[] vos)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggListdocHVO> transferTool = new BillTransferTool<AggListdocHVO>(
					vos);
			AggListdocHVO[] mergedVO = transferTool.getClientFullInfoBill();

			// 调用BP
			AceQclistdocInsertBP action = new AceQclistdocInsertBP();
			AggListdocHVO[] retvos = action.insert(mergedVO);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggListdocHVO[] vos) throws BusinessException {
		try {
			// 加锁 比较ts
			BillTransferTool<AggListdocHVO> transferTool = new BillTransferTool<AggListdocHVO>(
					vos);
			AggListdocHVO[] fullBills = transferTool.getClientFullInfoBill();
			AceQclistdocDeleteBP deleteBP = new AceQclistdocDeleteBP();
			deleteBP.delete(fullBills);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public AggListdocHVO[] pubupdateBills(AggListdocHVO[] vos)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<AggListdocHVO> transTool = new BillTransferTool<AggListdocHVO>(
					vos);
			// 补全前台VO
			AggListdocHVO[] fullBills = transTool.getClientFullInfoBill();
			// 获得修改前vo
			AggListdocHVO[] originBills = transTool.getOriginBills();
			// 调用BP
			AceQclistdocUpdateBP bp = new AceQclistdocUpdateBP();
			AggListdocHVO[] retBills = bp.update(fullBills, originBills);
			// 构造返回数据
			retBills = transTool.getBillForToClient(retBills);
			return retBills;
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggListdocHVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggListdocHVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggListdocHVO> query = new BillLazyQuery<AggListdocHVO>(
					AggListdocHVO.class);
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