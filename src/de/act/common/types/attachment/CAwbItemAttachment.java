package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CAwbItemAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = -2446746402856214169L;

	public CAwbItemAttachment() {
		super(FormularType.AWB_ITEM);
	}

	public CAwbItemAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.AWB_ITEM);
	}
}
