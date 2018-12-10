package nc.vo.qcco.analysemethod;

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
 
public class TestitemBVO extends SuperVO {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -7702219713463726890L;
/**
*子表主键
*/
public String pk_testitem;
/**
*值类型
*/
public String pk_valuetype;
/**
*组件
*/
public String pk_component;
/**
*行号
*/
public String rowno;
/**
*上层单据主键
*/
public String pk_analysemethod;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_testitem的Getter方法.属性名：子表主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_testitem() {
return this.pk_testitem;
} 

/**
* 属性pk_testitem的Setter方法.属性名：子表主键
* 创建日期:2018-12-5
* @param newPk_testitem java.lang.String
*/
public void setPk_testitem ( String pk_testitem) {
this.pk_testitem=pk_testitem;
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
* 属性 pk_component的Getter方法.属性名：组件
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_component() {
return this.pk_component;
} 

/**
* 属性pk_component的Setter方法.属性名：组件
* 创建日期:2018-12-5
* @param newPk_component nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_component ( String pk_component) {
this.pk_component=pk_component;
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
public String getPk_analysemethod(){
return this.pk_analysemethod;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_analysemethod String
*/
public void setPk_analysemethod(String pk_analysemethod){
this.pk_analysemethod=pk_analysemethod;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.testitem");
    }
   }
    