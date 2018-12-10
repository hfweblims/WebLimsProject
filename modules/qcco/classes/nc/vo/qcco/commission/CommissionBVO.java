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
 *  创建日期:2018-12-5
 * @author yonyouBQ
 * @version NCPrj ??
 */
 
public class CommissionBVO extends SuperVO {
	public CommissionRVO [] pk_commission_r;
public CommissionRVO[] getPk_commission_r() {
		return pk_commission_r;
	}

	public void setPk_commission_r(CommissionRVO[] pk_commission_r) {
		this.pk_commission_r = pk_commission_r;
	}

/**
*样品行主键
*/
public String pk_commission_b;
/**
*产品系列
*/
public String pk_productserial;
/**
*行号
*/
public String rowno;
/**
*规格型号
*/
public String typeno;
/**
*测试温度
*/
public String pk_testtemperature;
/**
*样品组别
*/
public String pk_samplegroup;
/**
*样品数量
*/
public String quantity;
/**
*制造商
*/
public String pk_manufacturer;
/**
*触点型号
*/
public String contactorno;
/**
*其他信息
*/
public String otherinfo;
/**
*顺序号
*/
public Integer seqnum;
/**
*上层单据主键
*/
public String pk_commission_h;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_commission_b的Getter方法.属性名：样品行主键
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getPk_commission_b() {
return this.pk_commission_b;
} 

/**
* 属性pk_commission_b的Setter方法.属性名：样品行主键
* 创建日期:2018-12-5
* @param newPk_commission_b java.lang.String
*/
public void setPk_commission_b ( String pk_commission_b) {
this.pk_commission_b=pk_commission_b;
} 
 
/**
* 属性 pk_productserial的Getter方法.属性名：产品系列
*  创建日期:2018-12-5
* @return nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public String getPk_productserial() {
return this.pk_productserial;
} 

/**
* 属性pk_productserial的Setter方法.属性名：产品系列
* 创建日期:2018-12-5
* @param newPk_productserial nc.vo.qcco.qcproductserial.ProductSerialVO
*/
public void setPk_productserial ( String pk_productserial) {
this.pk_productserial=pk_productserial;
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
* 属性 typeno的Getter方法.属性名：规格型号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getTypeno() {
return this.typeno;
} 

/**
* 属性typeno的Setter方法.属性名：规格型号
* 创建日期:2018-12-5
* @param newTypeno java.lang.String
*/
public void setTypeno ( String typeno) {
this.typeno=typeno;
} 
 
/**
* 属性 pk_testtemperature的Getter方法.属性名：测试温度
*  创建日期:2018-12-5
* @return nc.vo.qcco.qctestemperature.TestemperatureVO
*/
public String getPk_testtemperature() {
return this.pk_testtemperature;
} 

/**
* 属性pk_testtemperature的Setter方法.属性名：测试温度
* 创建日期:2018-12-5
* @param newPk_testtemperature nc.vo.qcco.qctestemperature.TestemperatureVO
*/
public void setPk_testtemperature ( String pk_testtemperature) {
this.pk_testtemperature=pk_testtemperature;
} 
 
/**
* 属性 pk_samplegroup的Getter方法.属性名：样品组别
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_samplegroup() {
return this.pk_samplegroup;
} 

/**
* 属性pk_samplegroup的Setter方法.属性名：样品组别
* 创建日期:2018-12-5
* @param newPk_samplegroup nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_samplegroup ( String pk_samplegroup) {
this.pk_samplegroup=pk_samplegroup;
} 
 
/**
* 属性 quantity的Getter方法.属性名：样品数量
*  创建日期:2018-12-5
* @return nc.vo.pub.lang.UFDouble
*/
public String getQuantity() {
return this.quantity;
} 

/**
* 属性quantity的Setter方法.属性名：样品数量
* 创建日期:2018-12-5
* @param newQuantity nc.vo.pub.lang.UFDouble
*/
public void setQuantity ( String quantity) {
this.quantity=quantity;
} 
 
/**
* 属性 pk_manufacturer的Getter方法.属性名：制造商
*  创建日期:2018-12-5
* @return nc.vo.bd.defdoc.DefdocVO
*/
public String getPk_manufacturer() {
return this.pk_manufacturer;
} 

/**
* 属性pk_manufacturer的Setter方法.属性名：制造商
* 创建日期:2018-12-5
* @param newPk_manufacturer nc.vo.bd.defdoc.DefdocVO
*/
public void setPk_manufacturer ( String pk_manufacturer) {
this.pk_manufacturer=pk_manufacturer;
} 
 
/**
* 属性 contactorno的Getter方法.属性名：触点型号
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getContactorno() {
return this.contactorno;
} 

/**
* 属性contactorno的Setter方法.属性名：触点型号
* 创建日期:2018-12-5
* @param newContactorno java.lang.String
*/
public void setContactorno ( String contactorno) {
this.contactorno=contactorno;
} 
 
/**
* 属性 otherinfo的Getter方法.属性名：其他信息
*  创建日期:2018-12-5
* @return java.lang.String
*/
public String getOtherinfo() {
return this.otherinfo;
} 

/**
* 属性otherinfo的Setter方法.属性名：其他信息
* 创建日期:2018-12-5
* @param newOtherinfo java.lang.String
*/
public void setOtherinfo ( String otherinfo) {
this.otherinfo=otherinfo;
} 
 
/**
* 属性 seqnum的Getter方法.属性名：顺序号
*  创建日期:2018-12-5
* @return java.lang.Integer
*/
public Integer getSeqnum() {
return this.seqnum;
} 

/**
* 属性seqnum的Setter方法.属性名：顺序号
* 创建日期:2018-12-5
* @param newSeqnum java.lang.Integer
*/
public void setSeqnum ( Integer seqnum) {
this.seqnum=seqnum;
} 
 
/**
* 属性 生成上层主键的Getter方法.属性名：上层主键
*  创建日期:2018-12-5
* @return String
*/
public String getPk_commission_h(){
return this.pk_commission_h;
}
/**
* 属性生成上层主键的Setter方法.属性名：上层主键
* 创建日期:2018-12-5
* @param newPk_commission_h String
*/
public void setPk_commission_h(String pk_commission_h){
this.pk_commission_h=pk_commission_h;
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
    return VOMetaFactory.getInstance().getVOMeta("qcco.commission_b");
    }
   }
    