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
 
public class TaskBVO extends SuperVO {
	public TaskRVO [] pk_task_r;
	public TaskSVO [] pk_sample;
public TaskRVO[] getPk_task_r() {
		return pk_task_r;
	}

	public void setPk_task_r(TaskRVO[] pk_task_r) {
		this.pk_task_r = pk_task_r;
	}

	public TaskSVO[] getPk_sample() {
		return pk_sample;
	}

	public void setPk_sample(TaskSVO[] pk_sample) {
		this.pk_sample = pk_sample;
	}

/**
*任务行主键
*/
public String pk_task_b;
/**
*任务编号
*/
public String taskcode;
/**
*任务名称
*/
public String taskname;
/**
*样品数量
*/
public UFDouble samplequantity;
/**
*执行顺序
*/
public Integer runorder;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_task_h;
/**
*时间戳
*/
public UFDateTime ts;
    public Integer Dr;
    
    
public Integer getDr() {
		return Dr;
	}

	public void setDr(Integer dr) {
		Dr = dr;
	}

/**
* 属性 pk_task_b的Getter方法.属性名：任务行主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_task_b() {
return this.pk_task_b;
} 

/**
* 属性pk_task_b的Setter方法.属性名：任务行主键
* 创建日期:2018-12-5
* @param newPk_task_b java.lang.String
*/
public void setPk_task_b ( String pk_task_b) {
this.pk_task_b=pk_task_b;
} 
 
/**
* 属性 taskcode的Getter方法.属性名：任务编号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTaskcode() {
return this.taskcode;
} 

/**
* 属性taskcode的Setter方法.属性名：任务编号
* 创建日期:2018-12-5
* @param newTaskcode java.lang.String
*/
public void setTaskcode ( String taskcode) {
this.taskcode=taskcode;
} 
 
/**
* 属性 taskname的Getter方法.属性名：任务名称
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTaskname() {
return this.taskname;
} 

/**
* 属性taskname的Setter方法.属性名：任务名称
* 创建日期:2018-12-5
* @param newTaskname java.lang.String
*/
public void setTaskname ( String taskname) {
this.taskname=taskname;
} 
 
/**
* 属性 samplequantity的Getter方法.属性名：样品数量
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDouble
*/
public UFDouble getSamplequantity() {
return this.samplequantity;
} 

/**
* 属性samplequantity的Setter方法.属性名：样品数量
* 创建日期:2018-12-5
* @param newSamplequantity nc.vo.pub.lang.UFDouble
*/
public void setSamplequantity ( UFDouble samplequantity) {
this.samplequantity=samplequantity;
} 
 
/**
* 属性 runorder的Getter方法.属性名：执行顺序
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getRunorder() {
return this.runorder;
} 

/**
* 属性runorder的Setter方法.属性名：执行顺序
* 创建日期:2018-12-5
* @param newRunorder java.lang.Integer
*/
public void setRunorder ( Integer runorder) {
this.runorder=runorder;
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
public String getPk_task_h(){
return this.pk_task_h;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_task_h String
*/
public void setPk_task_h(String pk_task_h){
this.pk_task_h=pk_task_h;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_b");
    }
   }
    