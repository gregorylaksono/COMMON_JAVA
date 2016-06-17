/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.staticobjects.RSAdd;

/**
 * Usecase for CRUD Customer informations.  
 * @note the current user can only handle companies, who are 
 * specified the the current as freightforwarder
 * @author MS
 * @version 1.0 15.06.2007
 */
public interface ICompanyAction extends IAction {

	/**
	 * Get a Company by ID
	 * @param id of Costumer
	 * @return CompanyObject
	 */
	public RSAdd getCompanyByID(String id);
	/**
	 * Get a Company by CompanyName
	 * @param name of company
	 * @return CompanyObject
	 */
	public RSAdd getCompanyByName(String name);
	/**
	 * get all companies at one airport
	 * @param ap3lc of airport
	 * @return List of CompanyObjects
	 */
	public List<RSAdd> getCompanyByAirport(String ap3lc);

	/**
	 * Get all Companies by specified Freightforwarder. 
	 * @note these are all Customer associated to an freightforwarder
	 * @param add of freightforwarder
	 * @return List of CompanyObjects
	 */
	public List<RSAdd> getCompanyByFreighforwarder(RSAdd add);
	/**
	 * Get all Companies by specified Freightforwarder. 
	 * @note these are all Customer associated to this current freightforwarder
	 * @return List of CompanyObjects
	 */
	public List<RSAdd> getCompanyByFreighforwarder();

	/**
	 * Crud Company (Create)
	 * @param add
	 * @return true, if succeeded
	 */
	public RSAdd createCompany(RSAdd add);
	/**
	 * crUd Company (Update)
	 * @param add
	 * @return true, if succeeded
	 */
	public RSAdd editCompany(RSAdd add);

}
