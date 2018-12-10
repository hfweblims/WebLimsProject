package nc.vo.qcco.qcitemvalue;

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
 
public class ItemValueVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -3023332593057043810L;
/**
*主键
*/
public String pk_itemvalue;
/**
*值集
*/
public String pk_valueitem;
/**
*业务
*/
public String pk_bizpk;
/**
*取值
*/
public String itemvalue;
/**
*取值显示
*/
public String valuestring;
/**
*集团
*/
public String pk_group;
/**
*组织
*/
public String pk_org;
/**
*组织版本
*/
public String pk_org_v;
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
*制单时间
*/
public UFDateTime maketime;
/**
*最后修改时间
*/
public UFDateTime lastmaketime;
/**
*制单日期
*/
public UFDate dmakedate;
/**
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_itemvalue的Getter方法.属性名：主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_itemvalue() {
return this.pk_itemvalue;
} 

/**
* 属性pk_itemvalue的Setter方法.属性名：主键
* 创建日期:2018-12-5
* @param newPk_itemvalue java.lang.String
*/
public void setPk_itemvalue ( String pk_itemvalue) {
this.pk_itemvalue=pk_itemvalue;
} 
 
/**
* 属性 pk_valueitem的Getter方法.属性名：值集
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcvaluetype.ValueListBVO
*/
public String getPk_valueitem() {
return this.pk_valueitem;
} 

/**
* 属性pk_valueitem的Setter方法.属性名：值集
* 创建日期:2018-12-5
* @param newPk_valueitem nc.vo.qcco.qcvaluetype.ValueListBVO
*/
public void setPk_valueitem ( String pk_valueitem) {
this.pk_valueitem=pk_valueitem;
} 
 
/**
* 属性 pk_bizpk的Getter方法.属性名：业务
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_bizpk() {
return this.pk_bizpk;
} 

/**
* 属性pk_bizpk的Setter方法.属性名：业务
* 创建日期:2018-12-5
* @param newPk_bizpk java.lang.String
*/
public void setPk_bizpk ( String pk_bizpk) {
this.pk_bizpk=pk_bizpk;
} 
 
/**
* 属性 itemvalue的Getter方法.属性名：取值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getItemvalue() {
return this.itemvalue;
} 

/**
* 属性itemvalue的Setter方法.属性名：取值
* 创建日期:2018-12-5
* @param newItemvalue java.lang.String
*/
public void setItemvalue ( String itemvalue) {
this.itemvalue=itemvalue;
} 
 
/**
* 属性 valuestring的Getter方法.属性名：取值显示
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getValuestring() {
return this.valuestring;
} 

/**
* 属性valuestring的Setter方法.属性名：取值显示
* 创建日期:2018-12-5
* @param newValuestring java.lang.String
*/
public void setValuestring ( String valuestring) {
this.valuestring=valuestring;
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
* 属性 pk_org_v的Getter方法.属性名：组织版本
*  创建日期:2018-12-5
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：组织版本
* 创建日期:2018-12-5
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
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
* 属性 maketime的Getter方法.属性名：制单时间
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getMaketime() {
return this.maketime;
} 

/**
* 属性maketime的Setter方法.属性名：制单时间
* 创建日期:2018-12-5
* @param newMaketime nc.vo.pub.lang.UFDateTime
*/
public void setMaketime ( UFDateTime maketime) {
this.maketime=maketime;
} 
 
/**
* 属性 lastmaketime的Getter方法.属性名：最后修改时间
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getLastmaketime() {
return this.lastmaketime;
} 

/**
* 属性lastmaketime的Setter方法.属性名：最后修改时间
* 创建日期:2018-12-5
* @param newLastmaketime nc.vo.pub.lang.UFDateTime
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.lastmaketime=lastmaketime;
} 
 
/**
* 属性 dmakedate的Getter方法.属性名：制单日期
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDmakedate() {
return this.dmakedate;
} 

/**
* 属性dmakedate的Setter方法.属性名：制单日期
* 创建日期:2018-12-5
* @param newDmakedate nc.vo.pub.lang.UFDate
*/
public void setDmakedate ( UFDate dmakedate) {
this.dmakedate=dmakedate;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.itemvalue");
    }
   }
    