package nc.ui.qcco.qccategory.refmodel;

import nc.ui.bd.ref.AbstractRefModel;

public class ProductCategoryRefModel extends AbstractRefModel {

	public ProductCategoryRefModel() {
		super();
		init();
	}
	
	private void init(){
	
		setRefNodeName("产品分类");
		setRefTitle("产品分类");
		setFieldCode(new String[] {
		"code",
		"name",
		"pk_parent"
				});
		setFieldName(new String[] {
		"编码",
		"名称",
		"上级分类"
				});
		setHiddenFieldCode(new String[] {
		"pk_category",
		"pk_group",
		"pk_org",
		"pk_org_v",
		"creator",
		"creationtime",
		"modifier",
		"modifiedtime"
			});
		setPkFieldCode("pk_category");
		setWherePart("1=1 and isnull(dr,0)=0");
		setTableName("qc_category");
		setRefCodeField("code");
		setRefNameField("name");
	
	}
	
}