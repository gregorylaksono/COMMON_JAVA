package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CNotifyAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = 148269140902019541L;

	public CNotifyAttachment() {
		super(FormularType.NOTIFY);
	}
}
