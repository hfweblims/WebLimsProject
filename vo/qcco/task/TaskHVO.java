package nc.vo.qcco.task;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此??要描述此?功能 </b>
 * <p>
 *   此?添加累的描述信息
 * </p>
 *  ?建日期:2018-11-12
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class TaskHVO extends SuperVO {
	
/**
*主表主?
*/
public String pk_task_h;
/**
*委托?主?
*/
public String pk_commission_h;
/**
*集?
*/
public String pk_group;
/**
*??
*/
public String pk_org;
/**
*??版本
*/
public String pk_org_v;
/**
*制?日期
*/
public UFDate dbilldate;
/**
*?建人
*/
public String creator;
/**
*?建??
*/
public UFDateTime creationtime;
/**
*修改人
*/
public String modifier;
/**
*修改??
*/
public UFDateTime modifiedtime;
/**
*code
*/
public String code;
/**
*name
*/
public String name;
/**
*制???
*/
public UFDateTime maketime;
/**
*最后修改??
*/
public UFDateTime lastmaketime;
/**
*?据ID
*/
public String billid;
/**
*?据?
*/
public String billno;
/**
*???型
*/
public String busitype;
/**
*制?人
*/
public String billmaker;
/**
*?批人
*/
public String approver;
/**
*?批??
*/
public Integer approvestatus;
/**
*?批批?
*/
public String approvenote;
/**
*?批??
*/
public UFDateTime approvedate;
/**
*交易?型
*/
public String transtype;
/**
*?据?型
*/
public String billtype;
/**
*交易?型pk
*/
public String transtypepk;
/**
*?源?据?型
*/
public String srcbilltype;
/**
*?源?据id
*/
public String srcbillid;
/**
*修?枚?
*/
public Integer emendenum;
/**
*?据版本pk
*/
public String billversionpk;
/**
*??戳
*/
public UFDateTime ts;
    
    
/**
* ?性 pk_task_h的Getter方法.?性名：主表主?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_task_h() {
return this.pk_task_h;
} 

/**
* ?性pk_task_h的Setter方法.?性名：主表主?
* ?建日期:2018-11-12
* @param newPk_task_h java.lang.String
*/
public void setPk_task_h ( String pk_task_h) {
this.pk_task_h=pk_task_h;
} 
 
/**
* ?性 pk_commission_h的Getter方法.?性名：委托?主?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_commission_h() {
return this.pk_commission_h;
} 

/**
* ?性pk_commission_h的Setter方法.?性名：委托?主?
* ?建日期:2018-11-12
* @param newPk_commission_h java.lang.String
*/
public void setPk_commission_h ( String pk_commission_h) {
this.pk_commission_h=pk_commission_h;
} 
 
/**
* ?性 pk_group的Getter方法.?性名：集?
*  ?建日期:2018-11-12
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ?性pk_group的Setter方法.?性名：集?
* ?建日期:2018-11-12
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ?性 pk_org的Getter方法.?性名：??
*  ?建日期:2018-11-12
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ?性pk_org的Setter方法.?性名：??
* ?建日期:2018-11-12
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ?性 pk_org_v的Getter方法.?性名：??版本
*  ?建日期:2018-11-12
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ?性pk_org_v的Setter方法.?性名：??版本
* ?建日期:2018-11-12
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ?性 dbilldate的Getter方法.?性名：制?日期
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDbilldate() {
return this.dbilldate;
} 

/**
* ?性dbilldate的Setter方法.?性名：制?日期
* ?建日期:2018-11-12
* @param newDbilldate nc.vo.pub.lang.UFDate
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
} 
 
/**
* ?性 creator的Getter方法.?性名：?建人
*  ?建日期:2018-11-12
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* ?性creator的Setter方法.?性名：?建人
* ?建日期:2018-11-12
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ?性 creationtime的Getter方法.?性名：?建??
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ?性creationtime的Setter方法.?性名：?建??
* ?建日期:2018-11-12
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ?性 modifier的Getter方法.?性名：修改人
*  ?建日期:2018-11-12
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* ?性modifier的Setter方法.?性名：修改人
* ?建日期:2018-11-12
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ?性 modifiedtime的Getter方法.?性名：修改??
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ?性modifiedtime的Setter方法.?性名：修改??
* ?建日期:2018-11-12
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ?性 code的Getter方法.?性名：code
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* ?性code的Setter方法.?性名：code
* ?建日期:2018-11-12
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* ?性 name的Getter方法.?性名：name
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* ?性name的Setter方法.?性名：name
* ?建日期:2018-11-12
* @param newName java.lang.String
*/
public void setName ( String name) {
this.name=name;
} 
 
/**
* ?性 maketime的Getter方法.?性名：制???
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getMaketime() {
return this.maketime;
} 

/**
* ?性maketime的Setter方法.?性名：制???
* ?建日期:2018-11-12
* @param newMaketime nc.vo.pub.lang.UFDateTime
*/
public void setMaketime ( UFDateTime maketime) {
this.maketime=maketime;
} 
 
/**
* ?性 lastmaketime的Getter方法.?性名：最后修改??
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getLastmaketime() {
return this.lastmaketime;
} 

/**
* ?性lastmaketime的Setter方法.?性名：最后修改??
* ?建日期:2018-11-12
* @param newLastmaketime nc.vo.pub.lang.UFDateTime
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.lastmaketime=lastmaketime;
} 
 
/**
* ?性 billid的Getter方法.?性名：?据ID
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBillid() {
return this.billid;
} 

/**
* ?性billid的Setter方法.?性名：?据ID
* ?建日期:2018-11-12
* @param newBillid java.lang.String
*/
public void setBillid ( String billid) {
this.billid=billid;
} 
 
/**
* ?性 billno的Getter方法.?性名：?据?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBillno() {
return this.billno;
} 

/**
* ?性billno的Setter方法.?性名：?据?
* ?建日期:2018-11-12
* @param newBillno java.lang.String
*/
public void setBillno ( String billno) {
this.billno=billno;
} 
 
/**
* ?性 busitype的Getter方法.?性名：???型
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBusitype() {
return this.busitype;
} 

/**
* ?性busitype的Setter方法.?性名：???型
* ?建日期:2018-11-12
* @param newBusitype java.lang.String
*/
public void setBusitype ( String busitype) {
this.busitype=busitype;
} 
 
/**
* ?性 billmaker的Getter方法.?性名：制?人
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBillmaker() {
return this.billmaker;
} 

/**
* ?性billmaker的Setter方法.?性名：制?人
* ?建日期:2018-11-12
* @param newBillmaker java.lang.String
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* ?性 approver的Getter方法.?性名：?批人
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getApprover() {
return this.approver;
} 

/**
* ?性approver的Setter方法.?性名：?批人
* ?建日期:2018-11-12
* @param newApprover java.lang.String
*/
public void setApprover ( String approver) {
this.approver=approver;
} 
 
/**
* ?性 approvestatus的Getter方法.?性名：?批??
*  ?建日期:2018-11-12
* @return nc.vo.pub.pf.BillStatusEnum
*/
public Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* ?性approvestatus的Setter方法.?性名：?批??
* ?建日期:2018-11-12
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* ?性 approvenote的Getter方法.?性名：?批批?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getApprovenote() {
return this.approvenote;
} 

/**
* ?性approvenote的Setter方法.?性名：?批批?
* ?建日期:2018-11-12
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* ?性 approvedate的Getter方法.?性名：?批??
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* ?性approvedate的Setter方法.?性名：?批??
* ?建日期:2018-11-12
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* ?性 transtype的Getter方法.?性名：交易?型
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getTranstype() {
return this.transtype;
} 

/**
* ?性transtype的Setter方法.?性名：交易?型
* ?建日期:2018-11-12
* @param newTranstype java.lang.String
*/
public void setTranstype ( String transtype) {
this.transtype=transtype;
} 
 
/**
* ?性 billtype的Getter方法.?性名：?据?型
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBilltype() {
return this.billtype;
} 

/**
* ?性billtype的Setter方法.?性名：?据?型
* ?建日期:2018-11-12
* @param newBilltype java.lang.String
*/
public void setBilltype ( String billtype) {
this.billtype=billtype;
} 
 
/**
* ?性 transtypepk的Getter方法.?性名：交易?型pk
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getTranstypepk() {
return this.transtypepk;
} 

/**
* ?性transtypepk的Setter方法.?性名：交易?型pk
* ?建日期:2018-11-12
* @param newTranstypepk java.lang.String
*/
public void setTranstypepk ( String transtypepk) {
this.transtypepk=transtypepk;
} 
 
/**
* ?性 srcbilltype的Getter方法.?性名：?源?据?型
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* ?性srcbilltype的Setter方法.?性名：?源?据?型
* ?建日期:2018-11-12
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* ?性 srcbillid的Getter方法.?性名：?源?据id
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getSrcbillid() {
return this.srcbillid;
} 

/**
* ?性srcbillid的Setter方法.?性名：?源?据id
* ?建日期:2018-11-12
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* ?性 emendenum的Getter方法.?性名：修?枚?
*  ?建日期:2018-11-12
* @return java.lang.Integer
*/
public Integer getEmendenum() {
return this.emendenum;
} 

/**
* ?性emendenum的Setter方法.?性名：修?枚?
* ?建日期:2018-11-12
* @param newEmendenum java.lang.Integer
*/
public void setEmendenum ( Integer emendenum) {
this.emendenum=emendenum;
} 
 
/**
* ?性 billversionpk的Getter方法.?性名：?据版本pk
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getBillversionpk() {
return this.billversionpk;
} 

/**
* ?性billversionpk的Setter方法.?性名：?据版本pk
* ?建日期:2018-11-12
* @param newBillversionpk java.lang.String
*/
public void setBillversionpk ( String billversionpk) {
this.billversionpk=billversionpk;
} 
 
/**
* ?性 生成??戳的Getter方法.?性名：??戳
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ?性生成??戳的Setter方法.?性名：??戳
* ?建日期:2018-11-12
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_h");
    }
   }
    