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
 *  创建日期:2018-11-12
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class CommissionRVO extends SuperVO {
	
/**
*参数行主键
*/
public String pk_commission_r;
/**
*样品组别
*/
public String pk_samplegroup;
/**
*最小值
*/
public String stdminvalue;
/**
*最大值
*/
public String stdmaxvalue;
/**
*单位
*/
public String pk_unit;
/**
*测试标记
*/
public Boolean testflag;
/**
*判断标记
*/
public Boolean judgeflag;
/**
*测试温度
*/
public String pk_testtemperature;
/**
*上层单据主键
*/
public String pk_commission_b;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_commission_r的Getter方法.属性名：参数行主键
*  创建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_commission_r() {
return this.pk_commission_r;
} 

/**
* 属性pk_commission_r的Setter方法.属性名：参数行主键
* 创建日期:2018-11-12
* @param newPk_commission_r java.lang.String
*/
public void setPk_commission_r ( String pk_commission_r) {
this.pk_commission_r=pk_commission_r;
} 
 
/**
* 属性 pk_samplegroup的Getter方法.属性名：样品组别
*  创建日期:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_samplegroup() {
return this.pk_samplegroup;
} 

/**
* 属性pk_samplegroup的Setter方法.属性名：样品组别
* 创建日期:2018-11-12
* @param newPk_samplegroup nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_samplegroup ( String pk_samplegroup) {
this.pk_samplegroup=pk_samplegroup;
} 
 
/**
* 属性 stdminvalue的Getter方法.属性名：最小值
*  创建日期:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdminvalue() {
return this.stdminvalue;
} 

/**
* 属性stdminvalue的Setter方法.属性名：最小值
* 创建日期:2018-11-12
* @param newStdminvalue nc.vo.pub.lang.UFDouble
*/
public void setStdminvalue ( String stdminvalue) {
this.stdminvalue=stdminvalue;
} 
 
/**
* 属性 stdmaxvalue的Getter方法.属性名：最大值
*  创建日期:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdmaxvalue() {
return this.stdmaxvalue;
} 

/**
* 属性stdmaxvalue的Setter方法.属性名：最大值
* 创建日期:2018-11-12
* @param newStdmaxvalue nc.vo.pub.lang.UFDouble
*/
public void setStdmaxvalue ( String stdmaxvalue) {
this.stdmaxvalue=stdmaxvalue;
} 
 
/**
* 属性 pk_unit的Getter方法.属性名：单位
*  创建日期:2018-11-12
* @return nc.vo.bd.material.measdoc.MeasdocVO
*/
public String getPk_unit() {
return this.pk_unit;
} 

/**
* 属性pk_unit的Setter方法.属性名：单位
* 创建日期:2018-11-12
* @param newPk_unit nc.vo.bd.material.measdoc.MeasdocVO
*/
public void setPk_unit ( String pk_unit) {
this.pk_unit=pk_unit;
} 
 
/**
* 属性 testflag的Getter方法.属性名：测试标记
*  创建日期:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getTestflag() {
return this.testflag;
} 

/**
* 属性testflag的Setter方法.属性名：测试标记
* 创建日期:2018-11-12
* @param newTestflag nc.vo.pub.lang.UFBoolean
*/
public void setTestflag ( Boolean testflag) {
this.testflag=testflag;
} 
 
/**
* 属性 judgeflag的Getter方法.属性名：判断标记
*  创建日期:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getJudgeflag() {
return this.judgeflag;
} 

/**
* 属性judgeflag的Setter方法.属性名：判断标记
* 创建日期:2018-11-12
* @param newJudgeflag nc.vo.pub.lang.UFBoolean
*/
public void setJudgeflag ( Boolean judgeflag) {
this.judgeflag=judgeflag;
} 
 
/**
* 属性 pk_testtemperature的Getter方法.属性名：测试温度
*  创建日期:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_testtemperature() {
return this.pk_testtemperature;
} 

/**
* 属性pk_testtemperature的Setter方法.属性名：测试温度
* 创建日期:2018-11-12
* @param newPk_testtemperature nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_testtemperature ( String pk_testtemperature) {
this.pk_testtemperature=pk_testtemperature;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-11-12
* @return String
*/
public String getPk_commission_b(){
return this.pk_commission_b;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-11-12
* @param newPk_commission_b String
*/
public void setPk_commission_b(String pk_commission_b){
this.pk_commission_b=pk_commission_b;
} 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2018-11-12
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2018-11-12
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("qcco.commission_r");
    }
   }
    