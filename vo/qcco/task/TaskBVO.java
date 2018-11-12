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
 
public class TaskBVO extends SuperVO {
	
/**
*任?行主?
*/
public String pk_task_b;
/**
*任???
*/
public String taskcode;
/**
*任?名?
*/
public String taskname;
/**
*?品?量
*/
public String samplequantity;
/**
*?行?序
*/
public Integer runorder;
/**
*行?
*/
public String rowno;
/**
*上??据主?
*/
public String pk_task_h;
/**
*??戳
*/
public UFDateTime ts;
    
    
/**
* ?性 pk_task_b的Getter方法.?性名：任?行主?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getPk_task_b() {
return this.pk_task_b;
} 

/**
* ?性pk_task_b的Setter方法.?性名：任?行主?
* ?建日期:2018-11-12
* @param newPk_task_b java.lang.String
*/
public void setPk_task_b ( String pk_task_b) {
this.pk_task_b=pk_task_b;
} 
 
/**
* ?性 taskcode的Getter方法.?性名：任???
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getTaskcode() {
return this.taskcode;
} 

/**
* ?性taskcode的Setter方法.?性名：任???
* ?建日期:2018-11-12
* @param newTaskcode java.lang.String
*/
public void setTaskcode ( String taskcode) {
this.taskcode=taskcode;
} 
 
/**
* ?性 taskname的Getter方法.?性名：任?名?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getTaskname() {
return this.taskname;
} 

/**
* ?性taskname的Setter方法.?性名：任?名?
* ?建日期:2018-11-12
* @param newTaskname java.lang.String
*/
public void setTaskname ( String taskname) {
this.taskname=taskname;
} 
 
/**
* ?性 samplequantity的Getter方法.?性名：?品?量
*  ?建日期:2018-11-12
* @return nc.vo.pub.lang.UFDouble
*/
public String getSamplequantity() {
return this.samplequantity;
} 

/**
* ?性samplequantity的Setter方法.?性名：?品?量
* ?建日期:2018-11-12
* @param newSamplequantity nc.vo.pub.lang.UFDouble
*/
public void setSamplequantity ( String samplequantity) {
this.samplequantity=samplequantity;
} 
 
/**
* ?性 runorder的Getter方法.?性名：?行?序
*  ?建日期:2018-11-12
* @return java.lang.Integer
*/
public Integer getRunorder() {
return this.runorder;
} 

/**
* ?性runorder的Setter方法.?性名：?行?序
* ?建日期:2018-11-12
* @param newRunorder java.lang.Integer
*/
public void setRunorder ( Integer runorder) {
this.runorder=runorder;
} 
 
/**
* ?性 rowno的Getter方法.?性名：行?
*  ?建日期:2018-11-12
* @return java.lang.String
*/
public String getRowno() {
return this.rowno;
} 

/**
* ?性rowno的Setter方法.?性名：行?
* ?建日期:2018-11-12
* @param newRowno java.lang.String
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
} 
 
/**
* ?性 生成上?主?的Getter方法.?性名：上?主?
*  ?建日期:2018-11-12
* @return String
*/
public String getPk_task_h(){
return this.pk_task_h;
}
/**
* ?性生成上?主?的Setter方法.?性名：上?主?
* ?建日期:2018-11-12
* @param newPk_task_h String
*/
public void setPk_task_h(String pk_task_h){
this.pk_task_h=pk_task_h;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_b");
    }
   }
    