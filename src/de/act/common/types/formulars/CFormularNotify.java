package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.staticobjects.RSAdd;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularNotify extends CAbstractFormular implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 18.01.2007
	 */
	private static final long serialVersionUID = 4356019964276542196L;
	private String deliver_add_id;
	private String deliver_subt_id;
	private String contact_person;
	private String contact_type;
	private Integer pcs;
	private Double wgt;
	private String remark;
	private RSAdd company;
	private String company_type;
	private Integer pcs_delivered;
	private Double freight_chrgs;
	private Double handling_chrgs;
	private Double storage_chrgs;
	private Double customs_chrgs;
	private Double chrgs_512b;
	private String user_name;
	private Date corr;
	private Integer cust_clear_req = 0;
	private Integer bank_relea_req = 0;
	private Integer payment_req = 0;

	public CFormularNotify() {
		super(FormularType.NOTIFY);
	}

	public CFormularNotify(IFormularMain mainform) {
		super(FormularType.NOTIFY,mainform);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getContact_type() {
		return contact_type;
	}

	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}

	public String getDeliver_add_id() {
		return deliver_add_id;
	}

	public void setDeliver_add_id(String deliver_add_id) {
		this.deliver_add_id = deliver_add_id;
	}

	public String getDeliver_subt_id() {
		return deliver_subt_id;
	}

	public void setDeliver_subt_id(String deliver_subt_id) {
		this.deliver_subt_id = deliver_subt_id;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public RSAdd getCompany() {
		return company;
	}

	public void setCompany(RSAdd company) {
		this.company = company;
	}

	public Double getChrgs_512b() {
		return chrgs_512b;
	}

	public void setChrgs_512b(Double chrgs_512b) {
		this.chrgs_512b = chrgs_512b;
	}

	public String getCompany_type() {
		return company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Double getCustoms_chrgs() {
		return customs_chrgs;
	}

	public void setCustoms_chrgs(Double customs_chrgs) {
		this.customs_chrgs = customs_chrgs;
	}

	public Double getFreight_chrgs() {
		return freight_chrgs;
	}

	public void setFreight_chrgs(Double freight_chrgs) {
		this.freight_chrgs = freight_chrgs;
	}

	public Double getHandling_chrgs() {
		return handling_chrgs;
	}

	public void setHandling_chrgs(Double handling_chrgs) {
		this.handling_chrgs = handling_chrgs;
	}

	public Integer getPcs_delivered() {
		return pcs_delivered;
	}

	public void setPcs_delivered(Integer pcs_delivered) {
		this.pcs_delivered = pcs_delivered;
	}

	public Double getStorage_chrgs() {
		return storage_chrgs;
	}

	public void setStorage_chrgs(Double storage_chrgs) {
		this.storage_chrgs = storage_chrgs;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getBank_relea_req() {
		return bank_relea_req;
	}

	public void setBank_relea_req(Integer bank_relea_req) {
		this.bank_relea_req = bank_relea_req;
	}

	public Integer getCust_clear_req() {
		return cust_clear_req;
	}

	public void setCust_clear_req(Integer cust_clear_req) {
		this.cust_clear_req = cust_clear_req;
	}

	public Integer getPayment_req() {
		return payment_req;
	}

	public void setPayment_req(Integer payment_req) {
		this.payment_req = payment_req;
	}
}
