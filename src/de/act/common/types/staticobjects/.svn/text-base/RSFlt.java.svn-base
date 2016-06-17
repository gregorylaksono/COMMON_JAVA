package de.act.common.types.staticobjects;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSFlt implements java.io.Serializable, Comparable, Cloneable {

	private static final long serialVersionUID = 8117146035870901736L;
	public Long flt_id;
	public String flt_no;
	public String freq;
	public Date dep;
	public Integer dep_dt;
	public Time arr;
	public Integer arr_dt;
	public Long ac_id;
	public String ac_name;
	public Long flt_group;
	public Integer flt_stops;
	public String transfer_to_ca_id;
	public Integer close_out;
	public RSVad vad;
	public RSConx connection;
	private String displayString = this.flt_no;
	private RSFltMmt flt_mmt;
	private int hashcode = 0;
	/*Rony - 20140526*/
	public Carrier transfer_ca;
	
	public Carrier getTransfer_ca() {
		return transfer_ca;
	}

	public void setTransfer_ca(Carrier transfer_ca) {
		this.transfer_ca = transfer_ca;
	}

	transient private static final int baseHash = RSFlt.class.getName().hashCode() * 2 + 1;
	
	private RSFltCapacity flightCapacity;

	public Long getFlt_Id() {
		return this.flt_id;
	}

	public void setFlt_Id( Long flt_id ) {
		this.flt_id = flt_id;
	}

	public String getFlt_no() {
		return flt_no;
	}

	public void setFlt_no(String flt_no) {
		this.flt_no = flt_no;
	}

	public String getFreq() {
		return this.freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
	}

	public Date getDep() {
		return this.dep;
	}

	public void setDep( Date dep ) {
		this.dep = dep;
	}

	public Integer getDep_dt() {
		return this.dep_dt;
	}

	public void setDep_dt(Integer dep_dt) {
		this.dep_dt = dep_dt;
	}

	public Time getArr() {
		return this.arr;
	}

	public void setArr(Time arr) {
		this.arr = arr;
	}

	public Integer getArr_dt() {
		return this.arr_dt;
	}

	public void setArr_dt(Integer arr_dt) {
		this.arr_dt = arr_dt;
	}

	public Long getAc_Id() {
		return ac_id;
	}

	public void setAc_Id(Long ac_id) {
		this.ac_id = ac_id;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public Long getFlt_group() {
		return this.flt_group;
	}

	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
	}

	public Integer getFlt_stops() {
		return flt_stops;
	}

	public void setFlt_stops(Integer flt_stops) {
		this.flt_stops = flt_stops;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public RSConx getConx() {
		return connection;
	}

	public void setConx(RSConx conx) {
		this.connection = conx;
	}

	public String toString() {
		if (this.displayString == null) { return this.flt_no; }
		return this.displayString;
	}

	public void setDisplayString(final String flt_no2) {
		this.displayString = flt_no2;
	}

	public int compareTo(final Object o) {
		return o.toString().compareTo(this.toString());
	}

	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null ) { return false; }
		if (obj instanceof RSFlt) { return ((RSFlt) obj).flt_id.equals(this.flt_id); }
		return false;
	}

	public int hashCode() {
		if (this.hashcode == 0) {
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.flt_id)
			.toHashCode();
		}
		return this.hashcode;
	}

	public RSFltCapacity getFlightCapacity() {
		return flightCapacity;
	}

	public void setFlightCapacity(RSFltCapacity flightCapacity) {
		this.flightCapacity = flightCapacity;
	}

	public String getTransfer_to_ca_id()
	{
		return transfer_to_ca_id;
	}

	public void setTransfer_to_ca_id(String transfer_to_ca_id)
	{
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

	public RSFltMmt getFlt_mmt()
	{
		return flt_mmt;
	}

	public void setFlt_mmt(RSFltMmt flt_mmt)
	{
		this.flt_mmt = flt_mmt;
	}

	@Override
	public RSFlt clone() throws CloneNotSupportedException
	{
		RSFlt temp = (RSFlt)super.clone();
		
		temp.setConx(this.getConx().clone());
		temp.setVad(this.getVad().clone());
		temp.setFlightCapacity(this.getFlightCapacity().clone());
		temp.setFlt_mmt(this.getFlt_mmt().clone());
		
		return temp;
	}
}
