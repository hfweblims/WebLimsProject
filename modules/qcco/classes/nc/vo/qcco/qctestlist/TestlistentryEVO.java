package nc.vo.qcco.qctestlist;

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
 
public class TestlistentryEVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1729041023721560700L;
/**
*孙表主键
*/
public String pk_testlistentry;
/**
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*显示顺序
*/
public Integer displayorder;
/**
*标准测试
*/
public String standardtest;
/**
*进位
*/
public UFBoolean iscarry;
/**
*参数名
*/
public String refname;
/**
*参数值
*/
public String refvalue;
/**
*测试等级
*/
public String testlevel;
/**
*仪器
*/
public String pk_instrument;
/**
*测试部门
*/
public String pk_dept;
/**
*标志位
*/
public UFBoolean flag;
/**
*变化
*/
public String change;
/**
*分析统计
*/
public String analysestates;
/**
*报告名称
*/
public String reportname;
/**
*是否报告
*/
public UFBoolean isreport;
/**
*条件补偿
*/
public String condcomp;
/**
*版本
*/
public String version;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_testlistcomp;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_testlistentry的Getter方法.属性名：孙表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_testlistentry() {
return this.pk_testlistentry;
} 

/**
* 属性pk_testlistentry的Setter方法.属性名：孙表主键
* 创建日期:2018-12-5
* @param newPk_testlistentry java.lang.String
*/
public void setPk_testlistentry ( String pk_testlistentry) {
this.pk_testlistentry=pk_testlistentry;
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
* 属性 displayorder的Getter方法.属性名：显示顺序
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getDisplayorder() {
return this.displayorder;
} 

/**
* 属性displayorder的Setter方法.属性名：显示顺序
* 创建日期:2018-12-5
* @param newDisplayorder java.lang.Integer
*/
public void setDisplayorder ( Integer displayorder) {
this.displayorder=displayorder;
} 
 
/**
* 属性 standardtest的Getter方法.属性名：标准测试
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getStandardtest() {
return this.standardtest;
} 

/**
* 属性standardtest的Setter方法.属性名：标准测试
* 创建日期:2018-12-5
* @param newStandardtest java.lang.String
*/
public void setStandardtest ( String standardtest) {
this.standardtest=standardtest;
} 
 
/**
* 属性 iscarry的Getter方法.属性名：进位
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIscarry() {
return this.iscarry;
} 

/**
* 属性iscarry的Setter方法.属性名：进位
* 创建日期:2018-12-5
* @param newIscarry nc.vo.pub.lang.UFBoolean
*/
public void setIscarry ( UFBoolean iscarry) {
this.iscarry=iscarry;
} 
 
/**
* 属性 refname的Getter方法.属性名：参数名
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getRefname() {
return this.refname;
} 

/**
* 属性refname的Setter方法.属性名：参数名
* 创建日期:2018-12-5
* @param newRefname java.lang.String
*/
public void setRefname ( String refname) {
this.refname=refname;
} 
 
/**
* 属性 refvalue的Getter方法.属性名：参数值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getRefvalue() {
return this.refvalue;
} 

/**
* 属性refvalue的Setter方法.属性名：参数值
* 创建日期:2018-12-5
* @param newRefvalue java.lang.String
*/
public void setRefvalue ( String refvalue) {
this.refvalue=refvalue;
} 
 
/**
* 属性 testlevel的Getter方法.属性名：测试等级
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTestlevel() {
return this.testlevel;
} 

/**
* 属性testlevel的Setter方法.属性名：测试等级
* 创建日期:2018-12-5
* @param newTestlevel java.lang.String
*/
public void setTestlevel ( String testlevel) {
this.testlevel=testlevel;
} 
 
/**
* 属性 pk_instrument的Getter方法.属性名：仪器
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_instrument() {
return this.pk_instrument;
} 

/**
* 属性pk_instrument的Setter方法.属性名：仪器
* 创建日期:2018-12-5
* @param newPk_instrument nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_instrument ( String pk_instrument) {
this.pk_instrument=pk_instrument;
} 
 
/**
* 属性 pk_dept的Getter方法.属性名：测试部门
*  创建日期:2018-12-5
* @return nc.vo.om.hrdept.HRDeptVO
*/
public String getPk_dept() {
return this.pk_dept;
} 

/**
* 属性pk_dept的Setter方法.属性名：测试部门
* 创建日期:2018-12-5
* @param newPk_dept nc.vo.om.hrdept.HRDeptVO
*/
public void setPk_dept ( String pk_dept) {
this.pk_dept=pk_dept;
} 
 
/**
* 属性 flag的Getter方法.属性名：标志位
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getFlag() {
return this.flag;
} 

/**
* 属性flag的Setter方法.属性名：标志位
* 创建日期:2018-12-5
* @param newFlag nc.vo.pub.lang.UFBoolean
*/
public void setFlag ( UFBoolean flag) {
this.flag=flag;
} 
 
/**
* 属性 change的Getter方法.属性名：变化
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getChange() {
return this.change;
} 

/**
* 属性change的Setter方法.属性名：变化
* 创建日期:2018-12-5
* @param newChange java.lang.String
*/
public void setChange ( String change) {
this.change=change;
} 
 
/**
* 属性 analysestates的Getter方法.属性名：分析统计
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getAnalysestates() {
return this.analysestates;
} 

/**
* 属性analysestates的Setter方法.属性名：分析统计
* 创建日期:2018-12-5
* @param newAnalysestates java.lang.String
*/
public void setAnalysestates ( String analysestates) {
this.analysestates=analysestates;
} 
 
/**
* 属性 reportname的Getter方法.属性名：报告名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getReportname() {
return this.reportname;
} 

/**
* 属性reportname的Setter方法.属性名：报告名称
* 创建日期:2018-12-5
* @param newReportname java.lang.String
*/
public void setReportname ( String reportname) {
this.reportname=reportname;
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
* 属性 condcomp的Getter方法.属性名：条件补偿
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCondcomp() {
return this.condcomp;
} 

/**
* 属性condcomp的Setter方法.属性名：条件补偿
* 创建日期:2018-12-5
* @param newCondcomp java.lang.String
*/
public void setCondcomp ( String condcomp) {
this.condcomp=condcomp;
} 
 
/**
* 属性 version的Getter方法.属性名：版本
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getVersion() {
return this.version;
} 

/**
* 属性version的Setter方法.属性名：版本
* 创建日期:2018-12-5
* @param newVersion java.lang.String
*/
public void setVersion ( String version) {
this.version=version;
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
public String getPk_testlistcomp(){
return this.pk_testlistcomp;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_testlistcomp String
*/
public void setPk_testlistcomp(String pk_testlistcomp){
this.pk_testlistcomp=pk_testlistcomp;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.testlistentry");
    }
    
    @Override
   	public String getParentPKFieldName() {
   		// TODO Auto-generated method stub
   		return "pk_testlistcomp";
   	}
   }
    