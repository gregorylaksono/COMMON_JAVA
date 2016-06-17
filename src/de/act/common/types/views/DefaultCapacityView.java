/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSVad;

/**
 * @author Henry
 *
 */
public class DefaultCapacityView implements Serializable{

	private static final long serialVersionUID = 7224190402608920746L;
	private String conx_id;
	private String ca_id;
	private Long ac_id;
	private String dept;
	private String dest;
	private RSVad conx_vad;
	private RSVad flt_vad;
	private Long flt_id;
	private Long flt_group;
	private Double auto_wgt;
	private Double auto_vol;
	private Double manual_wgt;
	private Double manual_vol;
	private Double max_wgt;
	private Double max_vol;
	private Integer open_for_cargo;
	private String ac_reg;
	private RSVad ac_vad;
	
	public String getConx_id() {
		return conx_id;
	}
	
	public void setConx_id(String conx_id) {
		this.conx_id = conx_id;
	}
	
	public String getCa_id() {
		return ca_id;
	}
	
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	
	public Long getAc_id() {
		return ac_id;
	}

	public void setAc_id(Long ac_id) {
		this.ac_id = ac_id;
	}

	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public RSVad getFlt_vad() {
		return flt_vad;
	}

	public void setFlt_vad(RSVad flt_vad) {
		this.flt_vad = flt_vad;
	}

	public RSVad getConx_vad() {
		return conx_vad;
	}

	public void setConx_vad(RSVad conx_vad) {
		this.conx_vad = conx_vad;
	}

	public Long getFlt_group() {
		return flt_group;
	}

	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
	}

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
	
	public int getOpen_for_cargo() {
		return open_for_cargo;
	}
	
	public void setOpen_for_cargo(int open_for_cargo) {
		this.open_for_cargo = open_for_cargo;
	}

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}

	public RSVad getAc_vad() {
		return ac_vad;
	}

	public void setAc_vad(RSVad ac_vad) {
		this.ac_vad = ac_vad;
	}
}
