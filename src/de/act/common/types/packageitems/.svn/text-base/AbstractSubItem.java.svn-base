/**
 * @author Admin
 * @since 27.03.2006
 */
package de.act.common.types.packageitems;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.nonstaticobjects.PackageVol;
import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.ICommodity;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Admin public class ItemAWB<T> extends AbstractSubItem<T> { }; itemAWB = new ItemAWB; itemSLI = new ItemPKG;
 * @param <T>
 * 
 */
@SuppressWarnings("unused")
public abstract class AbstractSubItem extends AbstractSliItem {

	private static final Logger log = Logger.getLogger(AbstractSubItem.class);
	private static final long serialVersionUID = -4446153719903120924L;
	private static final Long  CONSOLIDATION_ID = 1l;
	private Set<AbstractSubItem> subItems         = new LinkedHashSet<AbstractSubItem>();

	public AbstractSubItem() {
		
	}

	public AbstractSubItem(FormularType awb_item) {
		super(awb_item);
	}

	public AbstractSubItem(ItemPKG itemPKG) {
		super(itemPKG);
	}

	public AbstractSubItem(AbstractSubItem itemPKG) {
		super(itemPKG);
	}

	public Double getVol() {
		Double p = 0.0;
		if (subItems != null && subItems.size() > 0){
			for(AbstractSliItem a:subItems){
				if (a != null && a.getVol() != null){
					if(a.getIsTotal().equals(1)){
						p += a.getVol();
					}else{
						p += a.getPcs() * a.getVol();
					}
				}
			}
			return p;
		}
		else{
			if (super.getVolObj() != null)
				return super.getVolObj().getVolume();
			else return super.getVol();
		}
	}

	public void setHeight(Integer h) {
		if (super.getVolObj() == null){
			super.setVolObj(new PackageVol());
		}
		super.getVolObj().H = h;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#setWidth(java.lang.Integer)
	 */
	public void setWidth(Integer h) {
		if (super.getVolObj() == null){
			super.setVolObj(new PackageVol());
		}
		super.getVolObj().W = h;
	}

	public void setLength(Integer h) {
		if (super.getVolObj() == null){
			super.setVolObj(new PackageVol());
		}
		super.getVolObj().L = h;
	}

	public RSScc getScc() {
		RSScc scc = super.getScc();
		if(scc == null)
		{
			RSScc ret = null;
			if (subItems != null && subItems.size() > 0){
				/*for(AbstractSliItem a:this.subItems){
					ret = a.getScc();
				}
				return ret;*/
				AbstractSliItem item = subItems.iterator().next();
				return item.getScc();
			}
		}
		return scc;
	}

	public void setScc(RSScc scc) {
		if (subItems != null && this.subItems.size() > 1){
			// throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
			AbstractSliItem item = subItems.iterator().next();
			item.setScc(scc);
		}
		else if (subItems != null && this.subItems.size() == 1){
			AbstractSliItem item = subItems.iterator().next();
			item.setScc(scc);
		}
		else super.setScc(scc);
	}
	
	public void setSccOneOnly(RSScc scc) {
		super.setScc(scc);
	}

	public PackageVol getVolObj() {
		if (subItems != null && subItems.size() > 0){
			PackageVol ret = null;
			for(AbstractSliItem a:this.subItems){
				ret = a.getVolObj();
			}
			return ret;
		}
		else return super.getVolObj();
	}

	public void setVolObj(PackageVol volObj) {
		if (subItems != null && this.subItems.size() > 1){
			// throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
			AbstractSliItem item = subItems.iterator().next();
			item.setVolObj(volObj);
		}
		else if (subItems != null && this.subItems.size() == 1){
			AbstractSliItem item = subItems.iterator().next();
			item.setVolObj(volObj);
		}
		else super.setVolObj(volObj);
	}

	public Double getWgt() {
		Double p = 0.0;
		if (subItems != null && subItems.size() > 0){
			for(AbstractSliItem a:subItems){
				if(a.getIsTotal().equals(1)){
					p += a.getWgt();
				}else{
					p += a.getPcs() * a.getWgt();
				}
			}
			return p;
		}
		else{
			return super.getWgt();
		}
	}

	public void setWgt(Double wgt) {
		if (subItems != null && this.subItems.size() > 1){
			// throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
			// AbstractSliItem item = subItems.iterator().next();
			// item.setWgt(wgt);
		}
		else if (subItems != null && this.subItems.size() == 1){
			// this.subItems.iterator().next().setWgt(wgt);
		}
		else super.setWgt(wgt);
	}

	public synchronized void addSubItem(AbstractSubItem sub) {
		this.subItems.add(sub);
		recalculateRowNos();
	}

	public synchronized void removeSubItem(AbstractSubItem sub) {
		this.subItems.remove(sub);
		recalculateRowNos();
	}

	private void recalculateRowNos() {
		if (this.subItems != null){
			int row = 0;
			for(AbstractItem i:this.subItems){
				i.setRowNo(row);
				row++;
			}
		}
	}

	public Set<AbstractSubItem> getSubItems() {
		// recalculateRowNos() ;
		return this.subItems;
	}

	public void setSubItems(Set<AbstractSubItem> list) {
		this.subItems = list;
	}

	public void setMetadata(IAttachment metadata) {
		super.setMetadata(metadata);
		if (this.subItems != null){
			for(AbstractItem s:this.subItems){
				if (s.getMetadata() != null && !s.getMetadata().equals(metadata)) s.setMetadata(metadata);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#getCommodity()
	 */
	@Override
	public ICommodity getCommodity() {
		if (subItems != null && this.subItems.size() > 0){
			// iterate and calculate
			boolean first = true;
			Set<ICommodity> intersection = null;
			for(AbstractItem s:subItems){
				int i;
				ICommodity com = s.getCommodity();
				if (com != null && com instanceof CCommodityTree){
					// get list of parent
					Set<ICommodity> list = com.getParentList();
					if (first){
						intersection = new LinkedHashSet<ICommodity>(list);
						first = false;
					}
					else{
						intersection.retainAll(list);
					}
				}
			}
			ICommodity ret = null;
			if (intersection != null && intersection.size() > 0){
				ret = Collections.max(intersection, new Comparator<ICommodity>() {
					public int compare(ICommodity o1, ICommodity o2) {
						if (o1 != null && o2 != null && o1.getLevel() != null && o2.getLevel() != null){
							return o1.getLevel().compareTo(o2.getLevel());
						}
						else return -1;
					}
				});
			}
			if (ret != null && ret.getParentId() !=null && ret.getParentId()> 0){
				return ret;
			}
			else{
				// ret should be ROOAbstractSliItem - Commodity
				if (intersection != null && ret == null && intersection.size() > 0){
					ret = intersection.iterator().next();
				}
				if (ret != null && ret instanceof ICommodityTree){
					ICommodityTree tr = (ICommodityTree) ret;
					CCommodityTree com = new CCommodityTree();
					com.setId(CONSOLIDATION_ID);
					com.setName("Consolidation");
					com.setAwbName("Consolidation");
					return com;
				}
				return super.getCommodity();
			}
		}
		else{
			// else return this.commodity
			return super.getCommodity();
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#getCommodity()
	 */
	@Override
	public RSAnn getAnnotation() {
			
			ICommodity com = this.getCommodity();
			
			if (com.getAnnotation() != null) {
				return com.getAnnotation();
			} else {
				com.setAnnotation(super.getAnnotation());
				return com.getAnnotation();
			}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#getPcs()
	 */
	@Override
	public Integer getPcs() {
		if (subItems != null && this.subItems.size() > 0){
			Integer p = 0;
			for(AbstractSliItem sub:this.subItems){
				p += sub.getPcs();
			}
			return p;
		}
		else{
			return super.getPcs();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#setCommodity(de.act.common.types.staticobjects.ICommodity)
	 */
	@Override
	public void setCommodity(ICommodity com) {
		if (subItems != null && this.subItems.size() > 1){
			// throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
			// AbstractSliItem item = subItems.iterator().next();
			// item.setCommodity(com);
		}
		else if (subItems != null && this.subItems.size() == 1){
			AbstractSliItem item = subItems.iterator().next();
			item.setCommodity(com);
		}
		else{
			super.setCommodity(com);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#setAnnotation(de.act.common.types.staticobjects.RSAnn)
	 */
	@Override
	public void setAnnotation(RSAnn annotation) {
		
		
		if (subItems != null && this.subItems.size() > 1){
		}
		else if (subItems != null && this.subItems.size() == 1){
			AbstractSliItem item = subItems.iterator().next();
			item.setAnnotation(annotation);
		}
		else{
			super.setAnnotation(annotation);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.AbstractSliItem#setPcs(java.lang.Integer)
	 */
	@Override
	public void setPcs(Integer pcs) {
		if (subItems != null && this.subItems.size() > 1){
			// throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
			// AbstractSliItem item = subItems.iterator().next();
			// item.setPcs(pcs);
		}
		else if (subItems != null && this.subItems.size() == 1){
			AbstractSliItem item = subItems.iterator().next();
			item.setPcs(pcs);
		}
		else{
			super.setPcs(pcs);
		}
	}

	public void setAwbWgt(Double d) {
		if (this.getPcs() > 0){
			Double double1 = d / this.getPcs();
			if (subItems != null && this.subItems.size() == 1){
				AbstractSliItem item = subItems.iterator().next();
				item.setWgt(double1);
			}
			else{
				super.setWgt(d);
			}
		}
	}
}
