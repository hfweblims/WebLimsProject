package nc.ui.qcco.qcmodelno.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class ModelnoRefModel extends AbstractRefModel {

	public ModelnoRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("规格号");
		setRefTitle("规格号");
		setFieldCode(new String[] {
		"code",
		"name"
				});
		setFieldName(new String[] {
		"编码",
		"名称"
				});
		setHiddenFieldCode(new String[] {
		"pk_modelno",
		"pk_group",
		"pk_org",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime",
		"pk_productserial",
		"pk_entstandard"
			});
		setPkFieldCode("pk_modelno");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_modelno");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}