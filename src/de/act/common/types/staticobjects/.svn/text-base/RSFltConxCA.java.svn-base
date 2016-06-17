package de.act.common.types.staticobjects;
import java.io.Serializable;

@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSFltConxCA implements Serializable, Comparable {
	/**
	 * @author Martin Sachs
	 * @since 23.01.2006
	 */
	private static final long serialVersionUID = 4781318100797052821L;
	// conx
	public RSConx             conx             = new RSConx();
	// carrier
	public RSCaConx           carrier          = new RSCaConx();
	// flt
	public RSFlt              flight           = new RSFlt();
	public String             displayString    = this.carrier.ca_2lc + this.flight.flt_no;

	public RSFltConxCA(RSFlt l) {
		this.flight = l;
		//this.carrier = l.connection.carrier; //structure of hibernate changed. Cross Table Problem. Should perform re-query if this object needed.
		this.conx = l.connection;
		this.setDisplayString(this.flight.flt_no);
	}

	@Override
	public String toString() {
		return this.displayString;
	}

	public void setDisplayString(final String flt_no2) {
		this.displayString = flt_no2;
	}

	/*
	 * 29.11.2005
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final Object o) {
		return this.displayString.compareToIgnoreCase(o.toString());
	}
}
