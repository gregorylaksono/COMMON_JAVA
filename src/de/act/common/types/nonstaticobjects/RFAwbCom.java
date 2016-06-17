package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import de.act.common.types.packageitems.ItemAWB;
import de.act.common.types.staticobjects.ICommodity;
import de.act.common.types.staticobjects.RSAnn;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwbCom implements Serializable{

	private static final long serialVersionUID = -3811150344250407298L;
	public Integer awb_com_id;
	public ItemAWB awb_item_id;
	public Integer seq;
	public ICommodity com_id;
	public RSAnn ann_id;
	public Set<RFAwbComHai> fawbComHais;
	public List<RFAwbComHarem> fawbComHarems;

	/*public void setFawbComHais(List<RFAwbComHai> com_hais){
		fawbComHais=com_hais;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwb)
			return hashCode()==obj.hashCode();
		else return false;
	}

	@Override
	public int hashCode() {
		if (awb_com_id!=null)
			return awb_com_id.hashCode();
		else
			return super.hashCode();
	}

	public RSAnn getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(RSAnn ann_id) {
		this.ann_id = ann_id;
	}

	public Integer getAwb_com_id() {
		return awb_com_id;
	}

	public void setAwb_com_id(Integer awb_com_id) {
		this.awb_com_id = awb_com_id;
	}

	public ItemAWB getAwb_item_id() {
		return awb_item_id;
	}

	public void setAwb_item_id(ItemAWB awb_item_id) {
		this.awb_item_id = awb_item_id;
	}

	public ICommodity getCom_id() {
		return com_id;
	}

	public void setCom_id(ICommodity com_id) {
		this.com_id = com_id;
	}

	public Set<RFAwbComHai> getFawbComHais() {
		return fawbComHais;
	}

	public void setFawbComHais(Set<RFAwbComHai> fawbComHais) {
		this.fawbComHais = fawbComHais;
	}

	public List<RFAwbComHarem> getFawbComHarems() {
		return fawbComHarems;
	}

	public void setFawbComHarems(List<RFAwbComHarem> fawbComHarems) {
		this.fawbComHarems = fawbComHarems;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
}
