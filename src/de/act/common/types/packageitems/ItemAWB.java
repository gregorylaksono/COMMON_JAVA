package de.act.common.types.packageitems;

import java.io.Serializable;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.staticobjects.SRate;
import de.act.common.types.staticobjects.SRateAuto;


/**
 * @author Martin Sachs
 * @since 04.05.2006
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemAWB extends AbstractSubItem implements  Serializable{

	private static final long serialVersionUID = -8537566559964339219L;
	private String serviceCode;
	private Double chargableWgt = 0.0;
	private String rateType = null;
	private String rateClass = null;
	private String classType = null;
	private String itemNo = null;
	private Double rate = null;
	private Double rateFactor = null;
	private Double total = 0.0;
	private SRate rateObj = null;
	private ItemAWB link_row;
	private Double pivotRate = null;
	private Double overPivotRate = null;
	private String cur3lcFrom = null;
	private String cur3lcTo = null;
	private Double conversionRate = 0.0;
	private SRateAuto rateAutoObj = null;
	private Double salesRate = 0.0;
	private Double totalSalesRates = 0.0;
	private Double calcInsurance = 0.0;
	private Double insuranceValue = 0.0;
	
	public Double getPivotRate() {
		return pivotRate;
	}

	public void setPivotRate(Double pivotRate) {
		this.pivotRate = pivotRate;
	}

	public Double getOverPivotRate() {
		return overPivotRate;
	}

	public void setOverPivotRate(Double overPivotRate) {
		this.overPivotRate = overPivotRate;
	}

	public ItemAWB() {
		super(FormularType.AWB_ITEM);
	}

	public ItemAWB(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
	}

	public SRate getRateObj() {
		return rateObj;
	}

	public void setRateObj(SRate rateObj) {
		this.rateObj = rateObj;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getRateClass() {
		return rateClass;
	}

	public void setRateClass(String rateClass) {
		this.rateClass = rateClass;
	}

	public Double getRateFactor() {
		return rateFactor;
	}

	public void setRateFactor(Double rateFactor) {
		this.rateFactor = rateFactor;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getChargableWgt() {
		return chargableWgt;
	}

	public void setChargableWgt(Double chrgblWgt) {
		this.chargableWgt = chrgblWgt;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractSubItem#addSubItem(T)
	 */
	@Override
	public synchronized void addSubItem(AbstractSubItem sub) {
		super.addSubItem(sub);
		if (sub!=null)
			sub.setItemAwb(this);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractSubItem#removeSubItem(T)
	 */
	@Override
	public synchronized void removeSubItem(AbstractSubItem sub) {
		super.removeSubItem(sub);
		if (sub!=null)
			sub.setItemAwb(null);
	}

	public ItemAWB getLink_row() {
		return link_row;
	}

	public void setLink_row(ItemAWB link_row) {
		this.link_row = link_row;
	}

	public String getCur3lcFrom() {
		return cur3lcFrom;
	}

	public void setCur3lcFrom(String cur3lcFrom) {
		this.cur3lcFrom = cur3lcFrom;
	}

	public String getCur3lcTo() {
		return cur3lcTo;
	}

	public void setCur3lcTo(String cur3lcTo) {
		this.cur3lcTo = cur3lcTo;
	}

	public Double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public SRateAuto getRateAutoObj() {
		return rateAutoObj;
	}

	public void setRateAutoObj(SRateAuto rateAutoObj) {
		this.rateAutoObj = rateAutoObj;
	}

	public Double getSalesRate() {
		return salesRate;
	}

	public void setSalesRate(Double salesRate) {
		this.salesRate = salesRate;
	}

	public Double getTotalSalesRates() {
		return totalSalesRates;
	}

	public void setTotalSalesRates(Double totalSalesRates) {
		this.totalSalesRates = totalSalesRates;
	}

	public Double getCalcInsurance() {
		return calcInsurance;
	}

	public void setCalcInsurance(Double calcInsurance) {
		this.calcInsurance = calcInsurance;
	}

	public Double getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(Double insuranceValue) {
		this.insuranceValue = insuranceValue;
	}
	
}
