package nc.ui.qcco.qctestemperature.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class TestemperatureRefModel extends AbstractRefModel {

	public TestemperatureRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("²âÊÔÎÂ¶È");
		setRefTitle("²âÊÔÎÂ¶È");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"±àÂë",
		"Ãû³Æ"
				});
		setHiddenFieldCode(new String[] {
		"pk_testemperature",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"lastmaketime",
		"pk_structtype",
		"pk_modelno",
		"pk_entstandard",
		"pk_productserial",
		"analysename"
			});
		setPkFieldCode("pk_testemperature");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_testemperature");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}