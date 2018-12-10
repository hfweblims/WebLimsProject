package nc.bs.qcco.qccategory.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qccategory.ProductCategoryVO;

public class AceQccategoryBP {

	public ProductCategoryVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<ProductCategoryVO>(ProductCategoryVO.class).query(querySheme,
				null);
	}
}
