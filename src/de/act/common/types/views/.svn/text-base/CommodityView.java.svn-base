package de.act.common.types.views;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.RSVad;

public class CommodityView implements java.io.Serializable, Comparable<CommodityView>{
	
	private static final long serialVersionUID = 8078130926333915970L;
	private String full_description;
	private Integer creator;
	private Long com_id;
	private Long ann_id;
	private Long parent_id;
	private String ann_dsp;
	private String com_name;
	private String awb_name;
	private String ann_name;
	private RSVad vadCom;
	private RSVad vadAnn;
	private RSVad vadComAnn;
	

	public String getFull_description() {
		return full_description;
	}

	public void setFull_description(String full_description) {
		this.full_description = full_description;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	/*Rony - 20140507*/
	public int compareTo(final CommodityView o) {
		//return this.com_name.compareToIgnoreCase(o.com_name);
		return this.full_description.compareToIgnoreCase(o.full_description);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof AircraftView) {
			CommodityView a = (CommodityView) obj;
			return new EqualsBuilder().append(a.com_id, this.com_id).isEquals();
		}

		return false;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.com_id).toHashCode();
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Long getCom_id() {
		return com_id;
	}

	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}

	public Long getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(Long ann_id) {
		this.ann_id = ann_id;
	}

	public Long getParent_id() {
		return parent_id;
	}

	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}

	public String getAnn_dsp() {
		return ann_dsp;
	}

	public void setAnn_dsp(String ann_dsp) {
		this.ann_dsp = ann_dsp;
	}

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}

	public String getAwb_name() {
		return awb_name;
	}

	public void setAwb_name(String awb_name) {
		this.awb_name = awb_name;
	}

	public String getAnn_name() {
		return ann_name;
	}

	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}


	public RSVad getVadCom() {
		return vadCom;
	}

	public void setVadCom(RSVad vadCom) {
		this.vadCom = vadCom;
	}

	public RSVad getVadAnn() {
		return vadAnn;
	}

	public void setVadAnn(RSVad vadAnn) {
		this.vadAnn = vadAnn;
	}

	public RSVad getVadComAnn() {
		return vadComAnn;
	}

	public void setVadComAnn(RSVad vadComAnn) {
		this.vadComAnn = vadComAnn;
	}
}
