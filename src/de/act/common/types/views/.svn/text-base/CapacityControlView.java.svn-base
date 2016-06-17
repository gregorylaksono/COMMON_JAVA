package de.act.common.types.views;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class CapacityControlView implements Serializable {

	private static final long serialVersionUID = 8078130926333915970L;
	private Date capacity_date;
	private Long a_flt_id;
	private String ca_2lc;
	private Long s_flt_id;
	private String flight;
	private String ac_reg;
	private String dept;
	private String dest;
	private Timestamp dep;
	private Timestamp arr;
	private Double max_weight;
	private Double max_volume;
	private Double auto_weight;
	private Double auto_volume;
	private Double manual_weight;
	private Double manual_volume;
	private Integer open_for_cargo;
	private Long flt_group;
	private List<FltGroupView> l_flt_group;
	private int full_percentage;
	private Long ac_id;
	
	private String depTime;
	private String arrTime;
	private String capacity_date_time;

	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof CapacityControlView) {
			CapacityControlView a = (CapacityControlView) obj;
			return new EqualsBuilder().append(a.a_flt_id, this.a_flt_id).isEquals();
		}
		return false;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(this.ac_reg).toHashCode();
	}

	public Date getCapacity_date() {
		return capacity_date;
	}

	public void setCapacity_date(Date capacity_date) {
		this.capacity_date = capacity_date;
		this.capacity_date_time = null;
		if(capacity_date != null)
			this.capacity_date_time = new String(capacity_date.getYear() + ":" + capacity_date.getMonth() + ":" + capacity_date.getDate() + ":" + capacity_date.getHours() + ":" + capacity_date.getMinutes() + ":") + capacity_date.getSeconds();
	}

	public Long getA_flt_id() {
		return a_flt_id;
	}

	public void setA_flt_id(Long a_flt_id) {
		this.a_flt_id = a_flt_id;
	}

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}

	public Long getS_flt_id() {
		return s_flt_id;
	}

	public void setS_flt_id(Long s_flt_id) {
		this.s_flt_id = s_flt_id;
	}

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
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

	public Timestamp getDep() {
		return dep;
	}

	public void setDep(Timestamp dep) {
		this.dep = dep;
		this.depTime = null;
		if(dep != null)
			this.depTime = new String(dep.getYear() + ":" + dep.getMonth() + ":" + dep.getDate() + ":" + dep.getHours() + ":" + dep.getMinutes() + ":") + dep.getSeconds();
	}

	public Timestamp getArr() {
		return arr;
	}

	public void setArr(Timestamp arr) {
		this.arr = arr;
		this.arrTime = null;
		if(arr != null)
			this.arrTime = new String(arr.getYear() + ":" + arr.getMonth() + ":" + arr.getDate() + ":" + arr.getHours() + ":" + arr.getMinutes() + ":") + arr.getSeconds();
	}

	public Double getMax_weight() {
		return max_weight;
	}

	public void setMax_weight(Double max_weight) {
		this.max_weight = max_weight;
	}

	public Double getMax_volume() {
		return max_volume;
	}

	public void setMax_volume(Double max_volume) {
		this.max_volume = max_volume;
	}

	public Double getAuto_weight() {
		return auto_weight;
	}

	public void setAuto_weight(Double auto_weight) {
		this.auto_weight = auto_weight;
	}

	public Double getAuto_volume() {
		return auto_volume;
	}

	public void setAuto_volume(Double auto_volume) {
		this.auto_volume = auto_volume;
	}

	public Double getManual_weight() {
		return manual_weight;
	}

	public void setManual_weight(Double manual_weight) {
		this.manual_weight = manual_weight;
	}

	public Double getManual_volume() {
		return manual_volume;
	}

	public void setManual_volume(Double manual_volume) {
		this.manual_volume = manual_volume;
	}

	public Integer getOpen_for_cargo() {
		return open_for_cargo;
	}

	public void setOpen_for_cargo(Integer open_for_cargo) {
		this.open_for_cargo = open_for_cargo;
	}

	public Long getFlt_group() {
		return flt_group;
	}

	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
	}

	public List<FltGroupView> getL_flt_group() {
		return l_flt_group;
	}

	public void setL_flt_group(List<FltGroupView> l_flt_group) {
		this.l_flt_group = l_flt_group;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public int getFull_percentage() {
		return full_percentage;
	}

	public void setFull_percentage(int full_percentage) {
		this.full_percentage = full_percentage;
	}

	public Long getAc_id() {
		return ac_id;
	}

	public void setAc_id(Long ac_id) {
		this.ac_id = ac_id;
	}

	public String getDepTime()
	{
		return depTime;
	}

	public String getArrTime()
	{
		return arrTime;
	}

	public String getCapacity_date_time()
	{
		return capacity_date_time;
	}
	
}
