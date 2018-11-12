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
 
public class TaskSVO extends SuperVO {
	
/**
*?品行主?
*/
public String pk_sample;
/**
*?品??
*/
public String sampleno;
/**
*上??据主?
*/
public String pk_task_b;
/**
*??戳
*/
public UFDateTime ts;
    
    
/**
* ?性 pk_sample的Getter方法.?性名：?品行主?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_sample() {
return this.pk_sample;
} 

/**
* ?性pk_sample的Setter方法.?性名：?品行主?
* ?建日期:2018-11-12
* @param newPk_sample java.lang.String
*/
public void setPk_sample ( String pk_sample) {
this.pk_sample=pk_sample;
} 
 
/**
* ?性 sampleno的Getter方法.?性名：?品??
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getSampleno() {
return this.sampleno;
} 

/**
* ?性sampleno的Setter方法.?性名：?品??
* ?建日期:2018-11-12
* @param newSampleno java.lang.String
*/
public void setSampleno ( String sampleno) {
this.sampleno=sampleno;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_s");
    }
   }
    