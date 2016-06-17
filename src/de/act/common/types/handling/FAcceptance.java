/**
 * @file Acceptance.java
 * @package de.act.batch.app.forms.exportacceptance
 * @since 06.12.2005 18:27:44
 * @author Martin Sachs
 */
package de.act.common.types.handling;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFSubt;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;

/**
 * Acceptance.java:
 *
 * @since 06.12.2005
 * @author Martin Sachs F_ACC
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class FAcceptance extends FAcceptanceData implements Serializable {

	transient private static final long   serialVersionUID = -1667205758269857737L;
	public final static String SHP_ACC = "shpacc";
	public final static String AWB_ACC = "awbacc";
	public static final String ULD_ACC = "uldacc";
	private Set<Shipments> accItems = new HashSet<Shipments>();
	private final FormularType type = FormularType.ACCEPTANCE;
	private IFormularMain mainFormular;

	public FAcceptance() {
		super();
	}

	public String toString() {
		RFAwbNo awbNumber = this.getMetadata().getAwbNo();
		if (awbNumber != null) { return awbNumber.getCa_3dg() + "-" + awbNumber.getAwb_stock() + "-" + awbNumber.getAwb_no(); }
		return "no awbno";
	}

	public void setMainFormular(IFormularMain mainFormular) {
		this.mainFormular = mainFormular;
	}

	public RFAwbNo getAwbNo() {
		return this.getMetadata().getAwbNo();
	}

	public void setAwbNo(RFAwbNo a) {
		this.getMetadata().setAwbNo(a);
	}

	public Set<Shipments> getShipments() {
		return accItems;
	}

	public void setShipments(Set<Shipments> accItems) {
		this.accItems = accItems;
		if (this.accItems != null) {
			for (Shipments item : this.accItems) {
				item.setMetadata(this.getMetadata());
				item.setAcceptance(this);
			}
		}
	}   

	public IAttachment getMetadata() {
		return super.getMetadata();
	}

	public void setMetadata(IAttachment metadata) {
		super.setMetadata(metadata);
		if (this.accItems != null) for (Shipments item : accItems) {
			item.setMetadata(metadata);
		}
	}

	public FormularType getType() {
		return type;
	}

	public IFormularMain getMainFormular() {
		return mainFormular;
	}

	public RFAwbNo getAwbNumber() {
		return this.getMetadata().getAwbNo();
	}

	public void init(CAbstractAttachment meta1, RSAp depAp, RSAp desAp, RSAp airport, Date date, RSAdd consignee, Integer awbAcc, Set<Shipments> accN, RFSubt consigneeSubt) {
		this.setShipments(accN);
		this.setMetadata(meta1);
		this.setAp_dept(depAp);
		this.setAp_3lc(airport);
		this.setAp_dest(desAp);
		this.setCorr(date);
		if (consignee != null){
			this.setCne(consignee);
		}
		this.setAwb_acc(awbAcc);
	}
}
