package de.act.common.types.nonstaticobjects;

// This whole class is a single nuisance and only needed to please Hibernate
@SuppressWarnings("unused")
public class HibernateConnection implements java.io.Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.09.2006
	 */
	private static final long serialVersionUID = 7145001049393659941L;
	// this is the real class (and its data)
	protected TotalConnection tc = new TotalConnection();
	// these variables are needed only for formal (Hibernate) reasons
	// and never used
	private transient String aConxId;
	private transient String bConxId;
	private transient String cConxId;
	private transient String dConxId;
	private transient String eConxId;

	public TotalConnection getTotalConnection() {
		return this.tc;
	}

	//
	// Methods needed for Hibernate:
	//
	private boolean equals(String a, String b) {
		return (a == null ? (b == null) : a.equals(b));
	}
	
	public boolean equals(Object other) {
		if (other instanceof HibernateConnection) {
			HibernateConnection o = (HibernateConnection) other;
			return this.equals(this.getaConxId(), o.getaConxId()) ||
					this.equals(this.getbConxId(), o.getbConxId()) ||
					this.equals(this.getcConxId(), o.getcConxId()) ||
					this.equals(this.getdConxId(), o.getdConxId()) ||
					this.equals(this.geteConxId(), o.geteConxId());
		}
		return false;
	}
	
	private int hashCode(String s) {
		return (s == null ? 0 : s.hashCode());
	}
	
	public int hashCode() {
		return this.hashCode(this.getaConxId()) ^
		this.hashCode(this.getbConxId()) ^
		this.hashCode(this.getcConxId()) ^
		this.hashCode(this.getdConxId()) ^
		this.hashCode(this.geteConxId());
	}

	public ConxFlights getaConx() {
		return this.tc.conxs[0];
	}
	
	public void setaConx(ConxFlights conx) {
		this.tc.conxs[0] = conx;
		if (this.tc.len < 1)  this.tc.len = 1;
	}
	
	public String getaConxId() {
		return this.tc.conxs[0] == null ? null : this.tc.conxs[0].getConx();
	}
	
	public void setaConxId(String conxId) {
		
	}
	
	public ConxFlights getbConx() {
		return this.tc.conxs[1];
	}
	
	public void setbConx(ConxFlights conx) {
		this.tc.conxs[1] = conx;
		if (this.tc.len < 2)  this.tc.len = 2;
	}
	
	public String getbConxId() {
		return this.tc.conxs[1] == null ? null : this.tc.conxs[1].getConx();
	}
	
	public void setbConxId(String conxId) {
	}
	
	public ConxFlights getcConx() {
		return this.tc.conxs[2];
	}
	
	public void setcConx(ConxFlights conx) {
		this.tc.conxs[2] = conx;
		if (this.tc.len < 3)  this.tc.len = 3;
	}
	
	public String getcConxId() {
		return this.tc.conxs[2] == null ? null : this.tc.conxs[2].getConx();
	}
	
	public void setcConxId(String conxId) {
		
	}
	
	public ConxFlights getdConx() {
		return this.tc.conxs[3];
	}
	
	public void setdConx(ConxFlights conx) {
		this.tc.conxs[3] = conx;
		if (this.tc.len < 4)  this.tc.len = 4;
	}
	
	public String getdConxId() {
		return this.tc.conxs[3] == null ? null : this.tc.conxs[3].getConx();
	}
	
	public void setdConxId(String conxId) {
		
	}
	
	public ConxFlights geteConx() {
		return this.tc.conxs[4];
	}
	
	public void seteConx(ConxFlights conx) {
		int length = this.tc.conxs.length;
		this.tc.conxs[length-1] = conx;
		this.tc.len = length;
	}

	public String geteConxId() {
		return this.tc.conxs[4] == null ? null : this.tc.conxs[4].getConx();
	}

	public void seteConxId(String eConxId) {
//		this.eConxId = eConxId;
	}
} // class HibernateConnection
