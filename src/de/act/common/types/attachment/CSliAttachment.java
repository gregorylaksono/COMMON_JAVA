package de.act.common.types.attachment;
import de.act.common.types.formulars.FormularError;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.RFAdd;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CSliAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = 9019970481053096621L;

	public CSliAttachment() {
		super(FormularType.SLI);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.attachment.CAbstractAttachment#checkMandetoryFields()
	 */
	@Override
	public boolean checkMandetoryFields() {
		boolean ret = super.checkMandetoryFields();
		RFAdd add = this.getAddresses();
		boolean valid = true;
		if (add != null){
			if (this.getSign()==null || this.getSign().length()==0) {
				valid =false;
				this.errorList.add(new FormularError(10, "Missing Signature", 5, "Signature", FormularType.SLI));
			}
		}
		else{
			valid = false;
		}
		return ret && valid;
	}
}
