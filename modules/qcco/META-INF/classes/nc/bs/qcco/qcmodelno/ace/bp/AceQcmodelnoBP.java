package nc.bs.qcco.qcmodelno.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qcmodelno.ModelnoVO;

public class AceQcmodelnoBP {

	public ModelnoVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<ModelnoVO>(ModelnoVO.class).query(querySheme,
				null);
	}
}
