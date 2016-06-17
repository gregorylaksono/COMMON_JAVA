package de.act.common.types.packageitems;

import java.io.Serializable;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemSAD extends AbstractItem implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 02.03.2006
	 */
	private static final long serialVersionUID = 6949730959156269575L;

    public ItemSAD() {
	   super(FormularType.SAD_ITEM);
    }

    public ItemSAD(CAbstractAttachment metadata) {
	   this();
	   this.setMetadata(metadata);
    }
}
