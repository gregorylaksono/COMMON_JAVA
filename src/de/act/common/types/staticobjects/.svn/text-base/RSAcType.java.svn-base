package de.act.common.types.staticobjects;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 1.0 - 22.01.2007
 */
public final class RSAcType implements java.io.Serializable{

	private static final long serialVersionUID = -6704383870076431162L;
	private int ac_type_id;
	private String iata_type;
	private String icao_type;
	private String description;
	private String ac_size;
	private RSVad vad;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof RSAcType) {
			RSAcType a = (RSAcType) obj;
			return new EqualsBuilder().append(a.ac_type_id, this.ac_type_id).isEquals();
		}

		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.ac_type_id).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*
    @Override
    public String toString() {

	   return this.iata_type;
    }
	 */

	public int getAc_type_id() {
		return ac_type_id;
	}

	public void setAc_type_id(int ac_type_id) {
		this.ac_type_id = ac_type_id;
	}

	public String getIata_type() {
		return iata_type;
	}

	public void setIata_type(String iata_type) {
		this.iata_type = iata_type;
	}

	public String getIcao_type() {
		return icao_type;
	}

	public void setIcao_type(String icao_type) {
		this.icao_type = icao_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAc_size() {
		return ac_size;
	}

	public void setAc_size(String ac_size) {
		this.ac_size = ac_size;
	}

	public void setVad( RSVad vad ) {
		this.vad = vad;
	}

	public RSVad getVad() {
		return vad;
	}
}