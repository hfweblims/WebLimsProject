package nc.bs.qcco.qccommissiontype.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qccommissiontype.CommissionTypeVO;

public class AceQccommissiontypeBP {

	public CommissionTypeVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<CommissionTypeVO>(CommissionTypeVO.class).query(querySheme,
				null);
	}
}
