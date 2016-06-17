package de.act.common.types.packageitems;
import java.awt.Color;
import java.io.Serializable;
import java.util.Date;

import javax.swing.Icon;

import de.act.common.types.ManifestObject;
import de.act.common.types.WgtVol;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.BookingStates;
import de.act.common.types.staticobjects.RSAp;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.11.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemHandlingBKG extends AbstractSubItem implements Serializable, ManifestObject {

	private static final long serialVersionUID = -7027326960963260181L;
	private String loadingAdvice;
	private boolean imported;
	private Date requestedDepartureDate;
	private Date requestedArrivalDate;
	//private RSCa requestedCarrier;
	private String req_ca_id;
	private Integer hops;
	private RSAp from;
	private RSAp to;
	private String requestedStat;
	private BookingStates requestedState;
	private Integer prio;
	
	private Integer isParent;

	public ItemHandlingBKG() {
		super(FormularType.BKG_ITEM);
	}

	public ItemHandlingBKG(AbstractSliItem booking) {

	}

	public void setLoadingAdvice(String string) {
		this.loadingAdvice = string;
	}

	public String getLoadingAdvice() {
		return loadingAdvice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.ManifestObject#isImport()
	 */
	public boolean isImport() {
		return imported;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.ManifestObject#setImport(boolean)
	 */
	public void setImport(boolean isimport) {
		imported = isimport;
	}

	public void setRequestedDepartureDate(Date dep) {
		this.requestedDepartureDate = dep;
	}

	public void setRequestedArrivalDate(Date arr) {
		this.requestedArrivalDate = arr;
	}

	/*public void setRequestedCarrier(RSCa ca) {
		this.requestedCarrier = ca;
	}*/

	public void setHops(Integer hops) {
		this.hops = hops;
	}

	public void setFrom(RSAp from) {
		this.from = from;
	}

	public void setTo(RSAp to) {
		this.to = to;
	}

	public final Integer getHops() {
		return hops;
	}

	public final Date getRequestedArrivalDate() {
		return requestedArrivalDate;
	}

	/*public final RSCa getRequestedCarrier() {
		return requestedCarrier;
	}*/

	
	public final Date getRequestedDepartureDate() {
		return requestedDepartureDate;
	}

	public String getReq_ca_id() {
		return req_ca_id;
	}

	public void setReq_ca_id(String req_ca_id) {
		this.req_ca_id = req_ca_id;
	}

	public final BookingStates getRequestedState() {
		return requestedState;
	}

	public final void setRequestedState(BookingStates requestedState) {
		this.requestedState = requestedState;
		this.requestedStat = requestedState.getActCode();
	}

	public WgtVol getWgtVol() {
		return new WgtVol(this.getWgt(), this.getVol());
	}

	public final String getRequestedStat() {
		return requestedStat;
	}

	public final void setRequestedStat(String requestedStat) {
		this.requestedStat = requestedStat;
		if (requestedStat != null){
			this.requestedState = BookingStates.getStateForActCode(requestedStat);
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#getColor()
	 */
	public Color getColor() {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#getImage()
	 */
	public Icon getImage() {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#ifInvalidGetRoot()
	 */
	public ManifestObject ifInvalidGetRoot() {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isBooked()
	 */
	public boolean isBooked() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isNothing()
	 */
	public boolean isNothing() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#setColor(java.awt.Color)
	 */
	public void setColor(Color col) {
		
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public RSAp getFrom() {
		return from;
	}

	public RSAp getTo() {
		return to;
	}

	public Integer getIsParent() {
		return isParent;
	}

	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}

	public Integer getPrio()
	{
		return prio;
	}

	public void setPrio(Integer prio)
	{
		this.prio = prio;
	}
	
}
