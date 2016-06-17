package de.act.common.types.formulars;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import de.act.common.types.nonstaticobjects.RFAci;
import de.act.common.types.nonstaticobjects.RFOt;
import de.act.common.types.nonstaticobjects.RFStick;
import de.act.common.types.staticobjects.RSCcd;
import de.act.common.types.staticobjects.RSConx;
import de.act.common.types.staticobjects.RSRates;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularAWB extends CAbstractFormular implements Serializable {
	/**
	 * Logger for this class
	 */
	transient private static final Logger log						= Logger.getLogger(CFormularAWB.class);
	/**
	 * @author Martin Sachs
	 * @since 07.03.2006
	 */
	transient private static final long		serialVersionUID		= -9124207932496905095L;
	transient private static final String	DATE_FORMAT				= "yyyy-MM-dd";
	private Date							corr;
	private Double							curRate					= 0.0;
	private Double							insuRate				= 0.0;
	private RSCcd							ccd;
	private Double							wgtCharges				= 0.0;
	private Double							valCharges				= 0.0;
	private Double							tax						= 0.0;
	private Double							curConvRate 			= 0.0;
	private Date							date					= new Date();
	private String							place					= "";
	// CONSIGNEE
	private String							agentAccountNo;
	private List<RFAci>						acis;
	private String							sci;
	private RFStick							sticker;
	private Set<RFOt>						otherCharges			= new HashSet<RFOt>();
	private String							signature				= "shipper";
	private String							signatureCarrierOrAgent	= "ffw";
	// All rate classes
	// According to airport departure and destination
	private RSRates							rates;	// ??
	// Conx
	private RSConx							conx;
	private final FormularType				type					= FormularType.AWB;
	private String							mrnNo;
	transient private final static SimpleDateFormat	sf				= new SimpleDateFormat(DATE_FORMAT);

	public CFormularAWB() {
		super(FormularType.AWB);
	}

	public CFormularAWB(IFormularMain main) {
		super(FormularType.AWB, main);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormulars#getType()
	 */
	public FormularType getType() {
		return type;
	}

	public String getAgentAccountNo() {
		return agentAccountNo;
	}

	public void setAgentAccountNo(String agentAccountNo) {
		this.agentAccountNo = agentAccountNo;
	}

	public RSConx getConx() {
		return conx;
	}

	public void setConx(RSConx conx) {
		this.conx = conx;
	}

	public Date getDate() {
		if (date == null) {
			date = new Date();
		}
		return date;
	}

	public String getFormatedDate() {
		if (date == null) {
			date = new Date();
		}
		return sf.format(date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public RSRates getRates() {
		return rates;
	}

	public void setRates(RSRates rates) {
		this.rates = rates;
	}

	public String getSci() {
		return sci;
	}

	public void setSci(String sci) {
		this.sci = sci;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignatureCarrierOrAgent() {
		return signatureCarrierOrAgent;
	}

	public void setSignatureCarrierOrAgent(String signatureCarrierOrAgent) {
		this.signatureCarrierOrAgent = signatureCarrierOrAgent;
	}

	public RSCcd getCcd() {
		return ccd;
	}

	public void setCcd(RSCcd ccd) {
		this.ccd = ccd;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Double getCurConvRate() {
		return curConvRate;
	}

	public void setCurConvRate(Double curConvRate) {
		this.curConvRate = curConvRate;
	}

	public Double getCurRate() {
		return curRate;
	}

	public void setCurRate(Double curRate) {
		this.curRate = curRate;
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	public Double getInsuRate() {
		return insuRate;
	}

	public void setInsuRate(Double insuRate) {
		this.insuRate = insuRate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getValCharges() {
		return valCharges;
	}

	public void setValCharges(Double valCharges) {
		this.valCharges = valCharges;
	}

	public Double getWgtCharges() {
		return wgtCharges;
	}

	public void setWgtCharges(Double wgtCharges) {
		this.wgtCharges = wgtCharges;
	}

	public void setDate(String text) {
		try {
			this.date = sf.parse(text);
		} 
		catch (ParseException e) {
			log.error("Parsing date fails " + " ");
		}
	}

	public void setCurConvRate(String text) {
		try {
			this.curConvRate = Double.parseDouble(text);
		} 
		catch (NumberFormatException e) {
			log.error("Parsing CurConvRate fails " + " ");
		} 
		catch (RuntimeException e) {
			log.error("Parsing CurConvRate fails " + " ");
		}
	}

	public void setWgtCharges(String text) {
		if (text != null && text.length() > 0) this.wgtCharges = Double.parseDouble(text);
	}

	public void setValCharges(String text) {
		if (text != null && text.length() > 0) this.valCharges = Double.parseDouble(text);
	}

	public void setTax(String text) {
		if (text != null && text.length() > 0) try {
			this.tax = Double.parseDouble(text);
		} 
		catch (NumberFormatException e) {
			log.error("parsing tax fail " + " ",e);
		}
	}

	public Set<RFOt> getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(Set<RFOt> otherCharges) {
		this.otherCharges = otherCharges;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}

	public List<RFAci> getAcis() {
		return acis;
	}

	public void setAcis(List<RFAci> acis) {
		this.acis = acis;
	}

	public String getMrnNo()
	{
		return mrnNo;
	}

	public void setMrnNo(String mrnNo)
	{
		this.mrnNo = mrnNo;
	}

}
