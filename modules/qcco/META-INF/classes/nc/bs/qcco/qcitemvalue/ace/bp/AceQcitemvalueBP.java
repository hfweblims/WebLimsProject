package nc.bs.qcco.qcitemvalue.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qcitemvalue.ItemValueVO;

public class AceQcitemvalueBP {

	public ItemValueVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<ItemValueVO>(ItemValueVO.class).query(querySheme,
				null);
	}
}
