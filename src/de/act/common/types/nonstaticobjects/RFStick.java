/**
 * @author Admin
 * @since 23.03.2006
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.act.common.types.staticobjects.RSHai;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFStick  implements Serializable {

	private static final long serialVersionUID = 2651011594060659021L;
	private Long id= -1L ;
	private List<RFInfo> infos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<RFInfo> getInfos() {
		return infos;
	}

	public void setInfos(List<RFInfo> infos) {
		this.infos = infos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this== obj) {
			return true;
		}
		if (obj instanceof RFStick) {
			RFStick s = (RFStick) obj;
			if (s.id>-1 && this.id >-1)
				return s.id.equals(this.id);
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if (id!= -1 && id != null) return 37* this.id.hashCode();
		return super.hashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String ret = "Sticker: ";
		if (this.infos!=null) {
			ret += this.infos.size()+" ";
		}
		return ret;
	}

	public void addInfo(int seq,RSHai hai_name,String remark) {
		if (this.infos==null) {
			this.infos = new ArrayList<RFInfo>();
		}
		RFInfo info = null;
		if (this.infos.size()>seq && this.infos.size()>0&& seq>=0) {
			RFInfo inf = this.infos.get(seq);
			inf.setSeq(seq);
			if (hai_name!=null) {
				inf.setHai(hai_name);
			}
			if (remark!=null) {
				inf.setRemark(remark);
			}
		}
		else {
			info = new RFInfo(seq,hai_name,remark,this);
			this.infos.add(info);
		}
	}
	
	public void addInfo(int seq,RSHai hai_name,String remark, String fId) {
		if (this.infos==null) {
			this.infos = new ArrayList<RFInfo>();
		}
		RFInfo info = null;
		if (this.infos.size()>seq && this.infos.size()>0&& seq>=0) {
			RFInfo inf = this.infos.get(seq);
			inf.setSeq(seq);
			if (hai_name!=null) {
				inf.setHai(hai_name);
			}
			if (remark!=null) {
				inf.setRemark(remark);
			}
			if(fId != null){
				inf.setfId(fId);
			}
		}
		else {
			info = new RFInfo(seq,hai_name,remark,fId,this);
			this.infos.add(info);
		}
	}

	public int getCount() {
		if (this.infos!=null) return this.infos.size();
		return 0;
	}

	public RFInfo getInfoAt(int rowCount) {
		if (this.infos!=null&& this.infos.size()>rowCount&& rowCount>=0) {
			return this.infos.get(rowCount);
		}
		else {
			return null;
		}
	}

	public void addInfo(RSHai object, String remark) {
		if (this.infos==null) {
			this.infos = new ArrayList<RFInfo>();
		}
		RFInfo info = new RFInfo(this.infos.size(),object,remark,this);
		this.infos.add(info);
	}
}
