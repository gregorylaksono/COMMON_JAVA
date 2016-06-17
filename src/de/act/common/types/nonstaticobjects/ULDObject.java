/**
 * @file ULDObject.java
 * @package de.act.batch.data.forms.manifest
 * @since 30.11.2005 13:43:03
 * @author Martin Sachs
 * @hibernate.class table="a_uld"
 */
package de.act.common.types.nonstaticobjects;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import de.act.common.types.ManifestObject;
import de.act.common.types.handling.Shipments;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSState;
import de.act.common.types.staticobjects.RSUldType;

@org.jboss.cache.aop.annotation.PojoCacheable
public class ULDObject implements ManifestObject, Serializable{

	private static final long serialVersionUID = -3722354286391159277L;
	public Long uld_id;
	public String uld_no;
	public String uld_rem;
	public String uld_prefix;
	public Integer holder_add_id;
	public Integer owner_add_id ;
	public String holder_ap_3lc;
	public Integer isUsed;
	//public Long uld_type_id;
	public Long s_uld_id;
	//public String ca_id;
	//public String discr_id;
	public String ca_id;
	public RSCaConx carrier;
	public Discrepancies discrepancies;
	private Integer discr_id;
	public RSUldType uldType;
	//public Set<RSUldName> uldNames = new HashSet<RSUldName>();
	public RSUldType parent =null;
	private List<Shipments> shippments = new ArrayList<Shipments>();
	private Color color = ManifestObject.BULK_COLOR;
	private boolean remove= true;
	//private Set<Storage> storage = new HashSet<Storage>(1);
	private Storage storage = null;
	//private AssignmentStorageULD storageAssignment = null;
	public boolean isType = false;
	private int count;
	private String loadingAdvice;
	private boolean imported;

	private RSState stat;
	private String stat_id;
	private String stat_descr;
	
	public ULDObject() {
		//Shipments shp = new Shipments();
		color =ULDCOLOR;
		//shippments.add(shp);
	}

	public List<Shipments> getShippments() {
		return shippments;
	}

	public void setShippments(List<Shipments> shp) {
		this.shippments.clear();
		for (Shipments s : shp) {
			if (!containsAccItem(s)){
				this.shippments.add(s);
			}
		}
	}

	private boolean containsAccItem(ManifestObject accItem) {
		for (ManifestObject s : shippments) {
			if (s!=null && s.equals(accItem)){
				return true;
			}
		}
		return false;
	}

	public int getShippmentsCount() {
		return shippments.size();
	}

	/*
	 * 01.12.2005
	 * @see de.act.batch.data.forms.manifest.ManifestObject#getColor()
	 */
	public Color getColor() {
		return color;
	}

	public void setColor(Color col) {
		color = col;
	}

	public void addShipmentAt(int row, Shipments shipments) {
		Shipments empty = null;
		if (this.shippments.size()>0) {
			empty = this.shippments.get(this.shippments.size()-1);
			this.shippments.remove(empty);
		}
		if (empty==null) {
			empty = new Shipments();
		}
		this.shippments.add(row, shipments);
		this.shippments.add(empty);
	}

	public void addShipmentAndEmpty(Shipments shipments) {
		Shipments empty = null;
		if (this.shippments.size()>0) {
			empty = this.shippments.get(this.shippments.size()-1);
			this.shippments.remove(empty);
		}
		if (empty==null) {
			empty = new Shipments();
		}
		this.shippments.add(shipments);
		this.shippments.add(empty);
	}

	public boolean removeShipment(ManifestObject object) {
		int count=0;
		boolean found =false;
		for (ManifestObject s:this.shippments) {
			if (s== object) {
				found = true;
				break;
			}
			count++;
		}
		if (found) this.shippments.remove(count);
		return found;
	}

	public boolean canRemove() {
		boolean ret = remove;
		remove = true;
		return ret;
	}
	
	public void setCanRemove(boolean b) {
		remove = b;
	}

	/*
	 * 05.12.2005
	 * @see de.act.batch.data.forms.manifest.ManifestObject#getImage()
	 */
	public ImageIcon getImage() {
		ImageIcon img = ManifestObject.icon_uld;
		return img;
	}

	/*
	 * 05.12.2005
	 * @see de.act.batch.data.forms.manifest.ManifestObject#isInvalid()
	 */
	public ManifestObject ifInvalidGetRoot() {
		return this;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void decrementCount() {
		count--;
	}

	public void incrementCount() {
		count++;
	}

	public ManifestObject getShippmentsAt(int index) {
		if (index< this.shippments.size())
			return this.shippments.get(index);
		else
			return null;
	}

	//    /**
	//     *
	//     * @author Martin Sachs
	//     * @since 04.01.2006
	//     * @return Returns the uldItems.
	//     */
	//    public Set<AssignmentStorageULD> getUldItems() {
	//        return uldItems;
	//    }
	//
	//    /**
	//     * @author Martin Sachs
	//     * @since 04.01.2006
	//     * @param uldItems The uldItems to set.
	//     */
	//    public void setUldItems(Set<AssignmentStorageULD> uldItems) {
	//        this.uldItems = uldItems;
	//    }

	public void addShipment(Shipments shipments) {
		if (shipments instanceof Shipments) {
			((Shipments)shipments).setUld_id(this);
		}
		if (!this.shippments.contains(shipments)) {
			this.shippments.add(shipments);
		}

	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ULDObject && this.uld_id!=null&& ((ULDObject)obj).uld_id!=null) {
			return this.uld_id.equals(((ULDObject)obj).uld_id);
		}
		else return false;
	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int result = 17;
		if (this.uld_id!=null) {
			result += 37* this.uld_id.hashCode();
			return result;
		}
		else {
			return super.hashCode();
		}
	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.uld_prefix+this.uld_no;
	}

	public void clearShipments() {
		this.shippments.clear();
	}

	public Storage getStorage() {
		return this.storage;
		//        if (storageAssignment!=null)
		//            return storageAssignment.getStorage();
		//        else return null;

		//      if (storage.isEmpty()) {
		//      return null;
		//      }else
		//      return storage.iterator().next();
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public void setLoadingAdvice(String ad) {
		this.loadingAdvice = ad;
	}

	public String getLoadingAdvice() {
		if (this.loadingAdvice!=null)
			return loadingAdvice;
		else
			return "";
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#getPcs()
	 */
	public Integer getPcs() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#getWgt()
	 */
	public Double getWgt() {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isBooked()
	 */
	public boolean isBooked() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isNothing()
	 */
	public boolean isNothing() {
		return false;
	}

	public Integer getOwner_add_id() {
		return owner_add_id;
	}

	public void setOwner_add_id(Integer add_id) {
		this.owner_add_id = add_id;
	}

	public RSCaConx getCarrier() {
		return carrier;
	}

	public void setCarrier(RSCaConx carrier) {
		this.carrier = carrier;
	}

	public Discrepancies getDiscrepancies() {
		return discrepancies;
	}

	public void setDiscrepancies(Discrepancies discrepancies) {
		this.discrepancies = discrepancies;
	}

	public boolean isType() {
		return isType;
	}

	public void setType(boolean isType) {
		this.isType = isType;
	}

	public RSUldType getParent() {
		return parent;
	}

	public void setParent(RSUldType parent) {
		this.parent = parent;
	}

	public Long getUld_id() {
		return uld_id;
	}

	public void setUld_id(Long uld_id) {
		this.uld_id = uld_id;
	}

	public String getUld_no() {
		return uld_no;
	}

	public void setUld_no(String uld_no) {
		this.uld_no = uld_no;
	}

	public String getUld_prefix() {
		return uld_prefix;
	}

	public void setUld_prefix(String uld_prefix) {
		this.uld_prefix = uld_prefix;
	}

	public String getUld_rem() {
		return uld_rem;
	}

	public void setUld_rem(String uld_rem) {
		this.uld_rem = uld_rem;
	}

	public RSUldType getUldType() {
		return uldType;
	}

	public void setUldType(RSUldType uldType) {
		this.uldType = uldType;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isImport()
	 */
	public boolean isImport() {
		return imported;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#setImport(boolean)
	 */
	public void setImport(boolean isimport) {
		imported= isimport;
	}

	public Integer getHolder_add_id() {
		return holder_add_id;
	}

	public void setHolder_add_id(Integer holder_add_id) {
		this.holder_add_id = holder_add_id;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public Long getS_uld_id() {
		return s_uld_id;
	}

	public void setS_uld_id(Long s_uld_id) {
		this.s_uld_id = s_uld_id;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public RSState getStat() {
		return stat;
	}

	public void setStat(RSState stat) {
		this.stat = stat;
	}

	public String getStat_descr() {
		return stat_descr;
	}

	public void setStat_descr(String stat_descr) {
		this.stat_descr = stat_descr;
	}

	public Integer getDiscr_id() {
		return discr_id;
	}

	public void setDiscr_id(Integer discr_id) {
		this.discr_id = discr_id;
	}

	public String getStat_id() {
		return stat_id;
	}

	public void setStat_id(String stat_id) {
		this.stat_id = stat_id;
	}
}


//public ULDObject newInstance() {
//
//      ULDObject uld = new ULDObject();
////    simple copy todo: deep copy of all objects
//           uld.uld_id= uld_id;
//           uld.uld_no= uld_no;
//           uld.uld_rem= uld_rem;
//           uld.uld_prefix= uld_prefix;
//
//           uld.carrier = carrier;
//           uld.discrepancies = discrepancies;
//           uld.uldType = uldType;
//
//           uld.uldNames = uldNames;
//
//
//           uld.shippments = new ArrayList<Shipments>();
//
//           uld.color = ManifestObject.BOOKEDBULK;
//           uld.remove= true;
//
//           uld.isType = isType;
//           uld.count = count;
//
//
//           return uld;
//}
