package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class AircraftView implements Serializable {

	private static final long serialVersionUID = 8078130926333915970L;
	private long ac_id;
	private String ac_reg;
	private int ac_type_id;
	private String iata_type;
	private String ac_type_description;
	private String name;
	private String ac_cargo;
	private int total_compartment;
	private Date vad_from;
	private Date vad_to;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof AircraftView) {
			AircraftView a = (AircraftView) obj;
			return new EqualsBuilder().append(a.ac_reg, this.ac_reg).isEquals();
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

	public long getAc_id() {
		return ac_id;
	}

	public void setAc_id(long ac_id) {
		this.ac_id = ac_id;
	}

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}

	public int getAc_type_id() {
		return ac_type_id;
	}

	public void setAc_type_id( int ac_type_id ) {
		this.ac_type_id = ac_type_id;
	}

	public String getIata_type() {
		return iata_type;
	}

	public void setIata_type( String iata_type ) {
		this.iata_type = iata_type;
	}

	public String getAc_type_description() {
		return ac_type_description;
	}

	public void setAc_type_description(String ac_type_description) {
		this.ac_type_description = ac_type_description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAc_cargo() {
		return ac_cargo;
	}

	public void setAc_cargo(String ac_cargo) {
		this.ac_cargo = ac_cargo;
	}

	public int getTotal_compartment() {
		return total_compartment;
	}

	public void setTotal_compartment( int total_compartment ) {
		this.total_compartment = total_compartment;
	}

	public Date getVad_from() {
		return vad_from;
	}

	public void setVad_from( Date vad_from ) {
		this.vad_from = vad_from;
	}

	public Date getVad_to() {
		return vad_to;
	}

	public void setVad_to( Date vad_to ) {
		this.vad_to = vad_to;
	}
}
