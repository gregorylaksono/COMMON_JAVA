/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class RSDi implements Serializable, Comparable<RSDi>{

	private static final long serialVersionUID = -1870029571687577651L;
	private String di_2lc;
	private String co_2lc;
	private String di_name;
	private RSVad vad;

	public RSDi(){

	}

	public String getDi_2lc() {
		return di_2lc;
	}

	public void setDi_2lc(String di_2lc) {
		this.di_2lc = di_2lc;
	}

	public String getCo_2lc() {
		return co_2lc;
	}

	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}

	public String getDi_name() {
		return di_name;
	}

	public void setDi_name(String di_name) {
		this.di_name = di_name;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public int compareTo(RSDi di){
		return di.di_2lc.compareToIgnoreCase(di_2lc);
	}
}
