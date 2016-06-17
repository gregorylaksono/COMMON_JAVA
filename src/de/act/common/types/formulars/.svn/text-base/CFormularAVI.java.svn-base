package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.nonstaticobjects.RFStick;

/**
 * This Class decribes the AVI - Formulardatas .
 * @author Martin Sachs
 * @since 9/2005
 * TODO SPECIES Hashtable should be in the Application-Oject. AFormAVI !
 */

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularAVI extends CAbstractFormular implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 07.03.2006
	 */
	private static final long serialVersionUID = 76477586794008600L;
	private Date 	corr 			= new Date();
	private Integer consOk			= 0;
	private Integer acclim			= 0;
	private Integer cites			= 0;
	private Integer otLeg			= 0;
	private Integer reptiles 		= 0;
	private Date	date     		= new Date();
	private String	signature    	= "shipper";
	private RFStick sticker;

	public CFormularAVI() {
		super(FormularType.AVI);
	}

	public CFormularAVI(IFormularMain main) {
		super(FormularType.AVI,main);
	}

	public Integer getAcclim() {
		return acclim;
	}

	public void setAcclim(Integer acclim) {
		this.acclim = acclim;
	}

	public Integer getCites() {
		return cites;
	}

	public void setCites(Integer cites) {
		this.cites = cites;
	}

	public Integer getConsOk() {
		return consOk;
	}

	public void setConsOk(Integer consOk) {
		this.consOk = consOk;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getOtLeg() {
		return otLeg;
	}

	public void setOtLeg(Integer otLeg) {
		this.otLeg = otLeg;
	}

	public Integer getReptiles() {
		return reptiles;
	}

	public void setReptiles(Integer reptiles) {
		this.reptiles = reptiles;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public void setAcclim(boolean acclim2) {
		if (acclim2) this.acclim=1;
		else this.acclim=0;
	}

	public void setCites(boolean cites2) {
		if (cites2) this.cites=1;
		else this.cites=0;
	}

	public void setConsOk(boolean cons_ok) {
		if (cons_ok) this.consOk=1;
		else this.consOk=0;
	}

	public void setOtLeg(boolean ot_leg) {
		if (ot_leg) this.otLeg=1;
		else this.otLeg=0;
	}

	public void setReptiles(boolean reptiles2) {
		if (reptiles2) this.reptiles=1;
		else this.reptiles=0;
	}

	public boolean getAcclimBool() {
		return (this.acclim==1?true:false);
	}

	public boolean getCitesBool() {
		return (this.cites==1?true:false);
	}

	public boolean getConsOkBool() {
		return (this.consOk==1?true:false);
	}

	public boolean getOtLegBool() {
		return (this.otLeg==1?true:false);
	}

	public boolean getReptilesBool() {
		return (this.reptiles==1?true:false);
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}
}
