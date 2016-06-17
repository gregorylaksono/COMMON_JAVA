package de.act.common.types.formulars;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.act.common.types.User;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.attachment.CAciAttachment;
import de.act.common.types.attachment.CAddressAttachment;
import de.act.common.types.attachment.CAviItemAttachment;
import de.act.common.types.attachment.CAwbAttachment;
import de.act.common.types.attachment.CAwbItemAttachment;
import de.act.common.types.attachment.CAwbStateAttachment;
import de.act.common.types.attachment.CBkgItemAttachment;
import de.act.common.types.attachment.CBookingFlightAttachment;
import de.act.common.types.attachment.CBookingFlightStateAttachment;
import de.act.common.types.attachment.CDgrItemAttachment;
import de.act.common.types.attachment.CPackageAttachment;
import de.act.common.types.attachment.CPkgStateAttachment;
import de.act.common.types.attachment.CRoutingAttachment;
import de.act.common.types.attachment.CSliAttachment;
import de.act.common.types.localobjects.IconFolder;
import de.act.common.types.nonstaticobjects.BookingFlightState;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.BookingStates;
import de.act.common.types.nonstaticobjects.ErrorState;
import de.act.common.types.nonstaticobjects.ProcessStates;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.RFRt;
import de.act.common.types.nonstaticobjects.RFRtCuc;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaConx;

/**
 * the Main Dataclass for all Formulars. In this class all Formulars saved.
 *
 */
@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormular implements Serializable, IFormularMain {
	/**
	 * @author Martin Sachs
	 * @since 07.03.2006
	 */
	private static final long serialVersionUID = 4554442462257079630L;
	// Formular save name
	private RFForm						formularInfo		= new RFForm();
	private List<IFormularMain>			actChilds			= new ArrayList<IFormularMain>();
	private IconFolder					iconFolder;
	private List<CAbstractAttachment>	attachments			= new ArrayList<CAbstractAttachment>();
	private List<IFormulars>			formulars			= new ArrayList<IFormulars>();
	private List<IFormularMain>			houseFormulars;
	private ArrayList<FormularError>	errorList			= new ArrayList<FormularError>();
	private boolean						house;

	private HashMap<Long, Date> dep = new HashMap<Long, Date>();
	private HashMap<Long, Date> arr = new HashMap<Long, Date>();

	public CFormular() {
		CAbstractAttachment def = new CAddressAttachment();
		attachments.add(def);
		CAbstractAttachment p = new CPackageAttachment();
		attachments.add(p);
		attachments.add(new CRoutingAttachment());
		attachments.add(new CPkgStateAttachment());
		attachments.add(new CAciAttachment());
		attachments.add(new CAwbStateAttachment());
		attachments.add(new CAwbItemAttachment());
		attachments.add(new CAviItemAttachment());
		attachments.add(new CDgrItemAttachment());
		attachments.add(new CBkgItemAttachment());
		// attachments.add(new CAbstractAttachment(FormularType.SLI_ITEM));
		attachments.add(new CBookingFlightAttachment());
		attachments.add(new CBookingFlightStateAttachment());
	}

	public CFormular(final String fid, final User user) {
		CAbstractAttachment def = new CAddressAttachment(fid, user.getAddId());
		attachments.add(def);
		CAbstractAttachment p = new CPackageAttachment(fid, user.getAddId());
		attachments.add(p);
		attachments.add(new CRoutingAttachment(fid, user.getAddId()));
		attachments.add(new CPkgStateAttachment(fid, user.getAddId()));
		attachments.add(new CAciAttachment(fid, user.getAddId()));
		attachments.add(new CAwbStateAttachment(fid, user.getAddId()));
		attachments.add(new CAwbItemAttachment(fid, user.getAddId()));
		attachments.add(new CAviItemAttachment(fid, user.getAddId()));
		attachments.add(new CDgrItemAttachment(fid, user.getAddId()));
		attachments.add(new CBkgItemAttachment(fid, user.getAddId()));
		// attachments.add(new CAbstractAttachment(fid, user.getAddId(), FormularType.SLI_ITEM));
		attachments.add(new CBookingFlightAttachment(fid, user.getAddId()));
		attachments.add(new CBookingFlightStateAttachment(fid, user.getAddId()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this){
			return true;
		}
		else if (obj instanceof CFormular && ((CFormular) obj).formularInfo != null && this.formularInfo != null){
			return ((CFormular) obj).formularInfo.equals(this.formularInfo);
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.formularInfo != null){
			return this.formularInfo.hashCode() + this.getClass().toString().hashCode();
		}
		return super.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MainContainer";
	}

	public RFForm getFormularInfo() {
		return formularInfo;
	}

	public void setFormularInfo(RFForm formularInfo) {
		this.formularInfo = formularInfo;
	}

	public List<IFormulars> getFormulars() {
		return formulars;
	}

	public void setFormulars(List<IFormulars> formulars) {
		this.formulars = formulars;
	}

	public IconFolder getIconFolder() {
		return iconFolder;
	}

	public void setIconFolder(IconFolder iconFolder) {
		this.iconFolder = iconFolder;
		if (this.formularInfo != null){
			this.formularInfo.setImage_id(iconFolder.getImage_id());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getAgent()
	 */
	public RSAdd getAgent() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getAgent();
		}
		return null;
	}
	
	public Integer getAgentAddID() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getFfw_add_id();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setAgent(de.act.common.types.RSAdd)
	 */
	public void setAgent(RSAdd agent) {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null){
			def.getAddresses().setAgent(agent);
			if(agent != null && agent.getAdd_id() != null)def.getAddresses().setFfw_add_id(agent.getAdd_id());
			def.setAuth("s");
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getAwbNo()
	 */
	public RFAwbNo getAwbNo() {
		if (this.formularInfo != null){
			return formularInfo.getAwbNo();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setAwbNo(de.act.common.types.RFAwbNo)
	 */
	public void setAwbNo(RFAwbNo awbNo) {
		if (awbNo != null){
			if (this.formularInfo != null){
				awbNo.setId(formularInfo.getF_id());
				formularInfo.setAwbNo(awbNo);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getConsignee()
	 */
	public RSAdd getConsignee() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getConsignee();
		}
		return null;
	}
	
	public Integer getConsigneeAddID() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getCon_add_id();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setConsignee(de.act.common.types.RSAdd)
	 */
	public void setConsignee(RSAdd consignee) {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null){
			def.getAddresses().setConsignee(consignee);
			if(consignee != null && consignee.getAdd_id() != null){
				def.getAddresses().setCon_add_id(consignee.getAdd_id());
				//diky
				if(consignee.getUsingLC() != null){
					if(consignee.getUsingLC())
						def.getAddresses().setBank(1);
					else 
						def.getAddresses().setBank(0);
				}
				
			}
				
			def.setAuth("s");
		}
	}
	
	private CAbstractAttachment getLastAttachmentFor(FormularType t) {
		if (this.attachments != null && this.attachments.size() > 0){
			List<CAbstractAttachment> search = new ArrayList<CAbstractAttachment>();
			for(CAbstractAttachment at:this.attachments){
				String type = at.getAttType();
				if (at != null && type != null && type.equals(t.getConstaint())){
					search.add(at);
				}
			}
			if (search.size() > 0){
				Collections.sort(search, new Comparator<CAbstractAttachment>(){
					public int compare(CAbstractAttachment o1, CAbstractAttachment o2) {
						return o1.getAttNo().compareTo(o2.getAttNo());
					}  
				});
				return search.get(search.size() - 1);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getShipper()
	 */
	public RSAdd getShipper() {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getShipper();
		}
		return null;
	}
	
	public Integer getShipperAddID() {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getShp_add_id();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setShipper(de.act.common.types.RSAdd)
	 */
	public void setShipper(RSAdd shipper) {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null){
			def.getAddresses().setShipper(shipper);
			if(shipper != null && shipper.getAdd_id() != null)def.getAddresses().setShp_add_id(shipper.getAdd_id());
			def.setAuth("s");
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#addFormular(de.act.common.types.formulars.IFormulars)
	 */
	public void addFormular(IFormulars newFormular) {
		if (newFormular == null) return;
		if (this.formulars == null){
			this.formulars = new ArrayList<IFormulars>();
		}
		IFormulars exist = null;
		for(IFormulars f:this.formulars){
			if (f.getType() == newFormular.getType()){
				exist = f;
				break;
			}
		}
		// one formulartype can exist only once
		if (exist != null){
			this.formulars.remove(exist);
		}
		this.formulars.add(newFormular);
		newFormular.setMainFormular(this);
		if (newFormular.getType() == FormularType.SLI){
			List<RFRt> li = this.getRouting();
			this.setRouting(li);
		}
	}

	public void setRouting(List<RFRt> list) {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ROUTING);
		if (def != null){
			def.setRouting(list);
			def.setAuth("s");
		}
	}
	
	public List<RFRt> getRouting() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ROUTING);
		if (def != null && def.getRouting() != null){
			return def.getRouting();
		}
		return null;
	}
	
	public List<RSAp> getRoutingObject() {
		List<RFRt> list = getRouting();
		if (list != null){
			List<RSAp> rout = new ArrayList<RSAp>();
			for(RFRt r:list){
				rout.add(r.AP);
			}
			// for (IFormulars fo : this.formulars) {
			// if (fo.getType()==FormularType.SLI) {
			// CFormularSLI sli = (CFormularSLI) fo;
			// // sli.setRouting(rout);
			// }else if (fo.getType()==FormularType.AWB_SHIPPER) {
			// CFormularAWB sli = (CFormularAWB) fo;
			// // sli.setRouting(rout);
			// }
			// }
			return rout;
		}
		return null;
	}
	
	public List<RSAp> getRoutingObject(Map map) {
		List<RFRt> list = getRouting();
		if (list != null){
			List<RSAp> rout = new ArrayList<RSAp>();
			for(RFRt r:list){
				rout.add(r.AP);
			}
			return rout;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setVisible(de.act.common.types.formulars.FormularType, boolean)
	 */
	public void setVisible(FormularType sli, boolean b) {
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars f:this.formulars){
				if (f.getType() == sli){}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setItemSLIs(java.util.Set)
	 */
	public void setItemSLIs(Set<ItemPKG> sliItems) {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.PACKAGE);
		if (def != null){
			def.setItemPKG(sliItems);
			def.setAuth("s");
		}
	}
	
	public void setItemSLIsForSplit(Set<ItemPKG> sliItems) {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.PACKAGE);
		if (def != null){
			def.setItemPKG(sliItems);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenAVI()
	 */
	public boolean canOpenAVI() {
		return checkOpenRight(FormularType.AVI);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenDGR()
	 */
	public boolean canOpenDGR() {
		return checkOpenRight(FormularType.DGR);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenSLI()
	 */
	public boolean canOpenSLI() {
		return checkOpenRight(FormularType.SLI);
	}

	private boolean checkOpenRight(FormularType sli) {
		boolean ret = false;
		for(IFormulars form:this.formulars){
			if (form.getType() == sli){
				ret |= form.getDisplayable() ;
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenAWB()
	 */
	public boolean canOpenAWB() {
		return checkOpenRight(FormularType.AWB);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenBKG()
	 */
	public boolean canOpenBKG() {
		return checkOpenRight(FormularType.BKG);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#remove(de.act.common.types.formulars.FormularType)
	 */
	public void remove(FormularType dgr) {
		if (this.formulars != null){
			IFormulars removObj = null;
			for(IFormulars f:this.formulars){
				if (f.getType() == dgr){
					removObj = f;
					break;
				}
			}
			this.formulars.remove(removObj);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setImageByFormularData(de.act.common.types.formulars.IFormularMain)
	 */
	public void setImageByFormularData(boolean failure, int i, boolean nocarrier) {
		if (this != null){
			RFForm fform = this.getFormularInfo();
			CAbstractAttachment lpkg = this.getLastPackage();
			CAbstractAttachment lbkg = this.getlastBookingFlight();
			ProcessStates formular = null;

			if (this.canOpenBKG()) formular = ProcessStates.BKG;
			if (this.canOpenDGR()) formular = ProcessStates.DGR;
			if (this.canOpenAVI()) formular = ProcessStates.AVI;
			if (this.canOpenSLI()) formular = ProcessStates.SLI;
			// if (this.canOpenSLI()) formular = "sad";
			// if (this.canOpenSLI()) formular = "coo";
			if (this.canOpenAWB()) formular = ProcessStates.AWB_SHIPPER;
			if (this.canOpenDelivery()) formular = ProcessStates.AWB_DELIVERY;
			fform.setProcessState(formular);
			String caid = "";
			if (!this.house){
				if (!nocarrier){
					if (lbkg != null){
						List<BookingRequestFlight> flt = lbkg.getBkgFlights();
						if (flt != null && flt.size() > 0){
							BookingRequestFlight flt1 = flt.get(0);
							RSCaConx ca = flt1.getAirline();
							if (ca != null){
								//caid = ca.ca_id;
							}
						}
					}
				}
			}
			else{
				caid = fform.getCa_id();
			}
			if (i == 1){
				fform.setWork_state(ErrorState.OK.getError());
				if (this.canOpenAWB()) formular = ProcessStates.AWB_COPY;
			}
			else{
				if (this.canOpenAWB()) formular = ProcessStates.AWB_SHIPPER;
				fform.setWork_state(ErrorState.UNKNOWN.getError());
			}
			if (failure){
				fform.setErrorState(ErrorState.ERROR);
			}
			fform.setProcessState(formular);
			if (caid != null && caid.length() > 0) {
				String currentCa = fform.getCa_id();
				if (currentCa==null) {
					fform.setCa_id(caid);
				}
			}
			else {
				String currentCa = fform.getCa_id();
				if (currentCa==null) {
					fform.setCa_id(ProcessStates.DEFAULT_CARRIER.getFormularName());
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenCOO()
	 */
	public boolean canOpenCOO() {
		return checkOpenRight(FormularType.COO);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenSAD()
	 */
	public boolean canOpenSAD() {
		return checkOpenRight(FormularType.SAD);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenAVICheckList()
	 */
	public boolean canOpenAVICheckList() {
		return checkOpenRight(FormularType.AVICHECK);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#canOpenNOTOC()
	 */
	public boolean canOpenNOTOC() {
		return checkOpenRight(FormularType.NOTOC);
	}

	public boolean canOpenDelivery() {
		return checkOpenRight(FormularType.DELIVERY) || 
		checkOpenRight(FormularType.NOTIFY);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#checkMandetoryFields()
	 */
	public boolean checkMandatoryFields() {
		if (errorList == null){
			errorList = new ArrayList<FormularError>();
		}
		else{
			errorList.clear();
		}
		boolean ret = true;
		// check formularinfo
		ret &= this.formularInfo.checkMandetoryFields();
		// defaults
		int dd;
		ret &= this.getLastAddresses().checkMandetoryFields();
		Collection<? extends FormularError> errlist = this.getLastAddresses().getErrorList();
		if (!ret && errlist != null) errorList.addAll(errlist);
		// packages
		ret &= this.getLastPackage().checkMandetoryFields();
		errlist = this.getLastPackage().getErrorList();
		if (!ret && errlist != null) errorList.addAll(errlist);
		// formulars
		for(IFormulars f:this.formulars){
			if (f.getDisplayable()){
				ret &= f.checkMendetoryFields();
				if (!ret) errorList.addAll(f.getErrorList());
			}
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getErrors()
	 */
	public List<FormularError> getErrors() {
		if (this.errorList == null){
			this.errorList = new ArrayList<FormularError>();
		}
		return errorList;
	}

	public List<IFormularMain> getActChilds() {
		return actChilds;
	}

	public void setActChilds(List<IFormularMain> actChilds) {
		this.actChilds = actChilds;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setRoutingObject(java.util.List)
	 */
	public void setRoutingObject(List<RSAp> r) {
		List<RFRt> list = new ArrayList<RFRt>();
		int c = 0;
		if (r != null){
			for(RSAp ap:r){
				RFRt rf = new RFRt(ap, c);
				list.add(rf);
				c++;
			}
		}
		if (list != null && list.size() > 0){
			this.setRouting(list);
		}
	}
	
	public void setRoutingObject(List<RSAp> r, Map map) {
		List<RFRt> list = new ArrayList<RFRt>();
		Set<RFRtCuc> listRFRtCuc = new HashSet<RFRtCuc>();
		String cucCode = null;
		int c = 0;
		int seq = 0;
		if (r != null){
			for(RSAp ap:r){
				RFRt rf = new RFRt(ap, c);
				list.add(rf);
				c++;
			}
		}
		
		if (list != null && list.size() > 0){
			for(RFRt rfrt : list){
				listRFRtCuc = new HashSet<RFRtCuc>();
				cucCode = (String)map.get("cucCode");
				RFRtCuc rfCuc = new RFRtCuc(rfrt, cucCode, seq);
				rfCuc.setAP(rfrt.getAP());
				listRFRtCuc.add(rfCuc);
				rfrt.setRFRtCuc(listRFRtCuc);
				seq++;
			}
			this.setRouting(list);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getDepartureAirport()
	 */
	public RSAp getDepartureAirport() {
		List<RSAp> rt = this.getRoutingObject();
		if (rt != null && rt.size() > 0){
			return rt.get(0);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getDestinationAirport()
	 */
	public RSAp getDestinationAirport() {
		List<RSAp> rt = this.getRoutingObject();
		if (rt != null && rt.size() > 0){
			return rt.get(rt.size() - 1);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getFormularAwb()
	 */
	public IFormulars getFormularAwb() {
		if(this.attachments != null && this.getAttachments().size() > 0)
		{
			CAwbAttachment awb = (CAwbAttachment)getLastAttachmentFor(FormularType.AWB);
			if(awb != null)
			{
				IFormulars temp = awb.getFormular();
				temp.setMainFormular(this);
				return temp;
			}
		}
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(FormularType.AWB)
						// ||
						// awb.getType().equals(FormularType.AWB_CONSIGNEE)||
						// awb.getType().equals(FormularType.AWB_FFW)||
						// awb.getType().equals(FormularType.AWB_HND)
				)
				{
					return awb;
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getHouseAWBFormulars()
	 */
	public List<IFormularMain> getHouseAWBFormulars() {
		return houseFormulars;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setHouseAWBFormulars(java.util.List)
	 */
	public void setHouseAWBFormulars(List<IFormularMain> houseForms) {
		this.houseFormulars = houseForms;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#addHouseFormular(de.act.common.types.formulars.IFormularMain)
	 */
	public void addHouseFormular(IFormularMain main1) {
		if (this.houseFormulars == null){
			this.houseFormulars = new ArrayList<IFormularMain>();
		}
		this.houseFormulars.add(main1);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#removeHouseFormular(de.act.common.types.formulars.IFormularMain)
	 */
	public void removeHouseFormular(IFormularMain main1) {
		if (this.houseFormulars != null){
			this.houseFormulars.remove(main1);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#isHouseAWB()
	 */
	public boolean isHouseAWB() {
		return house;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#isHouseAWB()
	 */
	public void setHouseAWB(boolean b) {
		house = b;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#isMasterAWB()
	 */
	public boolean isMasterAWB() {
		return this.formularInfo != null && this.formularInfo.getChildrenCount() > 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setBookingState(de.act.common.types.nonstaticobjects.BookingStates)
	 */
	public void setBookingStateAtFlights(BookingStates state) {
		if (state != null){
			BookingStates s = state;
			ItemBKG bkg = this.getBookingItem();
			if (bkg != null){
				bkg.setRequestedState(s);
			}
			CAbstractAttachment bkgFlights = this.getLastAttachmentFor(FormularType.BKG_FLIGHT_STATE);
			if (bkgFlights != null){
				Set<BookingFlightState> states = bkgFlights.getBkgFlightStates();
				if (states != null && states.size() > 0){
					for(BookingFlightState f:states){
						f.setBookingState(state);
					}
				}
				bkgFlights.setAuth("s");
			}
			if (this.formularInfo != null){
				if (this.formularInfo.getFormular_name().equals("bkg") || state == BookingStates.BOOKING_CANCELED){
					this.formularInfo.setCa_id(state.getActCode());
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getBookingState()
	 */
	public BookingStates getRequestedBookingState() {
		ItemBKG bkg = getBookingItem();
		if (bkg != null){
			BookingStates bkgState = bkg.getRequestedState();
			return bkgState;
		}
		return BookingStates.NONE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getBookingItem()
	 */
	public ItemBKG getBookingItem() {
		CAbstractAttachment actualPkg = this.getLastAttachmentFor(FormularType.PACKAGE);
		if (actualPkg != null){
			Set<ItemBKG> bkgs = actualPkg.getItemBKGs();
			if (bkgs != null && bkgs.size() > 0){
				ItemBKG bkg = bkgs.iterator().next();
				return bkg;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setBookingStateAtFlightsOnly(de.act.common.types.nonstaticobjects.BookingStates)
	 */
	public void setBookingStateAtFlightsOnly(BookingStates state) {
		BookingStates s = BookingStates.NONE;
		ItemBKG bkg = this.getBookingItem();
		if (bkg != null){
			s = bkg.getRequestedState();
			if ((s == BookingStates.SHIPPER_ALTERNATIVE_REQUEST || s == BookingStates.SHIPPER_REQUEST) && state == BookingStates.AGENT_REQUEST){
				switch(s){
				case SHIPPER_ALTERNATIVE_REQUEST:
					s = BookingStates.AGENT_ALTERNATIVE_REQUEST;
					break;
				case SHIPPER_REQUEST:
					s = BookingStates.AGENT_REQUEST;
					break;
				}
				bkg.setRequestedState(s);
			}
			else{
				s = state;
			}
			CAbstractAttachment bkgFlights = this.getLastAttachmentFor(FormularType.BKG_FLIGHT_STATE);
			if (bkgFlights != null){
				Set<BookingFlightState> states = bkgFlights.getBkgFlightStates();
				if (states != null && states.size() > 0){
					for(BookingFlightState f:states){
						f.setBookingState(state);
					}
				}
				bkgFlights.setAuth("s");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getFormularSli()
	 */
	public IFormulars getFormularSli() {
		if(this.attachments != null && this.getAttachments().size() > 0)
		{
			CSliAttachment sli = (CSliAttachment)getLastAttachmentFor(FormularType.SLI);
			if(sli != null)
			{
				IFormulars temp = sli.getFormular();
				temp.setMainFormular(this);
				return temp;
			}
		}
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(FormularType.SLI)){
					return awb;
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setAuthState(java.lang.String)
	 */
	public void setAuthState(String string) {
		CAbstractAttachment def = this.getLastAddresses();
		if (def != null){
			def.setAuth(string);
		}
		CAbstractAttachment pkg = this.getLastPackage();
		if (pkg != null){
			pkg.setAuth(string);
		}
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb != null){
					awb.setAuthState(string);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getFormularBkg()
	 */
	public IFormulars getFormularBkg() {
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(FormularType.BKG)){
					return awb;
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getAddresses()
	 */
	public List<CAbstractAttachment> getAddresses() {
		if (this.attachments != null && this.attachments.size() > 0){
			List<CAbstractAttachment> search = new ArrayList<CAbstractAttachment>();
			for(CAbstractAttachment at:this.attachments){
				String type = at.getAttType();
				if (at != null && type != null && type.equals(FormularType.ADDRESS.getConstaint())){
					search.add(at);
				}
			}
			return search;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getLastAddresses()
	 */
	public CAbstractAttachment getLastAddresses() {
		CAbstractAttachment adds = this.getLastAttachmentFor(FormularType.ADDRESS);
		return adds;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getLastPackage()
	 */
	public CAbstractAttachment getLastPackage() {
		return this.getLastAttachmentFor(FormularType.PACKAGE);
	}
	
	public CAbstractAttachment getLastRouting(){
		return this.getLastAttachmentFor(FormularType.ROUTING);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getPackages()
	 */
	public List<CAbstractAttachment> getPackages() {
		if (this.attachments != null && this.attachments.size() > 0){
			List<CAbstractAttachment> search = new ArrayList<CAbstractAttachment>();
			for(CAbstractAttachment at:this.attachments){
				String type = at.getAttType();
				if (at != null && type != null && type.equals(FormularType.PACKAGE.getConstaint())){
					search.add(at);
				}
			}
			return search;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setAddresses(java.util.List)
	 */
	public void setAddresses(List<CAbstractAttachment> defaults) {
		if (this.attachments != null && this.attachments.size() > 0){
			this.attachments.removeAll(defaults);
			this.attachments.addAll(defaults);
			for (CAbstractAttachment a : defaults) {
				a.setAuth("s");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setPackages(java.util.List)
	 */
	public void setPackages(List<CAbstractAttachment> packages) {
		if (this.attachments != null && this.attachments.size() > 0){
			this.attachments.removeAll(packages);
			this.attachments.addAll(packages);
			for (CAbstractAttachment attachment : packages) {
				attachment.setAuth("s");
			}
		}
	}

	public List<CAbstractAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<CAbstractAttachment> attachments) {
		this.attachments = attachments;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getlastBookingFlight()
	 */
	public CAbstractAttachment getlastBookingFlight() {
		return this.getLastAttachmentFor(FormularType.BKG_FLIGHT);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#getlastBookingFlightList()
	 */
	public List<BookingRequestFlight> getlastBookingFlightList() {
		CAbstractAttachment attBkg = getlastBookingFlight();
		if (attBkg!=null) {
			return attBkg.getBkgFlights();
		}
		return null;
	}

	public CAbstractAttachment getLastAcceptance() {
		return this.getLastAttachmentFor(FormularType.ACCEPTANCE);
	}
	
	public CAbstractAttachment getLastAWBState(){
		return this.getLastAttachmentFor(FormularType.AWB_STATE);
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.formulars.IFormularMain#setBookingRequestFlights(java.util.List)
	 */
	public void setBookingRequestFlights(List<BookingRequestFlight> bookings) {
		CAbstractAttachment attBkg = getlastBookingFlight();
		if (attBkg==null) {
			attBkg =new CBookingFlightAttachment();
			attachments.add(attBkg);
		}
		attBkg.setBkgFlights(bookings);
		attBkg.setAuth("s");
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getFormularDelivery()
	 */
	public CFormularDelivery getFormularDelivery() {
		return (CFormularDelivery) this.getFormular(FormularType.DELIVERY);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getFormularNotoc()
	 */
	public CFormularNotoc getFormularNotoc() {
		return (CFormularNotoc) this.getFormular(FormularType.NOTOC);
	}

	private IFormulars getFormular(FormularType notoc) {
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(notoc)){
					return awb;
				}
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getAlsoNotify()
	 */
	public RSAdd getAlsoNotify() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getAlsoNotify();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#setAlsoNotify()
	 * diky
	 */
	public void setAlsoNotify(RSAdd aNotify) {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null){
			def.getAddresses().setAlsoNotify(aNotify);
			if(aNotify != null && aNotify.getAdd_id() != null){
				def.getAddresses().setAnotify_add_id(aNotify.getAdd_id());
			}
			def.setAuth("s");
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getBank()
	 */
	public RSAdd getBank() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getBank();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getDeliveryTo()
	 */
	public RSAdd getDeliveryTo() {
		CAbstractAttachment def = this.getLastAttachmentFor(FormularType.DELIVERY);
		if (def != null && def.getAddresses() != null){
			return def.getAddresses().getDeliverTo();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#setAlsoNotify()
	 * diky
	 */
	public void setDeliveryTo(RSAdd deliverTo) {
		CAbstractAttachment def = getLastAttachmentFor(FormularType.ADDRESS);
		if (def != null){
			def.getAddresses().setDeliverTo(deliverTo);
			if(deliverTo != null && deliverTo.getAdd_id() != null){
				def.getAddresses().setDeliver_add_id(deliverTo.getAdd_id());
			}
			def.setAuth("s");
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getFormularNotifys()
	 */
	public List<CFormularNotify> getFormularNotifys() {
		if (this.attachments != null && this.attachments.size() > 0){
			List<CFormularNotify> search = new ArrayList<CFormularNotify>();
			for(CAbstractAttachment at:this.attachments){
				String type = at.getAttType();
				if (at != null && type != null && type.equals(FormularType.NOTIFY.getConstaint())){
					search.add((CFormularNotify) at.getFormular());
				}
			}
			if (search.size() > 0){
				return search;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#addFormulars(java.util.List)
	 */
	public void addFormulars(List<IFormulars> formPart) {
		if (formPart!=null)
			for(IFormulars formulars:formPart){
				this.addFormular(formulars);
			}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getlastBookingFlightStates()
	 */
	public List<BookingStates> getlastBookingFlightStates() {
		CAbstractAttachment bkgF = this.getlastBookingFlight();
		Set<BookingFlightState> bkgs = bkgF.getBkgFlightStates();
		List<BookingStates> l = new ArrayList<BookingStates>();
		if (bkgs!=null)
			for(BookingFlightState s:bkgs){
				l.add(s.getBookingState());
			}
		return l;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#setFidAtAttachments(java.lang.String)
	 */
	public void setFidAtAttachments(String f_id) {
		for (CAbstractAttachment a:this.attachments) {
			a.setF_id(f_id);
		}
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getFormularAvi()
	 */
	public IFormulars getFormularAvi() {
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(FormularType.AVI)){
					return awb;
				}
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormularMain#getFormularDgr()
	 */
	public IFormulars getFormularDgr() {
		if (this.formulars != null && this.formulars.size() > 0){
			for(IFormulars awb:formulars){
				if (awb.getType().equals(FormularType.DGR)){
					return awb;
				}
			}
		}
		return null;
	}

	public HashMap<Long, Date> getDep() {
		return dep;
	}

	public void addDep(Long s_flt_id, Date depDate) {
		if(!this.dep.containsKey(s_flt_id)) this.dep.put(s_flt_id, depDate);
		else{
			this.dep.remove(s_flt_id);
			this.dep.put(s_flt_id, depDate);
		}
	}

	public HashMap<Long, Date> getArr() {
		return arr;
	}

	public void addArr(Long s_flt_id, Date arrDate) {
		if(!this.arr.containsKey(s_flt_id)) this.arr.put(s_flt_id, arrDate);
		else{
			this.arr.remove(s_flt_id);
			this.arr.put(s_flt_id, arrDate);
		}
	}
	
	public Date getDep(Long s_flt_id){
		return this.dep.get(s_flt_id);
	}
	
	public Date getArr(Long s_flt_id){
		return this.arr.get(s_flt_id);
	}

	public CAbstractAttachment getLastAttachment(FormularType t) {
		if (attachments != null && attachments.size() > 0){
			List<CAbstractAttachment> search = new ArrayList<CAbstractAttachment>();
			for(CAbstractAttachment at:attachments){
				String type = at.getAttType();
				if (at != null && type != null && type.equals(t.getConstaint())){
					search.add(at);
				}
			}
			if (search.size() > 0){
				Collections.sort(search, new Comparator<CAbstractAttachment>(){
					public int compare(CAbstractAttachment o1, CAbstractAttachment o2) {
						return o1.getAttNo().compareTo(o2.getAttNo());
					}  
				});
				return search.get(search.size() - 1);
			}
		}
		return null;
	}
}
