package de.act.common.types;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Aflt implements java.io.Serializable{

	private static final long serialVersionUID = -6841264355378574727L;
	Long	a_flt_id;
	Long	flt_group;
	Long	s_flt_id;
	Timestamp	dep;
	Timestamp	arr;
	//RSAc	ac;
	Long ac;
	Double	auto_wgt;
	Double	auto_vol;
	Double	manual_wgt;
	Double	manual_vol;
	Double	max_wgt;
	Double	max_vol;
	Integer open_for_cargo;
	String ac_reg;
	private Date depDate;

	public boolean equals(Object obj) {
		if (this==obj){
			return true;
		}
		if (obj instanceof Aflt) {
			Aflt af = (Aflt) obj;
			return new EqualsBuilder().append(this.a_flt_id, af.a_flt_id).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.a_flt_id).toHashCode();
	}

	public Aflt() {
		open_for_cargo = 0;
	}

	public Long getA_flt_id() {
		return a_flt_id;
	}

	public void setA_flt_id(Long a_flt_id) {
		this.a_flt_id = a_flt_id;
	}

	public Long getFlt_group() {
		return flt_group;
	}

	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
	}

	public Long getS_flt_id() {
		return s_flt_id;
	}

	public void setS_flt_id(Long s_flt_id) {
		this.s_flt_id = s_flt_id;
	}

	public Timestamp getDep() {
		return dep;
	}

	public void setDep(Timestamp dep) {
		this.dep = dep;
	}

	public Timestamp getArr() {
		return arr;
	}

	public void setArr(Timestamp arr) {
		this.arr = arr;
	}

	public Long getAc() {
		return ac;
	}

	public void setAc(Long ac) {
		this.ac = ac;
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

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}
	
}
