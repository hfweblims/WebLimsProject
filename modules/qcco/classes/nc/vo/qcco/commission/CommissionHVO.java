package nc.vo.qcco.commission;

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
 
public class CommissionHVO extends SuperVO {
	
/**
*主表主键
*/
public String pk_commission_h;
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
*最后修改时间
*/
public UFDateTime lastmaketime;
/**
*制单日期
*/
public UFDate dmakedate;
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
*交易类型
*/
public String transtype;
/**
*审核日期
*/
public UFDate taudittime;
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
*委托单类型
*/
public String pk_commissiontype;
/**
*委托单位
*/
public String pk_owner;
/**
*部门
*/
public String pk_dept;
/**
*付费单位
*/
public String pk_payer;
/**
*产品大类
*/
public String pk_maincategory;
/**
*二级分类
*/
public String pk_subcategory;
/**
*三级分类
*/
public String pk_lastcategory;
/**
*联系人
*/
public String contract;
/**
*用户
*/
public String cuserid;
/**
*电子邮件
*/
public String email;
/**
*联系电话
*/
public String teleno;
/**
*报告格式
*/
public String reportformat;
/**
*报告语言
*/
public String reportlang;
/**
*发送消息标记
*/
public UFBoolean sendflag;
/**
*检验后样品处理
*/
public String sampledealtype;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_commission_h的Getter方法.属性名：主表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_commission_h() {
return this.pk_commission_h;
} 

/**
* 属性pk_commission_h的Setter方法.属性名：主表主键
* 创建日期:2018-12-5
* @param newPk_commission_h java.lang.String
*/
public void setPk_commission_h ( String pk_commission_h) {
this.pk_commission_h=pk_commission_h;
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
* 属性 taudittime的Getter方法.属性名：审核日期
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getTaudittime() {
return this.taudittime;
} 

/**
* 属性taudittime的Setter方法.属性名：审核日期
* 创建日期:2018-12-5
* @param newTaudittime nc.vo.pub.lang.UFDate
*/
public void setTaudittime ( UFDate taudittime) {
this.taudittime=taudittime;
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
* 属性 pk_commissiontype的Getter方法.属性名：委托单类型
*  创建日期:2018-12-5
* @return nc.vo.qcco.qccommissiontype.CommissionTypeVO
*/
public String getPk_commissiontype() {
return this.pk_commissiontype;
} 

/**
* 属性pk_commissiontype的Setter方法.属性名：委托单类型
* 创建日期:2018-12-5
* @param newPk_commissiontype nc.vo.qcco.qccommissiontype.CommissionTypeVO
*/
public void setPk_commissiontype ( String pk_commissiontype) {
this.pk_commissiontype=pk_commissiontype;
} 
 
/**
* 属性 pk_owner的Getter方法.属性名：委托单位
*  创建日期:2018-12-5
* @return nc.vo.org.OrgVO
*/
public String getPk_owner() {
return this.pk_owner;
} 

/**
* 属性pk_owner的Setter方法.属性名：委托单位
* 创建日期:2018-12-5
* @param newPk_owner nc.vo.org.OrgVO
*/
public void setPk_owner ( String pk_owner) {
this.pk_owner=pk_owner;
} 
 
/**
* 属性 pk_dept的Getter方法.属性名：部门
*  创建日期:2018-12-5
* @return nc.vo.org.DeptVO
*/
public String getPk_dept() {
return this.pk_dept;
} 

/**
* 属性pk_dept的Setter方法.属性名：部门
* 创建日期:2018-12-5
* @param newPk_dept nc.vo.org.DeptVO
*/
public void setPk_dept ( String pk_dept) {
this.pk_dept=pk_dept;
} 
 
/**
* 属性 pk_payer的Getter方法.属性名：付费单位
*  创建日期:2018-12-5
* @return nc.vo.org.OrgVO
*/
public String getPk_payer() {
return this.pk_payer;
} 

/**
* 属性pk_payer的Setter方法.属性名：付费单位
* 创建日期:2018-12-5
* @param newPk_payer nc.vo.org.OrgVO
*/
public void setPk_payer ( String pk_payer) {
this.pk_payer=pk_payer;
} 
 
/**
* 属性 pk_maincategory的Getter方法.属性名：产品大类
*  创建日期:2018-12-5
* @return nc.vo.qcco.qccategory.ProductCategoryVO
*/
public String getPk_maincategory() {
return this.pk_maincategory;
} 

/**
* 属性pk_maincategory的Setter方法.属性名：产品大类
* 创建日期:2018-12-5
* @param newPk_maincategory nc.vo.qcco.qccategory.ProductCategoryVO
*/
public void setPk_maincategory ( String pk_maincategory) {
this.pk_maincategory=pk_maincategory;
} 
 
/**
* 属性 pk_subcategory的Getter方法.属性名：二级分类
*  创建日期:2018-12-5
* @return nc.vo.qcco.qccategory.ProductCategoryVO
*/
public String getPk_subcategory() {
return this.pk_subcategory;
} 

/**
* 属性pk_subcategory的Setter方法.属性名：二级分类
* 创建日期:2018-12-5
* @param newPk_subcategory nc.vo.qcco.qccategory.ProductCategoryVO
*/
public void setPk_subcategory ( String pk_subcategory) {
this.pk_subcategory=pk_subcategory;
} 
 
/**
* 属性 pk_lastcategory的Getter方法.属性名：三级分类
*  创建日期:2018-12-5
* @return nc.vo.qcco.qccategory.ProductCategoryVO
*/
public String getPk_lastcategory() {
return this.pk_lastcategory;
} 

/**
* 属性pk_lastcategory的Setter方法.属性名：三级分类
* 创建日期:2018-12-5
* @param newPk_lastcategory nc.vo.qcco.qccategory.ProductCategoryVO
*/
public void setPk_lastcategory ( String pk_lastcategory) {
this.pk_lastcategory=pk_lastcategory;
} 
 
/**
* 属性 contract的Getter方法.属性名：联系人
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getContract() {
return this.contract;
} 

/**
* 属性contract的Setter方法.属性名：联系人
* 创建日期:2018-12-5
* @param newContract java.lang.String
*/
public void setContract ( String contract) {
this.contract=contract;
} 
 
/**
* 属性 cuserid的Getter方法.属性名：用户
*  创建日期:2018-12-5
* @return nc.vo.bd.psn.PsndocVO
*/
public String getCuserid() {
return this.cuserid;
} 

/**
* 属性cuserid的Setter方法.属性名：用户
* 创建日期:2018-12-5
* @param newCuserid nc.vo.bd.psn.PsndocVO
*/
public void setCuserid ( String cuserid) {
this.cuserid=cuserid;
} 
 
/**
* 属性 email的Getter方法.属性名：电子邮件
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getEmail() {
return this.email;
} 

/**
* 属性email的Setter方法.属性名：电子邮件
* 创建日期:2018-12-5
* @param newEmail java.lang.String
*/
public void setEmail ( String email) {
this.email=email;
} 
 
/**
* 属性 teleno的Getter方法.属性名：联系电话
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTeleno() {
return this.teleno;
} 

/**
* 属性teleno的Setter方法.属性名：联系电话
* 创建日期:2018-12-5
* @param newTeleno java.lang.String
*/
public void setTeleno ( String teleno) {
this.teleno=teleno;
} 
 
/**
* 属性 reportformat的Getter方法.属性名：报告格式
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getReportformat() {
return this.reportformat;
} 

/**
* 属性reportformat的Setter方法.属性名：报告格式
* 创建日期:2018-12-5
* @param newReportformat nc.vo.bd.defdoc.DefdocVO
*/
public void setReportformat ( String reportformat) {
this.reportformat=reportformat;
} 
 
/**
* 属性 reportlang的Getter方法.属性名：报告语言
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getReportlang() {
return this.reportlang;
} 

/**
* 属性reportlang的Setter方法.属性名：报告语言
* 创建日期:2018-12-5
* @param newReportlang nc.vo.bd.defdoc.DefdocVO
*/
public void setReportlang ( String reportlang) {
this.reportlang=reportlang;
} 
 
/**
* 属性 sendflag的Getter方法.属性名：发送消息标记
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getSendflag() {
return this.sendflag;
} 

/**
* 属性sendflag的Setter方法.属性名：发送消息标记
* 创建日期:2018-12-5
* @param newSendflag nc.vo.pub.lang.UFBoolean
*/
public void setSendflag ( UFBoolean sendflag) {
this.sendflag=sendflag;
} 
 
/**
* 属性 sampledealtype的Getter方法.属性名：检验后样品处理
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getSampledealtype() {
return this.sampledealtype;
} 

/**
* 属性sampledealtype的Setter方法.属性名：检验后样品处理
* 创建日期:2018-12-5
* @param newSampledealtype nc.vo.bd.defdoc.DefdocVO
*/
public void setSampledealtype ( String sampledealtype) {
this.sampledealtype=sampledealtype;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.commission_h");
    }
   }
    