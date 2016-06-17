package de.act.central.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * FomularDGR generated by MyEclipse - Hibernate Tools
 */

public class FomularDGR extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 434545879206183684L;
	transient private Long attId;
	private Sticker sticker;
	private Attachment FAtt;
	private CentralSubt FSubtByShpSubtId;
	private CentralSubt FSubtByConSubtId;
	private Long pages;
	private Integer radio;
	private Integer acOnly;
	private Date dgrDate;
	private String sign;
	private String shpAddId; //HENRY this should either Long or Integer
	private String conAddId; //HENRY this should either Long or Integer
	private String card;
	private Date corr;

	// Constructors

	/** default constructor */
	public FomularDGR() {
		
	}

	/** minimal constructor */
	public FomularDGR(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	/** full constructor */
	public FomularDGR(Sticker FStick, Attachment FAtt, CentralSubt FSubtByShpSubtId, CentralSubt FSubtByConSubtId, Long pages, Integer radio, Integer acOnly, Date dgrDate, String sign, String shpAddId, String conAddId, String card, Date corr) {
		this.sticker = FStick;
		this.FAtt = FAtt;
		this.FSubtByShpSubtId = FSubtByShpSubtId;
		this.FSubtByConSubtId = FSubtByConSubtId;
		this.pages = pages;
		this.radio = radio;
		this.acOnly = acOnly;
		this.dgrDate = dgrDate;
		this.sign = sign;
		this.shpAddId = shpAddId;
		this.conAddId = conAddId;
		this.card = card;
		this.corr = corr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FomularDGR)) { return false; }
		if (this == obj) { return true; }
		FomularDGR rhs = (FomularDGR) obj;
		return new EqualsBuilder().append(this.FAtt, rhs.FAtt).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FAtt).toHashCode();
	}
	// Property accessors

	public Long getAttId() {
		return this.attId;
	}

	public void setAttId(Long attId) {
		this.attId = attId;
	}

	public Sticker getSticker() {
		return this.sticker;
	}

	public void setSticker(Sticker FStick) {
		this.sticker = FStick;
	}

	public Attachment getFAtt() {
		return this.FAtt;
	}

	public void setFAtt(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	public CentralSubt getFSubtByShpSubtId() {
		return this.FSubtByShpSubtId;
	}

	public void setFSubtByShpSubtId(CentralSubt FSubtByShpSubtId) {
		this.FSubtByShpSubtId = FSubtByShpSubtId;
	}

	public CentralSubt getFSubtByConSubtId() {
		return this.FSubtByConSubtId;
	}

	public void setFSubtByConSubtId(CentralSubt FSubtByConSubtId) {
		this.FSubtByConSubtId = FSubtByConSubtId;
	}

	public Long getPages() {
		return this.pages;
	}

	public void setPages(Long pages) {
		this.pages = pages;
	}

	 public Integer getAcOnly() {
		 return this.acOnly;
	 }

	 public void setAcOnly(Integer acOnly) {
		 this.acOnly = acOnly;
	 }

	 public Integer getRadio() {
		 return this.radio;
	 }

	 public void setRadio(Integer radio) {
		 this.radio = radio;
	 }

	 public Date getDgrDate() {
		 return this.dgrDate;
	 }

	 public void setDgrDate(Date dgrDate) {
		 this.dgrDate = dgrDate;
	 }

	 public String getSign() {
		 return this.sign;
	 }

	 public void setSign(String sign) {
		 this.sign = sign;
	 }

	 public String getShpAddId() {
		 return this.shpAddId;
	 }

	 public void setShpAddId(String shpAddId) {
		 this.shpAddId = shpAddId;
	 }

	 public String getConAddId() {
		 return this.conAddId;
	 }

	 public void setConAddId(String conAddId) {
		 this.conAddId = conAddId;
	 }

	 public String getCard() {
		 return this.card;
	 }

	 public void setCard(String card) {
		 this.card = card;
	 }

	 public Date getCorr() {
		 return this.corr;
	 }

	 public void setCorr(Date corr) {
		 this.corr = corr;
	 }
}