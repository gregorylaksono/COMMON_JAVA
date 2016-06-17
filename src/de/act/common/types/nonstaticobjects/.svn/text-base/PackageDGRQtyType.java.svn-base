package de.act.common.types.nonstaticobjects;


import java.io.Serializable;

import de.act.common.types.staticobjects.RSUnit;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class PackageDGRQtyType implements Serializable{

	/**
	 * @author Admin
	 * @since 22.03.2006
	 */
	private static final long serialVersionUID = 2269831512282535346L;
	// column count
	public static int columnCount=4;
	// data index
	transient public static final int PCS = 0;
	transient public static final int PKGTYPE = 1;
	transient public static final int QTY = 2;
	transient public static final int UNIT = 3;
	// data
	private Integer pcs = 0;
	private String 	pkgType = null;
	private Double	qty = 0.0;
	private RSUnit unit = new RSUnit();
	private String pkg_inst;

	public Object getValueAt(int col) {
		Object value=null;
		switch(col){
			case PCS : value=(pcs==null) ? 0: pcs; break;
			case PKGTYPE : value=(pkgType==null) ? "": pkgType; break;
			case QTY : value=(qty==null) ? 0.0: qty; break;
			case UNIT : value=(unit==null) ? new RSUnit(): unit; break;
			default: break;
		}
		return value;
	}

	public void setValueAt(int col, Object value) {
		switch(col){
		case PCS : pcs =(value==null) ? 0: (Integer)value; break;
		case PKGTYPE : pkgType =(value==null) ? "": (String)value; break;
		case QTY : qty =(value==null) ? 0.0: (Double)value; break;
		case UNIT : unit =(value==null) ? new RSUnit(): (RSUnit)value; break;
		default: break;
		}
	}

	public String toString(){
		/*if(PCS_NO==null || PKG_TYPE==null || FACTOR==null || QTY==null || rSUnit==null){
			return "";
		}*/
		StringBuffer buf=new StringBuffer();
		buf.append( (pcs==null)? "":pcs.toString() );
		buf.append("/");
		buf.append( (pkgType==null) ? "": pkgType );
		buf.append(" x ");
		buf.append(	(qty==null) ? "" : qty.toString() );
		buf.append(" ");
		buf.append(unit.toString());
		return buf.toString();
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public String getPkgType() {
		return pkgType;
	}

	public void setPkgType(String pkgType) {
		this.pkgType = pkgType;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public RSUnit getUnit() {
		return unit;
	}

	public void setUnit(RSUnit unit) {
		this.unit = unit;
	}

	public String getPkg_inst() {
		return pkg_inst;
	}

	public void setPkg_inst(String pkg_inst) {
		this.pkg_inst = pkg_inst;
	}
}
