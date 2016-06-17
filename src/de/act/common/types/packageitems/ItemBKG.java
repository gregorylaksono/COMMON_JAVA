package de.act.common.types.packageitems;
import java.awt.Color;
import java.io.Serializable;
import java.util.Date;

import javax.swing.Icon;

import de.act.common.types.ManifestObject;
import de.act.common.types.WgtVol;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.nonstaticobjects.BookingStates;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.11.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemBKG extends AbstractSubItem implements Serializable, ManifestObject {

	private static final long serialVersionUID = 6983934063164890024L;
	private String loadingAdvice;
	private boolean imported;
	private Date requestedDepartureDate;
	private Date requestedArrivalDate;
	//private RSCa requestedCarrier;
	private String requestedCarrier;
	private Integer hops;
	private RSAp from;
	private RSAp to;
	private String requestedStat;
	private BookingStates requestedState;
//	private RSAnn annotation;
	private RSScc scc;
	private Integer prio;
	
	private Integer isParent = 0;
	private boolean isDiscrepancy = false;
	private Integer oldRowNo = -1;
	private Integer thisPart = -1;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packageitems.AbstractSubItem#setMetadata(de.act.common.types.formulars.IAttachment)
	 */
	@Override
	public void setMetadata(IAttachment metadata) {
		super.setMetadata(metadata);
	}

	public ItemBKG() {
		super(FormularType.BKG_ITEM);
	}

	public ItemBKG(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
	}
	
	public void setFullBookingItem(ItemBKG oldBooking){
		this.setId(oldBooking.getId());
		this.setMetadata(oldBooking.getMetadata());
		this.setRowNo(oldBooking.getRowNo());
		this.setCorr(oldBooking.getCorr());
		this.setPcs(oldBooking.getPcs());
		this.setWgt(oldBooking.getWgt());
		this.setVol(oldBooking.getVol());
		this.setRequestedDepartureDate(oldBooking.getRequestedDepartureDate());
		this.setRequestedArrivalDate(oldBooking.getRequestedArrivalDate());
		this.setRequestedStat(oldBooking.getRequestedStat());
		this.setRequestedCarrier(oldBooking.getRequestedCarrier());
		this.setHops(oldBooking.getHops());
		this.setFrom(oldBooking.getFrom());
		this.setTo(oldBooking.getTo());
		this.setCommodity(oldBooking.getCommodity());
		this.setScc(oldBooking.getScc());
		this.setAnnotation(oldBooking.getAnnotation());
		this.setSubItems(oldBooking.getSubItems());
	}

	public Color getColor() {
		if (this.getUld() != null){
			if (this.getUld().isType()){
				return ManifestObject.ULD_TYPE_SHP;
			}
			else{
				return ManifestObject.ULD_SHP_COLOR;
			}
		}
		return ManifestObject.BULK_COLOR;
	}

	//    public Date getDepTime() {
	//	   if (bkg_flts == null || bkg_flts.isEmpty()){
	//		  return null;
	//	   }
	//	   BookingRequestFlight bkg_flt = bkg_flts.get(0);
	//	   if (bkg_flt == null){
	//		  return null;
	//	   }
	//	   return bkg_flt.getDepTime();
	//    }
	//
	//    public Date getArrTime() {
	//	   if (bkg_flts == null || bkg_flts.isEmpty()){
	//		  return null;
	//	   }
	//	   int size = bkg_flts.size();
	//	   BookingRequestFlight bkg_flt = bkg_flts.get(size - 1);
	//	   if (bkg_flt == null){
	//		  return null;
	//	   }
	//	   return bkg_flt.getArrTime();
	//    }
	//
	//    /**
	//      * @autor Admin
	//      * @since 28.03.2006
	//      * @return Returns the bkg_flts.
	//      */
	//    public List<BookingRequestFlight> getBkg_flts() {
	//	   return bkg_flts;
	//    }
	//
	//    /**
	//      * @author Admin
	//      * @since 28.03.2006
	//      * @param bkg_flts
	//      *             The bkg_flts to set.
	//      */
	//    public void setBkg_flts(List<BookingRequestFlight> bkg_flts) {
	//	   this.bkg_flts = bkg_flts;
	//    }

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packageitems.AbstractSubItem#addSubItem(T)
	 */
	@Override
	public synchronized void addSubItem(AbstractSubItem sub) {
		super.addSubItem(sub);
		if (sub != null){
			sub.setItemBkg((ItemBKG) this);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packageitems.AbstractSubItem#removeSubItem(T)
	 */
	@Override
	public synchronized void removeSubItem(AbstractSubItem sub) {
		super.removeSubItem(sub);
		if (sub != null) sub.setItemBkg((ItemBKG) null);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#getImage()
	 */
	public Icon getImage() {
		return ManifestObject.icon_type;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#ifInvalidGetRoot()
	 */
	public ManifestObject ifInvalidGetRoot() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#isNothing()
	 */
	public boolean isNothing() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#setColor(java.awt.Color)
	 */
	public void setColor(Color col) {
		
	}

	//    /**
	//      * @author Martin Sachs
	//      * @since 23.05.2006
	//      * @return
	//      */
	//    public int getArrivalDay() {
	//	   if (this.bkg_flts != null && bkg_flts.size() > 0){
	//		  this.bkg_flts.get(0);
	//	   }
	//	   BookingRequestFlight bkg_flt = bkg_flts.get(bkg_flts.size() - 1);
	//	   if (bkg_flt == null){
	//		  return 0;
	//	   }
	//	   return bkg_flt.getFlight().ARR_DT;
	//    }

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
	 * @see de.act.common.types.ManifestObject#isBooked()
	 */
	public boolean isBooked() {
		return false;
	}

	public RSAp getFrom() {
		return from;
	}

	public RSAp getTo() {
		return to;
	}

	public String getRequestedCarrier() {
		return requestedCarrier;
	}

	public void setRequestedCarrier(String requestedCarrier) {
		this.requestedCarrier = requestedCarrier;
	}

	/*public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}*/

	public Integer getIsParent() {
		return isParent;
	}

	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}

	public boolean isDiscrepancy() {
		return isDiscrepancy;
	}

	public void setDiscrepancy(boolean isDiscrepancy) {
		this.isDiscrepancy = isDiscrepancy;
	}

	public Integer getOldRowNo() {
		return oldRowNo;
	}

	public void setOldRowNo(Integer oldRowNo) {
		this.oldRowNo = oldRowNo;
	}

	public Integer getThisPart()
	{
		return thisPart;
	}

	public void setThisPart(Integer thisPart)
	{
		this.thisPart = thisPart;
	}

	public RSScc getScc()
	{
		return scc;
	}

	public void setScc(RSScc scc)
	{
		this.scc = scc;
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
