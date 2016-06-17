package de.act.common.types.staticobjects;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 1.0 - 22.01.2007
 */
public final class RSAc implements java.io.Serializable{

	private static final long serialVersionUID = 5216108597927656264L;
	private long s_id;
	private long ac_id;
	private String ac_reg;
	private String ca_id;
	private int ac_type_id;
	private String name;
	private String ac_cargo;
	private RSVad vad;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof RSAc) {
			RSAc a = (RSAc) obj;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*
    @Override
    public String toString() {

	   return this.iata_type;
    }
	 */

	public static boolean isCargoValid( String ac_cargo ) {
		if( ac_cargo.equals("p") || ac_cargo.equals("c") || ac_cargo.equals("m") || ac_cargo.equals("k") ) {
			//    		System.out.println("cargo is valid");
			return true;
		}
		//    	System.out.println("cargo ga valid");
		return false;
	}

	public long getS_id() {
		return s_id;
	}

	public void setS_id(long s_id) {
		this.s_id = s_id;
	}

	public long getAc_id() {
		return ac_id;
	}

	public void setAc_id(Long ac_id) {
		this.ac_id = ac_id;
	}

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public int getAc_type_id() {
		return ac_type_id;
	}

	public void setAc_type_id(int ac_type_id) {
		this.ac_type_id = ac_type_id;
	}

	public String getname() {
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

	public void setVad( RSVad vad ) {
		this.vad = vad;
	}

	public RSVad getVad() {
		return vad;
	}
}
