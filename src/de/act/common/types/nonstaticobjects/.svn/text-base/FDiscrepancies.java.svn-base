/**
 * @file FDiscrepancies.java
 * @package de.act.batch.data.forms.warehouse
 * @since 06.12.2005 17:02:43
 * @author Martin Sachs
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

import de.act.common.types.handling.FAcceptanceShipmentItem;
import de.act.common.types.staticobjects.Discrepancies;

/**
 * FDiscrepancies.java:
 *
 * @since 06.12.2005
 * @author Martin Sachs
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class FDiscrepancies implements Serializable{

	private static final long serialVersionUID = -1426339662395411421L;
	public Long acc_shipment_item_id;
	public FAcceptanceShipmentItem shipmentItem;
	public Discrepancies discrepancies;
	public String ap_3lc;
	public String discr_form;
	public String discr_rem;
	
	/*
	 * 13.12.2005
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FDiscrepancies)
			return hashCode() == obj.hashCode();
		else return false;
	}
	
	/*
	 * 13.12.2005
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return acc_shipment_item_id.hashCode();
	}
	
	/*
	 * 13.12.2005
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return discrepancies.toString()+", "+discr_rem+", "+ap_3lc;
	}
}
