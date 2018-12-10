package nc.vo.qcco.qclistdoc;

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
 
public class ListentryBVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -2217819432641610447L;
/**
*子表主键
*/
public String pk_listentry;
/**
*行号
*/
public String rowno;
/**
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*值
*/
public String value;
/**
*是否排序
*/
public UFBoolean isorder;
/**
*英文值
*/
public String envalue;
/**
*常量
*/
public String constvalue;
/**
*上层单据主键
*/
public String pk_listdoc;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_listentry的Getter方法.属性名：子表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_listentry() {
return this.pk_listentry;
} 

/**
* 属性pk_listentry的Setter方法.属性名：子表主键
* 创建日期:2018-12-5
* @param newPk_listentry java.lang.String
*/
public void setPk_listentry ( String pk_listentry) {
this.pk_listentry=pk_listentry;
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
* 属性 code的Getter方法.属性名：编码
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：编码
* 创建日期:2018-12-5
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* 属性 name的Getter方法.属性名：名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：名称
* 创建日期:2018-12-5
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* 属性 value的Getter方法.属性名：值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getValue() {
return this.value;
} 

/**
* 属性value的Setter方法.属性名：值
* 创建日期:2018-12-5
* @param newValue java.lang.String
*/
public void setValue ( String value) {
this.value=value;
} 
 
/**
* 属性 isorder的Getter方法.属性名：是否排序
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsorder() {
return this.isorder;
} 

/**
* 属性isorder的Setter方法.属性名：是否排序
* 创建日期:2018-12-5
* @param newIsorder nc.vo.pub.lang.UFBoolean
*/
public void setIsorder ( UFBoolean isorder) {
this.isorder=isorder;
} 
 
/**
* 属性 envalue的Getter方法.属性名：英文值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getEnvalue() {
return this.envalue;
} 

/**
* 属性envalue的Setter方法.属性名：英文值
* 创建日期:2018-12-5
* @param newEnvalue java.lang.String
*/
public void setEnvalue ( String envalue) {
this.envalue=envalue;
} 
 
/**
* 属性 constvalue的Getter方法.属性名：常量
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getConstvalue() {
return this.constvalue;
} 

/**
* 属性constvalue的Setter方法.属性名：常量
* 创建日期:2018-12-5
* @param newConstvalue java.lang.String
*/
public void setConstvalue ( String constvalue) {
this.constvalue=constvalue;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-12-5
* @return String
*/
public String getPk_listdoc(){
return this.pk_listdoc;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_listdoc String
*/
public void setPk_listdoc(String pk_listdoc){
this.pk_listdoc=pk_listdoc;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.listentry");
    }
   }
    