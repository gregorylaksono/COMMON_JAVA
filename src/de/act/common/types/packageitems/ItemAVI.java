package de.act.common.types.packageitems;

import java.io.Serializable;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.staticobjects.CommodityAVI;
import de.act.common.types.staticobjects.ICommodity;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemAVI extends AbstractSubItem implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 02.03.2006
	 */
	private static final long serialVersionUID = 9175824278263664054L;
	private CommodityAVI aviCommodity;
	private String aviContainer;
	private Integer qtyAnm = 0;

	public ItemAVI() {
		super(FormularType.AVI_ITEM);
	}

	public ItemAVI(CAbstractAttachment metadata) {
		super(FormularType.AVI_ITEM);
		this.setMetadata(metadata);
	}

	public ICommodity getCommodity() {
		return super.getCommodity();
	}

	public void setCommodity(ICommodity comm) {
		super.setCommodity(comm);
		if (comm!=null){
			if (comm.getComAVIs()!=null&& comm.getComAVIs().size()==1) {
				comm.setComAVI(comm.getComAVIs().iterator().next());
				this.setAviCommodity(comm.getComAVI());
			}
			else if (comm.getComAVI()!=null) {
				this.setAviCommodity(comm.getComAVI());
			}
		}
	}

	public Integer getQtyAnm() {
		return qtyAnm;
	}

	public void setQtyAnm(Integer qtyAnm) {
		this.qtyAnm = qtyAnm;
	}

	public String getAviContainer() {
		if (this.aviContainer==null) {
			if (this.getCommodity()!=null && this.getCommodity().getComAVI()!=null)
				this.aviContainer = this.getCommodity().getComAVI().getContainer();
			if (aviCommodity!=null) {
				this.aviContainer =  aviCommodity.getContainer();
			}
		}
		return aviContainer;
	}

	public void setAviContainer(String aviContainer) {
		this.aviContainer = aviContainer;
	}

	//	/**
	//	 * @author Martin Sachs
	//	 * @since 06.03.2006
	//	 */
	//	private void updatePCS() {
	//		Integer slipcs = this.parent.getPcs();
	//		if (parent.getCommodity()!=null && parent.getCommodity().isAVI()) {
	//			this.pcs = slipcs;
	//		}
	//
	//	}
	//
	//	/**
	//	 * @author Martin Sachs
	//	 * @since 06.03.2006
	//	 */
	//	private void updateCommodity() {
	//		ICommodity com = this.parent.getCommodity();
	//		if (com!=null && com.isAVI()) {
	//			this.commodity = com;
	//		}
	//
	//	}
	//
	//	/**
	//	 * @author Martin Sachs
	//	 * @since 06.03.2006
	//	 */
	//	public void update() {
	////		this.updateCommodity();
	////		this.updatePCS();
	//	}

	public CommodityAVI getAviCommodity() {
		return aviCommodity;
	}

	public void setAviCommodity(CommodityAVI aviCommodity) {
		this.aviCommodity = aviCommodity;
		if (this.getCommodity()==null&& aviCommodity!=null) {
			this.setCommodity(aviCommodity.getCommodity());
		}
	}
}
