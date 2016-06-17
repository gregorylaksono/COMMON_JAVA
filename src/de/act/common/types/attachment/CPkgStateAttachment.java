package de.act.common.types.attachment;

import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CPkgStateAttachment extends CAbstractAttachment {
    
	private static final long serialVersionUID = -2251128806329352439L;

	public CPkgStateAttachment() {
	   super(FormularType.PACKAGE_STATE);
    }

    public CPkgStateAttachment(String fid, Integer addId) {
	   super(fid,addId,FormularType.PACKAGE_STATE);
    }
}
