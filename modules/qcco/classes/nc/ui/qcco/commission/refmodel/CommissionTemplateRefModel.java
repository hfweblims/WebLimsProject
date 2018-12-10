package nc.ui.qcco.commission.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class CommissionTemplateRefModel extends AbstractRefModel {

	public CommissionTemplateRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("委托单模板");
		setRefTitle("委托单模板");
		setFieldCode(new String[] {
		"pk_billtypecode",
		"bill_templetcaption"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_billtemplet",
		"dividerproportion",
		"bill_templetname",
		"pk_corp",
		"nodecode",
		"pk_org"
			});
		setPkFieldCode("pk_billtemplet");
		setWherePart(" pub_billtemplet.pk_billtemplet <> '0' and pk_billtypecode = 'C0J00202'");
		setTableName("pub_billtemplet");
		setRefCodeField("pk_billtypecode");
		setRefNameField("bill_templetcaption");
	
	}
	
}