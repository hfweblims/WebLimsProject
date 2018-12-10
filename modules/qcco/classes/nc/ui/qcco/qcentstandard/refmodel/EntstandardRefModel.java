package nc.ui.qcco.qcentstandard.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class EntstandardRefModel extends AbstractRefModel {

	public EntstandardRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("企业标准");
		setRefTitle("企业标准");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_entstandard",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"pk_productserial",
		"pk_category"
			});
		setPkFieldCode("pk_entstandard");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_entstandard");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}