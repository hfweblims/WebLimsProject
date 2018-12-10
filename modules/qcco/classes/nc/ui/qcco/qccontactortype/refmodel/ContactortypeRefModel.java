package nc.ui.qcco.qccontactortype.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class ContactortypeRefModel extends AbstractRefModel {

	public ContactortypeRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("触点类型");
		setRefTitle("触点类型");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_contactortype",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"pk_group",
		"pk_org",
		"pk_productserial",
		"pk_entstandard"
			});
		setPkFieldCode("pk_contactortype");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_contactortype");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}