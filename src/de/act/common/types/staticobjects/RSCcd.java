/**
 * @file RSCcd.java
 * @package de.act.common.types
 * @since 27.01.2006 11:36:29
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

/**
 * RSCcd.java:
 *
 * @since 27.01.2006
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCcd implements Serializable {

	private static final long serialVersionUID = -5482433687525794876L;
	public String ccd_id;
	public String ccd_name;
	public String vad_id;
}
