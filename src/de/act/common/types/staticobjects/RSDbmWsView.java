package de.act.common.types.staticobjects;

import java.util.Date;
import java.util.Map;


@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSDbmWsView implements java.io.Serializable, Comparable<RSDbmWsView> {

	private static final long serialVersionUID = -2624320581403721850L;
	/**
	 * 
	 */
	
	private String ca_name;
	private Date dep_date;
	private String ap_3lc_from;
	private String ap_3lc_to;
	private Integer total_smu;
	private Integer total_pcs;
	private Double total_wgt;
	private Double total_vol;
	
	private Double total_incoming_wgt;
	private Double total_outgoing_wgt;
	private Double total_jasa_gudang_incoming;
	private Double total_jasa_gudang_outgoing;
	private Double total_jasa_kade;
	private Double total_cargo_charge;
	private Double total_admin_smu;
	private Map<String, Double> incoming_wgt_airlines;
	private Map<String, Double> outgoing_wgt_airlines;
	private Map<String, Integer> smu_airlines;

	public String getCa_name()
	{
		return ca_name;
	}

	public void setCa_name(String ca_name)
	{
		this.ca_name = ca_name;
	}

	public String getAp_3lc_from()
	{
		return ap_3lc_from;
	}

	public void setAp_3lc_from(String ap_3lc_from)
	{
		this.ap_3lc_from = ap_3lc_from;
	}

	public String getAp_3lc_to()
	{
		return ap_3lc_to;
	}

	public void setAp_3lc_to(String ap_3lc_to)
	{
		this.ap_3lc_to = ap_3lc_to;
	}

	public Integer getTotal_smu()
	{
		return total_smu;
	}

	public void setTotal_smu(Integer total_smu)
	{
		this.total_smu = total_smu;
	}

	public Integer getTotal_pcs()
	{
		return total_pcs;
	}

	public void setTotal_pcs(Integer total_pcs)
	{
		this.total_pcs = total_pcs;
	}

	public Double getTotal_wgt()
	{
		return total_wgt;
	}

	public void setTotal_wgt(Double total_wgt)
	{
		this.total_wgt = total_wgt;
	}

	public Double getTotal_vol()
	{
		return total_vol;
	}

	public void setTotal_vol(Double total_vol)
	{
		this.total_vol = total_vol;
	}

	public Date getDep_date()
	{
		return dep_date;
	}

	public void setDep_date(Date dep_date)
	{
		this.dep_date = dep_date;
	}

	public Double getTotal_incoming_wgt()
	{
		return total_incoming_wgt;
	}

	public void setTotal_incoming_wgt(Double total_incoming_wgt)
	{
		this.total_incoming_wgt = total_incoming_wgt;
	}

	public Double getTotal_outgoing_wgt()
	{
		return total_outgoing_wgt;
	}

	public void setTotal_outgoing_wgt(Double total_outgoing_wgt)
	{
		this.total_outgoing_wgt = total_outgoing_wgt;
	}

	public Double getTotal_jasa_gudang_incoming()
	{
		return total_jasa_gudang_incoming;
	}

	public void setTotal_jasa_gudang_incoming(Double total_jasa_gudang_incoming)
	{
		this.total_jasa_gudang_incoming = total_jasa_gudang_incoming;
	}

	public Double getTotal_jasa_gudang_outgoing()
	{
		return total_jasa_gudang_outgoing;
	}

	public void setTotal_jasa_gudang_outgoing(Double total_jasa_gudang_outgoing)
	{
		this.total_jasa_gudang_outgoing = total_jasa_gudang_outgoing;
	}

	public Double getTotal_jasa_kade()
	{
		return total_jasa_kade;
	}

	public void setTotal_jasa_kade(Double total_jasa_kade)
	{
		this.total_jasa_kade = total_jasa_kade;
	}

	public Double getTotal_cargo_charge()
	{
		return total_cargo_charge;
	}

	public void setTotal_cargo_charge(Double total_cargo_charge)
	{
		this.total_cargo_charge = total_cargo_charge;
	}

	public Double getTotal_admin_smu()
	{
		return total_admin_smu;
	}

	public void setTotal_admin_smu(Double total_admin_smu)
	{
		this.total_admin_smu = total_admin_smu;
	}

	public Map<String, Double> getIncoming_wgt_airlines()
	{
		return incoming_wgt_airlines;
	}

	public void setIncoming_wgt_airlines(Map<String, Double> incoming_wgt_airlines)
	{
		this.incoming_wgt_airlines = incoming_wgt_airlines;
	}

	public Map<String, Double> getOutgoing_wgt_airlines()
	{
		return outgoing_wgt_airlines;
	}

	public void setOutgoing_wgt_airlines(Map<String, Double> outgoing_wgt_airlines)
	{
		this.outgoing_wgt_airlines = outgoing_wgt_airlines;
	}

	public Map<String, Integer> getSmu_airlines()
	{
		return smu_airlines;
	}

	public void setSmu_airlines(Map<String, Integer> smu_airlines)
	{
		this.smu_airlines = smu_airlines;
	}

	@Override
	public int compareTo(RSDbmWsView arg0)
	{
		return 0;
	}
}
