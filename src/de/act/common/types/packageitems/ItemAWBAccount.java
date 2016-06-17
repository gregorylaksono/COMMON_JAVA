package de.act.common.types.packageitems;

import java.io.Serializable;

import de.act.central.types.FormularAWB;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemAWBAccount extends AbstractSubItem implements  Serializable{

	private static final long serialVersionUID = -8537566559964339219L;
	private Long awbAccountId;
	private Double rate = null;
	private Double ot = null;
	private Double tax = null;
	private Double creditCardFee = null;
	private Double total = 0.0;
	private String cur3lcFrom = null;
	private String cur3lcTo = null;
	private Double conversionRate = 0.0;
	private Long attId;
	private FormularAWB fAwb;
	
	public Long getAwbAccountId() {
		return awbAccountId;
	}

	public void setAwbAccountId(Long awbAccountId) {
		this.awbAccountId = awbAccountId;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getOt() {
		return ot;
	}

	public void setOt(Double ot) {
		this.ot = ot;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getCreditCardFee() {
		return creditCardFee;
	}

	public void setCreditCardFee(Double creditCardFee) {
		this.creditCardFee = creditCardFee;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
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

	public Long getAttId() {
		return attId;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public FormularAWB getfAwb() {
		return fAwb;
	}

	public void setfAwb(FormularAWB fAwb) {
		this.fAwb = fAwb;
	}

	public ItemAWBAccount() {
		super(FormularType.AWB_ITEM);
	}

	public ItemAWBAccount(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
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

}
