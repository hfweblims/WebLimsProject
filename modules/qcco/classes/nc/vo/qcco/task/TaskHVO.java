package nc.vo.qcco.task;

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
 
public class TaskHVO extends SuperVO {
	
/**
*主表主键
*/
public String pk_task_h;
/**
*委托单主键
*/
public String pk_commission_h;
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
*制单日期
*/
public UFDate dbilldate;
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
*code
*/
public String code;
/**
*name
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
*单据ID
*/
public String billid;
/**
*单据号
*/
public String billno;
/**
*业务类型
*/
public String busitype;
/**
*制单人
*/
public String billmaker;
/**
*审批人
*/
public String approver;
/**
*审批状态
*/
public Integer approvestatus;
/**
*审批批语
*/
public String approvenote;
/**
*审批时间
*/
public UFDateTime approvedate;
/**
*交易类型
*/
public String transtype;
/**
*单据类型
*/
public String billtype;
/**
*交易类型pk
*/
public String transtypepk;
/**
*来源单据类型
*/
public String srcbilltype;
/**
*来源单据id
*/
public String srcbillid;
/**
*修订枚举
*/
public Integer emendenum;
/**
*单据版本pk
*/
public String billversionpk;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_task_h的Getter方法.属性名：主表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_task_h() {
return this.pk_task_h;
} 

/**
* 属性pk_task_h的Setter方法.属性名：主表主键
* 创建日期:2018-12-5
* @param newPk_task_h java.lang.String
*/
public void setPk_task_h ( String pk_task_h) {
this.pk_task_h=pk_task_h;
} 
 
/**
* 属性 pk_commission_h的Getter方法.属性名：委托单主键
*  创建日期:2018-12-5
* @return nc.vo.qcco.commission.CommissionHVO
*/
public String getPk_commission_h() {
return this.pk_commission_h;
} 

/**
* 属性pk_commission_h的Setter方法.属性名：委托单主键
* 创建日期:2018-12-5
* @param newPk_commission_h nc.vo.qcco.commission.CommissionHVO
*/
public void setPk_commission_h ( String pk_commission_h) {
this.pk_commission_h=pk_commission_h;
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
* 属性 code的Getter方法.属性名：code
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：code
* 创建日期:2018-12-5
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* 属性 name的Getter方法.属性名：name
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：name
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
* 属性 billid的Getter方法.属性名：单据ID
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBillid() {
return this.billid;
} 

/**
* 属性billid的Setter方法.属性名：单据ID
* 创建日期:2018-12-5
* @param newBillid java.lang.String
*/
public void setBillid ( String billid) {
this.billid=billid;
} 
 
/**
* 属性 billno的Getter方法.属性名：单据号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBillno() {
return this.billno;
} 

/**
* 属性billno的Setter方法.属性名：单据号
* 创建日期:2018-12-5
* @param newBillno java.lang.String
*/
public void setBillno ( String billno) {
this.billno=billno;
} 
 
/**
* 属性 busitype的Getter方法.属性名：业务类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBusitype() {
return this.busitype;
} 

/**
* 属性busitype的Setter方法.属性名：业务类型
* 创建日期:2018-12-5
* @param newBusitype java.lang.String
*/
public void setBusitype ( String busitype) {
this.busitype=busitype;
} 
 
/**
* 属性 billmaker的Getter方法.属性名：制单人
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBillmaker() {
return this.billmaker;
} 

/**
* 属性billmaker的Setter方法.属性名：制单人
* 创建日期:2018-12-5
* @param newBillmaker java.lang.String
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* 属性 approver的Getter方法.属性名：审批人
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getApprover() {
return this.approver;
} 

/**
* 属性approver的Setter方法.属性名：审批人
* 创建日期:2018-12-5
* @param newApprover java.lang.String
*/
public void setApprover ( String approver) {
this.approver=approver;
} 
 
/**
* 属性 approvestatus的Getter方法.属性名：审批状态
*  创建日期:2018-12-5
* @return nc.vo.pub.pf.BillStatusEnum
*/
public Integer getApprovestatus() {
return this.approvestatus;
} 

/**
* 属性approvestatus的Setter方法.属性名：审批状态
* 创建日期:2018-12-5
* @param newApprovestatus nc.vo.pub.pf.BillStatusEnum
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
} 
 
/**
* 属性 approvenote的Getter方法.属性名：审批批语
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getApprovenote() {
return this.approvenote;
} 

/**
* 属性approvenote的Setter方法.属性名：审批批语
* 创建日期:2018-12-5
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* 属性 approvedate的Getter方法.属性名：审批时间
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getApprovedate() {
return this.approvedate;
} 

/**
* 属性approvedate的Setter方法.属性名：审批时间
* 创建日期:2018-12-5
* @param newApprovedate nc.vo.pub.lang.UFDateTime
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
} 
 
/**
* 属性 transtype的Getter方法.属性名：交易类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTranstype() {
return this.transtype;
} 

/**
* 属性transtype的Setter方法.属性名：交易类型
* 创建日期:2018-12-5
* @param newTranstype java.lang.String
*/
public void setTranstype ( String transtype) {
this.transtype=transtype;
} 
 
/**
* 属性 billtype的Getter方法.属性名：单据类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBilltype() {
return this.billtype;
} 

/**
* 属性billtype的Setter方法.属性名：单据类型
* 创建日期:2018-12-5
* @param newBilltype java.lang.String
*/
public void setBilltype ( String billtype) {
this.billtype=billtype;
} 
 
/**
* 属性 transtypepk的Getter方法.属性名：交易类型pk
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTranstypepk() {
return this.transtypepk;
} 

/**
* 属性transtypepk的Setter方法.属性名：交易类型pk
* 创建日期:2018-12-5
* @param newTranstypepk java.lang.String
*/
public void setTranstypepk ( String transtypepk) {
this.transtypepk=transtypepk;
} 
 
/**
* 属性 srcbilltype的Getter方法.属性名：来源单据类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getSrcbilltype() {
return this.srcbilltype;
} 

/**
* 属性srcbilltype的Setter方法.属性名：来源单据类型
* 创建日期:2018-12-5
* @param newSrcbilltype java.lang.String
*/
public void setSrcbilltype ( String srcbilltype) {
this.srcbilltype=srcbilltype;
} 
 
/**
* 属性 srcbillid的Getter方法.属性名：来源单据id
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getSrcbillid() {
return this.srcbillid;
} 

/**
* 属性srcbillid的Setter方法.属性名：来源单据id
* 创建日期:2018-12-5
* @param newSrcbillid java.lang.String
*/
public void setSrcbillid ( String srcbillid) {
this.srcbillid=srcbillid;
} 
 
/**
* 属性 emendenum的Getter方法.属性名：修订枚举
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getEmendenum() {
return this.emendenum;
} 

/**
* 属性emendenum的Setter方法.属性名：修订枚举
* 创建日期:2018-12-5
* @param newEmendenum java.lang.Integer
*/
public void setEmendenum ( Integer emendenum) {
this.emendenum=emendenum;
} 
 
/**
* 属性 billversionpk的Getter方法.属性名：单据版本pk
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getBillversionpk() {
return this.billversionpk;
} 

/**
* 属性billversionpk的Setter方法.属性名：单据版本pk
* 创建日期:2018-12-5
* @param newBillversionpk java.lang.String
*/
public void setBillversionpk ( String billversionpk) {
this.billversionpk=billversionpk;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_h");
    }
   }
    