package de.act.central.types;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Henry
 */
public class FAccHeader extends Central implements java.io.Serializable {

	private static final long serialVersionUID = -2367641074970361082L;
	transient private Long accHeaderId;
	private Attachment FAtt;
	private Integer awbAcc;
	private Integer part;
	private String finalDest;
	private Date corr;
	private Set<FAccAwbItem> FAccAwbItems = new HashSet<FAccAwbItem>(0);
	private Set<FAccShipment> FAccShipments = new HashSet<FAccShipment>(0);
	private Set<FAccDiscr> FAccDiscrs = new HashSet<FAccDiscr>(0);

	public FAccHeader() {
		
	}

	public FAccHeader(Long accHeaderId) {
		this.accHeaderId = accHeaderId;
	}

	public FAccHeader(Long accHeaderId, Attachment FAtt, Integer awbAcc,
			String finalDest, Date corr, Set<FAccAwbItem> FAccAwbItems, Set<FAccShipment> FAccShipments,
			Set<FAccDiscr> FAccDiscrs) {
		this.accHeaderId = accHeaderId;
		this.FAtt = FAtt;
		this.awbAcc = awbAcc;
		this.finalDest = finalDest;
		this.corr = corr;
		this.FAccAwbItems = FAccAwbItems;
		this.FAccShipments = FAccShipments;
		this.FAccDiscrs = FAccDiscrs;
	}

	public Long getAccHeaderId() {
		return this.accHeaderId;
	}

	public void setAccHeaderId(Long accHeaderId) {
		this.accHeaderId = accHeaderId;
	}

	public Attachment getFAtt() {
		return FAtt;
	}

	public void setFAtt(Attachment att) {
		FAtt = att;
	}

	public Integer getAwbAcc() {
		return this.awbAcc;
	}

	public void setAwbAcc(Integer awbAcc) {
		this.awbAcc = awbAcc;
	}

	public String getFinalDest() {
		return this.finalDest;
	}

	public void setFinalDest(String finalDest) {
		this.finalDest = finalDest;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Set<FAccAwbItem> getFAccAwbItems() {
		return this.FAccAwbItems;
	}

	public void setFAccAwbItems(Set<FAccAwbItem> FAccAwbItems) {
		this.FAccAwbItems = FAccAwbItems;
	}

	public Set<FAccShipment> getFAccShipments() {
		return this.FAccShipments;
	}

	public void setFAccShipments(Set<FAccShipment> FAccShipments) {
		this.FAccShipments = FAccShipments;
	}

	public Set<FAccDiscr> getFAccDiscrs() {
		return this.FAccDiscrs;
	}

	public void setFAccDiscrs(Set<FAccDiscr> FAccDiscrs) {
		this.FAccDiscrs = FAccDiscrs;
	}

	public Integer getPart()
	{
		return part;
	}

	public void setPart(Integer part)
	{
		this.part = part;
	}
	
}
