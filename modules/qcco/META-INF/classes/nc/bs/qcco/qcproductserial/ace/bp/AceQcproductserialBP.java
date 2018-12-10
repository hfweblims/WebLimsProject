package nc.bs.qcco.qcproductserial.ace.bp;

import nc.impl.pubapp.pattern.data.vo.SchemeVOQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.qcco.qcproductserial.ProductSerialVO;

public class AceQcproductserialBP {

	public ProductSerialVO[] queryByQueryScheme(IQueryScheme querySheme) {
		QuerySchemeProcessor p = new QuerySchemeProcessor(querySheme);
		p.appendFuncPermissionOrgSql();
		return new SchemeVOQuery<ProductSerialVO>(ProductSerialVO.class).query(querySheme,
				null);
	}
}
