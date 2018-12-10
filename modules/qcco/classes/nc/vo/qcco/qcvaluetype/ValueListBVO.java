package nc.vo.qcco.qcvaluetype;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2018-12-5
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class ValueListBVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -7121152471023567100L;
/**
*子表主键
*/
public String pk_valueitem;
/**
*取值项目编码
*/
public String code;
/**
*取值项目名称
*/
public String name;
/**
*取值项目类型
*/
public Integer datatype;
/**
*是否列表
*/
public UFBoolean islist;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_valuetype;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_valueitem的Getter方法.属性名：子表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_valueitem() {
return this.pk_valueitem;
} 

/**
* 属性pk_valueitem的Setter方法.属性名：子表主键
* 创建日期:2018-12-5
* @param newPk_valueitem java.lang.String
*/
public void setPk_valueitem ( String pk_valueitem) {
this.pk_valueitem=pk_valueitem;
} 
 
/**
* 属性 code的Getter方法.属性名：取值项目编码
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：取值项目编码
* 创建日期:2018-12-5
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* 属性 name的Getter方法.属性名：取值项目名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：取值项目名称
* 创建日期:2018-12-5
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* 属性 datatype的Getter方法.属性名：取值项目类型
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getDatatype() {
return this.datatype;
} 

/**
* 属性datatype的Setter方法.属性名：取值项目类型
* 创建日期:2018-12-5
* @param newDatatype java.lang.Integer
*/
public void setDatatype ( Integer datatype) {
this.datatype=datatype;
} 
 
/**
* 属性 islist的Getter方法.属性名：是否列表
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFUFBoolean
*/
public UFBoolean getIslist() {
return this.islist;
} 

/**
* 属性islist的Setter方法.属性名：是否列表
* 创建日期:2018-12-5
* @param newIslist nc.vo.pub.lang.UFBoolean
*/
public void setIslist ( UFBoolean islist) {
this.islist=islist;
} 
 
/**
* 属性 rowno的Getter方法.属性名：行号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getRowno() {
return this.rowno;
} 

/**
* 属性rowno的Setter方法.属性名：行号
* 创建日期:2018-12-5
* @param newRowno java.lang.String
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-12-5
* @return String
*/
public String getPk_valuetype(){
return this.pk_valuetype;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_valuetype String
*/
public void setPk_valuetype(String pk_valuetype){
this.pk_valuetype=pk_valuetype;
} 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2018-12-5
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("qcco.valuelist");
    }
   }
    