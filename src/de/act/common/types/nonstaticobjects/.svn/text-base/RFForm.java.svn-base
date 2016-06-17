/*
 * Created on 05.09.2005 To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import de.act.common.types.formulars.FormularError;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSState;

/**
 * Main Object for one Shipment process
 *
 * @author Martin Sachs
 * @since version 2.0
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFForm implements Serializable {
	
	transient private static final long  serialVersionUID = -5460428704289398639L;
	private static final String MASTER			= "m";
	private static final String HOUSE			= "h";
	private String				f_id			= null;
	private String				name			= null;
	private Integer				readOnly		= 0;
	private Date				setStamp		= new Date();
	private Date				created			= new Date();
	private Integer				isLocal			= 1;
	private String				status			= "p";
	private String				formular_name;
	private ProcessStates		processState;
	private String				work_state;
	private String				ca_id;
	private Integer				image_id;
	private RSState				state;
	private String				stateDescription;
	private RFForm				parent;
	private String				level;
	private Integer				childrenCount;
	private Set<RFForm>			childs;
	private RSAdd				creator;
	private RFAwbNo				awbNo ;
	private RFHouseForm			summary ;
	private Set<RFDistr>		distribute;
	private ErrorState			errorState;

	public Set<RFDistr> getDistribute() {
		return distribute;
	}

	public void setDistribute(Set<RFDistr> distribute) {
		this.distribute = distribute;
	}

	public RFAwbNo getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	public RFForm() {
		
	}

	public RFForm(String formId, String name2, int i) {
		this.f_id = formId;
		this.name = name2;
		this.readOnly = i;
	}

	public RFForm(String fid, int isLocal, int readOnly, String status) {
		this.f_id = fid;
		this.readOnly = readOnly;
		this.isLocal = isLocal;
		this.status = status;
//		this.created = new Date();
	}

	public int getIsLocal() {
		return isLocal;
	}

	public void setIsLocal(int is_local) {
		this.isLocal = is_local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(int read_only) {
		this.readOnly = read_only;
	}

	public Date getSetStamp() {
		return setStamp;
	}

	public void setSetStamp(Date set_stamp) {
		this.setStamp = set_stamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	 @Override
	 public boolean equals(Object obj) {
		 if (obj == this) {
			 return true;
		 } 
		 else {
			 if (obj instanceof RFForm && this.f_id != null && ((RFForm) obj).f_id != null) {
				 return ((RFForm) obj).f_id.equals(this.f_id);
			 }
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
		 if (this.f_id != null) { return this.f_id.hashCode(); }
		 return super.hashCode();
	 }

	 /*
	  * (non-Javadoc)
	  *
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
		 return this.name + ": " + this.f_id;
	 }

	 public Date getCreated() {
		 return created;
	 }

	 public void setCreated(Date created) {
		 this.created = created;
	 }

	 public String getF_id() {
		 return f_id;
	 }

	 public void setF_id(String f_id) {
		 this.f_id = f_id;
	 }

	 public Integer getImage_id() {
		 return image_id;
	 }

	 public void setImage_id(Integer image_id) {
		 this.image_id = image_id;
	 }

	 public void setIsLocal(Integer isLocal) {
		 this.isLocal = isLocal;
	 }

	 public void setReadOnly(Integer readOnly) {
		 this.readOnly = readOnly;
	 }

	 public String getCa_id() {
		 return ca_id;
	 }

	 public void setCa_id(String ca_id) {
		 this.ca_id = ca_id;
	 }

	 public String getFormular_name() {
		 return formular_name;
	 }

	 public void setFormular_name(String formular_name) {
		 this.formular_name = formular_name;
		 if (formular_name!=null && formular_name.length()>0)
			 this.processState = ProcessStates.getProcessState(formular_name);
	 }

	 public String getWork_state() {
		 return work_state;
	 }

	 public void setWork_state(String work_state) {
		 this.work_state = work_state;
		 if (work_state!=null && work_state.length()>0)
			this.errorState = ErrorState.getErrorState(work_state);
	 }

	 public boolean checkMandetoryFields() {
		 return f_id != null && f_id.length() > 0 && name != null && name.length() > 0;
	 }

	 public List<? extends FormularError> getErrorList() {
		 return null;
	 }

	 public RSState getState() {
		 return state;
	 }

	 public void setState(RSState state) {
		 this.state = state;
	 }

	 public String getStateDescription() {
		 return stateDescription;
	 }

	 public void setStateDescription(String stateDescription) {
		 this.stateDescription = stateDescription;
	 }

	 public Integer getChildrenCount() {
		 if (childs!=null ) {
			 return childs.size();
		 }
		 return (childrenCount==null?0:childrenCount);
	 }

	 public void setChildrenCount(Integer childrenCount) {
		 this.childrenCount = childrenCount;
	 }

	 public Set<RFForm> getChilds() {
		 return childs;
	 }

	 public void setChilds(Set<RFForm> childs) {
		 if (childs!=null) {
			 for (RFForm form : childs) {
				 form.setParent(this);
			 }
		 }
		 this.childs = childs;
	 }

	 public String getLevel() {
		 if (childs!=null && childs.size()>0) {
			 return MASTER;
		 }
		 if (parent!=null) {
			 return HOUSE;
		 }
		 return level;
	 }

	 public void setLevel(String level) {
		 this.level = level;
	 }

	 public RFForm getParent() {
		 return parent;
	 }

	 public void setParent(RFForm parent) {
		 this.parent = parent;
	 }

	 public boolean isMaster() {
		 if (this.awbNo!=null) {
			 return this.awbNo.getFfw_3lc()==null&& this.awbNo.getCa_3dg()!=null && this.childrenCount>0;
		 }
		 if ((parent==null && this.childrenCount!=null && this.childrenCount>0) || (this.childs!=null && this.childs.size()>0)) {
			 return true;
		 }
		 return false;
	 }

	 public boolean isHouse() {
		 if (parent!=null) {
			 return true;
		 }
		 return false;
	 }

	 public boolean addChild(RFForm awb) {
		 if (this.childs==null) {
			 this.childs = new LinkedHashSet<RFForm>();
		 }
		 boolean ret = this.childs.add(awb);
		 awb.setParent(this);
		 return ret;
	 }

	 public void removeChild(RFForm awb) {
		 if (this.childs!=null)
			 this.childs.remove(awb);
		 awb.setParent(null);
	 }

	 public RFHouseForm getSummary() {
		 return summary;
	 }

	 public void setSummary(RFHouseForm houseForm) {
		 this.summary = houseForm;
	 }

	 public void addChildList(List<RFForm> obj) {
		 if (obj!=null) {
			 for (RFForm form : obj) {
				 this.addChild(form);
			 }
		 }
	 }

	 public void removeChildList(List<RFForm> obj) {
		 if (obj!=null) {
			 for (RFForm form : obj) {
				 this.removeChild(form);
			 }
		 }
	 }

	 public void addChildListAt(int row, List<RFForm> obj) {
		 if (obj!=null) {
			 for (RFForm form : obj) {
				 this.addChildAt(row,form);
			 }
		 }
	 }

	 public boolean addChildAt(int row, RFForm awb) {
		 if (this.childs==null) {
			 this.childs = new LinkedHashSet<RFForm>();
		 }
		 boolean ret = this.childs.add(awb);
		 awb.setParent(this);
		 return ret;
	 }

	 public synchronized final ProcessStates getProcessState() {
		 return processState;
	 }

	 public synchronized final void setProcessState(ProcessStates processState) {
		 this.processState = processState;
		 if (this.processState!=null)
			 this.formular_name = this.processState.getFormularName();
	 }

	 public void setErrorState(ErrorState error) {
		 this.errorState = error;
		 if (error !=null) {
			 this.work_state = error.getError();
		 }
	 }

	 public synchronized final ErrorState getErrorState() {
		 return errorState;
	 }

	 public RSAdd getCreator() {
		 return creator;
	 }

	 public void setCreator(RSAdd creator) {
		 this.creator = creator;
	 }
}
