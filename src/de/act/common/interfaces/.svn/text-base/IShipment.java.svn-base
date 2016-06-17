/**
 * 
 */
package de.act.common.interfaces;

import java.util.List;

import de.act.common.types.views.BookingControlView2;
import de.act.common.types.views.MyShipmentView;

/**
 * @author Henry
 *
 */
public interface IShipment extends IAction{

	public List<BookingControlView2>  getAllMyShipment(Integer add_id, String ap3lc);
	
	public List<BookingControlView2>  getAllMyShipmentWithUserType(Integer add_id, String ap3lc);
	
	public List<BookingControlView2> getAllMyShipmentWithUserTypeForContentMyShipment(Integer add_id, String ap3lc);
	
public List<BookingControlView2>  getAllMyShipment(Integer add_id, String ap3lc, List<String> list);
	
	public List<BookingControlView2>  getAllMyShipmentWithUserType(Integer add_id, String ap3lc, List<String> list);
	
	public List<BookingControlView2> getAllMyShipmentWithUserTypeForContentMyShipment(Integer add_id, String ap3lc, List<String> list);
	
	public List<BookingControlView2> getAllMyShipmentWithUserTypeForContentMyShipmentPager(List<String> list, Integer pageSize, Integer page, List<String> sort, 
			String criteria, String searchValue, String criteria2, String searchValue2, Integer exportImport);
	
	public List<MyShipmentView> getAllMyShipmentWithUserTypeForContentMyShipmentPagerNew(List<String> list, Integer pageSize, Integer page, List<String> sort, 
			String criteria, String searchValue, String criteria2, String searchValue2, Integer exportImport);
	
	public Integer getMyShipmentWithUserTypeForContentMyShipmentPagerCount(Integer add_id, String ap3lc, List<String> rules, String criteria, String searchValue, 
			String criteria2, String searchValue2, Integer exportImport);
	
	public List<BookingControlView2> getAwbNumbers(Integer add_id, String ap3lc, List<String> list, String haService);
}
