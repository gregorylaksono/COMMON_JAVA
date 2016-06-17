/**
 * @file IAircraftTypeAction.java
 * @package de.act.blackbox.actions
 * @since 01.02.2006 15:25:33
 * @author Martin Sachs
 */
package de.act.common.interfaces;

import java.util.List;

import de.act.common.types.staticobjects.RSAcType;

public interface IAircraftTypeAction extends IAction{

	boolean createNewAircraftType(RSAcType ac_type);

	RSAcType loadAircraftTypeByAcTypeId(Integer ac_type_id);  

	List<RSAcType> getAllAircraftType();
}