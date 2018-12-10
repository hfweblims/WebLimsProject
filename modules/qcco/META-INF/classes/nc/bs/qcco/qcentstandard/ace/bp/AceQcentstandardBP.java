package nc.bs.qcco.qcentstandard.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qcentstandard.EntstandardVO;

public class AceQcentstandardBP {

	public EntstandardVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<EntstandardVO>(EntstandardVO.class).query(querySheme,
				null);
	}
}
