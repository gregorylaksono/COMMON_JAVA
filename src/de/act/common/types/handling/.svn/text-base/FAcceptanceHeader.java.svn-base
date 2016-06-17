/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.nonstaticobjects.FAcceptanceDiscrepancies;
import de.act.common.types.staticobjects.RSAp;

/**
 * @author Henry
 *
 */
public class FAcceptanceHeader implements Serializable {

	private static final long serialVersionUID = 1992785861735134523L;
	private Long acc_header_id;
	private IAttachment metadata = new CAcceptanceAttachment();
	private Integer awb_acc = 0;
	private Integer part = 0;
	private Integer oldPart = 0;
	private RSAp final_dest;
	private Set<FAcceptanceShipment> shipmentAcceptance;
	private Set<FAcceptanceAWBItem> awbItem;
	private Set<FAcceptanceDiscrepancies> acceptanceDisprecancies;
	
	private Boolean partshipment = false;
	
	public FAcceptanceHeader(){
		super();
	}

	public Long getAcc_header_id() {
		return acc_header_id;
	}

	public void setAcc_header_id(Long acc_header_id) {
		this.acc_header_id = acc_header_id;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	public Integer getAwb_acc() {
		return awb_acc;
	}

	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}

	public RSAp getFinal_dest() {
		return final_dest;
	}

	public void setFinal_dest(RSAp final_dest) {
		this.final_dest = final_dest;
	}

	public Set<FAcceptanceShipment> getShipmentAcceptance() {
		return shipmentAcceptance;
	}

	public void setShipmentAcceptance(Set<FAcceptanceShipment> shipmentAcceptance) {
		this.shipmentAcceptance = shipmentAcceptance;
	}
	
	public void addShipmentAcceptance(FAcceptanceShipment shipmentAcceptance) {
		if (shipmentAcceptance != null){
			if (this.shipmentAcceptance == null){
				this.shipmentAcceptance = new LinkedHashSet<FAcceptanceShipment>();
			}
			if (this.shipmentAcceptance.contains(shipmentAcceptance)){
				this.shipmentAcceptance.remove(shipmentAcceptance);
			}
			this.shipmentAcceptance.add(shipmentAcceptance);
			shipmentAcceptance.setAcc_header_id(this);
		}
	}

	public Set<FAcceptanceAWBItem> getAwbItem() {
		return awbItem;
	}

	public void setAwbItem(Set<FAcceptanceAWBItem> awbItem) {
		this.awbItem = awbItem;
	}

	public Set<FAcceptanceDiscrepancies> getAcceptanceDisprecancies() {
		return acceptanceDisprecancies;
	}

	public void setAcceptanceDisprecancies(Set<FAcceptanceDiscrepancies> acceptanceDisprecancies) {
		this.acceptanceDisprecancies = acceptanceDisprecancies;
	}

	public Integer getPart()
	{
		return part;
	}

	public void setPart(Integer part)
	{
		this.part = part;
	}

	public Boolean getPartshipment()
	{
		if(partshipment == null)
			return false;
		return partshipment;
	}

	public void setPartshipment(Boolean partshipment)
	{
		this.partshipment = partshipment;
	}

	public Integer getOldPart()
	{
		return oldPart;
	}

	public void setOldPart(Integer oldPart)
	{
		this.oldPart = oldPart;
	}
	
}