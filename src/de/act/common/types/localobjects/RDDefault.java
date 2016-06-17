/*
 * Created on 30.08.2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.localobjects;

import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaConx;

/**
 * @author Martin Sachs
 * @since 23.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RDDefault implements java.io.Serializable{

	private static final long serialVersionUID = -2460176745746904790L;
	private Integer add_id = null;
	private String ca_id = null;
	private Integer add_exp_agt = null;
	private String ap_3lc = null;
	private String cur_3lc = null;
	private Integer def_overwrite = null;
	private String def_sign = null;
	private String def_date_format = null;
	private Integer def_ap = null;
	private Integer def_scc = null;
	private Integer def_ca = null;
	private Integer def_cuc = null;
	private Integer def_ot_chrgs = null;
	private String def_unit_code = null;
	private Long stor_id;
	private Storage storage;
	private RSAp airport = null;
	private RSCaConx carrier ;
	private RSAdd add = null;
	private RSAdd extAdd = null;
	private String user_lang;

	public final RSAdd getExtAdd() {
		return extAdd;
	}

	public final void setExtAdd(RSAdd extAdd) {
		this.extAdd = extAdd;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof RDDefault) {
			return ((RDDefault)obj).add_id.equals(add_id);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return add_id.hashCode()*37+17;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.add!=null)
			return this.add.toString();
		return this.add_id.toString();
	}

	public RSAdd getAdd() {
		return add;
	}

	public void setAdd(RSAdd add) {
		this.add = add;
	}

	public Integer getAdd_exp_agt() {
		return add_exp_agt;
	}

	public void setAdd_exp_agt(Integer add_exp_agt) {
		this.add_exp_agt = add_exp_agt;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public RSAp getAirport() {
		return airport;
	}

	public void setAirport(RSAp airport) {
		this.airport = airport;
	}

	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public String getCur_3lc() {
		return cur_3lc;
	}

	public void setCur_3lc(String cur_3lc) {
		this.cur_3lc = cur_3lc;
	}

	public Integer getDef_ap() {
		return def_ap;
	}

	public void setDef_ap(Integer def_ap) {
		this.def_ap = def_ap;
	}

	public Integer getDef_ca() {
		return def_ca;
	}

	public void setDef_ca(Integer def_ca) {
		this.def_ca = def_ca;
	}

	public Integer getDef_cuc() {
		return def_cuc;
	}

	public void setDef_cuc(Integer def_cuc) {
		this.def_cuc = def_cuc;
	}

	public String getDef_date_format() {
		return def_date_format;
	}

	public void setDef_date_format(String def_date_format) {
		this.def_date_format = def_date_format;
	}

	public Integer getDef_ot_chrgs() {
		return def_ot_chrgs;
	}

	public void setDef_ot_chrgs(Integer def_ot_chrgs) {
		this.def_ot_chrgs = def_ot_chrgs;
	}

	public Integer getDef_overwrite() {
		return def_overwrite;
	}

	public void setDef_overwrite(Integer def_overwrite) {
		this.def_overwrite = def_overwrite;
	}

	public Integer getDef_scc() {
		return def_scc;
	}

	public void setDef_scc(Integer def_scc) {
		this.def_scc = def_scc;
	}

	public String getDef_sign() {
		return def_sign;
	}

	public void setDef_sign(String def_sign) {
		this.def_sign = def_sign;
	}

	public Long getStor_id() {
		return stor_id;
	}

	public void setStor_id(Long stor_id) {
		this.stor_id = stor_id;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public String getCa_id() {
		return this.ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public RSCaConx getCarrier() {
		return this.carrier;
	}

	public void setCarrier(RSCaConx carrier) {
		this.carrier = carrier;
	}

	public String getDef_unit_code() {
		return def_unit_code;
	}

	public void setDef_unit_code(String def_unit_code) {
		this.def_unit_code = def_unit_code;
	}

	public String getUser_lang() {
		return user_lang;
	}

	public void setUser_lang(String user_lang) {
		this.user_lang = user_lang;
	}
}
