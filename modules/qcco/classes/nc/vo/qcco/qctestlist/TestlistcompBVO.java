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
 
public class TestlistcompBVO extends SuperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6824665146058561176L;
	public TestlistentryEVO [] pk_testlistentry;
public TestlistentryEVO[] getPk_testlistentry() {
		return pk_testlistentry;
	}

	public void setPk_testlistentry(TestlistentryEVO[] pk_testlistentry) {
		this.pk_testlistentry = pk_testlistentry;
	}

/**
*子表主键
*/
public String pk_testlistcomp;
/**
*编码
*/
public String code;
/**
*名称
*/
public String name;
/**
*组件
*/
public String component;
/**
*分析统计
*/
public String analysestates;
/**
*显示顺序
*/
public Integer displayorder;
/**
*结果显示顺序
*/
public Integer resultorder;
/**
*单位
*/
public String pk_unitdoc;
/**
*是否四舍五入
*/
public UFBoolean isrounding;
/**
*小数位
*/
public Integer decbits;
/**
*进位
*/
public UFBoolean iscarry;
/**
*最小值
*/
public UFDouble minvalue;
/**
*最大值
*/
public UFDouble maxvalue;
/**
*是否报告
*/
public UFBoolean isreport;
/**
*是否非必输
*/
public UFBoolean isoptional;
/**
*是否显示
*/
public UFBoolean isdisplay;
/**
*要素值
*/
public String factorvalue;
/**
*分析版本
*/
public String analyseversion;
/**
*中文默认值
*/
public String cndefaultvalue;
/**
*英文默认值
*/
public String endefaultvalue;
/**
*List
*/
public String pk_listdoc;
/**
*默认数据存储名称
*/
public String storagename;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_testlist;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_testlistcomp的Getter方法.属性名：子表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_testlistcomp() {
return this.pk_testlistcomp;
} 

/**
* 属性pk_testlistcomp的Setter方法.属性名：子表主键
* 创建日期:2018-12-5
* @param newPk_testlistcomp java.lang.String
*/
public void setPk_testlistcomp ( String pk_testlistcomp) {
this.pk_testlistcomp=pk_testlistcomp;
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
* 属性 component的Getter方法.属性名：组件
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getComponent() {
return this.component;
} 

/**
* 属性component的Setter方法.属性名：组件
* 创建日期:2018-12-5
* @param newComponent nc.vo.bd.defdoc.DefdocVO
*/
public void setComponent ( String component) {
this.component=component;
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
* 属性 resultorder的Getter方法.属性名：结果显示顺序
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getResultorder() {
return this.resultorder;
} 

/**
* 属性resultorder的Setter方法.属性名：结果显示顺序
* 创建日期:2018-12-5
* @param newResultorder java.lang.Integer
*/
public void setResultorder ( Integer resultorder) {
this.resultorder=resultorder;
} 
 
/**
* 属性 pk_unitdoc的Getter方法.属性名：单位
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_unitdoc() {
return this.pk_unitdoc;
} 

/**
* 属性pk_unitdoc的Setter方法.属性名：单位
* 创建日期:2018-12-5
* @param newPk_unitdoc nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_unitdoc ( String pk_unitdoc) {
this.pk_unitdoc=pk_unitdoc;
} 
 
/**
* 属性 isrounding的Getter方法.属性名：是否四舍五入
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsrounding() {
return this.isrounding;
} 

/**
* 属性isrounding的Setter方法.属性名：是否四舍五入
* 创建日期:2018-12-5
* @param newIsrounding nc.vo.pub.lang.UFBoolean
*/
public void setIsrounding ( UFBoolean isrounding) {
this.isrounding=isrounding;
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
* 属性 isoptional的Getter方法.属性名：是否非必输
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFBoolean
*/
public UFBoolean getIsoptional() {
return this.isoptional;
} 

/**
* 属性isoptional的Setter方法.属性名：是否非必输
* 创建日期:2018-12-5
* @param newIsoptional nc.vo.pub.lang.UFBoolean
*/
public void setIsoptional ( UFBoolean isoptional) {
this.isoptional=isoptional;
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
* 属性 factorvalue的Getter方法.属性名：要素值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getFactorvalue() {
return this.factorvalue;
} 

/**
* 属性factorvalue的Setter方法.属性名：要素值
* 创建日期:2018-12-5
* @param newFactorvalue java.lang.String
*/
public void setFactorvalue ( String factorvalue) {
this.factorvalue=factorvalue;
} 
 
/**
* 属性 analyseversion的Getter方法.属性名：分析版本
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getAnalyseversion() {
return this.analyseversion;
} 

/**
* 属性analyseversion的Setter方法.属性名：分析版本
* 创建日期:2018-12-5
* @param newAnalyseversion java.lang.String
*/
public void setAnalyseversion ( String analyseversion) {
this.analyseversion=analyseversion;
} 
 
/**
* 属性 cndefaultvalue的Getter方法.属性名：中文默认值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getCndefaultvalue() {
return this.cndefaultvalue;
} 

/**
* 属性cndefaultvalue的Setter方法.属性名：中文默认值
* 创建日期:2018-12-5
* @param newCndefaultvalue java.lang.String
*/
public void setCndefaultvalue ( String cndefaultvalue) {
this.cndefaultvalue=cndefaultvalue;
} 
 
/**
* 属性 endefaultvalue的Getter方法.属性名：英文默认值
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getEndefaultvalue() {
return this.endefaultvalue;
} 

/**
* 属性endefaultvalue的Setter方法.属性名：英文默认值
* 创建日期:2018-12-5
* @param newEndefaultvalue java.lang.String
*/
public void setEndefaultvalue ( String endefaultvalue) {
this.endefaultvalue=endefaultvalue;
} 
 
/**
* 属性 pk_listdoc的Getter方法.属性名：List
*  创建日期:2018-12-5
* @return nc.vo.qcco.qclistdoc.ListdocHVO
*/
public String getPk_listdoc() {
return this.pk_listdoc;
} 

/**
* 属性pk_listdoc的Setter方法.属性名：List
* 创建日期:2018-12-5
* @param newPk_listdoc nc.vo.qcco.qclistdoc.ListdocHVO
*/
public void setPk_listdoc ( String pk_listdoc) {
this.pk_listdoc=pk_listdoc;
} 
 
/**
* 属性 storagename的Getter方法.属性名：默认数据存储名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getStoragename() {
return this.storagename;
} 

/**
* 属性storagename的Setter方法.属性名：默认数据存储名称
* 创建日期:2018-12-5
* @param newStoragename java.lang.String
*/
public void setStoragename ( String storagename) {
this.storagename=storagename;
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
public String getPk_testlist(){
return this.pk_testlist;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_testlist String
*/
public void setPk_testlist(String pk_testlist){
this.pk_testlist=pk_testlist;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.testlistcomp");
    }
   }
    