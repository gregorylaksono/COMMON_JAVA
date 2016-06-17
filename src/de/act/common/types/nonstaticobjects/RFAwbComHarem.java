package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwbComHarem implements Serializable{

	private static final long serialVersionUID = 2553842686972364153L;
	public Integer awb_com_id;
	public Integer seq;
	public String ha_rem_name;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwb)
			return hashCode()==obj.hashCode();
		else return false;
	}

	@Override
	public int hashCode() {
		if (awb_com_id!=null && seq!=null)
			return (awb_com_id.toString()+seq.toString()).hashCode();
		else
			return super.hashCode();
	}
}
