package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CAviItemAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = -941326445648449881L;

	public CAviItemAttachment() {
		super(FormularType.AVI_ITEM);
	}

	public CAviItemAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.AVI_ITEM);
	}
}
