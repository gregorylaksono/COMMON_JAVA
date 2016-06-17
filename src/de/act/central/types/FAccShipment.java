package de.act.central.types;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Henry
 */
public class FAccShipment implements java.io.Serializable {

	private static final long serialVersionUID = -7578262701953910378L;
	transient private Long accShipmentId;
	private FAccHeader FAccHeader;
	private String ap3lc;
	private Long conAddId;
	private Serializable awbAcc;
	private String statId;
	private String statDescr;
	private Date corr;
	private Set<FAccShipmentItem> FAccShipmentItems = new HashSet<FAccShipmentItem>(0);

	public FAccShipment() {
		
	}

	public FAccShipment(Long accShipmentId, FAccHeader FAccHeader) {
		this.accShipmentId = accShipmentId;
		this.FAccHeader = FAccHeader;
	}

	public FAccShipment(Long accShipmentId, FAccHeader FAccHeader,
			String ap3lc, Long conAddId, Serializable awbAcc, String statId,
			String statDescr, Date corr, Set<FAccShipmentItem> FAccShipmentItems) {
		this.accShipmentId = accShipmentId;
		this.FAccHeader = FAccHeader;
		this.ap3lc = ap3lc;
		this.conAddId = conAddId;
		this.awbAcc = awbAcc;
		this.statId = statId;
		this.statDescr = statDescr;
		this.corr = corr;
		this.FAccShipmentItems = FAccShipmentItems;
	}

	public Long getAccShipmentId() {
		return this.accShipmentId;
	}

	public void setAccShipmentId(Long accShipmentId) {
		this.accShipmentId = accShipmentId;
	}

	public FAccHeader getFAccHeader() {
		return this.FAccHeader;
	}

	public void setFAccHeader(FAccHeader FAccHeader) {
		this.FAccHeader = FAccHeader;
	}

	public String getAp3lc() {
		return this.ap3lc;
	}

	public void setAp3lc(String ap3lc) {
		this.ap3lc = ap3lc;
	}

	public Long getConAddId() {
		return this.conAddId;
	}

	public void setConAddId(Long conAddId) {
		this.conAddId = conAddId;
	}

	public Serializable getAwbAcc() {
		return this.awbAcc;
	}

	public void setAwbAcc(Serializable awbAcc) {
		this.awbAcc = awbAcc;
	}

	public String getStatId() {
		return this.statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public String getStatDescr() {
		return this.statDescr;
	}

	public void setStatDescr(String statDescr) {
		this.statDescr = statDescr;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Set<FAccShipmentItem> getFAccShipmentItems() {
		return this.FAccShipmentItems;
	}

	public void setFAccShipmentItems(Set<FAccShipmentItem> FAccShipmentItems) {
		this.FAccShipmentItems = FAccShipmentItems;
	}
}
