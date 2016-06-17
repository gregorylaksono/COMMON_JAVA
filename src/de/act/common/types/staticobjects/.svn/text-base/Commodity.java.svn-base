package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public class Commodity implements Comparable, Serializable {

	private static final long serialVersionUID = -4582353305546865455L;
	public Integer com_index;
	public String COM_ID = null; //HENRY it should be Long
	public String PARENT_ID = null; //HENRY it should be Long
	public String COM_NAME = null;
	public String AWB_NAME = null;
	public String COM_FLAG = null;
	public String COM_LEVEL = null;
	public String VAD_ID = null;
	//
	public Commodity parent;
	public Set<Commodity> childs = new HashSet<Commodity>();
	public RSAnn ann = new RSAnn();
	public boolean linkedCom = false;
	public Set<RSHai> hai_list = new HashSet<RSHai>();
	public List<String> harem_list = new ArrayList<String>();

	public Set<RSHai> getComHais() {
		return this.hai_list;
	}

	public List<String> getHarems() {
		return this.harem_list;
	}

	public RSAnn getAnn() {
		return this.ann == null ? null : this.ann;
	}

	public Long getAnnId() {
		return this.ann == null || this.ann.ann_id == null ? null : this.ann.ann_id;
	}

	@Override
	public String toString() {
		if (this.ann.ann_name != null) {
			if ("l".equals(this.ann.ann_dsp)) {
				return this.ann.ann_name + " " + this.COM_NAME;
			} 
			else {
				return this.COM_NAME + " " + this.ann.ann_name;
			}
		} 
		else {
			return this.COM_NAME;
		}
	}

	public int compareTo(final Object o) {
		// System.err.println(" vergleich: "+COM_NAME +" mit
		// "+((Commodity)o).COM_NAME);
		return this.COM_NAME.compareTo(((Commodity) o).COM_NAME);
	}

	/*
	 * 14.12.2005
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof Commodity) {
			if (this.COM_ID != null && ((Commodity) obj).COM_ID != null) {
				return this.COM_ID.equals(((Commodity) obj).COM_ID);
			} 
			else if (this.COM_NAME != null && ((Commodity) obj).COM_NAME != null) {
				return this.COM_NAME.equals(((Commodity) obj).COM_NAME);
			}
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}

	/*
	 * 14.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.COM_ID != null) {
			return this.COM_ID.hashCode();
		} 
		else {
			return super.hashCode();
		}
	}
}
