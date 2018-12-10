package nc.bs.qcco.qccontactortype.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qccontactortype.ContactorTypeVO;

public class AceQccontactortypeBP {

	public ContactorTypeVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<ContactorTypeVO>(ContactorTypeVO.class).query(querySheme,
				null);
	}
}
