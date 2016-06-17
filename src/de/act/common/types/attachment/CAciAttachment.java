package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CAciAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = 6215842225647936609L;

	public CAciAttachment() {
		super(FormularType.ACOUNING_INFORMATION);
	}

	public CAciAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.ACOUNING_INFORMATION);
	}
}
