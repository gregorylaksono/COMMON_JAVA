/**
 * @file IAction.java
 * @package de.act.batch.com.actions
 * @since 02.01.2006 09:57:25
 * @author Martin Sachs
 */
package de.act.common.interfaces;

import java.io.Serializable;

import de.act.common.types.User;

/**
 * IAction.java:
 *
 * @since 02.01.2006
 * @author Martin Sachs
 *
 */
public interface IAction extends Serializable {
	//boolean isAllowed();
	String getActionName();

	void setUser(User user);
}
