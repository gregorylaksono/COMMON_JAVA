/**
 * @file CommodityTree.java
 * @package de.act.common.types
 * @since 02.02.2006 10:22:58
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommodityTree extends Commodity implements Comparable, Serializable {

	private static final long serialVersionUID = 4600781003755565171L;

	@Override
	public int compareTo(final Object o) {
		// System.err.println(" vergleich: "+COM_NAME +" mit
		// "+((Commodity)o).COM_NAME);
		return this.COM_NAME.compareTo(((Commodity) o).COM_NAME);
	}
}
