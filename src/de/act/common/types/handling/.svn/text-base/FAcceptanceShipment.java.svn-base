/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;

import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

/**
 * @author Henry
 *
 */
public class FAcceptanceShipment implements Serializable{

	private static final long serialVersionUID = 3197248402301537379L;
	private Long acc_shipment_id;
	private FAcceptanceHeader acc_header_id;
	private RSAp ap_3lc;
	private Integer con_add_id;
	private Integer awb_acc_flag = 0;
	private RSState state_id;
	private String stat_descr;
	private Set<FAcceptanceShipmentItem> shipmentItem;
	
	private Integer part;
	
	public FAcceptanceShipment(){
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FAcceptanceShipment)) { return false; }
		if (this == obj) { return true; }
		FAcceptanceShipment rhs = (FAcceptanceShipment) obj;
		return new EqualsBuilder().append(this.acc_header_id, rhs.getAcc_header_id()).append(this.ap_3lc, rhs.getAp_3lc()).isEquals();
	}
	
	public Long getAcc_shipment_id() {
		return acc_shipment_id;
	}
	
	public void setAcc_shipment_id(Long acc_shipment_id) {
		this.acc_shipment_id = acc_shipment_id;
	}
	
	public FAcceptanceHeader getAcc_header_id() {
		return acc_header_id;
	}
	
	public void setAcc_header_id(FAcceptanceHeader acc_header_id) {
		this.acc_header_id = acc_header_id;
	}
	
	public RSAp getAp_3lc() {
		return ap_3lc;
	}
	
	public void setAp_3lc(RSAp ap_3lc) {
		this.ap_3lc = ap_3lc;
	}
	
	public Integer getCon_add_id() {
		return con_add_id;
	}
	
	public void setCon_add_id(Integer con_add_id) {
		this.con_add_id = con_add_id;
	}
	
	public Integer getAwb_acc_flag() {
		return awb_acc_flag;
	}
	
	public RSState getState_id() {
		return state_id;
	}

	public void setState_id(RSState state_id) {
		this.state_id = state_id;
	}

	public String getStat_descr() {
		return stat_descr;
	}

	public void setStat_descr(String stat_descr) {
		this.stat_descr = stat_descr;
	}

	public void setAwb_acc_flag(Integer awb_acc_flag) {
		this.awb_acc_flag = awb_acc_flag;
	}
	
	public Set<FAcceptanceShipmentItem> getShipmentItem() {
		return shipmentItem;
	}
	
	public void setShipmentItem(Set<FAcceptanceShipmentItem> shipmentItem) {
		this.shipmentItem = shipmentItem;
	}

	public Integer getPart()
	{
		return part;
	}

	public void setPart(Integer part)
	{
		this.part = part;
	} 
	
}
