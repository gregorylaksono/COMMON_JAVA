package de.act.common.types.packageitems;

import java.io.Serializable;
import java.util.Set;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.PackageDGRQtyType;
import de.act.common.types.staticobjects.CommodityDGR;
import de.act.common.types.staticobjects.ICommodity;

@org.jboss.cache.aop.annotation.PojoCacheable
@SuppressWarnings("unused")
public final class ItemDGR extends AbstractSubItem implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 02.03.2006
	 */
	private static final long serialVersionUID = -3304359423093885713L;
	private CommodityDGR dgrCommodity;
	private PackageDGRQtyType qtyType=new PackageDGRQtyType();
	private Integer page;

	public ICommodity getCommodity() {
		return super.getCommodity();
	}

	public ItemDGR() {
		super(FormularType.DGR_ITEM);
	}

	public ItemDGR(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
	}

	public void setCommodity(ICommodity comm) {
		super.setCommodity(comm);
		if (comm!=null){
			if (comm.getComDGRs()!=null && comm.getComDGRs().size()==1) {
				comm.setComDGR(comm.getComDGRs().iterator().next());
			}
			else if (comm.getComDGRs()!=null && comm.getComDGRs().size()>1) {
				comm.setComDGR(comm.getComDGRs().iterator().next());
			}
		}
	}

	public PackageDGRQtyType getQtyType() {
		return qtyType;
	}

	public void setQtyType(PackageDGRQtyType qty_type) {
		qtyType = qty_type;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public CommodityDGR getDgrCommodity() {
		ICommodity com = this.getCommodity();
		if (com!=null) {
			Set<CommodityDGR> list = com.getComDGRs();
			CommodityDGR comDgr = com.getComDGR();
			if (this.dgrCommodity==null)
				return dgrCommodity=comDgr;
			else
				return this.dgrCommodity;
		}
		else return this.dgrCommodity;
	}

	public void setDgrCommodity(CommodityDGR aviCommodity) {
		this.dgrCommodity = aviCommodity;
		if (this.getCommodity()==null) {
			this.setCommodity(dgrCommodity.getCommodity());
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.SubItem#getPcs()
	 */
	@Override
	public Integer getPcs() {
		if (qtyType!=null) {
			return qtyType.getPcs();
		}
		else {
			return super.getPcs();
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.SubItem#setPcs(java.lang.Integer)
	 */
	@Override
	public void setPcs(Integer pcs) {
		super.setPcs(pcs);
		if (this.qtyType!=null) {
			this.qtyType.setPcs(pcs);
		}
		else {
			this.qtyType= new PackageDGRQtyType();
			this.qtyType.setPcs(pcs);
		}
	}

}
