package de.act.common.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.GrantedAuthorityImpl;
import org.acegisecurity.userdetails.UserDetails;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class User implements UserDetails, Serializable {

	private static final long serialVersionUID = -6793073686480611599L;
	private final String	id;
	private final String	name;
	private  String			firstName;
	private  String			famName;
	private  String 		password;
	private  boolean		enabled;
	private  Set<String>	acts;
	private  Integer		addId;
	private  Long			desktop;
	private  String 		userSignature;
	private  String 		ca_id;
	private  Integer 		s_id;
	private  String			ca_2lc;
	private  String			ca_3dg;
	private  List<String> 	listAvailableForm;
	private  List<FormRight> listFormRight;
	private  Integer        showScheduler;
	private  Integer        alertTime;
	private  Integer        refreshInterval;
	private  Long           r_id;
	private Short			status;
	private String			ap_3lc;
	private String			type;
	private String          cur_3lc;
	
	private Long 			add_imp_agt;
	private Long 			add_exp_agt;
	private String			user_lang;
	private Long 			parent_id;

	public User(final String id, final String name, final String  firstName, final String  famName,
			final String password, final Integer addId, final boolean enabled,final Long folderId, final Long r_id, final List<String> actions, final List<String> forms, final List<FormRight> listFormRight, final Integer showScheduler, final Integer alertTime, final Integer refreshInterval) {
		this.id        = id;
		this.name      = name;
		this.firstName = firstName;
		this.famName   = famName;
		this.password  = password;
		this.addId     = addId;
		this.r_id      = r_id;
		this.enabled   = enabled;
		this.showScheduler = showScheduler;
		this.alertTime = alertTime;
		this.refreshInterval = refreshInterval;
		if (actions!=null) {
			this.acts      = new HashSet<String>(actions);
		} 
		else {
			this.acts = new HashSet<String>();
		}
		
		if(forms != null){
			this.listAvailableForm = new ArrayList<String>(forms);
		}
		else{
			this.listAvailableForm = new ArrayList<String>();
		}
		
		if(listFormRight != null){
			this.listFormRight = new ArrayList<FormRight>(listFormRight);
		}
		else{
			this.listFormRight = new ArrayList<FormRight>();
		}
		
		this.desktop = folderId;
	}
	
	public User(final String id, final String name, final String  firstName, final String  famName,
			final String password, final Integer addId, final boolean enabled,final Long folderId, final Long r_id, final List<String> actions, final List<String> forms, final List<FormRight> listFormRight, final Integer showScheduler, final Integer alertTime, final Integer refreshInterval, final Short status) {
		this.id        = id;
		this.name      = name;
		this.firstName = firstName;
		this.famName   = famName;
		this.password  = password;
		this.addId     = addId;
		this.r_id      = r_id;
		this.enabled   = enabled;
		this.showScheduler = showScheduler;
		this.alertTime = alertTime;
		this.refreshInterval = refreshInterval;
		if (actions!=null) {
			this.acts      = new HashSet<String>(actions);
		} 
		else {
			this.acts = new HashSet<String>();
		}
		
		if(forms != null){
			this.listAvailableForm = new ArrayList<String>(forms);
		}
		else{
			this.listAvailableForm = new ArrayList<String>();
		}
		
		if(listFormRight != null){
			this.listFormRight = new ArrayList<FormRight>(listFormRight);
		}
		else{
			this.listFormRight = new ArrayList<FormRight>();
		}
		
		this.desktop = folderId;
		this.status = status;
	}
	
	public User(final String id, final String name, final String  firstName, final String  famName,
			final String password, final Integer addId, final boolean enabled,final Long folderId, final Long r_id, final List<String> actions, final List<String> forms, final List<FormRight> listFormRight, final Integer showScheduler, final Integer alertTime, final Integer refreshInterval, final Short status, final String user_lang) {
		this.id        = id;
		this.name      = name;
		this.firstName = firstName;
		this.famName   = famName;
		this.password  = password;
		this.addId     = addId;
		this.r_id      = r_id;
		this.enabled   = enabled;
		this.showScheduler = showScheduler;
		this.alertTime = alertTime;
		this.refreshInterval = refreshInterval;
		if (actions!=null) {
			this.acts      = new HashSet<String>(actions);
		} 
		else {
			this.acts = new HashSet<String>();
		}
		
		if(forms != null){
			this.listAvailableForm = new ArrayList<String>(forms);
		}
		else{
			this.listAvailableForm = new ArrayList<String>();
		}
		
		if(listFormRight != null){
			this.listFormRight = new ArrayList<FormRight>(listFormRight);
		}
		else{
			this.listFormRight = new ArrayList<FormRight>();
		}
		
		this.desktop = folderId;
		this.status = status;
		
		this.user_lang = user_lang;
	}
	
	public User(final String id, final String name, final String  firstName, final String  famName,
			final String password, final Integer addId, final boolean enabled,final Long folderId, final List<String> actions) {
		this.id        = id;
		this.name      = name;
		this.firstName = firstName;
		this.famName   = famName;
		this.password  = password;
		this.addId     = addId;
		this.enabled   = enabled;
		if (actions!=null) {
			this.acts      = new HashSet<String>(actions);
		} 
		else {
			this.acts = new HashSet<String>();
		}
		
		this.desktop = folderId;
	}

	public User(String userName, Integer addId2) {
		this.name = userName;
		this.addId = addId2;
		this.id = userName;

	}

	public GrantedAuthority[] getAuthorities() {
		final GrantedAuthority[] auths = new GrantedAuthority[this.acts.size()];
		final Iterator<String> iter = this.acts.iterator();
		for (int i = 0; i < auths.length; i++) {
			auths[i] = new GrantedAuthorityImpl(
					"ROLE_" + iter.next().toUpperCase());
		}
		return auths;
	}

	public Set<String> getActions() {
		return this.acts;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public String getUsername() {
		return this.name;
	}

	public String getUserId() {
		return this.name;
	}

	public String getRealUserId() {
		return this.id;
	}

	public String getUserFirstName() {
		return this.firstName;
	}

	public String getUserFamilyName() {
		return this.famName;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public synchronized Integer getAddId() {
		return this.addId;
	}

	public void setAddId(Integer add_id){
		this.addId = add_id;
	}

	public synchronized Long getDesktop() {
		return this.desktop;
	}

	public String getUserSignature() {
		return userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}

	public List<String> getListAvailableForm() {
		return listAvailableForm;
	}

	public void setListAvailableForm(List<String> listAvailableForm) {
		this.listAvailableForm = listAvailableForm;
	}

	public List<FormRight> getListFormRight() {
		return listFormRight;
	}

	public void setListFormRight(List<FormRight> listFormRight) {
		this.listFormRight = listFormRight;
	}
	
	public Integer getShowScheduler() {
		return showScheduler;
	}

	public void setShowScheduler(Integer showScheduler) {
		this.showScheduler = showScheduler;
	}

	public Integer getAlertTime() {
		return alertTime;
	}

	public void setAlertTime(Integer alertTime) {
		this.alertTime = alertTime;
	}

	public Integer getRefreshInterval() {
		return refreshInterval;
	}

	public void setRefreshInterval(Integer refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public Long getR_id() {
		return r_id;
	}

	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}

	public Short getStatus()
	{
		return status;
	}

	public void setStatus(Short status)
	{
		this.status = status;
	}

	public String getAp_3lc()
	{
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc)
	{
		this.ap_3lc = ap_3lc;
	}
	
	public String getType()
	{
		return type;
	}

	public String getCur_3lc() {
		return cur_3lc;
	}

	public void setCur_3lc(String cur_3lc) {
		this.cur_3lc = cur_3lc;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Long getAdd_imp_agt()
	{
		return add_imp_agt;
	}

	public void setAdd_imp_agt(Long add_imp_agt)
	{
		this.add_imp_agt = add_imp_agt;
	}

	public Long getAdd_exp_agt()
	{
		return add_exp_agt;
	}

	public void setAdd_exp_agt(Long add_exp_agt)
	{
		this.add_exp_agt = add_exp_agt;
	}

	public String getUser_lang()
	{
		return user_lang;
	}

	public void setUser_lang(String user_lang)
	{
		this.user_lang = user_lang;
	}

	public Long getParent_id()
	{
		return parent_id;
	}

	public void setParent_id(Long parent_id)
	{
		this.parent_id = parent_id;
	}

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	/**
	 * 16.02.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof User) {
			if (((User)obj).id.equals(this.id)) {
				return true;
			}
			else {
				return false;
			}
		}
		return super.equals(obj);
	}

	/**
	 * 16.02.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (this.id!=null) {
			re += 37* this.id.hashCode();
			return re;
		}
		return super.hashCode();
	}
}
