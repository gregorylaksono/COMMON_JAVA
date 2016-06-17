/*
 * Created on 02.09.2005
 *
 * To change the template for this generated file go to Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;
import java.util.Date;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.attachment.CAddressAttachment;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.staticobjects.RSAdd;

/**
 * @author Martin Sachs
 * @since 1.0 - 09.11.2006
 */
@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAdd implements java.io.Serializable {
	private static final long serialVersionUID = -3753844914257022576L;
	private Long			id				= -1L;
	private IAttachment		metadata;
	private RSAdd			shipper;
	private Integer			shp_add_id;
	private RFSubt			shipperOptional;
	private RSAdd			consignee;
	private Integer			con_add_id;	
	private RFSubt			consigneeOptional;
	private RSAdd			agent;
	private Integer			ffw_add_id;
	private RFSubt			agentOptional;
	private Date			corr			= new Date();
	private RFSubt			deliverToOptional;
	private RFSubt			alsoNotifyOptional;
	private Integer			isBank;
	private Integer			isGov;
	private RSAdd			alsoNotify;
	private Integer			anotify_add_id;
	private RSAdd			deliverTo;
	private Integer			deliver_add_id;

	public RFAdd() {
		this.metadata = new CAddressAttachment();
	}

	public RFAdd(CAbstractAttachment attachment) {
		this.metadata = attachment;
	}

	public Integer getAnotify_add_id() {
		return anotify_add_id;
	}

	public void setAnotify_add_id(Integer anotify_add_id) {
		this.anotify_add_id = anotify_add_id;
	}

	public Integer getDeliver_add_id() {
		return deliver_add_id;
	}

	public void setDeliver_add_id(Integer deliver_add_id) {
		this.deliver_add_id = deliver_add_id;
	}

	// public String FORM_FLAG;
	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj instanceof RFAdd){
			return metadata.equals(((RFAdd) obj).metadata);
		}
		return false;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		re += 37 * this.metadata.hashCode();
		return re;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.metadata.toString();
	}

	public Integer getIsBank() {
		return isBank;
	}

	public void setIsBank(Integer isBank) {
		this.isBank = isBank;
	}
	
	public RSAdd getAgent() {
		return agent;
	}

	public void setAgent(RSAdd agent) {
		this.agent = agent;
	}

	public RFSubt getAgentOptional() {
		return agentOptional;
	}

	public void setAgentOptional(RFSubt agentOptional) {
		this.agentOptional = agentOptional;
	}

	public RSAdd getConsignee() {
		return consignee;
	}

	public void setConsignee(RSAdd consignee) {
		this.consignee = consignee;
	}

	public RFSubt getConsigneeOptional() {
		return consigneeOptional;
	}

	public void setConsigneeOptional(RFSubt consigneeOptional) {
		this.consigneeOptional = consigneeOptional;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RSAdd getShipper() {
		return shipper;
	}

	public void setShipper(RSAdd shipper) {
		this.shipper = shipper;
	}

	public RFSubt getShipperOptional() {
		return shipperOptional;
	}

	public void setShipperOptional(RFSubt shipperOptional) {
		this.shipperOptional = shipperOptional;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	public RSAdd getDeliverTo() {
		return deliverTo;
	}
	
	public void setDeliverTo(RSAdd deliverTo) {
		this.deliverTo = deliverTo;
	}

	public RSAdd getAlsoNotify() {
		return alsoNotify;
	}
	
	public void setAlsoNotify(RSAdd alsoNotify) {
		this.alsoNotify = alsoNotify;
	}

	public RSAdd getBank() {
		if (this.isBank!=null && this.isBank.equals(1))
			return consignee;
		return null;
	}
	
	public void setBank(Integer bank) {
		this.isBank = bank;
	}

	public Integer getShp_add_id() {
		return shp_add_id;
	}

	public void setShp_add_id(Integer shp_add_id) {
		this.shp_add_id = shp_add_id;
	}

	public Integer getCon_add_id() {
		return con_add_id;
	}

	public void setCon_add_id(Integer con_add_id) {
		this.con_add_id = con_add_id;
	}

	public Integer getFfw_add_id() {
		return ffw_add_id;
	}

	public void setFfw_add_id(Integer ffw_add_id) {
		this.ffw_add_id = ffw_add_id;
	}
}
