package nc.ui.qcco.qcanalysecondition.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class AnalyseconditionRefModel extends AbstractRefModel {

	public AnalyseconditionRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("测试条件");
		setRefTitle("测试条件");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_analysecondition",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"lastmaketime",
		"pk_valuetype",
		"componentname",
		"docversion",
		"displayorder",
		"resulttype",
		"unit",
		"minvalue",
		"maxvalue",
		"isconfirm",
		"istruncate",
		"decbits",
		"attrname8",
		"pk_instrument",
		"usecode",
		"isautocalc",
		"pk_listdoc",
		"cancelable",
		"isreport",
		"selectable",
		"iscarry",
		"hasprop",
		"isformatcalc",
		"isdisplay",
		"limsprogram",
		"bit2",
		"result",
		"transtype",
		"sourcetype",
		"pk_sourcedept",
		"pk_targetdept",
		"pk_contactortype",
		"pk_modelno",
		"cndefvalue",
		"endefvalue",
		"reportname",
		"dbilldate",
		"pk_analysecondition"
			});
		setPkFieldCode("pk_analysecondition");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_analysecondition");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}