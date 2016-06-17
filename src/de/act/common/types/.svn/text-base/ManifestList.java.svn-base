package de.act.common.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.RSUld;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class ManifestList implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 23.01.2006
	 */
	private static final long serialVersionUID = 7768977534221446099L;
	private List<RSUld> uldType = new ArrayList<RSUld>();
	private List<ULDObject> uldCargo = new ArrayList<ULDObject>();
	private List<ManifestObject> bulkCargo = new ArrayList<ManifestObject>();
	private AManifest manifest;
	// loadinglistItem -> bkgitems (could be assigned to ulds or location)
	// manifestitems -> acceptedItems (could be assigned to ulds or location)
	// -> empty ULDs
	// additional informations ?

	public List<ULDObject> getULDCargo() {
		return this.uldCargo;
	}

	public void setCargo(final List<ULDObject> cargo) {
		this.uldCargo.clear();
		for (final ULDObject c:cargo){
			this.addCargo(c);
		}
	}

	public int getCargoCount() {
		int count =0;
		// shipments count + count of ulds
		final int shpuldcount= this.getUldShpsCount();
		final int uldcount = this.getUldCount();
		final int uldtypecount = this.getUldTypeCount();
		final int bulkcount = this.bulkCargo!=null?this.bulkCargo.size():0;
		count = bulkcount+shpuldcount+uldcount+uldtypecount;
		return count;
	}

	public  int getUldTypeCount() {
		if (this.uldType==null){
			return 0;
		}
		return this.uldType.size();
	}

	public int getUldCount() {
		int uldOpen =0;
		if (this.uldType!=null) {
			for (final RSUld o:this.uldType) {
				if (o.isOpen()) {
					uldOpen+= o.ulds.size();
				}
			}
		}
		return this.uldCargo.size()+uldOpen;
	}

	public ManifestObject getCargoObject(final int rowIndex) {
		int rowcount =0;
		final int uldcount = this.getUldCount();
		final int uldshpcount =this.getUldShpsCount();
		final int bulkCount = this.bulkCargo.size();
		final int uldTypeCount = this.uldType.size();
		if (uldcount+uldshpcount+bulkCount+uldTypeCount ==0 ) {
			return null;
		}
		for(final ULDObject uld: this.uldCargo) {
			if (rowIndex == rowcount) {
				return uld;
			}
			rowcount++;

			//            final List<ManifestObject> shps = uld.getShippments();
			//            for (final ManifestObject shp: shps) {
			//                if (rowIndex == rowcount) {
			//                    if (shp instanceof Shipments) {
			//                        ((Shipments)shp).setUld_id(uld);
			//                    }
			//                    return shp;
			//                }
			//                rowcount++;
			//            }
		}
		if (rowIndex-uldshpcount-uldcount>=0 && bulkCount>0) {
			final ManifestObject sh =this.bulkCargo.get(rowIndex-uldshpcount-uldcount);
			//          sh.setList(bulkCargo);
			return sh;
		}
		else {
			if (uldTypeCount>0) {
				// ULDTypeObject ob =
				// this.uldType.get(rowIndex-uldshpcount-uldcount-bulkCount);
				for (final RSUld o: this.uldType) {
					if (rowIndex == rowcount) {
						return o;
					}
					rowcount++;

					if (o.isOpen()) {
						for (final ULDObject uld:o.ulds) {
							if (rowIndex == rowcount) {
								return uld;
							}
							rowcount++;
						}
					}
				}
			}
			else {
				assert rowIndex-uldshpcount-uldcount<0;
				return null;
			}
		}
		return null;
	}
	/**
	 * @return
	 */
	public int getUldShpsCount() {
		if (this.uldCargo==null) {
			return 0;
		}
		final int uldcount = this.uldCargo.size();
		int shippmentscount = 0;
		if (uldcount>0) {
			for(final ULDObject uld: this.uldCargo) {
				shippmentscount += uld.getShippmentsCount();
			}
		}
		return shippmentscount;
	}
	public void setShipments(final List<ManifestObject> shp) {
		this.bulkCargo.clear();

		for (final ManifestObject c:shp){
			this.addShipments(c);
		}
		//      this.bulkCargo = shp;
	}

	public List<ManifestObject> getShipments() {
		return this.bulkCargo ;
	}

	public boolean isAllULDTypeAssigned() {
		boolean ret=true;

		for (final ULDObject uld : this.uldCargo) {
			if (uld.isType==true) {
				ret = false;
				break;
			}
		}
		return ret;
	}

	public void addCargo(final ULDObject object) {
		if (this.uldCargo == null) {
			this.uldCargo = new ArrayList<ULDObject>();

		}
		else {
			if (!this.uldCargo.contains(object)) {
				this.uldCargo.add(object);
			}
			//          removeStorageFromULD(object);
		}
	}

	public void addShipments(final ManifestObject c) {
		if (c instanceof Shipments) {
			ManifestObject found =null;
			for (final ULDObject uld: this.uldCargo) {
				for (final ManifestObject s: uld.getShippments()) {
					if (s instanceof ItemBKG) {
						final ItemBKG bkg = (ItemBKG) s;
						final String  fid =bkg.getMetadata().getF_id();
						final Shipments cs = (Shipments) c;
						final String fidAcc = cs.getAcceptance().getMetadata().getF_id();
						if (fid.equals(fidAcc)) {
							found = s;
							break;
						}
					}
				}
				if (found!=null) {
					if (uld.removeShipment(found)) {
						//uld.addShipment(c);
					}
				}
			}
			if (found==null) {
				found = null;
				for(final ManifestObject s: this.bulkCargo) {
					if (s instanceof ItemBKG) {
						final ItemBKG bkg = (ItemBKG) s;
						final String  fid =bkg.getMetadata().getF_id();
						final Shipments cs = (Shipments) c;
						final String fidAcc = cs.getAcceptance().getMetadata().getF_id();
						if (fid.equals(fidAcc)) {
							found = s;
							break;
						}
					}
				}
			}
			if (found!=null) {
				if (this.bulkCargo.remove(found)) {
					this.bulkCargo.add(c);
				}
			}
			else {
				if (this.bulkCargo == null) {
					this.bulkCargo = new ArrayList<ManifestObject>();
				}
				{ //HENRY what is this, else statement or just surrounding a set of code group??
					if (!this.bulkCargo.contains(c)) {
						this.bulkCargo.add(c);
					}
				}
			}
		}
		else {
			if (this.bulkCargo == null) {
				this.bulkCargo = new ArrayList<ManifestObject>();
			}
			{ //HENRY what is this, else statement or just surrounding a set of code group??
				if (!this.bulkCargo.contains(c)) {
					this.bulkCargo.add(c);
				}
			}
			//          removeStorageFromShipment(shipments);
		}
	}
	//  /**
	//  * @author Martin Sachs
	//  * @since 16.01.2006
	//  */
	//  private void removeStorageFromShipment(Shipments shipments) {
	//  if (shipments!=null && shipments.getAccItem()!=null) {

	//  Storage sto =shipments.getAccItem().getStorage();
	//  sto.removeStorage(shipments.getAccItem());
	//  shipments.getAccItem().setStorage(null);
	//  expapp.storeLocation(sto);

	//  }
	//  }

	public void removeCargo(final ULDObject object) {
		if (this.uldCargo!=null) {
			this.uldCargo.remove(object);
		}
	}

	public void removeShipments(final Shipments shipments) {
		if (this.bulkCargo!=null) {
			this.bulkCargo.remove(shipments);
		}
	}

	public void addCargoBefore(final ULDObject mani, final ULDObject object) {
		// if (!uldCargo.contains(object)) {
		int count= 0;
		for (final ULDObject u: this.uldCargo) {
			if (u == mani) {
				break;
			}
			count++;
		}
		if (!this.uldCargo.contains(object)) {
			this.uldCargo.add(count, object);
		}
		//      removeStorageFromULD(object);
		//      }
	}

	//  /**
	//  * @author Martin Sachs
	//  * @since 16.01.2006
	//  * @param object
	//  */
	//  private void removeStorageFromULD(ULDObject object) {
	//  if (object!=null && object.getStorage()!=null) {
	//  object.getStorage().removeStorage(object);
	//  expapp.deleteLocationULD(object.getStorage());
	//  object.setStorage(null);
	//  }
	//  }

	public void removeManifestObject(final ManifestObject object) {
		{//HENRY I think it just a technique for surrounding a group of code
			final ManifestObject uld =  object;
			while (this.uldCargo.contains(object)) {
				this.uldCargo.remove(object);
			}
			if (uld instanceof ULDObject){
				if (this.uldType!=null){
					for (final RSUld typ:this.uldType) {
						while (typ.ulds.contains(uld)) {

							typ.removeUld((ULDObject) uld);
						}
					}
				}
			}
			for (final ULDObject u:this.uldCargo) {
				//                final List<ManifestObject> shps = u.getShippments();
				//                while (shps.contains(object)) {
				//                    shps.remove(object);
				//                }
			}
		}
		
		if (object instanceof Shipments) {
			final Shipments shp = (Shipments) object;
			if (shp.getUld_id()!=null && shp.getUld_id()!=null) {
				shp.getUld_id().removeShipment(shp);
			}
			if (this.bulkCargo!=null) {
				this.bulkCargo.remove(object);
			}
		}
		if (object instanceof ItemBKG) {
			final ItemBKG shp = ( ItemBKG) object;
			if (shp.getUld()!=null && shp.getUld()!=null) {
				shp.getUld().removeShipment(shp);
			}
			if (this.bulkCargo!=null) {
				this.bulkCargo.remove(object);
			}
		}
	}

	public Object getCargoObjectImage(final int index) {
		final ManifestObject obj= this.getCargoObject(index);
		final Icon img = obj.getImage();
		return img;
	}

	public void setULDType(final List<RSUld> uld) {
		this.uldType = uld;
	}

	public List<RSUld> getULDType() {
		return this.uldType;
	}
	
	public void clearULDCargo() {
		if (this.uldType!=null){
			this.uldType.clear();
		}
		this.uldCargo.clear();

	}
	/**
	 * Exchange the old object with a new one und copy all shipmentdata to the
	 * new one
	 *
	 * @param manifestObj
	 * @param object
	 */
	public void addRemove(final ULDObject manifestObj, final ULDObject object) {
		int count= 0;
		for (final ULDObject u: this.uldCargo) {
			if (u == manifestObj) {
				break;
			}
			count++;
		}
		if (!this.uldCargo.contains(object)) {
			object.setShippments(manifestObj.getShippments());
			this.uldCargo.remove(count);
			this.uldCargo.add(count, object);
		}
	}

	public Integer getShipmentsCount() {
		return this.bulkCargo.size();
	}

	public Integer getTotalPackages() {
		int counter = 0;
		for (final ManifestObject s:this.bulkCargo) {
			counter += s.getPcs();
		}
		for (final ULDObject uld:this.uldCargo) {
			for (final ManifestObject s:uld.getShippments()) {
				counter += s.getPcs();
			}
		}
		if (this.uldType!=null){
			for (final RSUld uldtype:this.uldType) {
				for (final ULDObject uld:uldtype.ulds) {
					for (final ManifestObject s:uld.getShippments()) {
						counter += s.getPcs();
					}
				}
			}
		}
		return counter;
	}

	public Double getTotalWgt() {
		Double counter = 0.0;
		for (final ManifestObject s:this.bulkCargo) {
			counter += s.getWgt();
		}
		for (final ULDObject uld:this.uldCargo) {
			for (final ManifestObject s:uld.getShippments()) {
				counter += s.getWgt();
			}
		}
		if (this.uldType!=null){
			for (final RSUld uldtype:this.uldType) {
				for (final ULDObject uld:uldtype.ulds) {
					for (final ManifestObject s:uld.getShippments()) {
						counter += s.getWgt();
					}
				}
			}
		}
		return counter;
	}

	public AManifest getManifest() {
		return this.manifest;
	}

	public void setManifest(final AManifest manifest) {
		this.manifest = manifest;
	}
}
