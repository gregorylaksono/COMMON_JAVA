/**
 * @file MFormExportAcceptance.java
 * @package de.act.batch.data.forms
 * @since 02.12.2005 15:17:25
 * @author Martin Sachs
 */
package de.act.common.types;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.handling.FAcceptance;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

/**
 * @since 02.12.2005
 * @author Martin Sachs
 * @deprecated
 */
@org.jboss.cache.aop.annotation.PojoCacheable
final class MFormExportAcceptance implements Serializable {

	private static final long serialVersionUID = 6241088820147108440L;
	public boolean displayed;
	private RSAp destinationAp;
	public String remarks;
	public String f_id;
	public RSState acc;
	public Set<Shipments> accItems;
	public FAcceptance acceptance ;
	public RFAwbNo awbNo = new RFAwbNo();
	private RSAp departureAp;

	public MFormExportAcceptance(Shipments shp,String f_id,String remark, RSAp dest) {
		this.accItems = new LinkedHashSet<Shipments>();
		this.accItems.add(shp);
		this.destinationAp = dest;
		this.f_id = f_id;
		this.remarks = remark;
	}

	public MFormExportAcceptance() {
		
	}

	public RSAp getDestinationAp() {
		return this.destinationAp;
	}

	public void setDestinationAp(RSAp destinationAp) {
		this.destinationAp = destinationAp;
	}

	public boolean isDestinationNull() {
		return this.destinationAp==null;
	}

	public RSAp getDepartureAp() {
		return this.departureAp;
	}

	public synchronized final RSState getAcc() {
		return this.acc;
	}

	public synchronized final void setAcc(RSState acc) {
		this.acc = acc;
	}

	public synchronized final FAcceptance getAcceptance() {
		return this.acceptance;
	}

	public synchronized final void setAcceptance(FAcceptance acceptance) {
		this.acceptance = acceptance;
	}

	public synchronized final Set<Shipments> getAccItems() {
		return this.accItems;
	}

	public synchronized final void setAccItems(Set<Shipments> accItems) {
		this.accItems = accItems;
	}

	public synchronized final RFAwbNo getAwbNo() {
		return this.awbNo;
	}

	public synchronized final void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	public synchronized final boolean isDisplayed() {
		return this.displayed;
	}

	public synchronized final void setDisplayed(boolean displayed) {
		this.displayed = displayed;
	}

	public synchronized final String getF_id() {
		return this.f_id;
	}

	public synchronized final void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public synchronized final String getRemarks() {
		return this.remarks;
	}

	public synchronized final void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public synchronized final void setDepartureAp(RSAp departureAp) {
		this.departureAp = departureAp;
	}
}
