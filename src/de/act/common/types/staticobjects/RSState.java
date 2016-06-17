/**
 * @file RSBkgState.java
 * @package de.act.batch.dbi.tab.types
 * @since 14.12.2005 11:58:02
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

/**
 * RSBkgState.java:
 *
 * @since 14.12.2005
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSState implements Serializable {

	private static final long serialVersionUID = 9061287619143906910L;
	public String stat_id;
	public String stat_iata;
	public String stat_badness;
	public String stat_name;
	public String stat_screen_name;
	public String stat_typ;
	//public String vad_id;
	public RSVad vad;

	public RSState() {
		
	}
	
	public RSState(String shp_acc) {
		stat_id = shp_acc;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof RSState) {
			return this.hashCode() == obj.hashCode();
		}
		else {
			return false;
		}
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.stat_id.hashCode();
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.stat_id.toString();
	}
}
