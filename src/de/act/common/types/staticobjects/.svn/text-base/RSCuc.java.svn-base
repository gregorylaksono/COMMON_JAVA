package de.act.common.types.staticobjects;
/**
 * @author Martin Sachs
 * @since 09.03.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCuc implements java.io.Serializable, Comparable<RSCuc> {
	
	private static final long serialVersionUID = -3842345191086482533L;
	public String CUC_3LC;
	public String CUC_NAME;
	public String vad_id;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSCuc) { return ((RSCuc) obj).CUC_3LC.equals(this.CUC_3LC); }
		return false;
	}
	
	public RSCuc(String cuc_3lc)
	{
		if(cuc_3lc == null)
			this.CUC_3LC = "N/A";
		else
			this.CUC_3LC = cuc_3lc;
	}
	
	public RSCuc()
	{
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.CUC_3LC.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.CUC_3LC;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSCuc o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}

	public String getCUC_3LC() {
		return CUC_3LC;
	}

	public void setCUC_3LC(String cUC_3LC) {
		CUC_3LC = cUC_3LC;
	}

	public String getCUC_NAME() {
		return CUC_NAME;
	}

	public void setCUC_NAME(String cUC_NAME) {
		CUC_NAME = cUC_NAME;
	}

	public String getVad_id() {
		return vad_id;
	}

	public void setVad_id(String vad_id) {
		this.vad_id = vad_id;
	}
}
