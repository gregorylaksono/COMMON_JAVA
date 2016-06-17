package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularError;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.RFAdd;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CAddressAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = -7637822671970898921L;

	public CAddressAttachment() {
		super(FormularType.ADDRESS);
	}

	public CAddressAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.ADDRESS);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.attachment.CAbstractAttachment#checkMandetoryFields()
	 */
	@Override
	public boolean checkMandetoryFields() {
		boolean ret = super.checkMandetoryFields();
		RFAdd add = this.getAddresses();
		boolean valid = true;
		if (add != null){
			if (add.getShipper() == null && add.getShipperOptional() == null){
				valid = false;
				this.errorList.add(new FormularError(10, "Shipper not set", 5, "Addressfield", FormularType.SLI));
			}
			if (add.getAgent() == null && add.getAgentOptional() == null){
				valid = false;
				this.errorList.add(new FormularError(10, "Agent not set", 5, "Addressfield", FormularType.SLI));
			}
			if (add.getConsignee() == null && add.getConsigneeOptional() == null){
				valid = true;
				this.errorList.add(new FormularError(10, "Consignee not set", 5, "Addressfield", FormularType.SLI));
			}
		}
		else{
			valid = false;
		}
		return ret && valid;
	}
}
