package de.act.common.types.staticobjects;
import java.util.ArrayList;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAvis extends ArrayList<RSAvi> {
	/**
	 * @author Martin Sachs
	 * @since 19.05.2006
	 */
	private static final long serialVersionUID = 3834259395189373474L;

	@Override
	public boolean add(final RSAvi a) {
		return super.add(a);
	}

	public String[] getComNameArray() {
		final String[] obj = new String[this.size()];
		final Object[] This = this.toArray();
		for (int i = 0; i < this.size(); i++) {
			final RSAvi ap = (RSAvi) This[i];
			obj[i] = ap.COM.COM_NAME;
		}
		return obj;
	}

	public String[] getAviScfNameArray() {
		final String[] obj = new String[this.size()];
		final Object[] This = this.toArray();
		for (int i = 0; i < this.size(); i++) {
			final RSAvi ap = (RSAvi) This[i];
			obj[i] = ap.AVI_SCF_NAME;
		}
		return obj;
	}
}
