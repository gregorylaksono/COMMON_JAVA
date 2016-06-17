package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CBkgItemAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = 1340374540879384319L;

	public CBkgItemAttachment() {
		super(FormularType.BKG_ITEM);
	}

	public CBkgItemAttachment(String fid, Integer addId) {
		super(fid,addId,FormularType.BKG_ITEM);
	}
}
