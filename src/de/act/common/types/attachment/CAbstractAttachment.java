/**
 * @author Admin
 * @since 14.03.2006
 */
package de.act.common.types.attachment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

import de.act.common.types.DeliveryHeadersView;
import de.act.common.types.formulars.CAbstractFormular;
import de.act.common.types.formulars.FormularError;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.handling.FAcceptance;
import de.act.common.types.handling.FAcceptanceHeader;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.AwbState;
import de.act.common.types.nonstaticobjects.BookingFlightState;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.PackageState;
import de.act.common.types.nonstaticobjects.RFAci;
import de.act.common.types.nonstaticobjects.RFAdd;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFRt;
import de.act.common.types.nonstaticobjects.RFRtCuc;
import de.act.common.types.packageitems.AbstractItem;
import de.act.common.types.packageitems.ItemAVI;
import de.act.common.types.packageitems.ItemAWB;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemDGR;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.packageitems.ItemSAD;
import de.act.common.types.packageitems.ItemSLI;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;

/**
 * @author Martin Sachs & Henry
 * @since 1.0 - 20.11.2006
 */
@SuppressWarnings("unused")
public abstract class CAbstractAttachment implements Serializable, IAttachment {

	private static final long          serialVersionUID       = 8606520017873886853L;
	/**
	 * Logger for this class
	 */
	transient private static Logger		log						= Logger.getLogger(CAbstractAttachment.class);
	private CAbstractFormular			formular;
	private RFAdd						addresses;
	private Set<FAcceptance>			acceptance				= new HashSet<FAcceptance>(0);
	private Set<FAcceptanceHeader>		acceptanceHeader		= new HashSet<FAcceptanceHeader>(0);
	private Set<ItemBKG>				itemBKGs				= null;
	private Set<ItemDGR>				itemDGRs				= null;
	private Set<ItemAVI>				itemAVIs				= null;
	private Set<ItemAWB>				itemAWBs				= null;
	private Set<ItemSAD>				itemSADs				= null;
	private Set<ItemPKG>				itemPKG					= null;
	private Set<ItemSLI>				itemSLIs 				= null;
	private Set<BookingFlightState>		bkgFlightStates			= null;
	private List<BookingRequestFlight>	bkgFlights				= null;
	private List<RFRt>					routing					= null;
	private Set<AwbState>				awbStates				= null;
	private Set<PackageState>			pkgStates				= null;
	private List<RFAci>					accountingInformations 	= null;
	private String						sign;
	private Long						id						= -1L;
	private String						auth					= "";
	private String						card					= "";
	private String						f_id					= "";
	private Integer						attNo					= 0;
	private String						attType;
	private Integer						creatorId;
	private RSAdd						creator;
	private Date						corr					= new Date();
	private RFAwbNo						awbNo;
	private DeliveryHeadersView			deliveryView ;
	protected List<FormularError>		errorList				= new ArrayList<FormularError>(0);
	
	private List<ItemPKG> listItemPKG = null;
	private List<ItemBKG> listItemBKG = null;
	private List<BookingRequestFlight> listBookingFlight = null;
	
	private boolean flightEditable = true;
	private List<Integer> discrPart = null;
	
	protected CAbstractAttachment() {
		
	}

	public CAbstractAttachment(CAbstractAttachment l) {
		id = l.id;
		auth = l.auth;
		card = l.card;
		f_id = l.f_id;
		attNo = l.attNo;
		creator = l.creator;
		creatorId = l.creatorId;
		corr = new Date();
		this.awbNo = l.awbNo;
		this.addresses = l.addresses;
		this.itemPKG = l.itemPKG;
		this.routing = l.routing;
		this.sign = l.sign;
		this.acceptance = l.acceptance;
		this.acceptanceHeader = l.acceptanceHeader;
		this.attType = l.attType;
		this.formular = l.formular;
		this.bkgFlightStates = l.bkgFlightStates;
		this.bkgFlights = l.bkgFlights;
	}

	public CAbstractAttachment(String fid, Integer addId, FormularType type) {
		this(type);
		this.f_id = fid;
		this.creatorId = addId;
	}

	protected CAbstractAttachment(FormularType type) {
		this.attType = type.getConstaint();
		switch(type){
		case ADDRESS:
			this.addresses = new RFAdd(this);
			break;
		case ACCEPTANCE:
			this.acceptance = new LinkedHashSet<FAcceptance>();
			this.acceptanceHeader = new LinkedHashSet<FAcceptanceHeader>();
			break;
		case ACOUNING_INFORMATION:
			this.accountingInformations = new ArrayList<RFAci>();
			break;
		case AVI_ITEM:
			this.itemAVIs = new LinkedHashSet<ItemAVI>();
			break;
		case AWB_ITEM:
			this.itemAWBs = new LinkedHashSet<ItemAWB>();
			break;
		case AWB_STATE:
			this.awbStates = new LinkedHashSet<AwbState>();
			break;
		case BKG_FLIGHT:
			this.bkgFlights = new ArrayList<BookingRequestFlight>();
			break;
		case BKG_FLIGHT_STATE:
			this.bkgFlightStates = new LinkedHashSet<BookingFlightState>();
			break;
		case BKG_ITEM:
			this.itemBKGs = new LinkedHashSet<ItemBKG>();
			break;
		case DGR_ITEM:
			this.itemDGRs = new LinkedHashSet<ItemDGR>();
			break;
		case PACKAGE:
			this.itemPKG = new LinkedHashSet<ItemPKG>();
			break;
		case PACKAGE_STATE:
			this.pkgStates = new LinkedHashSet<PackageState>();
			break;
		case ROUTING:
			this.routing = new ArrayList<RFRt>();
			break;
		case SAD_ITEM:
			this.itemSADs = new LinkedHashSet<ItemSAD>();
			break;
		case SLI_ITEM:
			this.itemSLIs = new LinkedHashSet<ItemSLI>();
			break;
		}
		this.auth = "c"; // for create
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getAttNo()
	 */
	public Integer getAttNo() {
		return attNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setAttNo(java.lang.Integer)
	 */
	public void setAttNo(Integer attNo) {
		this.attNo = attNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getAuth()
	 */
	public String getAuth() {
		return auth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setAuth(java.lang.String)
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getCard()
	 */
	public String getCard() {
		return card;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setCard(java.lang.String)
	 */
	public void setCard(String card) {
		this.card = card;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getCorr()
	 */
	public Date getCorr() {
		return corr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setCorr(java.util.Date)
	 */
	public void setCorr(Date corr) {
		this.corr = corr;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getCreator()
	 */
	public RSAdd getCreator() {
		return creator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setCreator(de.act.common.types.RSAdd)
	 */
	public void setCreator(RSAdd creator) {
		this.creator = creator;
		if (this.creator != null && this.creatorId == null){
			this.creatorId = this.creator.getAdd_id();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getId()
	 */
	public Long getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setId(java.lang.Integer)
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj instanceof CAbstractAttachment){
			CAbstractAttachment o = (CAbstractAttachment) obj;
			return new EqualsBuilder().append(this.f_id, o.f_id).append(this.attType, o.attType).append(this.attNo, o.attNo).append(this.creator, o.creator).isEquals();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (f_id != null){
			return new HashCodeBuilder().append(this.f_id).append(this.attType).append(this.attNo).append(this.creator).toHashCode();
		}
		else{
			//		  log.fatal("hashcode should be the unique from f_att");
			return new HashCodeBuilder().append(this.f_id).append(this.attType).append(this.attNo).append(this.creator).toHashCode();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id + "," + attNo + "," + f_id + "," + this.attType+", "+this.auth;
	}

	public Boolean isDisplayable() {
		// if auth not set, the formular is not ready for display
		// TODO other rights r, w, c, s, n, b- block
		return !this.auth.equals("b") || this.id>0;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#getAwbNo()
	 */
	public RFAwbNo getAwbNo() {
		return awbNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#setAwbNo(de.act.common.types.nonstaticobjects.RFAwbNo)
	 */
	public void setAwbNo(RFAwbNo a) {
		this.awbNo = a;
	}

	public void setNewCreatorAndId(RSAdd address) {
		Date d = new Date();
		this.setId(-1L);
		this.setCorr(d);
		this.setCreator(address);
		this.attNo++;
	}

	public void setNewCreatorAndId(RSAdd address, RSAp ap3lc) {
		Date d = new Date();
		this.setId(-1L);
		this.setCorr(d);
		this.setCreator(address);
		this.attNo++;
		if (this.acceptance != null){
			for(FAcceptance acc:this.acceptance){
				if (acc != null){
					acc.setState(null);
					acc.setAp_3lc(ap3lc);
					acc.setId(-1L);
					acc.setCorr(d);
					Set<Shipments> shps = acc.getShipments();
					if (shps != null){
						for(Shipments accshp:shps){
							accshp.setId(-1L);
							accshp.setCorr(d);
							accshp.setStorage(null);
						}
					}
				}
			}
		}
	}

	public Long getAccItemIdByAwbAcc(Integer awbAcc) {
		Set<FAcceptance> a1 = this.getAcceptance();
		if (a1 != null && a1.size() > 0){
			for(FAcceptance shpAcc:a1){
				if (shpAcc.getAwb_acc().equals(awbAcc)){
					Set<Shipments> ss = shpAcc.getShipments();
					if (ss != null && ss.size() > 0){
						return ss.iterator().next().getId();
					}
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#isSendable()
	 */
	public boolean isSendable() {
		if (auth != null){
			if (auth.equalsIgnoreCase("s")){
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IAttachment#isWriteable()
	 */
	public boolean isWriteable() {
		if (auth != null){
			if (!auth.equalsIgnoreCase("r")){
				return true;
			}
		}
		return false;
	}

	public Set<FAcceptance> getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(Set<FAcceptance> acceptance) {
		this.acceptance = acceptance;
		if (acceptance != null) for(FAcceptance awb:acceptance){
			awb.setMetadata(this);
		}
	}

	public Set<FAcceptanceHeader> getAcceptanceHeader() {
		return acceptanceHeader;
	}

	public void setAcceptanceHeader(Set<FAcceptanceHeader> acceptanceHeader) {
		this.acceptanceHeader = acceptanceHeader;
		if(acceptanceHeader != null) for(FAcceptanceHeader awb : acceptanceHeader){
			awb.setMetadata(this);
		}
	}

	public RFAdd getAddresses() {
		return addresses;
	}

	public void setAddresses(RFAdd addresses) {
		this.addresses = addresses;
		if (addresses != null) addresses.setMetadata(this);
	}

	public String getAttType() {
		return attType;
	}

	public void setAttType(String attType) {
		this.attType = attType;
	}
	
	public CAbstractFormular getFormular() {
		return formular;
	}

	public void setFormular(CAbstractFormular formular) {
		this.formular = formular;
	}

	public List<RFRt> getRouting() {
		return routing;
	}

	public void setRouting(List<RFRt> routing) {
		this.routing = routing;
		if (routing != null && routing.size() > 0) for(RFRt awb:routing){
			if (awb != null && (awb.getMetadata() == null || !awb.getMetadata().equals(this))){
				awb.setMetadata(this);
			}
		}
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 29.11.2006
	 * @param attNo -
	 *             versions counter
	 * @param corr -
	 *             actual date
	 * @param auth -
	 *             authentifikation rights.
	 * @param card -
	 *             card folder
	 * @param creator -
	 *             creator
	 * @param fid -
	 *             prozess-id
	 * @return void
	 */
	public void init(int attNo, Date corr, String auth, String card, RSAdd creator, String fid) {
		this.attNo = attNo;
		this.corr = corr;
		this.f_id = fid;
		this.auth = auth;
		this.card = card;
		this.creator = creator;
		if(creator != null)
			this.creatorId = creator.getAdd_id();
	}

	public boolean checkMandetoryFields() {
		return true;
	}

	public Collection<? extends FormularError> getErrorList() {
		return errorList;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public List<BookingRequestFlight> getBkgFlights() {
		return bkgFlights;
	}

	public void setBkgFlights(List<BookingRequestFlight> bkgFlights) {
		this.bkgFlights = bkgFlights;
		if (bkgFlights != null){
			for(BookingRequestFlight awb:bkgFlights){
				if (awb!=null &&awb.getAttachment()!=null &&!awb.getAttachment().equals(this)) awb.setAttachment(this);
			}
		}
	}

	public Set<BookingFlightState> getBkgFlightStates() {
		return bkgFlightStates;
	}

	public void setBkgFlightStates(Set<BookingFlightState> bkgFlightStates) {
		this.bkgFlightStates = bkgFlightStates;
		if (bkgFlightStates != null) for(BookingFlightState awb:bkgFlightStates){
			if (awb!=null &&awb.getAttachment()!=null &&!awb.getAttachment().equals(this)) awb.setAttachment(this);
		}
	}
	
	public Set<ItemAVI> getItemAVIs() {
		return itemAVIs;
	}

	public void setItemAVIs(Set<ItemAVI> itemAVIs) {
		this.itemAVIs = itemAVIs;
		if (itemAVIs != null){
			for(ItemAVI awb:itemAVIs){
				if (!awb.getMetadata().equals(this)) awb.setMetadata(this);
			}
		}
	}

	public Set<ItemAWB> getItemAWBs() {
		return itemAWBs;
	}

	public void setItemAWBs(Set<ItemAWB> itemAWBs) {
		this.itemAWBs = itemAWBs;
		if (itemAWBs != null) { 
			for(ItemAWB awb:itemAWBs){
				if (awb!=null)
					awb.setMetadata(this);
			}
		}
	}

	public Set<ItemBKG> getItemBKGs() {
		return itemBKGs;
	}

	public void setItemBKGs(Set<ItemBKG> itemBKGs) {
		this.itemBKGs = itemBKGs;
		if(itemBKGs != null)
		for(ItemBKG awb:itemBKGs){
			if (awb!=null && awb.getMetadata()!=null && !awb.getMetadata().equals(this)) awb.setMetadata(this);
		}
	}

	public Set<ItemDGR> getItemDGRs() {
		return itemDGRs;
	}

	public void setItemDGRs(Set<ItemDGR> itemDGRs) {
		this.itemDGRs = itemDGRs;
		if (itemDGRs != null){
			for(ItemDGR awb:itemDGRs){
				if (!awb.getMetadata().equals(this)) awb.setMetadata(this);
			}
		}
	}

	public Set<ItemSAD> getItemSADs() {
		return itemSADs;
	}

	public void setItemSADs(Set<ItemSAD> itemSADs) {
		this.itemSADs = itemSADs;
	}

	public Set<ItemPKG> getItemPKG() {
		return itemPKG;
	}

	public void setItemPKG(Set<ItemPKG> itemPKG) {
		this.itemPKG = itemPKG;
		Set<ItemBKG> bkgs = new LinkedHashSet<ItemBKG>();
		Set<ItemSLI> slis = new LinkedHashSet<ItemSLI>();
		Set<ItemAVI> avis = new LinkedHashSet<ItemAVI>();
		Set<ItemDGR> dgrs = new LinkedHashSet<ItemDGR>();
		if (this.itemPKG != null){
			for(ItemPKG s:this.itemPKG){
				ItemAVI avi = s.getItemAvi();
				if (avi != null){
					avis.add((ItemAVI) avi);
				}
				ItemDGR dgr = s.getItemDgr();
				if (dgr != null){
					dgrs.add((ItemDGR) dgr);
				}
				ItemBKG bkgItem = s.getItemBkg();
				if (bkgItem != null){
					bkgs.add(bkgItem);
				}
				ItemSLI sliItem = s.getItemSli();
				if (sliItem != null){
					slis.add(sliItem);
				}
			}
			this.setItemAVIs(avis);
			this.setItemDGRs(dgrs);
			this.setItemBKGs(bkgs);
			this.setItemSLIs(slis);
			for(AbstractItem awb:itemPKG){
				if (!awb.getMetadata().equals(this)) awb.setMetadata(this);
			}
		}
	}

	public FAcceptance getAcceptanceByAwbAcc(Integer awbAcc) {
		if (this.acceptance != null){
			for(FAcceptance a:this.acceptance){
				if (a.getAwb_acc().equals(awbAcc)){
					return a;
				}
			}
		}
		return null;
	}
	
	public FAcceptance getAcceptanceByAwbAcc(String dept, String dest) {
		if (this.acceptance != null){
			for(FAcceptance a:this.acceptance){
				if (a.getAp_dept().ap_3lc.compareTo(dept) == 0 && a.getAp_dest().ap_3lc.compareTo(dest) == 0){
					return a;
				}
			}
		}
		return null;
	}

	public void addAcceptance(FAcceptance acc) {
		if (acc != null){
			if (this.acceptance == null){
				this.acceptance = new LinkedHashSet<FAcceptance>();
			}
			if (this.acceptance.contains(acc)){
				this.acceptance.remove(acc);
			}
			this.acceptance.add(acc);
			acc.setMetadata(this);
		}
	}
	
	public void addAcceptanceHeader(FAcceptanceHeader acc) {
		if (acc != null){
			if (this.acceptanceHeader == null){
				this.acceptanceHeader = new LinkedHashSet<FAcceptanceHeader>();
			}
			this.acceptanceHeader.add(acc);
			acc.setMetadata(this);
		}
	}


	public void removeAcceptance(FAcceptance acc) {
		if (this.acceptance != null && acc != null){
			this.acceptance.remove(acc);
			acc.setMetadata(null);
		}
	}

	public Integer getTotalPcs() {
		Set<ItemBKG> bkg = this.getItemBKGs();
		if (bkg != null && bkg.size() > 0){
			ItemBKG b = bkg.iterator().next();
			return b.getPcs();
		}
		return null;
	}

	public Double getTotalWgt() {
		Set<ItemBKG> bkg = this.getItemBKGs();
		if (bkg != null && bkg.size() > 0){
			ItemBKG b = bkg.iterator().next();
			return b.getWgt();
		}
		return null;
	}

	public Set<AwbState> getAwbStates() {
		return awbStates;
	}

	public final void setAwbStates(Set<AwbState> awbStates) {
		this.awbStates = awbStates;
		/*if (awbStates != null) for(AwbState awb:awbStates){
			if (!awb.getAttachment().equals(this)) awb.setAttachment(this);
		}*/
	}

	public Set<PackageState> getPkgStates() {
		return pkgStates;
	}

	public void setPkgStates(Set<PackageState> pkgStates) {
		this.pkgStates = pkgStates;
		if (pkgStates != null) for(PackageState awb:pkgStates){
			if (!awb.getAttachment().equals(this)) awb.setAttachment(this);
		}
	}

	public final List<RFAci> getAccountingInformations() {
		return accountingInformations;
	}

	public final void setAccountingInformations(List<RFAci> accountingInformations) {
		this.accountingInformations = accountingInformations;
		if (this.accountingInformations != null){
			for(RFAci aci:accountingInformations){
				aci.setMetadata(this);
			}
		}
	}

	public RSAp getFrom() {
		if (this.attType.equals(FormularType.BKG_FLIGHT.getConstaint())){
			if (this.bkgFlights != null && this.bkgFlights.size() > 0){
				return bkgFlights.get(0).getFlight().connection.dept;
			}
		}
		else if (this.attType.equals(FormularType.ROUTING.getConstaint())){
			if (this.routing != null && this.routing.size() > 0){
				return routing.get(0).getAP();
			}
		}
		return null;
	}

	public RSAp getTo() {
		if (this.attType.equals(FormularType.BKG_FLIGHT.getConstaint())){
			if (this.bkgFlights != null && this.bkgFlights.size() > 0){
				return bkgFlights.get(bkgFlights.size()-1).getFlight().connection.dest;
			}
		}
		else if (this.attType.equals(FormularType.ROUTING.getConstaint())){
			if (this.routing != null && this.routing.size() > 0){
				return routing.get(routing.size()-1).getAP();
			}
		}
		return null;
	}

	public Date getDepTime() {
		if (this.bkgFlights == null || this.bkgFlights.isEmpty()){
			return null;
		}
		BookingRequestFlight bkg_flt = this.bkgFlights.get(0);
		if (bkg_flt == null){
			return null;
		}
		return bkg_flt.getDepTime();
	}

	public Date getArrTime() {
		if (this.bkgFlights == null || this.bkgFlights.isEmpty()){
			return null;
		}
		int size = this.bkgFlights.size();
		BookingRequestFlight bkg_flt = this.bkgFlights.get(size - 1);
		if (bkg_flt == null){
			return null;
		}
		return bkg_flt.getArrTime();
	}
	
	public Date getDepTimeForAWB() {
		if (this.bkgFlights == null || this.bkgFlights.isEmpty()){
			return null;
		}
		BookingRequestFlight bkg_flt = this.bkgFlights.get(0);
		if (bkg_flt == null){
			return null;
		}
		return bkg_flt.getDepTimeForAWB();
	}

	public Date getArrTimeForAWB() {
		if (this.bkgFlights == null || this.bkgFlights.isEmpty()){
			return null;
		}
		int size = this.bkgFlights.size();
		BookingRequestFlight bkg_flt = this.bkgFlights.get(size - 1);
		if (bkg_flt == null){
			return null;
		}
		return bkg_flt.getArrTimeForAWB();
	}

	public Set<ItemSLI> getItemSLIs() {
		return itemSLIs;
	}

	public void setItemSLIs(Set<ItemSLI> itemSLIs) {
		this.itemSLIs = itemSLIs;
	}

	public DeliveryHeadersView getDeliveryView() {
		return deliveryView;
	}

	public void setDeliveryView(DeliveryHeadersView deliveryView) {
		this.deliveryView = deliveryView;
	}

	public List<ItemPKG> getListItemPKG() {
		return listItemPKG;
	}

	public void setListItemPKG(List<ItemPKG> listItemPKG) {
		this.listItemPKG = listItemPKG;
	}

	public List<ItemBKG> getListItemBKG() {
		return listItemBKG;
	}

	public void setListItemBKG(List<ItemBKG> listItemBKG) {
		this.listItemBKG = listItemBKG;
	}

	public List<BookingRequestFlight> getListBookingFlight() {
		return listBookingFlight;
	}

	public void setListBookingFlight(List<BookingRequestFlight> listBookingFlight) {
		this.listBookingFlight = listBookingFlight;
	}

	public boolean isFlightEditable() {
		return flightEditable;
	}

	public void setFlightEditable(boolean flightEditable) {
		this.flightEditable = flightEditable;
	}

	public List<Integer> getDiscrPart()
	{
		return discrPart;
	}

	public void setDiscrPart(List<Integer> discrPart)
	{
		this.discrPart = discrPart;
	}
}