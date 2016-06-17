package de.act.common.types.formulars;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.RFAci;
import de.act.common.types.nonstaticobjects.RFInfo;
import de.act.common.types.nonstaticobjects.RFStick;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.RSCuc;
import de.act.common.types.staticobjects.RSCur;
import de.act.common.types.staticobjects.RSHai;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.RSUnit;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularSLI extends CAbstractFormular implements Serializable, Comparable<CFormularSLI> {
	/**
	 * @author Martin Sachs
	 * @since 07.03.2006
	 */
	private static final long serialVersionUID = 4989389710297247259L;
	private Date						corr;
	// BOOKING and ROUTING
	private ItemBKG						bookingRequest		= new ItemBKG();
	private RSCuc						cuc3lc;
	private RSScc						scc3lc;
	private RFStick						sticker;
	private Integer						freightCCState		= 0;
	private Integer						otherCCState		= 0;
	// DECLARED VALUE and INSURANCE
	private Double						valueInsurance;
	private Double						carValueCarrier;
	private Double						carValueCustomer;
	private RSCur						cur3lc;
	private Date						date				= new Date();
	private String						signature			= "shipper";
	private Double						volWgt;
	private RSUnit						volWgtUnit;
	private Double						wgt;
	private RSUnit						wgtUnit;
	transient private final static SimpleDateFormat	sf		= new SimpleDateFormat("yyyy-MM-dd");
	private List<RFAci>					acis				= new ArrayList<RFAci>();

	public CFormularSLI() {
		super(FormularType.SLI);
	}

	public CFormularSLI(IFormularMain mainform) {
		super(FormularType.SLI, mainform);
	}

	public String getDateString() {
		return sf.format(this.date);
	}

	public ItemBKG getBookingRequest() {
		return bookingRequest;
	}

	public void setBookingRequest(ItemBKG bookingRequest) {
		this.bookingRequest = bookingRequest;
	}

	public Double getCarValueCarrier() {
		return carValueCarrier;
	}

	public void setCarValueCarrier(Double carValueCarrier) {
		this.carValueCarrier = carValueCarrier;
	}

	public Double getCarValueCustomer() {
		return carValueCustomer;
	}

	public void setCarValueCustomer(Double carValueCustomer) {
		this.carValueCustomer = carValueCustomer;
	}

	public RSCuc getCuc3lc() {
		return cuc3lc;
	}

	public void setCuc3lc(RSCuc cuc3lc) {
		this.cuc3lc = cuc3lc;
	}

	public RSCur getCur3lc() {
		if (cur3lc!=null)
			return cur3lc;
		RSCur ret = new RSCur();
		ret.CUR_3LC = "EUR";
		return ret;
	}

	public void setCur3lc(RSCur cur) {
		this.cur3lc = cur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getFreightCCState() {
		return freightCCState;
	}

	public void setFreightCCState(Integer freightCCState) {
		if (freightCCState!=null && (freightCCState ==0 || freightCCState==1))
			this.freightCCState = freightCCState;
	}

	public Integer getOtherCCState() {
		return otherCCState;
	}

	public void setOtherCCState(Integer otherCCState) {
		if (otherCCState!=null && (otherCCState ==0 || otherCCState==1))
			this.otherCCState = otherCCState;
	}

	public RSScc getScc3lc() {
		return scc3lc;
	}

	public void setScc3lc(RSScc scc3lc) {
		this.scc3lc = scc3lc;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Double getValueInsurance() {
		return valueInsurance;
	}

	public void setValueInsurance(Double valueInsurance) {
		this.valueInsurance = valueInsurance;
	}

	public Double getVolWgt() {
		return volWgt;
	}

	public void setVolWgt(Double volWgt) {
		this.volWgt = volWgt;
	}

	public RSUnit getVolWgtUnit() {
		return volWgtUnit;
	}

	public void setVolWgtUnit(RSUnit volWgtUnit) {
		this.volWgtUnit = volWgtUnit;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public RSUnit getWgtUnit() {
		return wgtUnit;
	}

	public void setWgtUnit(RSUnit wgtUnit) {
		this.wgtUnit = wgtUnit;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public void setDateString(String text) {
		try {
			Date d = sf.parse(text);
			this.date = d;
		} 
		catch (ParseException e) {
			e.printStackTrace();
			this.date = new Date();
		}
	}

	public void setBookingRequest(List<BookingRequestFlight> bookings) {
		if (this.bookingRequest != null) {
			this.bookingRequest = new ItemBKG();
		}
		this.getMainFormular().setBookingRequestFlights(bookings);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		/*
		 * prepaid collect Customs code SCC DAte Signature
		 *
		 */
		boolean ret = true;
		getErrorList().clear();
		// ret &= this.scc3lc!=null && this.scc3lc.SCC_3LC!=null;
		// if (!ret ) getErrorList().add(new FormularError(0,"scc not
		// set",2,"SCC",FormularType.SLI));
		ret &= this.date != null;
		if (!ret) getErrorList().add(new FormularError(0, "date not set", 2, "DATE", FormularType.SLI));
		ret &= this.signature != null && this.signature.length() > 0;
		if (!ret) getErrorList().add(new FormularError(0, "signature not set", 2, "SCC", FormularType.SLI));
		//ret &= this.cuc3lc != null && this.cuc3lc.CUC_3LC != null;
		//if (!ret) getErrorList().add(new FormularError(0, "cuc not set", 2, "CUC", FormularType.SLI));
		ret &= this.freightCCState != null && this.freightCCState >= 0 && freightCCState <= 1;
		if (!ret) getErrorList().add(new FormularError(0, "prepaid/collect not set", 2, "CUC", FormularType.SLI));
		return ret;
	}

	public List<RFAci> getAcis() {
		return acis;
	}

	public void setAcis(List<RFAci> acis) {
		this.acis = acis;
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		// TODO check data
		if (sticker!=null) {
			List<RFInfo> list = sticker.getInfos();
			List<RFInfo> remove = new ArrayList<RFInfo>();
			if (list!=null && list.size()>0) {
				for (RFInfo info : list) {
					if (info!=null) {
						RSHai h = info.getHai();
						String rem = info.getRemark();
						if ((h==null || h.getId()==null || h.getId().length()==0)&& (rem == null || rem.length()==0)) {
							remove.add(info);
						}
					}
				}
				for (RFInfo info : remove) {
					list.remove(info);
				}
			}
		}
		this.sticker = sticker;
	}
	
	// Used to sort SLIs ascending
	@Override
	public int compareTo(CFormularSLI obj)
	{
		return this.getId().compareTo(obj.getId());
	}
}
