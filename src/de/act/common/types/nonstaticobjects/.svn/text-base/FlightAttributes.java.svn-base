package de.act.common.types.nonstaticobjects;


@org.jboss.cache.aop.annotation.PojoCacheable
public final class FlightAttributes implements java.io.Serializable{
	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = -2118730203085954668L;
	public double SUM_WGT;
	public double SUM_VOL;
	public double MAX_VOL;
	public double MAX_WGT;
	public double AVAILABLE_WGT;
	public double AVAILABLE_VOL;
	// no hashCod or equals implementation: always new instance
}

/*
 * select sum(z_bkg.WGT) as SUM_WGT, sum(VOL) as sum_vol,z_flt.flt_id, MAX_WGT, MAX_VOL, MAX_WGT - SUM(WGT) as AVAILABLE_WGT, MAX_VOL - SUM(VOL) as AVAILABLE_VOL, WGT_UNIT, VOL_UNIT
from
    z_bkg,
    z_flt,
    (select  FLT_ID,F_ID, MAX(CORR) as MAX_CORR from z_bkg group by flt_id,F_ID) as sub

where
    z_bkg.F_ID = sub.F_ID
    and z_bkg.FLT_ID = sub.flt_id
    and MAX_CORR = z_bkg.CORR
    and z_flt.flt_id = z_bkg.flt_id
    and MAX_WGT is not NULL
    and MAX_VOL is not NULL
    and z_bkg.flt_id ='0000066540'
group by z_flt.flt_id, MAX_WGT, MAX_VOL, WGT_UNIT, VOL_UNIT
 */
