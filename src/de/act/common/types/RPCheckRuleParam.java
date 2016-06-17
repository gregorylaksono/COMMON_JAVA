package de.act.common.types;

import java.sql.Timestamp;
import java.util.List;

import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCas;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RPCheckRuleParam {
	public Integer 		r_id		=null;
	public Timestamp 	dep_time	=null;
	public Timestamp 	des_time	=null;
	public RSCas	 	ac_routing	=null;
	public List<RSAp>	aps			=null;
	public String		ca_awb		=null;
	public String		uld_class	=null;
	public String		uld_rate	=null;
	public String		charges_type=null;
	public String		cur			=null;
	public Integer		wgt			=null;
	public Integer		intern		=null;
}
