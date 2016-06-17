package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class PackageVol implements Serializable {

	/**
	 * @author MS
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = 4202077543359270783L;
	public Integer L;
	public Integer W;
	public Integer H;
	private Long length;
	private Long weight;
	private Long height;
	private Double volume = null;

	public PackageVol(Double vol) {
		volume= vol;
	}

	public PackageVol() {

	}

	public PackageVol(int i, int j, int k) {
		this.L = i;
		this.H = j;
		this.W = k;
	}

	public String toString(){
		if(L == null || W == null || H == null || L <= 0 || W <= 0 || H <= 0 ){
			return "";
		}
		StringBuffer b = new StringBuffer();
		b.append(L.toString());
		b.append("/" + W.toString());
		b.append("/" + H.toString());
		return b.toString();
	}

	public Object getValueAt(int col) {
		Object value=null;
		switch(col){
			case 0: value = (L == null) ? 0 : L; break;
			case 1: value = (W == null) ? 0 : W; break;
			case 2: value = (H == null) ? 0 : H; break;
		}
		return value;
	}

	public void setValueAt(int col, Object value){
		switch(col){
			case 0: L=(value==null) ? 0:(Integer)value; break;
			case 1: W=(value==null) ? 0:(Integer)value; break;
			case 2: H=(value==null) ? 0:(Integer)value; break;
		}
	}

	public Double  getVolume() {
		// cm in m 100 cm * 100 cm * 100 cm
		if (L!=null && W!=null && H!=null) {
			Double vo = (Double)(L*W*H / 1000000.0);
			if (vo == 0.0 && this.volume!=null) {
				return this.volume;
			}
			return vo;
		}
		return this.volume;
	}

	public Double getPurVolume() {
		return this.volume;
	}

	public void setPurVolume(Double p) {
		this.volume = p;
	}

	public Integer getHeight() {
		return H;
	}
	
	public void setHeight(Integer h) {
		H = h;
	}

	public Integer getLength() {
		return L;
	}

	public void setLength(Integer l) {
		L = l;
	}

	public Integer getWeight() {
		return W;
	}

	public void setWeight(Integer w) {
		W = w;
	}

	public Integer getH() {
		return H;
	}

	public void setH(Integer h) {
		H = h;
		this.volume=null;
	}

	public Integer getL() {
		return L;
	}

	public void setL(Integer l) {
		L = l;
		this.volume=null;
	}

	public Integer getW() {
		return W;
	}

	public void setW(Integer w) {
		W = w;
		this.volume=null;
	}

	public void setVolume(Double double1) {
		this.W = null;
		this.H = null;
		this.L = null;
		this.volume = double1;
	}
}
