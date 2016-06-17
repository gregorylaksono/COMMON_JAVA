package de.act.common.types.packageitems;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.PackageState;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSPkg;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemSLI extends AbstractSubItem implements Serializable {
	/**
	 * @author Martin Sachs
	 * @since 02.03.2006
	 */
	private static final long serialVersionUID = 1008542468651844179L;
	private RSPkg kindPkg = new RSPkg();
	private RSAnn annotation;
	private Set<PackageState> pkgStates;

	public ItemSLI() {
		super(FormularType.SLI_ITEM);
		pkgStates = new LinkedHashSet<PackageState>();
	}

	public ItemSLI(ItemSLI itemPKG) {
		super(itemPKG);
		annotation = itemPKG.annotation;
		kindPkg = itemPKG.kindPkg;
		pkgStates = new LinkedHashSet<PackageState>();
	}

	public ItemSLI(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
	}

	public RSPkg getKindPkg() {
		return kindPkg;
	}
	
	public void setKindPkg(RSPkg kindPkg) {
		this.kindPkg = kindPkg;
	}

	public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}

	public Set<PackageState> getPkgStates() {
		return pkgStates;
	}

	public void setPkgStates(Set<PackageState> pkgStates) {
		this.pkgStates = pkgStates;
	}
}
