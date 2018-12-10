package nc.vo.qcco.qcanalysecondition;

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
 
public class AnalyseConditionHVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -1797195398710939226L;
/**
*主表主键
*/
public String pk_analysecondition;
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
*测试条件编码
*/
public String code;
/**
*测试条件名称
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
*值类型
*/
public String pk_valuetype;
/**
*组件名称
*/
public String componentname;
/**
*档案版本
*/
public String docversion;
/**
*组件显示顺序
*/
public Integer displayorder;
/**
*结果类型
*/
public String resulttype;
/**
*单位
*/
public String unit;
/**
*最小值
*/
public UFDouble minvalue;
/**
*最大值
*/
public UFDouble maxvalue;
/**
*是否认可
*/
public UFBoolean isconfirm;
/**
*是否截取进位
*/
public UFBoolean istruncate;
/**
*小数位
*/
public Integer decbits;
/**
*attrDisplayName8
*/
public String attrname8;
/**
*使用仪器
*/
public String pk_instrument;
/**
*使用编码
*/
public String usecode;
/**
*是否自动计算
*/
public UFBoolean isautocalc;
/**
*列表键
*/
public String pk_listdoc;
/**
*是否允许取消
*/
public UFBoolean cancelable;
/**
*是否报告
*/
public UFBoolean isreport;
/**
*是否可选
*/
public UFBoolean selectable;
/**
*是否四舍五入进位
*/
public UFBoolean iscarry;
/**
*是否有属性
*/
public UFBoolean hasprop;
/**
*格式化计算
*/
public UFBoolean isformatcalc;
/**
*是否显示
*/
public UFBoolean isdisplay;
/**
*Lims程序
*/
public String limsprogram;
/**
*位数2
*/
public Integer bit2;
/**
*报告结果
*/
public String result;
/**
*转换类型
*/
public String transtype;
/**
*来源分类
*/
public String sourcetype;
/**
*来源单位
*/
public String pk_sourcedept;
/**
*目标单位
*/
public String pk_targetdept;
/**
*触点类型
*/
public String pk_contactortype;
/**
*规格型号
*/
public String pk_modelno;
/**
*中文默认值
*/
public String cndefvalue;
/**
*英文默认值
*/
public String endefvalue;
/**
*attrDisplayName4
*/
public String reportname;
/**
*制单日期
*/
public UFDate dbilldate;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_analysecondition的Getter方法.属性名：主表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_analysecondition() {
return this.pk_analysecondition;
} 

/**
* 属性pk_analysecondition的Setter方法.属性名：主表主键
* 创建日期:2018-12-5
* @param newPk_analysecondition java.lang.String
*/
public void setPk_analysecondition ( String pk_analysecondition) {
this.pk_analysecondition=pk_analysecondition;
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
* 属性 code的Getter方法.属性名：测试条件编码
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCode() {
return this.code;
} 

/**
* 属性code的Setter方法.属性名：测试条件编码
* 创建日期:2018-12-5
* @param newCode java.lang.String
*/
public void setCode ( String code) {
this.code=code;
} 
 
/**
* 属性 name的Getter方法.属性名：测试条件名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getName() {
return this.name;
} 

/**
* 属性name的Setter方法.属性名：测试条件名称
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
* 属性 pk_valuetype的Getter方法.属性名：值类型
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcvaluetype.ValueTypeHVO
*/
public String getPk_valuetype() {
return this.pk_valuetype;
} 

/**
* 属性pk_valuetype的Setter方法.属性名：值类型
* 创建日期:2018-12-5
* @param newPk_valuetype nc.vo.qcco.qcvaluetype.ValueTypeHVO
*/
public void setPk_valuetype ( String pk_valuetype) {
this.pk_valuetype=pk_valuetype;
} 
 
/**
* 属性 componentname的Getter方法.属性名：组件名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getComponentname() {
return this.componentname;
} 

/**
* 属性componentname的Setter方法.属性名：组件名称
* 创建日期:2018-12-5
* @param newComponentname java.lang.String
*/
public void setComponentname ( String componentname) {
this.componentname=componentname;
} 
 
/**
* 属性 docversion的Getter方法.属性名：档案版本
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getDocversion() {
return this.docversion;
} 

/**
* 属性docversion的Setter方法.属性名：档案版本
* 创建日期:2018-12-5
* @param newDocversion java.lang.String
*/
public void setDocversion ( String docversion) {
this.docversion=docversion;
} 
 
/**
* 属性 displayorder的Getter方法.属性名：组件显示顺序
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getDisplayorder() {
return this.displayorder;
} 

/**
* 属性displayorder的Setter方法.属性名：组件显示顺序
* 创建日期:2018-12-5
* @param newDisplayorder java.lang.Integer
*/
public void setDisplayorder ( Integer displayorder) {
this.displayorder=displayorder;
} 
 
/**
* 属性 resulttype的Getter方法.属性名：结果类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getResulttype() {
return this.resulttype;
} 

/**
* 属性resulttype的Setter方法.属性名：结果类型
* 创建日期:2018-12-5
* @param newResulttype java.lang.String
*/
public void setResulttype ( String resulttype) {
this.resulttype=resulttype;
} 
 
/**
* 属性 unit的Getter方法.属性名：单位
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getUnit() {
return this.unit;
} 

/**
* 属性unit的Setter方法.属性名：单位
* 创建日期:2018-12-5
* @param newUnit nc.vo.bd.defdoc.DefdocVO
*/
public void setUnit ( String unit) {
this.unit=unit;
} 
 
/**
* 属性 minvalue的Getter方法.属性名：最小值
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getMinvalue() {
return this.minvalue;
} 

/**
* 属性minvalue的Setter方法.属性名：最小值
* 创建日期:2018-12-5
* @param newMinvalue nc.vo.pub.lang.UFDouble
*/
public void setMinvalue ( UFDouble minvalue) {
this.minvalue=minvalue;
} 
 
/**
* 属性 maxvalue的Getter方法.属性名：最大值
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getMaxvalue() {
return this.maxvalue;
} 

/**
* 属性maxvalue的Setter方法.属性名：最大值
* 创建日期:2018-12-5
* @param newMaxvalue nc.vo.pub.lang.UFDouble
*/
public void setMaxvalue ( UFDouble maxvalue) {
this.maxvalue=maxvalue;
} 
 
/**
* 属性 isconfirm的Getter方法.属性名：是否认可
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsconfirm() {
return this.isconfirm;
} 

/**
* 属性isconfirm的Setter方法.属性名：是否认可
* 创建日期:2018-12-5
* @param newIsconfirm nc.vo.pub.lang.UFBoolean
*/
public void setIsconfirm ( UFBoolean isconfirm) {
this.isconfirm=isconfirm;
} 
 
/**
* 属性 istruncate的Getter方法.属性名：是否截取进位
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIstruncate() {
return this.istruncate;
} 

/**
* 属性istruncate的Setter方法.属性名：是否截取进位
* 创建日期:2018-12-5
* @param newIstruncate nc.vo.pub.lang.UFBoolean
*/
public void setIstruncate ( UFBoolean istruncate) {
this.istruncate=istruncate;
} 
 
/**
* 属性 decbits的Getter方法.属性名：小数位
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getDecbits() {
return this.decbits;
} 

/**
* 属性decbits的Setter方法.属性名：小数位
* 创建日期:2018-12-5
* @param newDecbits java.lang.Integer
*/
public void setDecbits ( Integer decbits) {
this.decbits=decbits;
} 
 
/**
* 属性 attrname8的Getter方法.属性名：attrDisplayName8
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getAttrname8() {
return this.attrname8;
} 

/**
* 属性attrname8的Setter方法.属性名：attrDisplayName8
* 创建日期:2018-12-5
* @param newAttrname8 java.lang.String
*/
public void setAttrname8 ( String attrname8) {
this.attrname8=attrname8;
} 
 
/**
* 属性 pk_instrument的Getter方法.属性名：使用仪器
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_instrument() {
return this.pk_instrument;
} 

/**
* 属性pk_instrument的Setter方法.属性名：使用仪器
* 创建日期:2018-12-5
* @param newPk_instrument nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_instrument ( String pk_instrument) {
this.pk_instrument=pk_instrument;
} 
 
/**
* 属性 usecode的Getter方法.属性名：使用编码
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getUsecode() {
return this.usecode;
} 

/**
* 属性usecode的Setter方法.属性名：使用编码
* 创建日期:2018-12-5
* @param newUsecode java.lang.String
*/
public void setUsecode ( String usecode) {
this.usecode=usecode;
} 
 
/**
* 属性 isautocalc的Getter方法.属性名：是否自动计算
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsautocalc() {
return this.isautocalc;
} 

/**
* 属性isautocalc的Setter方法.属性名：是否自动计算
* 创建日期:2018-12-5
* @param newIsautocalc nc.vo.pub.lang.UFBoolean
*/
public void setIsautocalc ( UFBoolean isautocalc) {
this.isautocalc=isautocalc;
} 
 
/**
* 属性 pk_listdoc的Getter方法.属性名：列表键
*  创建日期:2018-12-5
* @return nc.vo.qcco.qclistdoc.ListdocHVO
*/
public String getPk_listdoc() {
return this.pk_listdoc;
} 

/**
* 属性pk_listdoc的Setter方法.属性名：列表键
* 创建日期:2018-12-5
* @param newPk_listdoc nc.vo.qcco.qclistdoc.ListdocHVO
*/
public void setPk_listdoc ( String pk_listdoc) {
this.pk_listdoc=pk_listdoc;
} 
 
/**
* 属性 cancelable的Getter方法.属性名：是否允许取消
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getCancelable() {
return this.cancelable;
} 

/**
* 属性cancelable的Setter方法.属性名：是否允许取消
* 创建日期:2018-12-5
* @param newCancelable nc.vo.pub.lang.UFBoolean
*/
public void setCancelable ( UFBoolean cancelable) {
this.cancelable=cancelable;
} 
 
/**
* 属性 isreport的Getter方法.属性名：是否报告
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsreport() {
return this.isreport;
} 

/**
* 属性isreport的Setter方法.属性名：是否报告
* 创建日期:2018-12-5
* @param newIsreport nc.vo.pub.lang.UFBoolean
*/
public void setIsreport ( UFBoolean isreport) {
this.isreport=isreport;
} 
 
/**
* 属性 selectable的Getter方法.属性名：是否可选
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getSelectable() {
return this.selectable;
} 

/**
* 属性selectable的Setter方法.属性名：是否可选
* 创建日期:2018-12-5
* @param newSelectable nc.vo.pub.lang.UFBoolean
*/
public void setSelectable ( UFBoolean selectable) {
this.selectable=selectable;
} 
 
/**
* 属性 iscarry的Getter方法.属性名：是否四舍五入进位
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIscarry() {
return this.iscarry;
} 

/**
* 属性iscarry的Setter方法.属性名：是否四舍五入进位
* 创建日期:2018-12-5
* @param newIscarry nc.vo.pub.lang.UFBoolean
*/
public void setIscarry ( UFBoolean iscarry) {
this.iscarry=iscarry;
} 
 
/**
* 属性 hasprop的Getter方法.属性名：是否有属性
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getHasprop() {
return this.hasprop;
} 

/**
* 属性hasprop的Setter方法.属性名：是否有属性
* 创建日期:2018-12-5
* @param newHasprop nc.vo.pub.lang.UFBoolean
*/
public void setHasprop ( UFBoolean hasprop) {
this.hasprop=hasprop;
} 
 
/**
* 属性 isformatcalc的Getter方法.属性名：格式化计算
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsformatcalc() {
return this.isformatcalc;
} 

/**
* 属性isformatcalc的Setter方法.属性名：格式化计算
* 创建日期:2018-12-5
* @param newIsformatcalc nc.vo.pub.lang.UFBoolean
*/
public void setIsformatcalc ( UFBoolean isformatcalc) {
this.isformatcalc=isformatcalc;
} 
 
/**
* 属性 isdisplay的Getter方法.属性名：是否显示
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsdisplay() {
return this.isdisplay;
} 

/**
* 属性isdisplay的Setter方法.属性名：是否显示
* 创建日期:2018-12-5
* @param newIsdisplay nc.vo.pub.lang.UFBoolean
*/
public void setIsdisplay ( UFBoolean isdisplay) {
this.isdisplay=isdisplay;
} 
 
/**
* 属性 limsprogram的Getter方法.属性名：Lims程序
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getLimsprogram() {
return this.limsprogram;
} 

/**
* 属性limsprogram的Setter方法.属性名：Lims程序
* 创建日期:2018-12-5
* @param newLimsprogram java.lang.String
*/
public void setLimsprogram ( String limsprogram) {
this.limsprogram=limsprogram;
} 
 
/**
* 属性 bit2的Getter方法.属性名：位数2
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getBit2() {
return this.bit2;
} 

/**
* 属性bit2的Setter方法.属性名：位数2
* 创建日期:2018-12-5
* @param newBit2 java.lang.Integer
*/
public void setBit2 ( Integer bit2) {
this.bit2=bit2;
} 
 
/**
* 属性 result的Getter方法.属性名：报告结果
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getResult() {
return this.result;
} 

/**
* 属性result的Setter方法.属性名：报告结果
* 创建日期:2018-12-5
* @param newResult java.lang.String
*/
public void setResult ( String result) {
this.result=result;
} 
 
/**
* 属性 transtype的Getter方法.属性名：转换类型
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTranstype() {
return this.transtype;
} 

/**
* 属性transtype的Setter方法.属性名：转换类型
* 创建日期:2018-12-5
* @param newTranstype java.lang.String
*/
public void setTranstype ( String transtype) {
this.transtype=transtype;
} 
 
/**
* 属性 sourcetype的Getter方法.属性名：来源分类
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getSourcetype() {
return this.sourcetype;
} 

/**
* 属性sourcetype的Setter方法.属性名：来源分类
* 创建日期:2018-12-5
* @param newSourcetype java.lang.String
*/
public void setSourcetype ( String sourcetype) {
this.sourcetype=sourcetype;
} 
 
/**
* 属性 pk_sourcedept的Getter方法.属性名：来源单位
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_sourcedept() {
return this.pk_sourcedept;
} 

/**
* 属性pk_sourcedept的Setter方法.属性名：来源单位
* 创建日期:2018-12-5
* @param newPk_sourcedept nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_sourcedept ( String pk_sourcedept) {
this.pk_sourcedept=pk_sourcedept;
} 
 
/**
* 属性 pk_targetdept的Getter方法.属性名：目标单位
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_targetdept() {
return this.pk_targetdept;
} 

/**
* 属性pk_targetdept的Setter方法.属性名：目标单位
* 创建日期:2018-12-5
* @param newPk_targetdept nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_targetdept ( String pk_targetdept) {
this.pk_targetdept=pk_targetdept;
} 
 
/**
* 属性 pk_contactortype的Getter方法.属性名：触点类型
*  创建日期:2018-12-5
* @return nc.vo.qcco.qccontactortype.ContactorTypeVO
*/
public String getPk_contactortype() {
return this.pk_contactortype;
} 

/**
* 属性pk_contactortype的Setter方法.属性名：触点类型
* 创建日期:2018-12-5
* @param newPk_contactortype nc.vo.qcco.qccontactortype.ContactorTypeVO
*/
public void setPk_contactortype ( String pk_contactortype) {
this.pk_contactortype=pk_contactortype;
} 
 
/**
* 属性 pk_modelno的Getter方法.属性名：规格型号
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcmodelno.ModelnoVO
*/
public String getPk_modelno() {
return this.pk_modelno;
} 

/**
* 属性pk_modelno的Setter方法.属性名：规格型号
* 创建日期:2018-12-5
* @param newPk_modelno nc.vo.qcco.qcmodelno.ModelnoVO
*/
public void setPk_modelno ( String pk_modelno) {
this.pk_modelno=pk_modelno;
} 
 
/**
* 属性 cndefvalue的Getter方法.属性名：中文默认值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCndefvalue() {
return this.cndefvalue;
} 

/**
* 属性cndefvalue的Setter方法.属性名：中文默认值
* 创建日期:2018-12-5
* @param newCndefvalue java.lang.String
*/
public void setCndefvalue ( String cndefvalue) {
this.cndefvalue=cndefvalue;
} 
 
/**
* 属性 endefvalue的Getter方法.属性名：英文默认值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getEndefvalue() {
return this.endefvalue;
} 

/**
* 属性endefvalue的Setter方法.属性名：英文默认值
* 创建日期:2018-12-5
* @param newEndefvalue java.lang.String
*/
public void setEndefvalue ( String endefvalue) {
this.endefvalue=endefvalue;
} 
 
/**
* 属性 reportname的Getter方法.属性名：attrDisplayName4
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getReportname() {
return this.reportname;
} 

/**
* 属性reportname的Setter方法.属性名：attrDisplayName4
* 创建日期:2018-12-5
* @param newReportname java.lang.String
*/
public void setReportname ( String reportname) {
this.reportname=reportname;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.analysecondition");
    }
   }
    