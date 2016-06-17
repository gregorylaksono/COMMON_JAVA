package de.act.common.types.agent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import de.act.central.types.Addresses;
import de.act.central.types.Attachment;
import de.act.central.types.Attachment2;
import de.act.central.types.BookingFlight;
import de.act.central.types.FormularInformation;
import de.act.central.types.Manifest;
import de.act.central.types.PackageItemBKG;
import de.act.central.types.Routing;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.RFForm;

/**
 * @author Martin Sachs
 * @since 1.0 - 07.11.2006
 */
public class ContentData implements Serializable, Cloneable {

	private static final long serialVersionUID = 1549915674277392418L;
	private RFForm form;
	private List<Attachment> attachments;
	private List<Attachment2> attachments2;
	private Manifest manifest;
	private FormularInformation formularInformations;

	public final FormularInformation getFormularInformations() {
		return formularInformations;
	}

	public final void setFormularInformations(FormularInformation formularInformations) {
		this.formularInformations = formularInformations;
	}

	public ContentData(FormularInformation form) {
		super();
		this.formularInformations = form;
	}

	public ContentData(RFForm form) {
		super();
		this.form = form;
	}

	public ContentData(Manifest manifest) {
		super();
		this.manifest = manifest;
	}

	public ContentData(RFForm form, List<Attachment> attachments, Manifest manifest, FormularInformation formularInformations) {
		super();
		this.form = form;
		this.attachments = attachments;
		this.manifest = manifest;
		this.formularInformations = formularInformations;
	}

	public final List<Attachment> getAttachments() {
		return attachments;
	}

	public final void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<Attachment2> getAttachments2() {
		return attachments2;
	}

	public void setAttachments2(List<Attachment2> attachments2) {
		this.attachments2 = attachments2;
	}

	public final RFForm getForm() {
		return form;
	}

	public final void setForm(RFForm form) {
		this.form = form;
	}

	public final Manifest getManifest() {
		return manifest;
	}

	public final void setManifest(Manifest manifest) {
		this.manifest = manifest;
	}

	public Integer getAgent() {
		Attachment a = getAttachmentfor(FormularType.ADDRESS);
		if (a!=null) {
			Set<Addresses> adds = a.getFAdds();
			if(adds!=null && adds.size()>0) {
				Addresses add = adds.iterator().next();
				return add.getFfwAddId();
			}
		}
		return null;
	}

	private Attachment getAttachmentfor(FormularType address) {
		for (Attachment a:this.attachments) {
			if (a!=null && a.getAttType().equals(address.getConstaint())){
				return a;
			}
		}
		return null;
	}

	private Attachment getLastAttachment(FormularType address) {
		List<Attachment> listSameAttachment = new ArrayList<Attachment>();
		for (Attachment a:this.attachments) {
			if (a!=null && a.getAttType().equals(address.getConstaint())){
				listSameAttachment.add(a);
			}
		}
		if (listSameAttachment.size() > 0){
			Collections.sort(listSameAttachment, new Comparator<Attachment>(){
				public int compare(Attachment o1, Attachment o2) {
					return o1.getAttNo().compareTo(o2.getAttNo());
				}  
			});
			return listSameAttachment.get(listSameAttachment.size() - 1);
		}
		return null;
	}

	public Integer getConsignee() {
		Attachment a = getAttachmentfor(FormularType.ADDRESS);
		if (a!=null) {
			Set<Addresses> adds = a.getFAdds();
			if(adds!=null && adds.size()>0) {
				Addresses add = adds.iterator().next();
				return add.getConAddId();
			}
		}
		return null;
	}

	public Integer getShipper() {
		Attachment a = getAttachmentfor(FormularType.ADDRESS);
		if (a!=null) {
			Set<Addresses> adds = a.getFAdds();
			if(adds!=null && adds.size()>0) {
				Addresses add = adds.iterator().next();
				return add.getShpAddId();
			}
		}
		return null;
	}

	public List<String> getRouting() {
		Attachment a = getAttachmentfor(FormularType.ROUTING);
		if (a!=null) {
			List<String> list = new ArrayList<String>();
			Set<Routing> rt = a.getFRts();
			if (rt!=null) {
				for(Routing r:rt){
					list.add(r.getAp3lc());
				}
				return list;
			}
		}
		return null;
	}

	public PackageItemBKG getBookingItem() {
		Attachment a = getAttachmentfor(FormularType.PACKAGE);
		if (a!=null) {
			Set<PackageItemBKG> items = a.getFBkgItems();
			if (items!=null) {
				return items.iterator().next();
			}
		}
		return null;
	}
	
	public Set<PackageItemBKG> getSetBookingItem() {
		Attachment a = getAttachmentfor(FormularType.PACKAGE);
		if (a!=null) {
			Set<PackageItemBKG> items = a.getFBkgItems();
			if (items!=null) {
				return items;
			}
		}
		return null;
	}

	public Set<BookingFlight> getFBkgFlts() {
		Attachment a = getAttachmentfor(FormularType.BKG_FLIGHT);
		if (a!=null) {
			Set<BookingFlight> items = a.getFBkgFlts();
			return items;
		}
		return null;
	}

	public Set<BookingFlight> getLastFBkgFlts() {
		Attachment listLastAttachment = getLastAttachment(FormularType.BKG_FLIGHT);
		Set<BookingFlight> items;
		if (listLastAttachment != null) {
			items = listLastAttachment.getFBkgFlts();
			return items;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		RFForm form_clone = null;
		List<Attachment> attachments_clone= null;
		Manifest manifest_clone= null;
		FormularInformation formularInformations_clone= null;
		if (form!=null )
			form_clone = form; // dont need to clone, 'cause this is the orginal version from sender
		if (manifest!=null )
			manifest_clone = (Manifest) manifest; // TODO: Later, if manifest must change from box to box
		if (formularInformations!=null )
			formularInformations_clone = (FormularInformation) formularInformations.clone();
		if (attachments!=null) {
			attachments_clone = new ArrayList<Attachment>();
			attachments_clone.addAll(attachments);
		}
		ContentData ret = new ContentData(form_clone,attachments_clone,manifest_clone,formularInformations_clone);
		return ret;
	}
}
