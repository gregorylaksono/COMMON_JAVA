/**
 * @file MetaIcon.java
 * @package de.act.common.types
 * @since 16.02.2006 14:35:08
 * @author Martin Sachs
 */
package de.act.common.types.localobjects;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;

import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestData;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.ULDObject;

/**
 * MetaIcon.java:
 * 
 * @since 16.02.2006
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class IconFolder implements Serializable {

	transient private static final long   	serialVersionUID		= 5376336513084892644L;
	transient public static final Integer 	SLI					= 100;
	transient public static final Integer 	BKG					= 500;
	transient public static final Integer 	DGR					= 200;
	transient public static final Integer 	AVI					= 300;
	transient public static final Integer 	SCH					= 600;
	// transient public static final Integer SAD = 500;
	transient public static final Integer 	MAIL				= 1000;
	transient public static final Integer 	EXP					= 1100;
	transient public static final Integer 	ULD_P1P				= 700;
	transient public static final Integer 	SLI_SEND_TO_CENTRAL	= 101;
	transient public static final Integer 	AWB1				= 400;
	transient public static final Integer 	AWB2				= 401;
	transient public static final Integer 	AWB3				= 402;
	transient public static final Integer 	AWB4				= 403;
	transient public static final Integer 	AWB_MASTER			= 404;
	transient public static final Integer 	WAREHOUSE			= 1200;
	transient public static final Integer 	LOADING				= 1300;
	transient public static final Integer 	MANIFEST			= 1400;
	transient public static final Integer 	INBOX_EMPTY			= 10;
	transient public static final Integer 	INBOX_FULL			= 11;
	transient public static final Integer 	OUTBOX_EMPTY		= 30;
	transient public static final Integer 	OUTBOX_FULL			= 31;
	transient public static final Integer 	FOLDER_EMPTY		= 0;
	transient public static final Integer 	FOLDER_FULL			= 1;
	transient public static final Integer 	WASTE_EMPTY			= 20;
	transient public static final Integer 	WASTE_FULL			= 21;
	transient public static final Integer 	COO					= 1101;
	transient public static final Integer 	SAD					= 1102;
	transient public static final Integer 	AVICHECK			= 1103;
	transient public static final Integer 	NOTOC				= 1104;
	transient public static final Integer 	DELIVERY 			= 1105;
	private Long							id					= -1L;
	private Integer							staticIcon			= 0;
	/*
	 * Icon Position on DesktopPane
	 */
	private Integer						x					= 0;
	private Integer						y					= 0;
	/*
	 * Window position
	 */
	private Integer						windowX				= 0;
	private Integer						windowY				= 0;
	/*
	 * Width and Height of opened Window
	 */
	private Integer						windowW				= 0;
	private Integer						windowH				= 0;
	/*
	 * ChangeDate and createDate
	 */
	private Date							created				= new Date();
	private Date							changed				= new Date();
	private String							name				= new Date().toString();
	private String							type;
	private Integer							image_id;
	// icon data
	private IconFolderLeaf					attachedData		= null;
	private Set<IconFolder>					childs				= new HashSet<IconFolder>();
	private IconFolder						parent				= null;

	public IconFolder() {
		attachedData = new IconFolderLeaf();
		attachedData.setIcon(this);
	}

	public IconFolder(String name, IconFolder parent, String type, Integer image_id, Integer delete, int x, int y, int wh, int ww, int wx, int wy) {
		super();
		staticIcon = delete;
		this.name = name;
		this.parent = parent;
		this.type = type;
		windowH = wh;
		windowW = ww;
		windowX = wx;
		windowY = wy;
		this.x = x;
		this.y = y;
		this.image_id = image_id;
		this.id = -1L;
		this.attachedData = null;
	}

	public IconFolder(RFForm form, String name, IconFolder parent, String type, Integer image_id, Integer delete, int x, int y, int wh, int ww, int wx, int wy) {
		this(name, parent, type, image_id, delete, x, y, wh, ww, wx, wy);
		// if (form != null) {
		this.attachedData = new IconFolderLeaf(form);
		this.attachedData.setIcon(this);
		// } else this.attachedData = null;
	}

	public IconFolder(Shipments form, String name, IconFolder parent, String type, Integer image_id, Integer delete, int x, int y, int wh, int ww, int wx, int wy) {
		this(name, parent, type, image_id, delete, x, y, wh, ww, wx, wy);
		if (form != null) {
			this.attachedData = new IconFolderLeaf(form);
			this.attachedData.setIcon(this);
		} 
		else this.attachedData = null;
	}

	public IconFolder(AManifestData form, String name, IconFolder parent, String type, Integer image_id, Integer delete, int x, int y, int wh, int ww, int wx, int wy) {
		this(name, parent, type, image_id, delete, x, y, wh, ww, wx, wy);
		if (form != null) {
			this.attachedData = new IconFolderLeaf(form);
			this.attachedData.setIcon(this);
		} 
		else this.attachedData = null;
	}

	public IconFolder(ULDObject uld, String name, IconFolder parent, String type, Integer image_id, Integer delete, int x, int y, int wh, int ww, int wx, int wy) {
		this(name, parent, type, image_id, delete, x, y, wh, ww, wx, wy);
		if (uld != null) {
			this.attachedData = new IconFolderLeaf(uld);
			this.attachedData.setIcon(this);
		} 
		else this.attachedData = null;
	}

	public Date getChanged() {
		return changed;
	}

	public void setChanged(Date changed) {
		this.changed = changed;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if (name == null || name.length() == 0) {
			this.name = new Date().toString();
		}
	}

	public int getWindowH() {
		return windowH;
	}

	public void setWindowH(int wh) {
		windowH = wh;
	}

	public int getWindowW() {
		return windowW;
	}

	public void setWindowW(int ww) {
		windowW = ww;
	}

	public int getWindowX() {
		return windowX;
	}

	public void setWindowX(int wx) {
		windowX = wx;
	}

	public int getWindowY() {
		return windowY;
	}

	public void setWindowY(int wy) {
		windowY = wy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStaticIcon() {
		return staticIcon;
	}

	public void setStaticIcon(Integer canDelete) {
		this.staticIcon = canDelete;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * 16.02.2006
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	 @Override
	 public boolean equals(Object obj) {
		 if (obj instanceof IconFolder) { 
			 return new EqualsBuilder().append(this.name, ((IconFolder) obj).name).isEquals()
			 && (this.parent != null && ((IconFolder) obj).parent != null ? this.parent.equals(((IconFolder) obj).parent) : this.parent == null && ((IconFolder) obj).parent == null); 
		 }
		 return false;
	 }

	 /*
	  * 16.02.2006
	  * 
	  * @see java.lang.Object#hashCode()
	  */
	 @Override
	 public int hashCode() {
		 int re = 17;
		 if (id != null && id != 0) {
			 re += 37 * id.hashCode();
		 } 
		 else {
			 if (name == null) { return super.hashCode(); }
			 re += 37 * name.hashCode();
			 if (this.parent != null) re += 37 * this.parent.hashCode();
		 }
		 return re;
	 }

	 /*
	  * 16.02.2006
	  * 
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
		 return name;
	 }

	 public Shipments getShipments() {
		 if (this.attachedData != null)
			 return this.attachedData.getShipments();
		 else return null;
	 }

	 public void setShipments(Shipments acceptanceItem) {
		 this.attachedData = new IconFolderLeaf(acceptanceItem);
	 }

	 public Set<IconFolder> getChilds() {
		 return childs;
	 }

	 public void setChilds(Set<IconFolder> childs) {
		 this.childs = childs;
	 }

	 public RFForm getForm() {
		 if (this.attachedData != null) return this.attachedData.getForm();
		 return null;
	 }

	 public void setForm(RFForm form) {
		 this.attachedData = new IconFolderLeaf(form);
	 }

	 public IconFolder getParent() {
		 return parent;
	 }

	 public void setParent(IconFolder parent) {
		 this.parent = parent;
		 this.parent.addChild(this);
	 }

	 public ULDObject getUld() {
		 if (this.attachedData != null) return this.attachedData.getUld();
		 return null;
	 }

	 public void setUld(ULDObject uld) {
		 this.attachedData = new IconFolderLeaf(uld);
	 }

	 public Integer getImageTyp() {
		 return image_id;
	 }

	 public Integer getImage_id() {
		 return image_id;
	 }

	 public void setImage_id(Integer image_id) {
		 this.image_id = image_id;
		 if (this.attachedData!=null) {
			 RFForm f = this.attachedData.getForm();
			 if (f!=null) {
				 f.setImage_id(image_id);
			 }
		 }
	 }

	 public AManifestData getManifest() {
		 if (this.attachedData != null) return this.attachedData.getManifest();
		 return null;
	 }

	 public void setManifest(AManifest manifest) {
		 this.attachedData = new IconFolderLeaf(manifest);
	 }

	 public void addChild(IconFolder iconFolder) {
		 if (iconFolder != null) {
			 if (this.childs.add(iconFolder)) {
				 iconFolder.setParent(this);
			 }
		 }
	 }

	 public void removeChild(IconFolder iconFolder) {
		 if (this.childs.remove(iconFolder)) {
			 // iconFolder.setParent(null);
		 }
	 }

	 public void setWindowsPostition(Rectangle r) {
		 this.windowH = null;
		 this.windowW = null;
		 this.windowX = null;
		 this.windowY = null;
	 }

	 public IconFolderLeaf getAttachedData() {
		 return attachedData;
	 }

	 public void setAttachedData(IconFolderLeaf attachedData) {
		 this.attachedData = attachedData;
		 if (attachedData != null) attachedData.setIcon(this);
	 }

	 public IconFolder createInstance() {
		 IconFolder d = new IconFolder();
		 return d;
	 }

	 public boolean isIn(String name2) {
		 if (this.childs != null) {
			 for (IconFolder f : this.childs) {
				 if (f.name.equals(name2)) { return true; }
			 }
		 }
		 return false;
	 }

	 public void setFormByMainFormular(IFormularMain mform) {
		 if (mform != null && this.attachedData != null) {
			 RFForm f = mform.getFormularInfo();
			 this.attachedData.setForm(f);
		 }
	 }
}
