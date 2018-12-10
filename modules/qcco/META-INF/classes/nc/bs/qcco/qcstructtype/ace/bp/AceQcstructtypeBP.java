package nc.bs.qcco.qcstructtype.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qcstructtype.StructTypeVO;

public class AceQcstructtypeBP {

	public StructTypeVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<StructTypeVO>(StructTypeVO.class).query(querySheme,
				null);
	}
}
