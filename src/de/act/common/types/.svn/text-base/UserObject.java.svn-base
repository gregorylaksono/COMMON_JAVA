package de.act.common.types;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;

import de.act.common.types.staticobjects.RSAdd;

public class UserObject implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 19.02.2007
	 */
	private static final long serialVersionUID = -5624495287939223417L;
	private String             id;
	private String             name;
	private String             firstName;
	private String             famName;
	private String             password;
	private String             sign; 
	private Integer            enabled = 1;
	private Set<String>        acts;
	private String 				exportAgent;
	private Integer 			addId;
	private Integer				show_scheduler;
	private Integer				alert_time;
	private Integer 			refresh_interval;
	private Long             	desktop;
	private RSAdd 				address;
	private String 				ca_id;
	private String				user_lang;
	private Long 				r_id;
	private Integer				mani_interval_days;
	private Integer				mani_interval_hours;
	private String userSignature;
	private boolean passwordChanged;
	private Long ruleId;
	private List<String> listAp;
	private String 				plainPass;
	private Short status;
	private String cur3lc;
	private Long ac_id;
	
	public UserObject() {
		
	}

	public UserObject(String name) {
		super();
		this.name = name;
	}
	
	
	public String getCur3lc() {
		return cur3lc;
	}

	public void setCur3lc(String cur3lc) {
		this.cur3lc = cur3lc;
	}

	public String getUserSignature() {
		return userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}

	public boolean isPasswordChanged() {
		return passwordChanged;
	}

	public void setPasswordChanged(boolean passwordChanged) {
		this.passwordChanged = passwordChanged;
	}

	public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public List<String> getListAp() {
		return listAp;
	}

	public void setListAp(List<String> listAp) {
		this.listAp = listAp;
	}				

	/**
	 * 16.02.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof UserObject) {
			return new EqualsBuilder().append(((UserObject)obj).name, name).append(((UserObject)obj).address, address).isEquals();
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
		if (this.address!=null) {
			re += 37* this.address.hashCode();
		}
		if (this.name!=null) {
			re += 37* this.name.hashCode();
		}
		if (re==17) return super.hashCode();
		return re;
	}

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public Integer getShow_scheduler() {
		return show_scheduler;
	}

	public void setShow_scheduler(Integer show_scheduler) {
		this.show_scheduler = show_scheduler;
	}

	public Integer getAlert_time() {
		return alert_time;
	}

	public void setAlert_time(Integer alert_time) {
		this.alert_time = alert_time;
	}

	public Integer getRefresh_interval() {
		return refresh_interval;
	}

	public void setRefresh_interval(Integer refresh_interval) {
		this.refresh_interval = refresh_interval;
	}

	public Long getDesktop() {
		return desktop;
	}

	public void setDesktop(Long desktop) {
		this.desktop = desktop;
	}

	public boolean isEnabled() {
		return enabled!=null  && enabled.equals(new Integer(1));
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getFamName() {
		return famName;
	}

	public void setFamName(String famName) {
		this.famName = famName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public Set<String> getActs() {
		return this.acts;
	}

	public void setActs(Set<String> acts) {
		this.acts = acts;
	}

	public RSAdd getAddress() {
		return this.address;
	}

	public void setAddress(RSAdd address) {
		this.address = address;
	}

	public String getExportAgent() {
		return this.exportAgent;
	}

	public void setExportAgent(String exportAgent) {
		this.exportAgent = exportAgent;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public String getUser_lang() {
		return user_lang;
	}

	public void setUser_lang(String user_lang) {
		this.user_lang = user_lang;
	}

	public Long getR_id() {
		return r_id;
	}

	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}

	public Integer getMani_interval_days() {
		return mani_interval_days;
	}

	public void setMani_interval_days(Integer mani_interval_days) {
		this.mani_interval_days = mani_interval_days;
	}

	public Integer getMani_interval_hours() {
		return mani_interval_hours;
	}

	public void setMani_interval_hours(Integer mani_interval_hours) {
		this.mani_interval_hours = mani_interval_hours;
	}

	public String getPlainPass() {
		return plainPass;
	}

	public void setPlainPass(String plainPass) {
		this.plainPass = plainPass;
	}

	public Short getStatus()
	{
		return status;
	}

	public void setStatus(Short status)
	{
		this.status = status;
	}

	public Long getAc_id() {
		return ac_id;
	}

	public void setAc_id(Long ac_id) {
		this.ac_id = ac_id;
	}
	
}
