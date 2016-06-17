/**
 * @author Martin Sachs
 * @since 07.03.2006
 */
package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.localobjects.IconFolder;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.BookingStates;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;

/**
 * Interface for a set of formulars, which belongs to one shipmentaction
 * This set is offen called FormularContainer. The RFForm object (F_id)
 * describes the identity of this container. 
 * This Object is also the model of the mainFormularContainer (@link GFormAppContainer) 
 * @author Martin Sachs
 * @since 2.0
 * @date 9.05.2006
 */
public interface IFormularMain extends Serializable{

	/**
	 * get the Addressobject of the Agent of this formuarcontainer.
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the agent-addressobject.
	 */
	public RSAdd getAgent();
	
	public Integer getAgentAddID();
	/**
	 * set the Image dynamical by the containing state of this container. The state is
	 * stored in the F-From object representation.
	 * @author Martin Sachs
	 * @param failure 
	 * @param i 
	 * @param nocarrier 
	 * @param type 
	 * @since 29.04.2006
	 */
	public void setImageByFormularData(boolean failure, int i, boolean nocarrier);

	/**
	 * Set the Agent of this container.
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param agent The agent to set.
	 */
	public void setAgent(RSAdd agent);

	/**
	 * get the AWBno for this shipmentaction
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the awbNo.
	 */
	public RFAwbNo getAwbNo();

	/**
	 * Set the AWB No to this container. 
	 * @note The awbno is not ever unique.
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param awbNo The awbNo to set.
	 */
	public void setAwbNo(RFAwbNo awbNo);

	/**
	 * Get the Consignee-Address for this container.
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the consignee.
	 */
	public RSAdd getConsignee();
	
	public Integer getConsigneeAddID();

	/**
	 * set the Consignee object.
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param consignee The consignee to set.
	 */
	public void setConsignee(RSAdd consignee);

	/**
	 * get the FormularInformation object. This contains the State of the Formulars
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the formularInfo.
	 */
	public RFForm getFormularInfo();

	/**
	 * set the formularInformationobject
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param formularInfo The formularInfo to set.
	 */
	public void setFormularInfo(RFForm formularInfo);

	/**
	 * get all formulars
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the formulars.
	 */
	public List<IFormulars> getFormulars();

	/**
	 * set a list of formulars. 
	 * @note The sequence is not ordered, but the first formular would displayed as the first TAB in the Frame.
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param formulars The formulars to set.
	 */
	public void setFormulars(List<IFormulars> formulars);

	/**
	 * get the associated IconFolder
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the iconFolder.
	 */
	public IconFolder getIconFolder();

	/**
	 * Set the IconFolder -Object. It describes the action with a dynamical generated ImageIcon
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param iconFolder The iconFolder to set.
	 */
	public void setIconFolder(IconFolder iconFolder);

	/**
	 * get the Shipper Address
	 * @autor Martin Sachs
	 * @since 07.03.2006
	 * @return Returns the shipper.
	 */
	public RSAdd getShipper();
	
	public Integer getShipperAddID();

	/**
	 * set the shipperAddress
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param shipper The shipper to set.
	 */
	public void setShipper(RSAdd shipper);

	/**
	 * add a formular to this container. 
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param newFormular
	 */
	public void addFormular(IFormulars newFormular);

	/**
	 * get the Default Values for this container. All defaults belong to 
	 * all formulars and would displayed in many ways.
	 * Usually each container could have only one default object. 
	 * When the defaults were changed after storing the Container to the DB, 
	 * there could be a list of changes for each Container.
	 * @note Each Display have to consider which changes to be displayed.
	 * @autor Martin Sachs
	 * @since 16.03.2006
	 * @return Returns the defaults.
	 */
	public List<CAbstractAttachment> getAddresses();

	/**
	 * set the default values for this container.
	 * @author Martin Sachs
	 * @since 16.03.2006
	 * @param defaults The defaults to set.
	 */
	public void setAddresses(List<CAbstractAttachment> defaults);

	/**
	 * get the list of Packageinformations. The first PackageItem is 
	 * the initial Dataobject. each change generates a new copy of all PackageItem
	 * informations. 
	 * @autor Martin Sachs
	 * @since 16.03.2006
	 * @return Returns the packages.
	 */
	public List<CAbstractAttachment> getPackages() ;

	/**
	 * set the list of packageinformations
	 * @author Martin Sachs
	 * @since 16.03.2006
	 * @param packages The packages to set.
	 */
	public void setPackages(List<CAbstractAttachment> packages);

	/**
	 * set the Displayability for each formular (@link IFormular)
	 * @author Martin Sachs
	 * @since 16.03.2006
	 * @param sli, FormularType 
	 * @param b, if true sli is displayable.
	 */
	public void setVisible(FormularType sli, boolean b);

	/**
	 * To String method to help debugging and logging.
	 * @author Martin Sachs
	 * @since 09.05.2006
	 * @return Identifying string representation 
	 */
	public String toString();

	/**
	 * set the List of the Main Packageinformations. (@link ItemPKG, table: f_pkg)
	 * @author Martin Sachs
	 * @since 24.03.2006
	 * @param sliItems
	 */
	public void setItemSLIs(Set<ItemPKG> sliItems);
	
	public void setItemSLIsForSplit(Set<ItemPKG> sliItems);

	/**
	 * get the last version of packageinformations
	 * @author Martin Sachs
	 * @since 24.03.2006
	 * @return PackageinformationObject
	 */
	public CAbstractAttachment getLastPackage();

	/**
	 * @author Martin Sachs
	 * @since 05.04.2006
	 * @return true, if AVI can displayed
	 */
	public boolean canOpenAVI();

	/**
	 * @author Martin Sachs
	 * @since 05.04.2006
	 * @return true, if DGR can displayed
	 */
	public boolean canOpenDGR();

	/**
	 * @author Martin Sachs
	 * @since 05.04.2006
	 * @return true, if SLI can displayed
	 */
	public boolean canOpenSLI();
	/**
	 * @author Martin Sachs
	 * @since 05.04.2006
	 * @return true, if AWB can displayed
	 */
	public boolean canOpenAWB();

	/**
	 * @author Martin Sachs
	 * @since 07.04.2006
	 * @return true, if BKG can displayed
	 */
	public boolean canOpenBKG();

	/**
	 * remove the Formular by the given type
	 * @author Martin Sachs
	 * @since 13.04.2006
	 * @param dgr - FormularType
	 */
	public void remove(FormularType dgr);

	/**
	 * Get the last version of the defaultinformations
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @return last defaults
	 */
	public CAbstractAttachment getLastAddresses();
	/**
	 * @author Martin Sachs
	 * @since 29.04.2006
	 * @return true, if COO can displayed
	 */
	public boolean canOpenCOO();
	/**
	 * @author Martin Sachs
	 * @since 29.04.2006
	 * @return true, if SAD can displayed
	 */
	public boolean canOpenSAD();
	/**
	 * @author Martin Sachs
	 * @since 29.04.2006
	 * @return true, if AVICheckList can displayed
	 */
	public boolean canOpenAVICheckList();
	/**
	 * @author Martin Sachs
	 * @since 29.04.2006
	 * @return true, if NOTOC can displayed
	 */
	public boolean canOpenNOTOC();
	/**
	 * Check funktion to check all mandatory field in all Objects.
	 * 
	 * @author Martin Sachs
	 * @since 08.05.2006
	 * @return true, if all mandatory fields are filled useful.
	 */
	public boolean checkMandatoryFields();
	/**
	 * get the list of ErrorObjects, which represents the describtion of 
	 * the not filled mandatory fields
	 * @author Martin Sachs
	 * @since 08.05.2006
	 * @return list of ErrorObjects, if checkMendatoryFields returns true;
	 */
	public List<FormularError> getErrors();
	/**
	 * @author Martin Sachs
	 * @since 10.05.2006
	 * @return
	 */
	public List<RSAp> getRoutingObject();
	/**
	 * @author Martin Sachs
	 * @since 10.05.2006
	 * @param r
	 */
	public void setRoutingObject(List<RSAp> r);
	/**
	 * @author Martin Sachs
	 * @since 29.05.2006
	 * @return
	 */
	public void setRoutingObject(List<RSAp> r, Map map);
	public List<RSAp> getRoutingObject(Map map);
	
	public RSAp getDestinationAirport();
	/**
	 * @author Martin Sachs
	 * @since 29.05.2006
	 * @return
	 */
	public RSAp getDepartureAirport();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 09.06.2006
	 * @return
	 * @return Object
	 */
	public IFormulars getFormularAwb();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.06.2006
	 * @return
	 * @return List<IFormularMain>
	 */
	public List<IFormularMain> getHouseAWBFormulars();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.06.2006
	 * @return
	 * @return List<IFormularMain>
	 */
	public void setHouseAWBFormulars(List<IFormularMain> houseForms);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.06.2006
	 * @param main1
	 * @return void
	 */
	public void addHouseFormular(IFormularMain main1);
	
	public void removeHouseFormular(IFormularMain main1);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 28.06.2006
	 * @return
	 * @return boolean
	 */
	public boolean isHouseAWB();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 28.06.2006
	 * @return
	 * @return boolean
	 */
	public void setHouseAWB(boolean b);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 30.06.2006
	 * @return
	 * @return boolean
	 */
	public boolean isMasterAWB();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 10.10.2006
	 * @param shipper_cancel
	 * @return void
	 */
	public void setBookingStateAtFlights(BookingStates state);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 11.10.2006
	 * @return
	 * @return BookingStates
	 */
	public BookingStates getRequestedBookingState();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 11.10.2006
	 * @return
	 * @return ItemBKG
	 */
	public ItemBKG getBookingItem();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 18.10.2006
	 * @param shipper_request
	 * @return void
	 */
	public void setBookingStateAtFlightsOnly(BookingStates shipper_request);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.10.2006
	 * @return
	 * @return IFormulars
	 */
	public IFormulars getFormularSli();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.10.2006
	 * @param string
	 * @return void
	 */
	public void setAuthState(String string);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 26.10.2006
	 * @return
	 * @return IFormulars
	 */
	public IFormulars getFormularBkg();

	public void setAttachments(List<CAbstractAttachment> attachments);
	
	public List<CAbstractAttachment> getAttachments();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.12.2006
	 * @return
	 * @return CAbstractAttachment
	 */
	public CAbstractAttachment getlastBookingFlight();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.12.2006
	 * @return
	 * @return List<BookingRequestFlight>
	 */
	public List<BookingRequestFlight> getlastBookingFlightList();
	
	public CAbstractAttachment getLastAcceptance();
	
	public CAbstractAttachment getLastAWBState();
	
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.12.2006
	 * @param bookings
	 * @return void
	 */
	public void setBookingRequestFlights(List<BookingRequestFlight> bookings);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 15.12.2006
	 * @return
	 * @return CFormularNotoc
	 */
	public CFormularNotoc getFormularNotoc();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 15.12.2006
	 * @return
	 * @return CFormularDelivery
	 */
	public CFormularDelivery getFormularDelivery();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 15.12.2006
	 * @return
	 * @return boolean
	 */
	public boolean canOpenDelivery();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 16.01.2007
	 * @return
	 * @return RSAdd
	 */
	public RSAdd getAlsoNotify();
	/**
	 * @author Diky
	 * @since 1.0 - 16.01.2007
	 * @return
	 * @return RSAdd
	 */
	public void setAlsoNotify(RSAdd alsoNotify);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 16.01.2007
	 * @return
	 * @return RSAdd
	 */
	public RSAdd getDeliveryTo();
	/**
	 * @author Diky
	 * @since 1.0 - 16.01.2007
	 * @return
	 * @return RSAdd
	 */
	public void setDeliveryTo(RSAdd deliveryTo);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 16.01.2007
	 * @return
	 * @return RSAdd
	 */
	public RSAdd getBank();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 18.01.2007
	 * @return
	 * @return List<CFormularNotify>
	 */
	public List<CFormularNotify> getFormularNotifys();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 18.01.2007
	 * @param formPart
	 * @return void
	 */
	public void addFormulars(List<IFormulars> formPart);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 22.01.2007
	 * @return
	 * @return List<BookingStates>
	 */
	public List<BookingStates> getlastBookingFlightStates();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.01.2007
	 * @param f_id
	 * @return void
	 */
	public void setFidAtAttachments(String f_id);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 24.01.2007
	 * @return
	 * @return IFormulars
	 */
	public IFormulars getFormularAvi();
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 24.01.2007
	 * @return
	 * @return IFormulars
	 */
	public IFormulars getFormularDgr();

	public CAbstractAttachment getLastRouting();
	
	public HashMap<Long, Date> getDep();
	
	public Date getDep(Long s_flt_id);
	
	public void addDep(Long s_flt_id, Date dep);
	
	public HashMap<Long, Date> getArr();
	
	public Date getArr(Long s_flt_id);
	
	public void addArr(Long s_flt_id, Date arr);
	
	public CAbstractAttachment getLastAttachment(FormularType type);
}