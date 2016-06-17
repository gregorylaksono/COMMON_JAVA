package de.act.central.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * FormularAVI generated by MyEclipse - Hibernate Tools
 */

public class FormularAVI extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 8040958899260382327L;
	transient private Long attId;
	private Sticker sticker;
	private Attachment FAtt;
	private CentralSubt FSubt;
	private String shpAddId; //HENRY this should either Long or Integer
	private Integer consOk;
	private Integer acclim;
	private Integer cites;
	private Integer otLeg;
	private Integer reptiles;
	private Date aviDate;
	private String sign;
	private String card;
	private Date corr;

	// Constructors

	/** default constructor */
	public FormularAVI() {
		
	}

	/** minimal constructor */
	public FormularAVI(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	/** full constructor */
	public FormularAVI(Sticker FStick, Attachment FAtt, CentralSubt FSubt, String shpAddId, Integer consOk, Integer acclim, Integer cites, Integer otLeg, Integer reptiles, Date aviDate, String sign, String card, Date corr) {
		this.sticker = FStick;
		this.FAtt = FAtt;
		this.FSubt = FSubt;
		this.shpAddId = shpAddId;
		this.consOk = consOk;
		this.acclim = acclim;
		this.cites = cites;
		this.otLeg = otLeg;
		this.reptiles = reptiles;
		this.aviDate = aviDate;
		this.sign = sign;
		this.card = card;
		this.corr = corr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FormularAVI)) { return false; }
		if (this == obj) { return true; }
		FormularAVI rhs = (FormularAVI) obj;
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

	public CentralSubt getFSubt() {
		return this.FSubt;
	}

	public void setFSubt(CentralSubt FSubt) {
		this.FSubt = FSubt;
	}

	public String getShpAddId() {
		return this.shpAddId;
	}

	public void setShpAddId(String shpAddId) {
		this.shpAddId = shpAddId;
	}

	 public Integer getAcclim() {
		 return this.acclim;
	 }

	 public void setAcclim(Integer acclim) {
		 this.acclim = acclim;
	 }

	 public Integer getCites() {
		 return this.cites;
	 }

	 public void setCites(Integer cites) {
		 this.cites = cites;
	 }

	 public Integer getConsOk() {
		 return this.consOk;
	 }

	 public void setConsOk(Integer consOk) {
		 this.consOk = consOk;
	 }

	 public Integer getOtLeg() {
		 return this.otLeg;
	 }

	 public void setOtLeg(Integer otLeg) {
		 this.otLeg = otLeg;
	 }

	 public Integer getReptiles() {
		 return this.reptiles;
	 }

	 public void setReptiles(Integer reptiles) {
		 this.reptiles = reptiles;
	 }

	 public Date getAviDate() {
		 return this.aviDate;
	 }

	 public void setAviDate(Date aviDate) {
		 this.aviDate = aviDate;
	 }

	 public String getSign() {
		 return this.sign;
	 }

	 public void setSign(String sign) {
		 this.sign = sign;
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