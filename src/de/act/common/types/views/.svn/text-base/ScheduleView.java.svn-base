package de.act.common.types.views;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ScheduleView implements Serializable {

	private static final long serialVersionUID = 8078130926333915970L;
	private String flt_id;
	private String conx_id;
	private Long flt_group;
	private String dept;
	private String dest;
	private String ca_2lc;
	private String flt_no;
	private Time dep;
	private Integer dep_dt;
	private Time arr;
	private Integer arr_dt;
	private String lag;	//for what?
	private String freq;
	private Date vad_from;
	private Date vad_to;
	private Integer flt_stops;
	private String ac_reg;
	private Double capacity;
	private String ca_id;
	private String cur_3lc;
	private Long ac_id;
	private String transfer_to_ca_id;
	private Integer close_out;
	private Double mmt;

	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof ScheduleView) {
			ScheduleView s = (ScheduleView) obj;
			return new EqualsBuilder().append(s.flt_id, this.flt_id).isEquals();
		}

		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.ac_reg).toHashCode();
	}

	public String getFlt_Id() {
		return this.flt_id;
	}

	public void setFlt_Id( String flt_id ) {
		this.flt_id = flt_id;
	}

	public String getConx_Id() {
		return this.conx_id;
	}

	public void setConx_Id(String conx_id) {
		this.conx_id = conx_id;
	}

	public Long getFlt_group() {
		return this.flt_group;
	}

	public void setFlt_group( Long flt_group ) {
		this.flt_group = flt_group;
	}

	public String getDept() {
		return dept;
	}

	public void setDept( String dept ) {
		this.dept = dept;
	}

	public String getDest() {
		return dest;
	}

	public void setDest( String dest ) {
		this.dest = dest;
	}

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc( String ca_2lc ) {
		this.ca_2lc = ca_2lc;
	}

	public void setFlt_no( String flt_no ) {
		this.flt_no = flt_no;
	}

	public String getFlt_no() {
		return this.flt_no;
	}

	public Time getDep() {
		return dep;
	}

	public void setDep(Time dep) {
		this.dep = dep;
	}

	public Integer getDep_day() {
		return this.dep_dt;
	}

	public void setDep_day(Integer dep_day) {
		this.dep_dt = dep_day;
	}

	public Time getArr() {
		return arr;
	}

	public void setArr(Time arr) {
		this.arr = arr;
	}

	public Integer getArr_day() {
		return this.arr_dt;
	}

	public void setArr_dt(Integer arr_day) {
		this.arr_dt = arr_day;
	}

	public String getLag() {
		return lag;
	}

	public void setLag(String lag) {
		this.lag = lag;
	}

	public String getFreq() {
		return this.freq;
	}

	public void setFreq( String freq ) {
		this.freq = freq;
	}

	public Date getVad_from() {
		return this.vad_from;
	}

	public void setVad_from( Date vad_from ) {
		this.vad_from = vad_from;
	}

	public Date getVad_to() {
		return this.vad_to;
	}

	public void setVad_to(Date vad_to) {
		this.vad_to = vad_to;
	}

	public Double getCapacity() {
		return this.capacity;
	}

	public void setCapacity( Double capacity ) {
		this.capacity = capacity;
	}

	public Integer getFlt_stops() {
		return this.flt_stops;
	}

	public void setFlt_stops( Integer flt_stops ) {
		this.flt_stops = flt_stops;
	}

	public String getAc_reg() {
		return this.ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}

	public String getCa_Id() {
		return ca_id;
	}

	public void setCa_Id(String ca_id) {
		this.ca_id = ca_id;
	}

	public String getCur_3lc() {
		return cur_3lc;
	}

	public void setCur_3lc(String cur_3lc) {
		this.cur_3lc = cur_3lc;
	}

	public Long getAc_Id() {
		return ac_id;
	}

	public void setAc_Id(Long ac_id) {
		this.ac_id  = ac_id;
	}

	public String getTransfer_to_ca_id() {
		return transfer_to_ca_id;
	}

	public void setTransfer_to_ca_id(String transfer_to_ca_id) {
		this.transfer_to_ca_id = transfer_to_ca_id;
	}

	public Integer getClose_out()
	{
		return close_out;
	}

	public void setClose_out(Integer close_out)
	{
		this.close_out = close_out;
	}

	public Double getMmt()
	{
		return mmt;
	}

	public void setMmt(Double mmt)
	{
		this.mmt = mmt;
	}
	
}
