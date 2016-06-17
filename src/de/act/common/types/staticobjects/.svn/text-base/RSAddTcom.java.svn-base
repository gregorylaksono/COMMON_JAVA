package de.act.common.types.staticobjects;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAddTcom implements java.io.Serializable {
	/**
	 * @author Martin Sachs
	 * @since 14.02.2006
	 */
	private static final long serialVersionUID = -6825113118465743203L;
	private Integer add_tcom_id;
	//private RSAdd add = null;
	private Integer add = null;
	private String no = null;
	private String type = null;
	private Integer add_tcom_order;
	private String userName = null;
	private int hashcode = 0;
	transient private static final int baseHash = RSAddTcom.class.getName().hashCode() * 2 + 1;
	private RSVad vad;

	public RSAddTcom() {
		
	}

	public RSAddTcom(String type, String no) {
		this.no = no;
		this.type= type;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSAddTcom) {
			RSAddTcom tcom = (RSAddTcom) obj;
			return new EqualsBuilder().append(tcom.add,this.add).append(tcom.no, this.no).isEquals();
		}
		return false;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		this.hashcode = new HashCodeBuilder().append(baseHash).append(this.no).append(this.no).toHashCode();

		return this.hashcode;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new StringBuffer().append(add!=null?add:"").append(type!=null?type:"").append(no!=null?no:"").toString();
	}
	
	public Integer getAdd() {
		return add;
	}

	public void setAdd(Integer add) {
		this.add = add;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public Integer getAdd_tcom_id() {
		return add_tcom_id;
	}

	public void setAdd_tcom_id(Integer add_tcom_id) {
		this.add_tcom_id = add_tcom_id;
	}

	public Integer getAdd_tcom_order() {
		return add_tcom_order;
	}

	public void setAdd_tcom_order(Integer add_tcom_order) {
		this.add_tcom_order = add_tcom_order;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
