/**
 * @file Shipments.java
 * @package de.act.batch.data.forms.manifest
 * @since 30.11.2005 13:53:05
 * @author Martin Sachs
 */
package de.act.common.types.handling;
import java.awt.Color;
import java.io.File;
import java.io.Serializable;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import de.act.common.types.ManifestObject;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemHandlingBKG;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.RSAp;

/**
 * Shipments.java:
 *
 * @since 30.11.2005
 * @author Martin Sachs
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class Shipments extends FAcceptanceItem implements ManifestObject, Serializable {

	private static final long serialVersionUID = 1863574775795274875L;
	private final static Icon icon_ok = new ImageIcon("Images" + File.separator + "ok2-blue.png");
	private final static Icon icon_fail = new ImageIcon("Images" + File.separator + "red_x.png");
	private final static Icon icon_yellow = new ImageIcon("Images" + File.separator + "yellow_o.png");
	
	public enum STATE {
		BOOKED, UNBOOKED, NOTHING
	};
	
	private STATE state = STATE.BOOKED;
	private enum HANDLINGSTATE {
		OK, INCOMPLETE, FAIL
	};
	
	private HANDLINGSTATE handlingState = HANDLINGSTATE.FAIL;
	private boolean remove = true;
	private String loadingAdvice;
	private boolean imported;

	public Shipments() {
		setEmptyShipment();
	}

	public Shipments(FAcceptanceItem a) {
		super(a);
	}

	public Shipments(ItemPKG p) {
		super(p);
	}

	public Shipments(Shipments p) {
		super(p);
	}

	public Shipments(ItemBKG booking) {
		super(booking);
	}

	public Shipments(ItemBKG bkgItem, Storage sto) {
		super(bkgItem, sto);
	}

	public Shipments(ItemHandlingBKG bkgItem) {
		super(bkgItem);
	}

	public Shipments(ItemHandlingBKG bkgItem, Storage sto) {
		super(bkgItem, sto);
	}

	public Icon getImage() {
		switch(handlingState){
		case OK:
			return icon_ok;
		case INCOMPLETE:
			return icon_yellow;
		default:
			return (STATE.NOTHING == state ? null : icon_fail);
		}
	}

	public void setHandlingOK() {
		handlingState = HANDLINGSTATE.OK;
	}

	public void setHandlingFAIL() {
		handlingState = HANDLINGSTATE.FAIL;
	}

	public void setHandlingINCOMPLETE() {
		handlingState = HANDLINGSTATE.INCOMPLETE;
	}

	public Color getColor() {
		if (state == STATE.NOTHING) return ManifestObject.NOTHING;
		if (this.getUld_id() != null){
			if (this.getUld_id().isType()){
				return ManifestObject.ULD_SHP_COLOR;
			}
			else{
				return ManifestObject.ULD_TYPE_SHP;
			}
		}
		return ManifestObject.BULK_COLOR;
	}

	public void setColor(Color col) {
		
	}

	private void setEmptyShipment() {
		state = STATE.NOTHING;
	}

	public void setStateBooked() {
		state = STATE.BOOKED;
	}

	public void setStateUnbooked() {
		this.state = STATE.UNBOOKED;
	}

	/**
	 * @return Returns the awbPrefix.
	 */
	 public String getAwbPrefix() {
		if (this.getAcceptance() != null){
			RFAwbNo awb = this.getAcceptance().getAwbNumber();
			if (awb != null){
				return awb.getCa_3dg();
			}
		}
		return "UNK";
	 }

	 /**
	  * @return Returns the awbSerial.
	  */
	 public String getAwbSerial() {
		 if (this.getAcceptance() != null){
			 RFAwbNo awb = this.getAcceptance().getAwbNumber();
			 if (awb != null){
				 return "" + awb.getAwb_stock() + awb.getAwb_no() + "";
			 }
		 }
		 if (this.getAcceptance() != null && this.getAcceptance().getMetadata() != null){
			 return this.getAcceptance().getMetadata().getF_id();
		 }
		 return "";
	 }

	 public String getComment1() {
		 return "";
	 }

	 public String getComment2() {
		 return "";
	 }

	 public void setBulk(boolean booked) {
		 if (booked){
			 // color = ManifestObject.BOOKEDBULK;
			 state = STATE.BOOKED;
		 }
		 else{
			 // color = ManifestObject.UNBOOKEDBULK;
			 state = STATE.UNBOOKED;
		 }
	 }

	 public boolean isBooked() {
		 return (this.state == STATE.BOOKED ? true : false);
	 }

	 public void setCanRemove(boolean b) {
		 this.remove = b;
	 }

	 public boolean canRemove() {
		 boolean ret = remove;
		 remove = true;
		 return ret;
	 }

	 /*
	  * 05.12.2005
	  *
	  * @see de.act.batch.data.forms.manifest.ManifestObject#isInvalid()
	  */
	 public ManifestObject ifInvalidGetRoot() {
		 if (getUld_id() != null && getUld_id() != null && this.state == STATE.NOTHING){
			 return getUld_id();
		 }
		 return this;
	 }

	 public boolean isNothing() {
		 return state == STATE.NOTHING;
	 }

	 /*
	  * 04.01.2006
	  *
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
		 String ret = "";/* this.getAwbPrefix()+"-"+this.getAwbSerial() */;
		 ret += super.toString();
		 if (ret == null || ret.length() == 0){
			 ret += this.getClass().toString();
		 }
		 return ret;
	 }

	 public HANDLINGSTATE getHandlingState() {
		 return handlingState;
	 }

	 public void setHandlingState(HANDLINGSTATE handlingState) {
		 this.handlingState = handlingState;
	 }

	 public String getLoadingAdvice() {
		 return loadingAdvice;
	 }

	 public void setLoadingAdvice(String loadingAdvice) {
		 this.loadingAdvice = loadingAdvice;
	 }

	 public STATE getState() {
		 return state;
	 }

	 public void setState(STATE state) {
		 this.state = state;
	 }

	 public RSAp getOrigin() {
		 if (this.getAcceptance() != null){
			 return this.getAcceptance().getAp_dept();
		 }
		 return null;
	 }

	 public RSAp getDestination() {
		 if (this.getAcceptance() != null){
			 return this.getAcceptance().getAp_dest();
		 }
		 return null;
	 }

	 /*
	  * (non-Javadoc)
	  *
	  * @see de.act.common.types.ManifestObject#isImport()
	  */
	 public boolean isImport() {
		 return imported;
	 }

	 /*
	  * (non-Javadoc)
	  *
	  * @see de.act.common.types.ManifestObject#setImport(boolean)
	  */
	 public void setImport(boolean isimport) {
		 imported = isimport;
	 }
}
