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
 
public class TaskRVO extends SuperVO {
	
/**
*??行主?
*/
public String pk_task_r;
/**
*?品??
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
*?位
*/
public String pk_unit;
/**
*????
*/
public Boolean testflag;
/**
*判定??
*/
public Boolean judgeflag;
/**
*???度
*/
public String pk_testtemperature;
/**
*上??据主?
*/
public String pk_task_b;
/**
*??戳
*/
public UFDateTime ts;
    
    
/**
* ?性 pk_task_r的Getter方法.?性名：??行主?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_task_r() {
return this.pk_task_r;
} 

/**
* ?性pk_task_r的Setter方法.?性名：??行主?
* ?建日期:2018-11-12
* @param newPk_task_r java.lang.String
*/
public void setPk_task_r ( String pk_task_r) {
this.pk_task_r=pk_task_r;
} 
 
/**
* ?性 pk_samplegroup的Getter方法.?性名：?品??
*  ?建日期:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_samplegroup() {
return this.pk_samplegroup;
} 

/**
* ?性pk_samplegroup的Setter方法.?性名：?品??
* ?建日期:2018-11-12
* @param newPk_samplegroup nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_samplegroup ( String pk_samplegroup) {
this.pk_samplegroup=pk_samplegroup;
} 
 
/**
* ?性 stdminvalue的Getter方法.?性名：最小值
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdminvalue() {
return this.stdminvalue;
} 

/**
* ?性stdminvalue的Setter方法.?性名：最小值
* ?建日期:2018-11-12
* @param newStdminvalue nc.vo.pub.lang.UFDouble
*/
public void setStdminvalue ( String stdminvalue) {
this.stdminvalue=stdminvalue;
} 
 
/**
* ?性 stdmaxvalue的Getter方法.?性名：最大值
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getStdmaxvalue() {
return this.stdmaxvalue;
} 

/**
* ?性stdmaxvalue的Setter方法.?性名：最大值
* ?建日期:2018-11-12
* @param newStdmaxvalue nc.vo.pub.lang.UFDouble
*/
public void setStdmaxvalue ( String stdmaxvalue) {
this.stdmaxvalue=stdmaxvalue;
} 
 
/**
* ?性 pk_unit的Getter方法.?性名：?位
*  ?建日期:2018-11-12
* @return nc.vo.bd.material.measdoc.MeasdocVO
*/
public String getPk_unit() {
return this.pk_unit;
} 

/**
* ?性pk_unit的Setter方法.?性名：?位
* ?建日期:2018-11-12
* @param newPk_unit nc.vo.bd.material.measdoc.MeasdocVO
*/
public void setPk_unit ( String pk_unit) {
this.pk_unit=pk_unit;
} 
 
/**
* ?性 testflag的Getter方法.?性名：????
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getTestflag() {
return this.testflag;
} 

/**
* ?性testflag的Setter方法.?性名：????
* ?建日期:2018-11-12
* @param newTestflag nc.vo.pub.lang.UFBoolean
*/
public void setTestflag ( Boolean testflag) {
this.testflag=testflag;
} 
 
/**
* ?性 judgeflag的Getter方法.?性名：判定??
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFBoolean
*/
public Boolean getJudgeflag() {
return this.judgeflag;
} 

/**
* ?性judgeflag的Setter方法.?性名：判定??
* ?建日期:2018-11-12
* @param newJudgeflag nc.vo.pub.lang.UFBoolean
*/
public void setJudgeflag ( Boolean judgeflag) {
this.judgeflag=judgeflag;
} 
 
/**
* ?性 pk_testtemperature的Getter方法.?性名：???度
*  ?建日期:2018-11-12
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_testtemperature() {
return this.pk_testtemperature;
} 

/**
* ?性pk_testtemperature的Setter方法.?性名：???度
* ?建日期:2018-11-12
* @param newPk_testtemperature nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_testtemperature ( String pk_testtemperature) {
this.pk_testtemperature=pk_testtemperature;
} 
 
/**
* ?性 生成上?主?的Getter方法.?性名：上?主?
*  ?建日期:2018-11-12
* @return String
*/
public String getPk_task_b(){
return this.pk_task_b;
}
/**
* ?性生成上?主?的Setter方法.?性名：上?主?
* ?建日期:2018-11-12
* @param newPk_task_b String
*/
public void setPk_task_b(String pk_task_b){
this.pk_task_b=pk_task_b;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_r");
    }
   }
    