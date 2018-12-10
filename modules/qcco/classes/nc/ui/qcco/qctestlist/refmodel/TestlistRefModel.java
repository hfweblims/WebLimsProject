package nc.ui.qcco.qctestlist.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class TestlistRefModel extends AbstractRefModel {

	public TestlistRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("testlist");
		setRefTitle("testlist");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"??",
		"¦W?"
				});
		setHiddenFieldCode(new String[] {
		"pk_testlist",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"lastmaketime",
		"pk_testlist",
		"changedate",
		"changer",
		"isremove",
		"groupname",
		"extlink",
		"isgloble",
		"belongs",
		"isresultorder",
		"approvelrole",
		"pk_entstandart",
		"dbilldate"
			});
		setPkFieldCode("pk_testlist");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_testlist");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}