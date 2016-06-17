package de.act.common.types.staticobjects;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCaConx implements java.io.Serializable, Comparable<RSCaConx> {
	/**
	 * @author Martin Sachs
	 * @since 21.04.2006
	 */
	private static final long serialVersionUID = 5379325117439076753L;
	public Integer s_ca_id;
	public String ca_id = "";
	public String ca_name = "";
	public String ca_3dg = "";
	public String ca_2lc = "";
	public String ca_3lc = "";
	public Integer alliance_id;
	public String iata_stat;
	public String vad_id;
	public Date vad_from;
	public Date vad_to;
	public RSVad VAD;
	public Set<RSConx> connections = new HashSet<RSConx>();
	// for Table data model
	private RSAp DEPT;
	private RSAp DEST;
	private String displayString = this.ca_2lc;
	private int hashcode = 0;
	transient private static final int baseHash = RSCaConx.class.getName().hashCode() * 2 + 1;

	public RSCaConx(RSCa ca) {
		this.alliance_id = ca.alliance_id;
		this.ca_2lc = ca.ca_2lc;
		this.ca_3dg = ca.ca_3dg;
		this.ca_3lc = ca.ca_3lc;
		this.ca_id = ca.ca_id;
		this.ca_name = ca.ca_name;
		//this.DEPT = ca.DEPT;
		//this.DEST = ca.DEST;
		this.iata_stat = ca.iata_stat;
		//this.vad_id = ca.vad_id;
		this.s_ca_id = ca.s_ca_id;
	}

	public RSCaConx() {
		
	}

	public String getCa3lc() {
		return this.ca_3dg;
	}

	@Override
	public String toString() {
		if (this.displayString == null || this.displayString.length() == 0) {
			if (this.ca_2lc == null) { return ""; }
			return this.ca_2lc;
		}
		return this.displayString;
	}

	public void setDisplayString(final String ca_2lc2) {
		this.displayString = ca_2lc2;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null || this.hashCode() != obj.hashCode()) { return false; }
		if (obj instanceof RSCaConx) {
			final boolean ret = this.ca_id.equals(((RSCaConx) obj).ca_id);
			return ret;
		}
		return false;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.hashcode == 0) {
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.ca_id).toHashCode();
		}
		return this.hashcode;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSCaConx o) {
		return this.ca_id.compareToIgnoreCase(o.ca_id);
	}

	public Date getVad_from() {
		return vad_from;
	}

	public void setVad_from(Date vad_from) {
		this.vad_from = vad_from;
	}

	public Date getVad_to() {
		return vad_to;
	}

	public void setVad_to(Date vad_to) {
		this.vad_to = vad_to;
	}

	public RSAp getDEPT() {
		return DEPT;
	}

	public void setDEPT(RSAp dept) {
		DEPT = dept;
	}

	public RSAp getDEST() {
		return DEST;
	}

	public void setDEST(RSAp dest) {
		DEST = dest;
	}
}
