package nc.ui.qcco.qcstructtype.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class StructtypeRefModel extends AbstractRefModel {

	public StructtypeRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("结构类型");
		setRefTitle("结构类型");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_structtype",
		"pk_group",
		"pk_org",
		"pk_productserial",
		"creator",
		"pk_entstandard",
		"creationtime",
		"modifier",
		"modifiedtime"
			});
		setPkFieldCode("pk_structtype");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_structtype");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}