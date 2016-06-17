/**
 * @file Storage.java
 * @package de.act.batch.data.forms.warehouse
 * @since 08.12.2005 11:31:46
 * @author Martin Sachs
 */
package de.act.common.types.localobjects;
import java.io.Serializable;

import org.apache.log4j.Logger;

import de.act.common.types.staticobjects.RSAdd;

/**
 * Storage.java:
 *
 * @since 08.12.2005
 * @author Martin Sachs
 *
 * @hibernate.class
 * table="d_storage"
 */
@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class Storage implements Serializable{
	/**
	 * Logger for this class
	 */
	transient private static final Logger log = Logger.getLogger(Storage.class);
	private static final long serialVersionUID = 7469553821925453463L;
	//    private static int instances = 0;
	//    private  Log myLog;
	private Long stor_id= -1L;
	private String stor_name;
	private String stor_type;
	private Storage stor_parent;
	private Long stor_parent_id;
	private Long owner_add_id;
	private RSAdd owner_add;
	private Location loc;

	/**
	 * Childs of Storage in Warehouse
	 */
	//    private List<Storage> childs = new ArrayList<Storage>();
	/**
	 * Set of Assignment of this storage to an AccItem. The AccItem must have
	 * the same list.
	 * TODO: Observer - pattern
	 */
	//private Set<AssignmentStorageAcceptanceItem> ass_items = new HashSet<AssignmentStorageAcceptanceItem>();
	//private Set<AssignmentStorageULD> uldItems = new HashSet<AssignmentStorageULD>();
	
	//private Set<Shipments> accItems = new HashSet<Shipments>();
	//private Set<ULDObject> uldItems = new HashSet<ULDObject>();


	public Storage() {
		//myLog = LogFactory.getLog(Storage.class);
		//myLog.info("new Storage Nr."+instances);
	}

	/**
	 *
	 * @param item
	 *
     */
	//    public void addStorage(Shipments item) {
	//        if (item!=null) {
	//            // remove old storage
	//            this.accItems.add(item);
	//            item.setStorage(this);
	//         }
	//    }
	//
	//    public void addStorage(ULDObject uld) {
	//        if (uld!=null) {
	//            uld.setStorage(this);
	//            this.uldItems.add(uld);
	//        }
	//    }
	//
	//    public synchronized void removeStorage(ULDObject uld) {
	//        if (uld!=null) {
	//            uld.setStorage(null);
	//            this.uldItems.remove(uld);
	//        }
	//    }

	public String toString() {
		return stor_name+(stor_type==null?"":"("+stor_type+")");
	}

	//    /**
	//     */
	//    /**
	//     * @return Returns the childs.
	//     */
	//    public List<Storage> getChilds() {
	//        return childs;
	//    }
	//
	//    /**
	//     */
	//    /**
	//     * @param childs The childs to set.
	//     *
	//     */
	//    public void setChilds(List<Storage> childs) {
	//        this.childs = childs;
	//    }
	
	/**
	 * @return Returns the stor_id.
	 */

	public Long getStor_id() {
		return stor_id;
	}

	/**
	 * @param stor_id The stor_id to set.
	 */
	public void setStor_id(Long stor_id) {
		this.stor_id = stor_id;
	}

	/**
	 * @return Returns the stor_name.
	 */
	public String getStor_name() {
		return stor_name;
	}

	/**
	 * @param stor_name The stor_name to set.
	 */
	public void setStor_name(String stor_name) {
		this.stor_name = stor_name;
	}

	/**
	 * @return Returns the stor_parent.
	 */
	public Storage getStor_parent() {
		return stor_parent;
	}

	/**
	 * @param stor_parent The stor_parent to set.
	 */
	public void setStor_parent(Storage stor_parent) {
		this.stor_parent = stor_parent;
		this.stor_parent_id = stor_parent == null ? null : stor_parent.getStor_id();
	}

	/**
	 * @return Returns the stor_type.
	 */
	public String getStor_type() {
		return stor_type;
	}

	/**
	 * @param stor_type The stor_type to set.
	 */
	public void setStor_type(String stor_type) {
		this.stor_type = stor_type;
	}

	
	//    /**
	//     * @param accItems
	//     */
	//    public void addStorage(List<Shipments> accItems) {
	//        for(Shipments a: accItems) {
	//            //a.acceptance.awbPrefix=(acc.awbPrefix);
	//            //a.acceptance.awbSerial=(acc.awbSerial);
	////            a.acceptance.awbNos.add(a.acceptance.awbNumber);
	////            for (FContent f : a.fcontent) {
	////                Shipments shp = new Shipments();
	////
	////                shp.setBooking(f.bkgRequest);
	////                shp.setContent(f);
	////                shp.setULD(null);
	////                this.addStorage(shp);
	////            }
	//            this.addStorage(a);
	//        }
	//    }
	/**
	 * @param accItems
	 */
	//    public void addStorage(Set<Shipments> accItems) {
	//        for(Shipments a: accItems) {
	////            a.acceptance.awbNos.add(a.acceptance.awbNumber);
	//            this.addStorage(a);
	//        }
	//    }


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
	//
	//    /**
	//     * @author Martin Sachs
	//     * @since 04.01.2006
	//     * @param uldItems The uldItems to set.
	//     */
	//    public void setUldItems(Set<AssignmentStorageULD> uldItems) {
	//        this.uldItems = uldItems;
	//    }
	//
	//	/**
	//	 * @author Martin Sachs
	//	 * @since 06.01.2006
	//	 * @param shipments
	//	 */
	//	public synchronized void removeStorage(Shipments shipments) {
	//
	//    		try {
	//                AbstractItem remove= null;
	//                for (AbstractItem a: this.accItems) {
	//                    if (a.equals(shipments)) {
	//                        remove =a;
	//                    }
	//                }
	//                if (this.accItems.remove(remove)) {
	//
	//                }else {
	//
	//                    log.error("error at removeStorage" );
	//                }
	//            } catch (RuntimeException e) {
	//                log.error("Exception at removeStorage: "+" ",e );
	//            }
	//	}

	public Long getOwner_add_id()
	{
		return owner_add_id;
	}

	public void setOwner_add_id(Long owner_add_id)
	{
		this.owner_add_id = owner_add_id;
	}

	public RSAdd getOwner_add()
	{
		return owner_add;
	}

	public void setOwner_add(RSAdd owner_add)
	{
		this.owner_add = owner_add;
		if(owner_add != null)
			this.owner_add_id = owner_add.getAdd_id().longValue();
	}	

	public Location getLoc()
	{
		return loc;
	}

	public void setLoc(Location loc)
	{
		this.loc = loc;
	}

	public Long getStor_parent_id()
	{
		return stor_parent_id;
	}

	public void setStor_parent_id(Long stor_parent_id)
	{
		this.stor_parent_id = stor_parent_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 06.01.2006
	 * @return
	 */
	//    public int getChildCount() {
	//        return this.childs.size();
	//    }



	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Storage && this.stor_id!=null&& ((Storage)obj).stor_id!=null) {
			return this.stor_id.equals(((Storage)obj).stor_id);
		}
		else return false;
	}

	/**
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (this.stor_id!=null) {
			re += 37 *this.stor_id.hashCode();
			return re;
		}
		else
			return super.hashCode();
	}

	/**
	 * @author Martin Sachs
	 * @since 11.01.2006
	 */
	//    public void clearAssItems() {
	////        myLog.warn("clearing all Accitems !");
	//       this.accItems.clear();
	//    }

	//	/**
	//	 * @autor Admin
	//	 * @since 16.01.2006
	//	 * @return Returns the uldobjectItems.
	//	 */
	//	public Set<ULDObject> getUldobjectItems() {
	//		return uldobjectItems;
	//	}
	//
	//	/**
	//	 * @author Martin Sachs
	//	 * @since 16.01.2006
	//	 * @param uldobjectItems The uldobjectItems to set.
	//	 */
	//	public void setUldobjectItems(Set<ULDObject> uldobjectItems) {
	//		this.uldobjectItems = uldobjectItems;
	//	}

	//    /**
	//     */
	//    /**
	//     *
	//     * @author Martin Sachs
	//     * @since 16.01.2006
	//     * @return Returns the accItems.
	//     */
	//    public Set<Shipments> getAccItems() {
	//        return accItems;
	//    }
	//
	//    /**
	//     */
	//    /**
	//     * @author Martin Sachs
	//     * @since 16.01.2006
	//     * @param accItems The accItems to set.
	//     */
	//    public void setAccItems(Set<Shipments> accItems) {
	//        this.accItems = accItems;
	//    }
	//
	//    /**
	//     */
	//    /**
	//     *
	//     * @author Martin Sachs
	//     * @since 17.01.2006
	//     * @return Returns the uldItems.
	//     */
	//    public Set<ULDObject> getUldItems() {
	//        return uldItems;
	//    }
	//
	//    /**
	//     */
	//    /**
	//     * @author Martin Sachs
	//     * @since 17.01.2006
	//     * @param uldItems The uldItems to set.
	//     */
	//    public void setUldItems(Set<ULDObject> uldItems) {
	//        this.uldItems = uldItems;
	//    }

	//    /**
	//     *
	//     * @author Martin Sachs
	//     * @since 17.01.2006
	//     * @return Returns the uldItems.
	//     */
	//    public Set<AssignmentStorageULD> getUldItems() {
	//        return uldItems;
	//    }
	//
	//    /**
	//     * @author Martin Sachs
	//     * @since 17.01.2006
	//     * @param uldItems The uldItems to set.
	//     */
	//    public void setUldItems(Set<AssignmentStorageULD> uldItems) {
	//        this.uldItems = uldItems;
	//    }
}
