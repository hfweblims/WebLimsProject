package nc.vo.qcco.qccontactortype;

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
 
public class ContactorTypeVO extends SuperVO {
	private static final long serialVersionUID = -8006589555544190243L;
/**
*主键
*/
public String pk_contactortype;
/**
*创建人
*/
public String creator;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*修改人
*/
public String modifier;
/**
*修改时间
*/
public UFDateTime modifiedtime;
/**
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*集团
*/
public String pk_group;
/**
*组织
*/
public String pk_org;
/**
*产品系列
*/
public String pk_productserial;
/**
*企业标准
*/
public String pk_entstandard;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_contactortype的Getter方法.属性名：主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_contactortype() {
return this.pk_contactortype;
} 

/**
* 属性pk_contactortype的Setter方法.属性名：主键
* 创建日期:2018-12-5
* @param newPk_contactortype java.lang.String
*/
public void setPk_contactortype ( String pk_contactortype) {
this.pk_contactortype=pk_contactortype;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2018-12-5
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2018-12-5
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2018-12-5
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：修改人
*  创建日期:2018-12-5
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：修改人
* 创建日期:2018-12-5
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifiedtime的Getter方法.属性名：修改时间
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* 属性modifiedtime的Setter方法.属性名：修改时间
* 创建日期:2018-12-5
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
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
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2018-12-5
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2018-12-5
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：组织
*  创建日期:2018-12-5
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：组织
* 创建日期:2018-12-5
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_productserial的Getter方法.属性名：产品系列
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public String getPk_productserial() {
return this.pk_productserial;
} 

/**
* 属性pk_productserial的Setter方法.属性名：产品系列
* 创建日期:2018-12-5
* @param newPk_productserial nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public void setPk_productserial ( String pk_productserial) {
this.pk_productserial=pk_productserial;
} 
 
/**
* 属性 pk_entstandard的Getter方法.属性名：企业标准
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcentstandard.EntstandardVO
*/
public String getPk_entstandard() {
return this.pk_entstandard;
} 

/**
* 属性pk_entstandard的Setter方法.属性名：企业标准
* 创建日期:2018-12-5
* @param newPk_entstandard nc.vo.qcco.qcentstandard.EntstandardVO
*/
public void setPk_entstandard ( String pk_entstandard) {
this.pk_entstandard=pk_entstandard;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.contactortype");
    }
   }
    