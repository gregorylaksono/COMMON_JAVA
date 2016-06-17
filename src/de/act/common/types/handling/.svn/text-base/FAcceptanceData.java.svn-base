/**
 * @file Acceptance.java
 * @package de.act.batch.app.forms.exportacceptance
 * @since 06.12.2005 18:27:44
 * @author Martin Sachs
 */
package de.act.common.types.handling;
import java.awt.Color;
import java.io.Serializable;
import java.util.Date;

import javax.swing.Icon;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.ManifestObject;
import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.nonstaticobjects.RFStick;
import de.act.common.types.nonstaticobjects.RFSubt;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

/**
 * Acceptance.java:
 *
 * @since 06.12.2005
 * @author Martin Sachs F_ACC
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class FAcceptanceData implements Serializable {

	private static final long serialVersionUID = 2033258003033879398L;
	public final static String SHP_ACC = "shpacc";
	public final static String AWB_ACC = "awbacc";
	public final static String ULD_ACC = "uldacc";
	private Long				id				= -1L;
	private Integer				awb_acc			= 0;
	private Date				corr			= new Date();
	private RSAp				ap_3lc;
	private RSAp				ap_dest;
	private RSAp				ap_dept;
	private RSAdd				cne;
	private Integer				con_add_id;
	private RFSubt				consigneeSubt;
	private RSState				state;
	private String				stateDesc;
	private RFStick				sticker			= null;
	private IAttachment			metadata		= new CAcceptanceAttachment();

	public FAcceptanceData() {
		super();
	}

	/*
	 * 12.12.2005
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FAcceptanceData)) { return false; }
		if (this == obj) { return true; }
		FAcceptanceData rhs = (FAcceptanceData) obj;
		return new EqualsBuilder().append(this.metadata, rhs.metadata).append(this.awb_acc, rhs.awb_acc).isEquals();
	}

	/*
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.metadata).append(this.awb_acc).toHashCode();
	}

	/*
	 * 06.01.2006
	 *
	 * @see de.act.common.types.ManifestObject#getColor()
	 */
	public Color getColor() {
		return null;
	}

	/*
	 * 06.01.2006
	 *
	 * @see de.act.common.types.ManifestObject#setColor(java.awt.Color)
	 */
	public void setColor(Color col) {}

	public Icon getImage() {
		return null;
	}

	/*
	 * 06.01.2006
	 *
	 * @see de.act.common.types.ManifestObject#ifInvalidGetRoot()
	 */
	public ManifestObject ifInvalidGetRoot() {
		return null;
	}

	public RSAp getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(RSAp ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public RSAp getAp_dest() {
		return ap_dest;
	}

	public void setAp_dest(RSAp ap_dest) {
		this.ap_dest = ap_dest;
	}

	public Integer getAwb_acc() {
		return awb_acc;
	}

	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}

	public RSAdd getCne() {
		return cne;
	}

	public void setCne(RSAdd cne) {
		this.cne = cne;
	}

	public Integer getCon_add_id() {
		return con_add_id;
	}

	public void setCon_add_id(Integer con_add_id) {
		this.con_add_id = con_add_id;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	public RSState getState() {
		return state;
	}

	public void setState(RSState state) {
		this.state = state;
	}

	public String getStateDesc() {
		return stateDesc;
	}

	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	public synchronized final RSAp getAp_dept() {
		return ap_dept;
	}

	public synchronized final void setAp_dept(RSAp ap_dept) {
		this.ap_dept = ap_dept;
	}

	public RFSubt getConsigneeSubt() {
		return consigneeSubt;
	}

	public void setConsigneeSubt(RFSubt consigneeSubt) {
		this.consigneeSubt = consigneeSubt;
	}
}
