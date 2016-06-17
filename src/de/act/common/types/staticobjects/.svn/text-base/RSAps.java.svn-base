package de.act.common.types.staticobjects;
import java.util.ArrayList;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAps extends ArrayList<RSAp> {
	/**
	 * @author Martin Sachs
	 * @since 19.05.2006
	 */
	private static final long serialVersionUID = -3850389178834024678L;

	public boolean addRSAp(final RSAp a) {
		return super.add(a);
	}

	public Object[] getObjectArray() {
		final String[] obj = new String[this.size()];
		final Object[] This = this.toArray();
		for (int i = 0; i < this.size(); i++) {
			final RSAp ap = (RSAp) This[i];
			obj[i] = ap.ap_3lc;
		}
		return obj;
	}

	public Object[] getObjectArrayFullName() {
		final String[] obj = new String[this.size()];
		final Object[] This = this.toArray();
		for (int i = 0; i < this.size(); i++) {
			final RSAp ap = (RSAp) This[i];
			obj[i] = ap.ap_name;
		}
		return obj;
	}
}
