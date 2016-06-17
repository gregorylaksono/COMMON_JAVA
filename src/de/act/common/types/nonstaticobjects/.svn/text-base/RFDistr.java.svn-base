/*
 * Created on 02.09.2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.RSAdd;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFDistr implements java.io.Serializable{

	private static final long serialVersionUID = 4527593975424594884L;
	private String distr_id;
	private String F_ID = null;
	private String ADD_ID = null;
	private Integer PART;
	private String ADD_TYPE;
	private Date RCVD;
	private Date SENT;
	private Integer WRITER;
	private RSAdd address;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj==this) return true;
		if (obj instanceof RFDistr) {
			RFDistr d = (RFDistr) obj;
			return new EqualsBuilder().append(this.F_ID, d.F_ID).append(this.PART,d.PART).append(this.ADD_ID,d.ADD_ID).append(this.ADD_TYPE,d.ADD_TYPE).isEquals();
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.F_ID).append(this.PART).append(this.ADD_ID).append(this.ADD_TYPE).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ""+this.F_ID+"/"+this.PART;
	}
	
	public String getADD_ID() {
		return ADD_ID;
	}
	
	public void setADD_ID(String add_id) {
		ADD_ID = add_id;
	}

	public String getADD_TYPE() {
		return ADD_TYPE;
	}

	public void setADD_TYPE(String add_type) {
		ADD_TYPE = add_type;
	}

	public RSAdd getAddress() {
		return address;
	}

	public void setAddress(RSAdd address) {
		this.address = address;
	}

	public String getF_ID() {
		return F_ID;
	}

	public void setF_ID(String f_id) {
		F_ID = f_id;
	}

	public Integer getPART() {
		return PART;
	}

	public void setPART(Integer part) {
		PART = part;
	}
	
	public Date getRCVD() {
		return RCVD;
	}
	
	public void setRCVD(Date rcvd) {
		RCVD = rcvd;
	}

	public Date getSENT() {
		return SENT;
	}

	public void setSENT(Date sent) {
		SENT = sent;
	}

	public Integer getWRITER() {
		return WRITER;
	}

	public void setWRITER(Integer writer) {
		WRITER = writer;
	}
}