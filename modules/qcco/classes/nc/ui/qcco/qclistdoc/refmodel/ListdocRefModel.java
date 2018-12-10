package nc.ui.qcco.qclistdoc.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class ListdocRefModel extends AbstractRefModel {

	public ListdocRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("List");
		setRefTitle("List");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"±àÂë",
		"Ãû³Æ"
				});
		setHiddenFieldCode(new String[] {
		"pk_listdoc",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"pk_samplegroup",
		"memo",
		"isremove",
		"extdir",
		"lastmaketime",
		"isorder",
		"pk_listdoc",
		"dbilldate"
			});
		setPkFieldCode("pk_listdoc");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_listdoc");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}