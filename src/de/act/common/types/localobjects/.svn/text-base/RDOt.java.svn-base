package de.act.common.types.localobjects;

import java.io.Serializable;

import de.act.common.types.formulars.CFormularAWB;
import de.act.common.types.staticobjects.RSOt1lc;
import de.act.common.types.staticobjects.RSOt2lc;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RDOt implements Serializable, Comparable<RDOt>{

	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 */
	private static final long serialVersionUID = 7972217369723144556L;
	private RSOt2lc ot_2lc = null;
	private RSOt1lc ot_1lc = null;
	private Double ot_rate = null;
	private Long id = -1L; // att_id
	private CFormularAWB metadata = new CFormularAWB();

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(RDOt o) {
		return toString().compareToIgnoreCase((o).toString());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof RDOt) {
			if (this.ot_1lc!=null && this.ot_2lc!=null && metadata!=null && ((RDOt)obj).ot_1lc!=null && ((RDOt)obj).ot_2lc!=null &&((RDOt)obj).metadata!=null  ) {
				return ((RDOt)obj).ot_1lc.equals(ot_1lc) && ((RDOt)obj).ot_2lc.equals(ot_2lc)&& ((RDOt)obj).metadata.equals(metadata);
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.ot_1lc!=null && this.ot_2lc!=null && metadata!=null)
			return ot_1lc.hashCode()*37+ ot_2lc.hashCode()*17+metadata.hashCode()*17;
		else
			return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.ot_1lc!=null && this.ot_2lc!=null)
			return this.ot_1lc.toString()+" - "+this.ot_2lc.toString();
		else return "";
	}

	public RSOt1lc getOt_1lc() {
		return ot_1lc;
	}

	public void setOt_1lc(RSOt1lc ot_1lc) {
		this.ot_1lc = ot_1lc;
	}

	public RSOt2lc getOt_2lc() {
		return ot_2lc;
	}

	public void setOt_2lc(RSOt2lc ot_2lc) {
		this.ot_2lc = ot_2lc;
	}

	public Double getOt_rate() {
		return ot_rate;
	}

	public void setOt_rate(Double ot_rate) {
		this.ot_rate = ot_rate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CFormularAWB getMetadata() {
		return metadata;
	}

	public void setMetadata(CFormularAWB sli) {
		this.metadata = sli;
	}
}