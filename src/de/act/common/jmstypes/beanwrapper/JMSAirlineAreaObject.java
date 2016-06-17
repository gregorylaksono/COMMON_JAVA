/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestItem;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.RSState;
import de.act.common.types.staticobjects.RSUld;
import de.act.common.types.staticobjects.RSUldTypeStock;

/**
 * @author Henry
 *
 */
public class JMSAirlineAreaObject implements Serializable{

	private static final long serialVersionUID = -5625945470675268910L;
	private ULDObject uldObject;
	private RSUld sULD;
	private RSUldTypeStock uldStock;
	private AManifest manifest;
	private AManifestItem newManifestItem;
	private AManifestItem oldManifestItem;
	private String fID;
	private Long fltID;
	private Date fltDate;
	private Integer addID;
	private Long oldSULD;
	private RSState rsState;
	private Integer isUsed;
	private String state;
	private Integer blackboxID;
	private Integer centralID;
	
	public JMSAirlineAreaObject(){
		
	}

	public ULDObject getUldObject() {
		return uldObject;
	}

	public void setUldObject(ULDObject uldObject) {
		this.uldObject = uldObject;
	}

	public RSUld getSULD() {
		return sULD;
	}

	public void setSULD(RSUld suld) {
		sULD = suld;
	}

	public RSUldTypeStock getUldStock() {
		return uldStock;
	}

	public void setUldStock(RSUldTypeStock uldStock) {
		this.uldStock = uldStock;
	}

	public AManifest getManifest() {
		return manifest;
	}

	public void setManifest(AManifest manifest) {
		this.manifest = manifest;
	}

	public AManifestItem getNewManifestItem() {
		return newManifestItem;
	}

	public void setNewManifestItem(AManifestItem newManifestItem) {
		this.newManifestItem = newManifestItem;
	}

	public AManifestItem getOldManifestItem() {
		return oldManifestItem;
	}

	public void setOldManifestItem(AManifestItem oldManifestItem) {
		this.oldManifestItem = oldManifestItem;
	}

	public String getFID() {
		return fID;
	}

	public void setFID(String fid) {
		fID = fid;
	}

	public Long getFltID() {
		return fltID;
	}

	public void setFltID(Long fltID) {
		this.fltID = fltID;
	}

	public Date getFltDate() {
		return fltDate;
	}

	public void setFltDate(Date fltDate) {
		this.fltDate = fltDate;
	}

	public Integer getAddID() {
		return addID;
	}

	public void setAddID(Integer addID) {
		this.addID = addID;
	}

	public Long getOldSULD() {
		return oldSULD;
	}

	public void setOldSULD(Long oldSULD) {
		this.oldSULD = oldSULD;
	}

	public RSState getRsState() {
		return rsState;
	}

	public void setRsState(RSState rsState) {
		this.rsState = rsState;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getBlackboxID() {
		return blackboxID;
	}

	public void setBlackboxID(Integer blackboxID) {
		this.blackboxID = blackboxID;
	}

	public Integer getCentralID() {
		return centralID;
	}

	public void setCentralID(Integer centralID) {
		this.centralID = centralID;
	}
}
