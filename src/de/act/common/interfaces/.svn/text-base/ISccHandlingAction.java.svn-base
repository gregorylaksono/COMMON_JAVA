package de.act.common.interfaces;

import java.util.List;
import java.util.Map;

import de.act.common.types.AScc;
import de.act.common.types.ASccLoadable;
import de.act.common.types.formulars.FormularNotocInfo;
import de.act.common.types.handling.ANotoc;
import de.act.common.types.handling.ANotocItem;
import de.act.common.types.nonstaticobjects.Preadvise;
import de.act.common.types.nonstaticobjects.PreadviseBookingData;
import de.act.common.types.nonstaticobjects.PreadviseDB;
import de.act.common.types.nonstaticobjects.RFNotocDgrDetails;
import de.act.common.types.staticobjects.CommodityDGR;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.SccCaRule;
import de.act.common.types.staticobjects.SccPreference;
import de.act.common.types.views.ASccValueView;
import de.act.common.types.views.BookingAccBean;
import de.act.common.types.views.BookingControlView2;
import de.act.common.types.views.BookingInformationView;
import de.act.common.types.views.SccLimitationView;
import de.act.common.types.views.SccLoadableView;
import de.act.common.types.views.SccPreferenceView;

public interface ISccHandlingAction extends IAction{
	
	/**
	 * get unnotified SCC	 
	 * @param String f_id	 
	 * @return List of ShipmentInformationView
	 */
	public List<PreadviseBookingData> getUnnotifiedSCC();
	
	/**
	 * save SCC	 
	 * @param RFSccHandling RFSccHandling	 
	 * @return Boolean
	 */
	public Boolean savePreadvise(List<Preadvise> preadvise);
	
	/**
	 * update respond of user
	 * @param Integer preadvise_user_id	 
	 * @return Boolean
	 */
	public Boolean updateRespond(Long id, Boolean respond);
	
	public String getUserLogin();
	
	/**
	 * check respond of user
	 * @param String user_id	 
	 * @return Boolean
	 */
	public Boolean isNotified();
	
	public BookingControlView2 getBookingData(String f_id);
	
	public BookingControlView2 approved(Integer id);
	
	public BookingControlView2 getCancelData(Integer id);
	
	public Boolean CheckAccpt(Integer id);
	
	public Integer insertSccPreference(SccPreference bean);
	
	public List<SccPreference> getSccPreferenceByCaId();
	
	public List<RSScc> getSccByMatch(String scc);
	
	public List<SccPreference> getSccPreferenceByScc3LcAndCaId(String scc3Lc);
	
	public PreadviseDB getPreByFId(String id);
	
	public Integer savePreadvise(String f_id, Integer respond);
	
	public Integer insertFormularNotocInfo(FormularNotocInfo bean);
	
	public Integer insertFormularNotocInfo(List<FormularNotocInfo> bean);
	
	public FormularNotocInfo getFormularNotocInfoByPkgId(Long id);
	
	public Integer insertANotoc(ANotoc bean);
	
	public Integer insertANotoc(List<ANotoc> bean);
	
	public ANotoc getANotocByManiId(Long id);
	
	public Integer insertANotocItem(ANotocItem bean);
	
	public Integer insertANotocItem(List<ANotocItem> bean);
	
	public ANotocItem getANotocItemByPkgId(Long id);
	
	public Map<Long, ANotocItem> getManyANotocItemByPkgId(List<String> id);

	public Map<Long, ANotoc> getManyANotocByManiId(List<String> id);
	
	public Map<Long, FormularNotocInfo> getManyFormularNotocInfoByPkgId(List<String> id);
	
	public Map<Long, CommodityDGR> getManyDgrByComId(List<String> id);
	
	public Integer insertANotocAndFormularNotocInfo(ANotoc bean, List<FormularNotocInfo> list);
	
	public Integer insertRFNotocDgrDetails(List<RFNotocDgrDetails> bean);

	public Map<Long, RFNotocDgrDetails> getRFNotocDgrDetails(List<String> id);
	
	public Integer insertNotocInformations(ANotoc bean, List<FormularNotocInfo> list, List<RFNotocDgrDetails> dgrs);
	
	/*
	 * ============================================================================================================================
	 * 		Airline SCC Part
	 * ============================================================================================================================
	 */
	
	public AScc saveAirlineScc(AScc scc);
	
	public AScc getAirLineSccByCaidNScc(String scc3lc);
	
	public List<SccPreferenceView> getAirlineSccList();
	
	public Map<String, String> getAcceptedAirlineScc(String caId);
	
	public List<SccLoadableView> getSccLoadable(Long primaryId);
	
	public Integer saveSccLoadable(List<ASccLoadable> loadList);
	
	public Map<String, Object> validateSccLoadable(List<BookingAccBean> bookList, List<BookingAccBean> flightList);
	
	public List<RSScc> getSccMatchByAirline(String scc);
	
	public List<SccLimitationView> getSccLimitationForAvi(String scc);
	
	public Integer saveSccLimitationForAVI(List<SccCaRule> loadList);
	
	public List<SccCaRule> getSccCaRuleAll();
	
	public List<ASccValueView> getASccValueView(String scc_3lc);
	
	public BookingInformationView getBookingInformationViewByFId(String f_id);
}
