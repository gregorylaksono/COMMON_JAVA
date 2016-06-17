/**
 * @author Admin
 * @since 27.03.2006
 */
package de.act.common.types.packageitems;
import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

import de.act.common.types.attachment.CAviItemAttachment;
import de.act.common.types.attachment.CAwbItemAttachment;
import de.act.common.types.attachment.CDgrItemAttachment;
import de.act.common.types.attachment.CPackageAttachment;
import de.act.common.types.attachment.CSadItemAttachment;
import de.act.common.types.attachment.CSliItemAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.staticobjects.ICommodity;
import de.act.common.types.staticobjects.RSAnn;

/**
 * This is an abstract Item the packages in all Formulars
 *
 * @author Martin Sachs
 * @version 3.0 27.Maerz 2006
 */
public class AbstractItem implements Serializable{

	private static final long serialVersionUID = 5491396889870398090L;
	/**
	 * Logger for this class
	 */
	transient private static final Logger log      = Logger.getLogger(AbstractItem.class);
	private Date				corr		= new Date();
	private IAttachment			metadata;
	private AbstractItem		itemAwb;
	private Integer				pcs			= 0;
	private ICommodity			commodity;
	private Integer				rowNo		= 0;
	private String				marks;
	private Long				id			= -1L;
	private Integer isTotal;
	private RSAnn				annotation;

	public AbstractItem(AbstractItem s) {
		corr = s.corr;
		metadata = s.metadata;
		itemAwb = s.itemAwb;
		pcs = s.pcs;
		commodity = s.commodity;
		id = s.id;
		rowNo = s.rowNo;
		marks = s.marks;
		isTotal = s.isTotal;
		annotation = s.annotation;
	}

	public AbstractItem() {
		
	}

	public AbstractItem(FormularType s) {
		switch(s) {
			case AVI_ITEM:metadata = new CAviItemAttachment();break;
			case DGR_ITEM:metadata = new CDgrItemAttachment();break;
			case PACKAGE: metadata = new CPackageAttachment();break;
			case AWB_ITEM:metadata = new CAwbItemAttachment();break;
			case SLI_ITEM:metadata = new CSliItemAttachment();break;
			case SAD_ITEM:metadata = new CSadItemAttachment();break;
		}

	}

	public Integer getRowNo() {
		return rowNo;
	}

	public void setRowNo(Integer rowNo) {
		if (rowNo==null) {
			log.error("null row no set");
		}
		else {
			//log.error(this.getClass()+" set rowno to "+rowNo);
		}
		this.rowNo = rowNo;
	}

	public Long getId() {
		//log.info("getId "+ this.toString()+" ");
		return id;
	}
	
	public void setId(Long pkg_id) {
		this.id = pkg_id;
	}
	
	public ICommodity getCommodity() {
		return this.commodity;
	}
	
	public void setCommodity(ICommodity com) {
		this.commodity = com;
	}
	
	public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}
	
	public Integer getPcs() {
		return this.pcs;
	}
	
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public IAttachment getMetadata() {
		return this.metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
		if (this.itemAwb != null) {
			if (itemAwb.getMetadata() != null && !itemAwb.getMetadata().equals(metadata))
				this.itemAwb.setMetadata(metadata);
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (obj instanceof AbstractItem) {
			AbstractItem s = (AbstractItem) obj;
			if (getRowNo()==null ) {
				//log.error("this.rowno is null");
				return false;
			}
			if (s.getRowNo()==null){
				//log.error("obj.rowno is null"+ this.commodity);
				return false;
			}
			if (s.getMetadata()==null || this.getMetadata()==null){
				//log.error("obj.rowno is null"+ this.commodity);
				return false;
			}

			return this.getRowNo().equals(s.getRowNo()) && this.getMetadata().equals(s.getMetadata());
		}
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getRowNo()).append(this.getMetadata()).toHashCode();
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.rowNo != null && this.getCommodity() != null)
			return this.getClass().getSimpleName()+": "+this.metadata.toString()+" "+this.id+" "+this.rowNo + " " + this.getCommodity().toString()+
					" "+this.getAnnotation();
		return getRowNo().toString();
	}

	public AbstractItem getItemAwb() {
		return itemAwb;
	}

	public void setItemAwb(AbstractItem parent) {
		this.itemAwb = parent;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Integer getIsTotal() {
		return isTotal;
	}

	public void setIsTotal(Integer isTotal) {
		this.isTotal = isTotal;
	}
	
}
