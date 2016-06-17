package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.Date;

import de.act.common.types.RRRules;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCc implements Serializable {
	/**
	 * @author Martin Sachs
	 * @since 27.01.2006
	 */
	private static final long serialVersionUID = 6396244508679081624L;
	public String cc_id = null;
	public String ca_id = null;
	public String co_2lc = null;
	public Integer cc_acc = null;
	public Double cc_fee = null;
	public Integer cc_min = null;
	public String cur_3lc = null;
	public Integer r_id = null;
	public String vad_id = null;
	public RSCaConx carrier;
	public RSCo country;
	public RSCur currency;
	public RSRate rate;
	public Long addId;
	
	public Date vad_from = null;
	public Date vad_to = null;
	
	public RRRules rules = null;

	public RSVad vad;
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSCc) {
			final RSCc c = (RSCc) obj;
			return c.cc_id.equals(this.cc_id);
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.cc_id.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.cc_id;
	}
}
