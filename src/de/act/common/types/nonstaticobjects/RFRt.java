package de.act.common.types.nonstaticobjects;
import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.attachment.CRoutingAttachment;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.staticobjects.RSAp;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFRt implements java.io.Serializable {
	/**
	 * @author Martin Sachs
	 * @since 26.01.2006
	 */
	private static final long	serialVersionUID	= 6020790106997338022L;
	public Long					rtId				= -1L;
	public Long					id					= -1L;
	private IAttachment			metadata			= new CRoutingAttachment();
	public RSAp					AP					= null;
	public Integer				RT_SEQ				= null;
	// Central server
	public Date					CORR				= null;
	
	private Set<RFRtCuc> RFRtCuc;

	public RFRt() {
		CORR = new Date();
	}

	public RFRt(RSAp ap2,int seq) {
		this();
		this.AP = ap2;
		this.RT_SEQ = seq;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RFRt)) { return false; }
		if (this == obj) { return true; }
		RFRt rhs = (RFRt) obj;
		return new EqualsBuilder().append(this.metadata, rhs.metadata).append(this.RT_SEQ, rhs.RT_SEQ).isEquals();
	}

	/*
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.metadata).append(this.RT_SEQ).toHashCode();
	}

	/*
	 * 26.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.RT_SEQ + ", " + this.AP;
	}

	public RSAp getAP() {
		return AP;
	}
	
	public void setAP(RSAp ap_3lc) {
		AP = ap_3lc;
	}

	public Date getCORR() {
		return CORR;
	}

	public void setCORR(Date corr) {
		CORR = corr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRT_SEQ() {
		return RT_SEQ;
	}

	public void setRT_SEQ(Integer rt_seq) {
		RT_SEQ = rt_seq;
	}

	public Long getRtId() {
		return rtId;
	}

	public void setRtId(Long rtId) {
		this.rtId = rtId;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	public Set<RFRtCuc> getRFRtCuc() {
		return RFRtCuc;
	}

	public void setRFRtCuc(Set<RFRtCuc> rFRtCuc) {
		RFRtCuc = rFRtCuc;
	}

}
