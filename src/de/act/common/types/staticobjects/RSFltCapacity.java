/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSFltCapacity implements Serializable, Cloneable
{

	private static final long serialVersionUID = 8078032722939270851L;
	private Long flt_id;
	private Double auto_wgt;
	private Double auto_vol;
	private Double manual_wgt;
	private Double manual_vol;
	private Double max_wgt;
	private Double max_vol;
	private Integer open_for_cargo;
	
	public Long getFlt_id() {
		return flt_id;
	}
	
	public void setFlt_id(Long flt_id) {
		this.flt_id = flt_id;
	}
	
	public Double getAuto_wgt() {
		return auto_wgt;
	}
	
	public void setAuto_wgt(Double auto_wgt) {
		this.auto_wgt = auto_wgt;
	}
	
	public Double getAuto_vol() {
		return auto_vol;
	}
	
	public void setAuto_vol(Double auto_vol) {
		this.auto_vol = auto_vol;
	}
	
	public Double getManual_wgt() {
		return manual_wgt;
	}
	
	public void setManual_wgt(Double manual_wgt) {
		this.manual_wgt = manual_wgt;
	}
	
	public Double getManual_vol() {
		return manual_vol;
	}
	
	public void setManual_vol(Double manual_vol) {
		this.manual_vol = manual_vol;
	}
	
	public Double getMax_wgt() {
		return max_wgt;
	}
	
	public void setMax_wgt(Double max_wgt) {
		this.max_wgt = max_wgt;
	}
	
	public Double getMax_vol() {
		return max_vol;
	}
	
	public void setMax_vol(Double max_vol) {
		this.max_vol = max_vol;
	}
	
	public Integer getOpen_for_cargo() {
		return open_for_cargo;
	}
	
	public void setOpen_for_cargo(Integer open_for_cargo) {
		this.open_for_cargo = open_for_cargo;
	}
	
	public RSFltCapacity clone() throws CloneNotSupportedException
	{
		return (RSFltCapacity)super.clone();
	}
}