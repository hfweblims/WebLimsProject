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
 
public class TaskSVO extends SuperVO {
	
/**
*样品行主键
*/
public String pk_sample;
/**
*样品编号
*/
public String sampleno;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_task_b;
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
* 属性 pk_sample的Getter方法.属性名：样品行主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_sample() {
return this.pk_sample;
} 

/**
* 属性pk_sample的Setter方法.属性名：样品行主键
* 创建日期:2018-12-5
* @param newPk_sample java.lang.String
*/
public void setPk_sample ( String pk_sample) {
this.pk_sample=pk_sample;
} 
 
/**
* 属性 sampleno的Getter方法.属性名：样品编号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getSampleno() {
return this.sampleno;
} 

/**
* 属性sampleno的Setter方法.属性名：样品编号
* 创建日期:2018-12-5
* @param newSampleno java.lang.String
*/
public void setSampleno ( String sampleno) {
this.sampleno=sampleno;
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
public String getPk_task_b(){
return this.pk_task_b;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_task_b String
*/
public void setPk_task_b(String pk_task_b){
this.pk_task_b=pk_task_b;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.task_s");
    }
    @Override
	public String getParentPKFieldName() {
		// TODO Auto-generated method stub
		return "pk_task_b";
	}
   }
    