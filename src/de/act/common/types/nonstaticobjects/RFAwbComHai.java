package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwbComHai implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 12.06.2006
	 */
	private static final long serialVersionUID = 5229231189488342348L;
	public Integer awb_com_id;
	public String hai_id;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwb)
			return hashCode()==obj.hashCode();
		else return false;
	}

	@Override
	public int hashCode() {
		if (awb_com_id!=null && hai_id!=null)
			return ((awb_com_id.toString()+hai_id).toString()).hashCode();
		else
			return super.hashCode();
	}
}
