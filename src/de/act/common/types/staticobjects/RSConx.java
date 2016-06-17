package de.act.common.types.staticobjects;
import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSConx implements Serializable, Cloneable {

	private static final long serialVersionUID = -5996931319021852864L;
	public String conx_id = null;
	public String ca_id = null;
	public RSAp dept = null;
	public RSAp dest = null;
	public String cur_3lc = null;
	public RSVad vad = null;
	//public String VAD_ID = null;
	//public Date vad_from;
	//public Date vad_to;
	public RSCaConx carrier; //Cross Table. DBScheduleManager, Should be rechecked
	private Carrier carrier_object;

	public RSConx() {
		this.vad = new RSVad();
	}

	public String getConx_Id() {
		return conx_id;
	}

	public void setConx_id(String conx_id) {
		this.conx_id = conx_id;
	}

	public String getCa_Id() {
		return ca_id;
	}

	public void setCa_Id(String ca_id) {
		this.ca_id = ca_id;
	}

	public RSAp getDept() {
		return this.dept;
	}

	public void setDept(RSAp dept) {
		this.dept = dept;
	}

	public RSAp getDest() {
		return this.dest;
	}

	public void setDest(RSAp dest) {
		this.dest = dest; 
	}

	public String getCur_3lc() {
		return this.cur_3lc;
	}

	public void setCur_3lc(String cur_3lc) {
		this.cur_3lc = cur_3lc;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSConx) {
			return this.conx_id.equals(((RSConx) obj).conx_id);
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		if (this.conx_id != null) {
			return this.conx_id.hashCode() * 37;
		}
		else {
			return super.hashCode();
		}
	}

	public String toString() {
		return this.dept + "->" + this.dest;
	}
	
	public RSConx clone() throws CloneNotSupportedException
	{
		return (RSConx)super.clone();
	}

	public Carrier getCarrier_object()
	{
		return carrier_object;
	}

	public void setCarrier_object(Carrier carrier_object)
	{
		this.carrier_object = carrier_object;
	}
	
}
