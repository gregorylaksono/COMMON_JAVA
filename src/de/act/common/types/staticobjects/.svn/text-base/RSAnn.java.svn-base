package de.act.common.types.staticobjects;
import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAnn implements Serializable {
	/**
	 * @author Martin Sachs
	 * @since 23.01.2006
	 */
	private static final long serialVersionUID = -4365165748116277462L;
	public Long ann_id;
	public Long ann_group;
	public String ann_name;
	public String ann_dsp;
	public RSVad vad;
	private final static int baseHash = RSAnn.class.getName().hashCode() * 2 + 1;

	@Override
	public String toString() {
		return this.getAnn_name();
	}

	/*
	 * 23.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (this.getAnn_id() != null && obj != null && obj instanceof RSAnn) {
			final RSAnn com = (RSAnn) obj;
			return new EqualsBuilder().append(this.getAnn_name(), this.getAnn_name()).isEquals();
		}
		return false;
	}

	/*
	 * 23.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(baseHash).append(this.getAnn_name()).toHashCode();
	}

	public Long getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(Long ann_id) {
		this.ann_id = ann_id;
	}

	public Long getAnn_group() {
		return ann_group;
	}

	public void setAnn_group(Long ann_group) {
		this.ann_group = ann_group;
	}

	public String getAnn_name() {
		return ann_name;
	}

	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}

	public String getAnn_dsp() {
		return ann_dsp;
	}

	public void setAnn_dsp(String ann_dsp) {
		this.ann_dsp = ann_dsp;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}
}
