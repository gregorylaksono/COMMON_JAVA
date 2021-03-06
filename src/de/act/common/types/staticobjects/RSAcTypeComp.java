package de.act.common.types.staticobjects;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 1.0 - 22.01.2007
 */
public final class RSAcTypeComp implements java.io.Serializable{

	private static final long serialVersionUID = -916513451349722886L;
	private Integer ac_type_id;
	private Long ac_comp;
	private String comp_use;
	private String comp_pos;
	private Double max_door_w;
	private Double max_door_h;
	private Double max_door_l;
	private Double max_comp_wgt;
	private Double max_floor_wgt;
	private Double max_vol;
	private Integer avi;
	private Integer dgr;
	private Integer val;
	private Double big;
	private Double hea;
	private RSVad vad;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof RSAcTypeComp) {
			RSAcTypeComp a = (RSAcTypeComp) obj;
			return new EqualsBuilder().append(a.ac_type_id, this.ac_type_id).isEquals();
		}

		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.ac_type_id).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*
    @Override
    public String toString() {

	   return this.iata_type;
    }
	 */

	public Integer getAc_type_id() {
		return ac_type_id;
	}

	public void setAc_type_id(Integer ac_type_id) {
		this.ac_type_id = ac_type_id;
	}

	public Long getAc_comp() {
		return ac_comp;
	}

	public void setAc_comp(Long ac_comp) {
		this.ac_comp = ac_comp;
	}

	public String getComp_use() {
		return comp_use;
	}

	public void setComp_use(String comp_use) {
		this.comp_use = comp_use;
	}

	public String getComp_pos() {
		return comp_pos;
	}

	public void setComp_pos(String comp_pos) {
		this.comp_pos = comp_pos;
	}

	public Double getMax_door_w() {
		return max_door_w;
	}

	public void setMax_door_w(Double max_door_w) {
		this.max_door_w = max_door_w;
	}

	public Double getMax_door_h() {
		return max_door_h;
	}

	public void setMax_door_h(Double max_door_h) {
		this.max_door_h = max_door_h;
	}

	public Double getMax_door_l() {
		return max_door_l;
	}

	public void setMax_door_l(Double max_door_l) {
		this.max_door_l = max_door_l;
	}

	public Double getMax_comp_wgt() {
		return max_comp_wgt;
	}

	public void setMax_comp_wgt(Double max_comp_wgt) {
		this.max_comp_wgt = max_comp_wgt;
	}

	public Double getMax_floor_wgt() {
		return max_floor_wgt;
	}

	public void setMax_floor_wgt(Double max_floor_wgt) {
		this.max_floor_wgt = max_floor_wgt;
	}

	public Double getMax_vol() {
		return max_vol;
	}

	public void setMax_vol(Double max_vol) {
		this.max_vol = max_vol;
	}

	public Integer getAvi() {
		return avi;
	}

	public void setAvi(Integer avi) {
		if( avi == 0 || avi == 1 ) {
			this.avi = avi;
		}
	}

	public Integer getDgr() {
		return dgr;
	}

	public void setDgr(Integer dgr) {
		if( dgr == 0 || dgr == 1 ) {
			this.dgr = dgr;
		}
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		if( val == 0 || val == 1 ) {
			this.val = val;
		}
	}

	public Double getBig() {
		return big;
	}

	public void setBig(Double big) {
		this.big = big;
	}

	public Double getHea() {
		return hea;
	}

	public void setHea(Double hea) {
		this.hea = hea;
	}

	public void setVad( RSVad vad ) {
		this.vad = vad;
	}

	public RSVad getVad() {
		return vad;
	}
}