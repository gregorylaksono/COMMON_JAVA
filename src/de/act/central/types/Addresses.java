package de.act.central.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * Addresses generated by MyEclipse - Hibernate Tools
 */

public class Addresses extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 8485700002203192101L;
	transient private Long attId;
	private CentralSubt FSubtByFfwSubtId;
	private Attachment FAtt;
	private CentralSubt FSubtByShpSubtId;
	private CentralSubt FSubtByConSubtId;
	private Integer shpAddId;
	private Integer ffwAddId;
	private Integer conAddId;
	private Date corr;
	private boolean isContains = false;

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.attId);
		sb.append(" [{");
		sb.append(this.FAtt);sb.append("}, ");
		sb.append(this.shpAddId);sb.append(", ");
		sb.append(this.ffwAddId);sb.append(", ");
		sb.append(this.conAddId);sb.append(", ");
		sb.append(this.corr);
		sb.append("]");
		return sb.toString();
	}

	// Constructors

	/** default constructor */
	public Addresses() {
		
	}

	/** minimal constructor */
	public Addresses(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	/** full constructor */
	public Addresses(CentralSubt FSubtByFfwSubtId, Attachment FAtt, CentralSubt FSubtByShpSubtId, CentralSubt FSubtByConSubtId, Integer shpAddId, Integer ffwAddId, Integer conAddId, Date corr) {
		this.FSubtByFfwSubtId = FSubtByFfwSubtId;
		this.FAtt = FAtt;
		this.FSubtByShpSubtId = FSubtByShpSubtId;
		this.FSubtByConSubtId = FSubtByConSubtId;
		this.shpAddId = shpAddId;
		this.ffwAddId = ffwAddId;
		this.conAddId = conAddId;
		this.corr = corr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * f_id, att_type, att_no, add_id
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Addresses)) { return false; }
		if (this == obj) { return true; }
		Addresses rhs = (Addresses) obj;
		return new EqualsBuilder().append(this.FAtt, rhs.FAtt).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FAtt).toHashCode();
	}

	// Property accessors

	public Long getAttId() {
		return this.attId;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public CentralSubt getFSubtByFfwSubtId() {
		return this.FSubtByFfwSubtId;
	}

	public void setFSubtByFfwSubtId(CentralSubt FSubtByFfwSubtId) {
		this.FSubtByFfwSubtId = FSubtByFfwSubtId;
	}

	public Attachment getFAtt() {
		return this.FAtt;
	}

	public void setFAtt(Attachment FAtt) {
		this.FAtt = FAtt;
		if (FAtt!=null){
			this.attId = FAtt.getAttId();
		}
	}

	public CentralSubt getFSubtByShpSubtId() {
		return this.FSubtByShpSubtId;
	}

	public void setFSubtByShpSubtId(CentralSubt FSubtByShpSubtId) {
		this.FSubtByShpSubtId = FSubtByShpSubtId;
	}

	public CentralSubt getFSubtByConSubtId() {
		return this.FSubtByConSubtId;
	}

	public void setFSubtByConSubtId(CentralSubt FSubtByConSubtId) {
		this.FSubtByConSubtId = FSubtByConSubtId;
	}

	public Integer getShpAddId() {
		return this.shpAddId;
	}

	public void setShpAddId(Integer shpAddId) {
		this.shpAddId = shpAddId;
	}

	public Integer getFfwAddId() {
		return this.ffwAddId;
	}

	public void setFfwAddId(Integer ffwAddId) {
		this.ffwAddId = ffwAddId;
	}

	public Integer getConAddId() {
		return this.conAddId;
	}

	public void setConAddId(Integer conAddId) {
		this.conAddId = conAddId;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public boolean isContains() {
		return isContains;
	}

	public void setContains(boolean isContains) {
		this.isContains = isContains;
	}
}