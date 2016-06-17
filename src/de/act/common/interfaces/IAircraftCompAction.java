/**
 * @file IAircraftAction.java
 * @package de.act.blackbox.actions
 * @since 01.02.2006 15:25:33
 * @author Martin Sachs
 */
package de.act.common.interfaces;

import java.util.List;

import de.act.common.types.staticobjects.RSAcComp;

public interface IAircraftCompAction extends IAction{

	boolean createNewAircraftComp(RSAcComp ac_comp);

	RSAcComp loadAircraftCompByAcId(Integer ac_id);  

	List<RSAcComp> getAllAircraftComp();
}