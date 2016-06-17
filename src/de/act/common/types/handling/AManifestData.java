/**
 *
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSFlt;

/**
 * @author Martin Sachs
 * @since 1.0 - 21.06.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class AManifestData implements Serializable {

	private static final long serialVersionUID = -8600294334678953073L;
	private Long id = -1L;
	private RSFlt flt_id ;  	// flight
	private Date flt_date;  	// flightdate and time
	private RSAdd user_add_id;	// company
	private RSAdd creator_add_id;
	private Date corr;			// timestamp
	private Date v_o;			// shipment is flying away
	private Date close_out;
	private String stat_id;
	private String ac_reg;

	private Integer userAddress;
	private Integer creatorAddress;
	
	public AManifestData() {

	}

	public AManifestData(AManifestData form) {
		this.user_add_id = form.getUser_add_id();
		this.close_out = form.getClose_out();
		this.corr = form.getCorr();
		this.flt_date = form.getFlt_date();
		this.flt_id = form.getFlt_id();
		this.id = form.getId();
		this.stat_id = form.getStat_id();
		this.v_o = form.getV_o();
	}

	public AManifestData(RSFlt flt, Date bkg_flt_date, RSAdd address, Date d, String state, RSAdd creator) {
		this.flt_id = flt;
		this.flt_date = bkg_flt_date;
		this.user_add_id = address;
		this.corr = d;
		this.stat_id = state;
		this.creator_add_id = creator;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * flt_id, flt_date, user_add_id, corr
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof AManifestData) {
			AManifestData m = (AManifestData)obj;
			return  m.flt_id.equals(this.flt_id) &&
			m.flt_date.equals(this.flt_date)&&
			m.user_add_id.equals(this.user_add_id);
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (flt_id!=null && flt_date!=null) {
			return this.user_add_id.getAirport()+ "/"+this.flt_id.flt_no+ "/"+ flt_date.toString();
		}
		return this.getClass().getSimpleName();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.flt_id).append(this.flt_date).append(this.user_add_id).toHashCode();
	}

	public RSAdd getUser_add_id() {
		return user_add_id;
	}

	public void setUser_add_id(RSAdd add_id) {
		this.user_add_id = add_id;
	}

	public Date getClose_out() {
		return close_out;
	}

	public void setClose_out(Date close_out) {
		this.close_out = close_out;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Date getFlt_date() {
		return flt_date;
	}

	public void setFlt_date(Date flt_date) {
		this.flt_date = flt_date;
	}

	public RSFlt getFlt_id() {
		return flt_id;
	}

	public void setFlt_id(RSFlt flt_id) {
		this.flt_id = flt_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long mani_id) {
		this.id = mani_id;
	}

	public String getStat_id() {
		return stat_id;
	}

	public void setStat_id(String stat_id) {
		this.stat_id = stat_id;
	}

	public Date getV_o() {
		return v_o;
	}

	public void setV_o(Date v_o) {
		this.v_o = v_o;
	}

	public boolean isOut() {
		return this.v_o!=null;
	}

	public synchronized final RSAdd getCreator_add_id() {
		return creator_add_id;
	}

	public synchronized final void setCreator_add_id(RSAdd creator_add_id) {
		this.creator_add_id = creator_add_id;
	}

	public Integer getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Integer userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getCreatorAddress() {
		return creatorAddress;
	}

	public void setCreatorAddress(Integer creatorAddress) {
		this.creatorAddress = creatorAddress;
	}

	public String getAc_reg() {
		return ac_reg;
	}

	public void setAc_reg(String ac_reg) {
		this.ac_reg = ac_reg;
	}
}