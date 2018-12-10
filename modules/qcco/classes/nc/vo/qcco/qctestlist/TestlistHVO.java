package nc.vo.qcco.qctestlist;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
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
 
public class TestlistHVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 4983066086081364182L;
/**
*主表主键
*/
public String pk_testlist;
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
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*制单时间
*/
public UFDateTime maketime;
/**
*最后修改时间
*/
public UFDateTime lastmaketime;
/**
*更改日期
*/
public UFLiteralDate changedate;
/**
*更改人
*/
public String changer;
/**
*是否移除
*/
public UFBoolean isremove;
/**
*组名
*/
public String groupname;
/**
*扩展链接
*/
public String extlink;
/**
*全局标志
*/
public UFBoolean isgloble;
/**
*所属人
*/
public String belongs;
/**
*是否结果排序
*/
public UFBoolean isresultorder;
/**
*审批角色
*/
public String approvelrole;
/**
*企业标准
*/
public String pk_entstandart;
/**
*制单日期
*/
public UFDate dbilldate;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_testlist的Getter方法.属性名：主表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_testlist() {
return this.pk_testlist;
} 

/**
* 属性pk_testlist的Setter方法.属性名：主表主键
* 创建日期:2018-12-5
* @param newPk_testlist java.lang.String
*/
public void setPk_testlist ( String pk_testlist) {
this.pk_testlist=pk_testlist;
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
* 属性 changedate的Getter方法.属性名：更改日期
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFLiteralDate
*/
public UFLiteralDate getChangedate() {
return this.changedate;
} 

/**
* 属性changedate的Setter方法.属性名：更改日期
* 创建日期:2018-12-5
* @param newChangedate nc.vo.pub.lang.UFLiteralDate
*/
public void setChangedate ( UFLiteralDate changedate) {
this.changedate=changedate;
} 
 
/**
* 属性 changer的Getter方法.属性名：更改人
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getChanger() {
return this.changer;
} 

/**
* 属性changer的Setter方法.属性名：更改人
* 创建日期:2018-12-5
* @param newChanger java.lang.String
*/
public void setChanger ( String changer) {
this.changer=changer;
} 
 
/**
* 属性 isremove的Getter方法.属性名：是否移除
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFUFBoolean
*/
public UFBoolean getIsremove() {
return this.isremove;
} 

/**
* 属性isremove的Setter方法.属性名：是否移除
* 创建日期:2018-12-5
* @param newIsremove nc.vo.pub.lang.UFBoolean
*/
public void setIsremove ( UFBoolean isremove) {
this.isremove=isremove;
} 
 
/**
* 属性 groupname的Getter方法.属性名：组名
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getGroupname() {
return this.groupname;
} 

/**
* 属性groupname的Setter方法.属性名：组名
* 创建日期:2018-12-5
* @param newGroupname java.lang.String
*/
public void setGroupname ( String groupname) {
this.groupname=groupname;
} 
 
/**
* 属性 extlink的Getter方法.属性名：扩展链接
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getExtlink() {
return this.extlink;
} 

/**
* 属性extlink的Setter方法.属性名：扩展链接
* 创建日期:2018-12-5
* @param newExtlink java.lang.String
*/
public void setExtlink ( String extlink) {
this.extlink=extlink;
} 
 
/**
* 属性 isgloble的Getter方法.属性名：全局标志
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsgloble() {
return this.isgloble;
} 

/**
* 属性isgloble的Setter方法.属性名：全局标志
* 创建日期:2018-12-5
* @param newIsgloble nc.vo.pub.lang.UFBoolean
*/
public void setIsgloble ( UFBoolean isgloble) {
this.isgloble=isgloble;
} 
 
/**
* 属性 belongs的Getter方法.属性名：所属人
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBelongs() {
return this.belongs;
} 

/**
* 属性belongs的Setter方法.属性名：所属人
* 创建日期:2018-12-5
* @param newBelongs java.lang.String
*/
public void setBelongs ( String belongs) {
this.belongs=belongs;
} 
 
/**
* 属性 isresultorder的Getter方法.属性名：是否结果排序
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsresultorder() {
return this.isresultorder;
} 

/**
* 属性isresultorder的Setter方法.属性名：是否结果排序
* 创建日期:2018-12-5
* @param newIsresultorder nc.vo.pub.lang.UFBoolean
*/
public void setIsresultorder ( UFBoolean isresultorder) {
this.isresultorder=isresultorder;
} 
 
/**
* 属性 approvelrole的Getter方法.属性名：审批角色
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getApprovelrole() {
return this.approvelrole;
} 

/**
* 属性approvelrole的Setter方法.属性名：审批角色
* 创建日期:2018-12-5
* @param newApprovelrole java.lang.String
*/
public void setApprovelrole ( String approvelrole) {
this.approvelrole=approvelrole;
} 
 
/**
* 属性 pk_entstandart的Getter方法.属性名：企业标准
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcentstandard.EntstandardVO
*/
public String getPk_entstandart() {
return this.pk_entstandart;
} 

/**
* 属性pk_entstandart的Setter方法.属性名：企业标准
* 创建日期:2018-12-5
* @param newPk_entstandart nc.vo.qcco.qcentstandard.EntstandardVO
*/
public void setPk_entstandart ( String pk_entstandart) {
this.pk_entstandart=pk_entstandart;
} 
 
/**
* 属性 dbilldate的Getter方法.属性名：制单日期
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* 属性dbilldate的Setter方法.属性名：制单日期
* 创建日期:2018-12-5
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.testlist");
    }
   }
    