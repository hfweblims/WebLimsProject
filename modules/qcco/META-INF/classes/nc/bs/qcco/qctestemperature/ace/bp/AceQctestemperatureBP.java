package nc.bs.qcco.qctestemperature.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qctestemperature.TestemperatureVO;

public class AceQctestemperatureBP {

	public TestemperatureVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<TestemperatureVO>(TestemperatureVO.class).query(querySheme,
				null);
	}
}
