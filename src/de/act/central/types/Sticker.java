package de.act.central.types;

import java.util.HashSet;
import java.util.Set;

/**
 * Sticker generated by MyEclipse - Hibernate Tools
 */
@SuppressWarnings("unchecked")
public class Sticker extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = -8044892334365390208L;
	transient private Long stickId;
	private Set FSlis = new HashSet(0);
	private Set FPkgs = new HashSet(0);
	private Set FAccs = new HashSet(0);
	private Set FBkgs = new HashSet(0);
	private Set FAwbStats = new HashSet(0);
	private Set FInfos = new HashSet(0);
	private Set FDgrs = new HashSet(0);
	private Set FAvis = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sticker() {
		
	}

	/** full constructor */
	public Sticker(Set FSlis, Set FPkgs, Set FAccs, Set FBkgs, Set FAwbStats, Set FInfos, Set FDgrs, Set FAvis) {
		this.FSlis = FSlis;
		this.FPkgs = FPkgs;
		this.FAccs = FAccs;
		this.FBkgs = FBkgs;
		this.FAwbStats = FAwbStats;
		this.FInfos = FInfos;
		this.FDgrs = FDgrs;
		this.FAvis = FAvis;
	}

	// Property accessors

	public Long getStickId() {
		return this.stickId;
	}

	public void setStickId(Long stickId) {
		this.stickId = stickId;
	}

	public Set getFSlis() {
		return this.FSlis;
	}

	public void setFSlis(Set FSlis) {
		this.FSlis = FSlis;
	}

	public Set getFPkgs() {
		return this.FPkgs;
	}

	public void setFPkgs(Set FPkgs) {
		this.FPkgs = FPkgs;
	}

	public Set getFAccs() {
		return this.FAccs;
	}

	public void setFAccs(Set FAccs) {
		this.FAccs = FAccs;
	}

	public Set getFBkgs() {
		return this.FBkgs;
	}

	public void setFBkgs(Set FBkgs) {
		this.FBkgs = FBkgs;
	}

	public Set getFAwbStats() {
		return this.FAwbStats;
	}

	public void setFAwbStats(Set FAwbStats) {
		this.FAwbStats = FAwbStats;
	}

	public Set getFInfos() {
		return this.FInfos;
	}

	public void setFInfos(Set FInfos) {
		this.FInfos = FInfos;
	}

	public Set getFDgrs() {
		return this.FDgrs;
	}

	public void setFDgrs(Set FDgrs) {
		this.FDgrs = FDgrs;
	}

	public Set getFAvis() {
		return this.FAvis;
	}

	public void setFAvis(Set FAvis) {
		this.FAvis = FAvis;
	}
}