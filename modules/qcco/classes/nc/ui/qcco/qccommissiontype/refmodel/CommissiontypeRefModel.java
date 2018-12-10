package nc.ui.qcco.qccommissiontype.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class CommissiontypeRefModel extends AbstractRefModel {

	public CommissiontypeRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("委托类型");
		setRefTitle("委托类型");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_commissiontype",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"pk_group",
		"pk_org",
		"describe",
		"commissiontemplate"
			});
		setPkFieldCode("pk_commissiontype");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_commissiontype");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}