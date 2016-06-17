package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularDelivery extends CAbstractFormular implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 18.01.2007
	 */
	private static final long serialVersionUID = 1229609794313200140L;
	private Integer pcs;
	private Double wgt;
	private String recipient_name;
	private String recipient_sign;
	private String customs_ref_no;		
	private String bank_release_no;
	private String invoice_no;		
	private Date corr;

	public CFormularDelivery() {
		super(FormularType.DELIVERY);
	}

	public CFormularDelivery(IFormularMain mainform) {
		super(FormularType.DELIVERY,mainform);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}

	public String getBank_release_no() {
		return bank_release_no;
	}

	public void setBank_release_no(String bank_release_no) {
		this.bank_release_no = bank_release_no;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public String getCustoms_ref_no() {
		return customs_ref_no;
	}

	public void setCustoms_ref_no(String customs_ref_no) {
		this.customs_ref_no = customs_ref_no;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public String getRecipient_name() {
		return recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getRecipient_sign() {
		return recipient_sign;
	}

	public void setRecipient_sign(String recipient_sign) {
		this.recipient_sign = recipient_sign;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
}
