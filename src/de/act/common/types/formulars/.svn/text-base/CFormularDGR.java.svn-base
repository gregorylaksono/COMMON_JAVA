package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFStick;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularDGR extends CAbstractFormular implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 07.03.2006
	 */
	private static final long serialVersionUID = 4426198849569959903L;
	private Date corr ;
	private Date date = new Date();
	private String nameTitleOfSignatory ="shipper";
	private RFAwbNo airWaybillNo;
	private Integer acOnly = 0;
	private Integer radio = 0;
	private Integer pages = 1;
	private String place;
	private RFStick sticker;

	public CFormularDGR() {
		super(FormularType.DGR);
	}

	public CFormularDGR(IFormularMain main) {
		super(FormularType.DGR,main);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNameTitleOfSignatory() {
		return nameTitleOfSignatory;
	}

	public void setNameTitleOfSignatory(String nameTitleOfSignatory) {
		this.nameTitleOfSignatory = nameTitleOfSignatory;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public RFAwbNo getAirWaybillNo() {
		return airWaybillNo;
	}

	public void setAirWaybillNo(RFAwbNo airWaybillNo) {
		this.airWaybillNo = airWaybillNo;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getAirWaybillNoString() {
		if (airWaybillNo==null) {
			return null;
		}
		return airWaybillNo.toString();
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	public void setRemark(String text) {
		if (this.sticker==null) {
			this.sticker = new RFStick();
		}
		this.sticker.addInfo(null,text);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}

	public Integer getAcOnly() {
		return acOnly;
	}

	public void setAcOnly(Integer acOnly) {
		this.acOnly = acOnly;
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}
}
