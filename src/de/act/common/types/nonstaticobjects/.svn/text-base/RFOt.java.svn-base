package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.Money;
import de.act.common.types.formulars.CFormularAWB;
import de.act.common.types.localobjects.RDOt;
import de.act.common.types.staticobjects.RSOt1lc;
import de.act.common.types.staticobjects.RSOt2lc;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFOt extends RDOt implements Serializable, Comparable<RDOt>{

	/**
	 * @author Martin Sachs
	 * @since 13.04.2006
	 */
	private static final long serialVersionUID = 3072845541273133636L;
	private Date corr = new Date();
	private String otCur3lcFrom;
	private String otCur3lcTo;
	private Double otConversionRate;

	public RFOt() {

	}
	public RFOt(Money d, RSOt1lc lc1, RSOt2lc lc2) {
		if (d!=null) {
			this.setId(-1L);
			this.setOt_1lc(lc1);
			this.setOt_2lc(lc2);
			this.setOt_rate(d.getAmount());
		}
	}

	public RFOt(RDOt d) {
		if (d!=null) {
			this.setId(d.getId());
			this.setMetadata(d.getMetadata());
			this.setOt_1lc(d.getOt_1lc());
			this.setOt_2lc(d.getOt_2lc());
			this.setOt_rate(d.getOt_rate());
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(RDOt o) {
		return toString().compareToIgnoreCase((o).toString());
	}

	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}

	public CFormularAWB getMetadata() {
		return super.getMetadata();
	}

	public void setMetadata(CFormularAWB sli) {
		super.setMetadata ( sli);
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}
	public String getOtCur3lcFrom() {
		return otCur3lcFrom;
	}
	public void setOtCur3lcFrom(String otCur3lcFrom) {
		this.otCur3lcFrom = otCur3lcFrom;
	}
	public String getOtCur3lcTo() {
		return otCur3lcTo;
	}
	public void setOtCur3lcTo(String otCur3lcTo) {
		this.otCur3lcTo = otCur3lcTo;
	}
	public Double getOtConversionRate() {
		return otConversionRate;
	}
	public void setOtConversionRate(Double otConversionRate) {
		this.otConversionRate = otConversionRate;
	}
}
