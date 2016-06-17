package de.act.common.types.staticobjects;
import java.math.BigDecimal;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSScc implements java.io.Serializable, Comparable<RSScc> {

	private static final long serialVersionUID = -8239683082646619041L;
	public String SCC_3LC;
	public String SCC_NAME;
	private int hashcode = 0;
	transient private static final int baseHash = RSAdd.class.getName().hashCode() * 2 + 1;
	private BigDecimal scc_prio;
	private RSVad vad;
	
	public RSScc() {
		
	}

	public RSScc(String string) {
		SCC_3LC = string;
	}

	@Override
	public String toString() {
		return this.SCC_3LC;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSScc) {
			return new EqualsBuilder().append(((RSScc) obj).SCC_3LC,this.SCC_3LC).isEquals(); }
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
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.SCC_3LC).toHashCode();
		}
		return this.hashcode;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSScc o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}

	public BigDecimal getScc_prio() {
		return scc_prio;
	}

	public void setScc_prio(BigDecimal scc_prio) {
		this.scc_prio = scc_prio;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}
}
