package nc.ui.qcco.analysemethod.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class AnalysemethodRefModel extends AbstractRefModel {

	public AnalysemethodRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("分析方法");
		setRefTitle("分析方法");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_analysemethod",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"maketime",
		"lastmaketime",
		"pk_analyzetype",
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
		"pk_analysemethod",
		"cbilldate"
			});
		setPkFieldCode("pk_analysemethod");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_analysemethod");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}