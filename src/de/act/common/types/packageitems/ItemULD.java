package de.act.common.types.packageitems;

import java.io.Serializable;

import de.act.common.types.nonstaticobjects.ULDObject;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemULD extends AbstractSubItem implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 02.03.2006
	 */
	private static final long serialVersionUID = -8594323209893219376L;
	private ULDObject uldObject;

	public ItemULD(ULDObject object) {
		this.uldObject = object;
	}

	public ULDObject getUldObject() {
		return uldObject;
	}

	public void setUldObject(ULDObject uldObject) {
		this.uldObject = uldObject;
	}
}
