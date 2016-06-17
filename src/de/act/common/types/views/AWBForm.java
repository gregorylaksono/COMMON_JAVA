package de.act.common.types.views;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.act.common.types.UserObject;
import de.act.common.types.nonstaticobjects.RFOt;
import de.act.common.types.staticobjects.Discrepancies;

public class AWBForm implements java.io.Serializable{
	
	private static final long serialVersionUID = 6461310570886911776L;	
	
	private String awbNo;
	private Address shipperAddress;
	private Address consigneeAddress;
	private Address agentAddress;
	private String ap_name_from;
	private String ap_3lc_from;
	private String ap_name_to;
	private String ap_3lc_to;
	private List<String> listRSAp = new ArrayList<String>();
	private String flightDate1;
	private String flightDate2;
	private List<String> listFlight = new ArrayList<String>();
	private String ca_2lc;
	private String ca_name;
	private List<HandlingInformation> listHandlingInfo = new ArrayList<HandlingInformation>();
	private List<AWBCom> listAWBCom = new ArrayList<AWBCom>();
	private String agentName;
	private String agentCity;
	private String agentIATACode;
	private String agentIATAAccountNumber;
	
	private String cur_3lc;
	private Boolean WTVAL_ppd;
	private Boolean WTVAL_coll;
	private Boolean other_ppd;
	private Boolean other_coll;
	private Integer freightCCState;
	private Integer otherCCState;
	private Double carValueCarrier;
	private Double carValueCustomer;
	private Double valueInsurance;
	
	private Set<RFOt> setOtherCharges;	

	private RFOt fuelCharges;
	private RFOt chargesCollectFee;
	private Map<String, RFOt> mapDefaultOtherCharges;
	private List<AccountingInformation> listAccInformation;
	
	private UserObject UserObject;
	private String signatureType;
	private String f_id;
	private Integer statusPrintAWB;
	private String non_standard;
	
	private Discrepancies discr;
	
	private Double prepaid;
	private Double collect;
	private Double valuationCharge1;
	private Double valuationCharge2;
	private Double tax1;
	private Double tax2;
	private Double totalOtherChargesDueAgent1;
	private Double totalOtherChargesDueAgent2;
	private Double totalOtherChargesDueCarrier1;
	private Double totalOtherChargesDueCarrier2;
	private Double totalPrepaid;
	private Double totalCollect;
	private Double currencyConversionRates;
	private Double ccChargesInDestCurrency;
	private Double chargesAtDestination;
	private Double totalCollectCharges;
	private String currentDate;
	private String signaturePlace;
	private String signature;
	private String serviceDisplay;
	private String cNote;
	private String typeShipment;
	private Integer pcs;
	private Double wgt;
	private Double L;
	private Double W;
	private Double H;
	private Double vol;
	private Double totalPcs;
	private Double totalWgt;
	private Double totalPrice;
	
	public AWBForm(){
	}
	
	public Boolean getWTVAL_coll() {
		return WTVAL_coll;
	}

	public void setWTVAL_coll(Boolean wtval_coll) {
		WTVAL_coll = wtval_coll;
	}

	public Boolean getOther_ppd() {
		return other_ppd;
	}

	public void setOther_ppd(Boolean other_ppd) {
		this.other_ppd = other_ppd;
	}

	public Boolean getOther_coll() {
		return other_coll;
	}

	public void setOther_coll(Boolean other_coll) {
		this.other_coll = other_coll;
	}
	
	public String getNon_standard() {
		return non_standard;
	}
	public void setNon_standard(String non_standard) {
		this.non_standard = non_standard;
	}
	public Address getShipperAddress() {
		return shipperAddress;
	}
	public void setShipperAddress(Address shipperAddress) {
		this.shipperAddress = shipperAddress;
	}
	public Address getConsigneeAddress() {
		return consigneeAddress;
	}
	public void setConsigneeAddress(Address consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	public Address getAgentAddress() {
		return agentAddress;
	}
	public void setAgentAddress(Address agentAddress) {
		this.agentAddress = agentAddress;
	}
	public String getAp_name_from() {
		return ap_name_from;
	}
	public void setAp_name_from(String ap_name_from) {
		this.ap_name_from = ap_name_from;
	}
	public String getAp_3lc_from() {
		return ap_3lc_from;
	}
	public void setAp_3lc_from(String ap_3lc_from) {
		this.ap_3lc_from = ap_3lc_from;
	}
	public String getAp_name_to() {
		return ap_name_to;
	}
	public void setAp_name_to(String ap_name_to) {
		this.ap_name_to = ap_name_to;
	}
	public String getAp_3lc_to() {
		return ap_3lc_to;
	}
	public void setAp_3lc_to(String ap_3lc_to) {
		this.ap_3lc_to = ap_3lc_to;
	}
	public List<String> getListRSAp() {
		return listRSAp;
	}
	public void setListRSAp(List<String> listRSAp) {
		this.listRSAp = listRSAp;
	}
	
	public String getFlightDate1() {
		return flightDate1;
	}
	public void setFlightDate1(String flightDate1) {
		this.flightDate1 = flightDate1;
	}
	public String getFlightDate2() {
		return flightDate2;
	}
	public void setFlightDate2(String flightDate2) {
		this.flightDate2 = flightDate2;
	}
	public List<String> getListFlight() {
		return listFlight;
	}
	public void setListFlight(List<String> listFlight) {
		this.listFlight = listFlight;
	}
	public String getCa_2lc() {
		return ca_2lc;
	}
	public List<HandlingInformation> getListHandlingInfo() {
		return listHandlingInfo;
	}
	public void setListHandlingInfo(
			List<HandlingInformation> listHandlingInfo) {
		this.listHandlingInfo = listHandlingInfo;
	}
	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}
	public List<AWBCom> getListAWBCom() {
		return listAWBCom;
	}
	public void setListAWBCom(List<AWBCom> listAWBCom) {
		this.listAWBCom = listAWBCom;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentCity() {
		return agentCity;
	}
	public void setAgentCity(String agentCity) {
		this.agentCity = agentCity;
	}
	public String getAgentIATACode() {
		return agentIATACode;
	}
	public void setAgentIATACode(String agentIATACode) {
		this.agentIATACode = agentIATACode;
	}
	public String getAgentIATAAccountNumber() {
		return agentIATAAccountNumber;
	}
	public void setAgentIATAAccountNumber(String agentIATAAccountNumber) {
		this.agentIATAAccountNumber = agentIATAAccountNumber;
	}
	public String getCur_3lc() {
		return cur_3lc;
	}
	public void setCur_3lc(String cur_3lc) {
		this.cur_3lc = cur_3lc;
	}
	public Integer getFreightCCState() {
		return freightCCState;
	}
	public void setFreightCCState(Integer freightCCState) {
		this.freightCCState = freightCCState;
	}
	public Integer getOtherCCState() {
		return otherCCState;
	}
	public void setOtherCCState(Integer otherCCState) {
		this.otherCCState = otherCCState;
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
	public Double getValueInsurance() {
		return valueInsurance;
	}
	public void setValueInsurance(Double valueInsurance) {
		this.valueInsurance = valueInsurance;
	}
	public Set<RFOt> getSetOtherCharges() {
		return setOtherCharges;
	}
	public void setSetOtherCharges(Set<RFOt> setOtherCharges) {
		this.setOtherCharges = setOtherCharges;
	}
	public RFOt getFuelCharges() {
		return fuelCharges;
	}
	public void setFuelCharges(RFOt fuelCharges) {
		this.fuelCharges = fuelCharges;
	}
	public RFOt getChargesCollectFee() {
		return chargesCollectFee;
	}
	public void setChargesCollectFee(RFOt chargesCollectFee) {
		this.chargesCollectFee = chargesCollectFee;
	}
	public Map<String, RFOt> getMapDefaultOtherCharges() {
		return mapDefaultOtherCharges;
	}
	public void setMapDefaultOtherCharges(
			Map<String, RFOt> mapDefaultOtherCharges) {
		this.mapDefaultOtherCharges = mapDefaultOtherCharges;
	}
	public List<AccountingInformation> getListAccInformation() {
		return listAccInformation;
	}
	public void setListAccInformation(
			List<AccountingInformation> listAccInformation) {
		this.listAccInformation = listAccInformation;
	}
	public UserObject getUserObject() {
		return UserObject;
	}
	public void setUserObject(UserObject UserObject) {
		this.UserObject = UserObject;
	}
	public String getSignatureType() {
		return signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public Integer getStatusPrintAWB() {
		return statusPrintAWB;
	}
	public void setStatusPrintAWB(Integer statusPrintAWB) {
		this.statusPrintAWB = statusPrintAWB;
	}
	public Discrepancies getDiscr() {
		return discr;
	}
	public void setDiscr(Discrepancies discr) {
		this.discr = discr;
	}
	public Double getPrepaid() {
		return prepaid;
	}
	public void setPrepaid(Double prepaid) {
		this.prepaid = prepaid;
	}
	public Double getCollect() {
		return collect;
	}
	public void setCollect(Double collect) {
		this.collect = collect;
	}
	public Double getValuationCharge1() {
		return valuationCharge1;
	}
	public void setValuationCharge1(Double valuationCharge1) {
		this.valuationCharge1 = valuationCharge1;
	}
	public Double getValuationCharge2() {
		return valuationCharge2;
	}
	public void setValuationCharge2(Double valuationCharge2) {
		this.valuationCharge2 = valuationCharge2;
	}
	public Double getTax1() {
		return tax1;
	}
	public void setTax1(Double tax1) {
		this.tax1 = tax1;
	}
	public Double getTax2() {
		return tax2;
	}
	public void setTax2(Double tax2) {
		this.tax2 = tax2;
	}
	public Double getTotalOtherChargesDueAgent1() {
		return totalOtherChargesDueAgent1;
	}
	public void setTotalOtherChargesDueAgent1(Double totalOtherChargesDueAgent1) {
		this.totalOtherChargesDueAgent1 = totalOtherChargesDueAgent1;
	}
	public Double getTotalOtherChargesDueAgent2() {
		return totalOtherChargesDueAgent2;
	}
	public void setTotalOtherChargesDueAgent2(Double totalOtherChargesDueAgent2) {
		this.totalOtherChargesDueAgent2 = totalOtherChargesDueAgent2;
	}
	public Double getTotalOtherChargesDueCarrier1() {
		return totalOtherChargesDueCarrier1;
	}
	public void setTotalOtherChargesDueCarrier1(Double totalOtherChargesDueCarrier1) {
		this.totalOtherChargesDueCarrier1 = totalOtherChargesDueCarrier1;
	}
	public Double getTotalOtherChargesDueCarrier2() {
		return totalOtherChargesDueCarrier2;
	}
	public void setTotalOtherChargesDueCarrier2(Double totalOtherChargesDueCarrier2) {
		this.totalOtherChargesDueCarrier2 = totalOtherChargesDueCarrier2;
	}
	public Double getTotalPrepaid() {
		return totalPrepaid;
	}
	public void setTotalPrepaid(Double totalPrepaid) {
		this.totalPrepaid = totalPrepaid;
	}
	public Double getTotalCollect() {
		return totalCollect;
	}
	public void setTotalCollect(Double totalCollect) {
		this.totalCollect = totalCollect;
	}
	public Double getCurrencyConversionRates() {
		return currencyConversionRates;
	}
	public void setCurrencyConversionRates(Double currencyConversionRates) {
		this.currencyConversionRates = currencyConversionRates;
	}
	public Double getCcChargesInDestCurrency() {
		return ccChargesInDestCurrency;
	}
	public void setCcChargesInDestCurrency(Double ccChargesInDestCurrency) {
		this.ccChargesInDestCurrency = ccChargesInDestCurrency;
	}
	public Double getChargesAtDestination() {
		return chargesAtDestination;
	}
	public void setChargesAtDestination(Double chargesAtDestination) {
		this.chargesAtDestination = chargesAtDestination;
	}
	public Double getTotalCollectCharges() {
		return totalCollectCharges;
	}
	public void setTotalCollectCharges(Double totalCollectCharges) {
		this.totalCollectCharges = totalCollectCharges;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public void setWTVAL_ppd(Boolean wTVAL_ppd) {
		WTVAL_ppd = wTVAL_ppd;
	}

	public Boolean getWTVAL_ppd() {
		return WTVAL_ppd;
	}

	public String getSignaturePlace() {
		return signaturePlace;
	}

	public void setSignaturePlace(String signaturePlace) {
		this.signaturePlace = signaturePlace;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getServiceDisplay() {
		return serviceDisplay;
	}

	public void setServiceDisplay(String serviceDisplay) {
		this.serviceDisplay = serviceDisplay;
	}

	public String getcNote() {
		return cNote;
	}

	public void setcNote(String cNote) {
		this.cNote = cNote;
	}

	public String getTypeShipment() {
		return typeShipment;
	}

	public void setTypeShipment(String typeShipment) {
		this.typeShipment = typeShipment;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Double getL() {
		return L;
	}

	public void setL(Double l) {
		L = l;
	}

	public Double getW() {
		return W;
	}

	public void setW(Double w) {
		W = w;
	}

	public Double getH() {
		return H;
	}

	public void setH(Double h) {
		H = h;
	}

	public Double getVol() {
		return vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public Double getTotalPcs() {
		return totalPcs;
	}

	public void setTotalPcs(Double totalPcs) {
		this.totalPcs = totalPcs;
	}

	public Double getTotalWgt() {
		return totalWgt;
	}

	public void setTotalWgt(Double totalWgt) {
		this.totalWgt = totalWgt;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
