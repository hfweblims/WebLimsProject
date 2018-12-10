package nc.ui.qcco.qcvaluetype.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class ValuetypeRefModel extends AbstractRefModel {

	public ValuetypeRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("值类型");
		setRefTitle("值类型");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_valuetype",
		"pk_valuetype",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"lastmaketime",
		"dmakedate"
			});
		setPkFieldCode("pk_valuetype");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_valuetype");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}