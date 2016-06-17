/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSCimp;
import de.act.common.types.staticobjects.RSCimpAdd;
import de.act.common.types.staticobjects.ZHandlingAirport;

public interface IHandlingAgentConfigurationAction extends IAction
{

	public List<ZHandlingAirport> getHandlingAgentsByAirline();

	public List<RSAdd> getHandlingAgentsByAirport(String airport);
	
	public Integer insertHandlingAgentAirport(ZHandlingAirport bean);
	
	public boolean deleteHandlingAgentAirport(ZHandlingAirport bean);
	
	public ZHandlingAirport getHandlingByAirlineAndAirportAndService(String airline, String airport, String service);
	
	public List<ZHandlingAirport> getHandlingAgentsByUserAddId();
	
	public List<ZHandlingAirport> getHandlingByAirlineAndAirportAndType(String airline, String airport, String type);

    public RSCimpAdd getCimpAddByAddId(Long add_id);

    public RSCimpAdd saveCimpAdd(RSCimpAdd bean);

    public boolean deleteCimpPref(Long cimp_pref_id);

    public List<RSCimp> getAllCimp();
    
    public String saveCimpSITA(String sitaAdd, String caId);
}
