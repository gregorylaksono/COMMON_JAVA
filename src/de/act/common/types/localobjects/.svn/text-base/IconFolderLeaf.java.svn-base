/**
 * @author Martin Sachs
 * @since 23.02.2006
 */
package de.act.common.types.localobjects;
import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestData;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.ULDObject;

/**
 * @author Martin Sachs
 * @since 24.04.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class IconFolderLeaf implements Serializable {

	private static final long serialVersionUID = -6562181526727063333L;
	private Long id = -1L;
	private RFForm form;
	private ULDObject uld;
	private Shipments shipments;
	private AManifestData manifest;
	private IconFolder icon = null;

	public IconFolderLeaf() {
		
	}

	public IconFolderLeaf(RFForm form2) {
		this.form = form2;
	}

	public IconFolderLeaf(Shipments form2) {
		this.shipments = form2;
	}

	public IconFolderLeaf(AManifestData form2) {
		this.manifest = form2;
	}

	public IconFolderLeaf(ULDObject uld2) {
		this.uld = uld2;
	}

	public  Shipments getShipments() {
		return shipments;
	}

	public  void setShipments(Shipments acceptanceItem) {
		this.shipments = acceptanceItem;
	}

	public RFForm getForm() {
		return form;
	}

	public void setForm(RFForm form) {
		this.form = form;
	}

	public AManifestData getManifest() {
		return manifest;
	}

	public void setManifest(AManifest manifest) {
		this.manifest = manifest;
	}

	public ULDObject getUld() {
		return uld;
	}

	public void setUld(ULDObject uld) {
		this.uld = uld;
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj instanceof IconFolderLeaf) {
			IconFolderLeaf o = (IconFolderLeaf) obj;
			return new EqualsBuilder().append(this.icon, o.icon).append(this.shipments, o.shipments).append(this.manifest, o.manifest).append(this.uld, o.uld).append(this.form, o.form).isEquals();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.shipments).append(this.form).append(this.manifest).append(this.uld).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.shipments != null) {
			return this.shipments.toString();
		} 
		else if (this.manifest != null) {
			return this.manifest.toString();
		} 
		else if (this.form != null) {
			return this.form.toString();
		} 
		else if (this.uld != null) {
			return this.uld.toString();
		}
		else return "no attachemt";
	}

	public IconFolder getIcon() {
		return icon;
	}

	public void setIcon(IconFolder icon) {
		this.icon = icon;
		this.id = icon.getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
