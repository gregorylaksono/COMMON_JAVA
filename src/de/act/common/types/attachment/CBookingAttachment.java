package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CBookingAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = -1696592998463368161L;

	public CBookingAttachment() {
		super(FormularType.BKG);
	}
}
