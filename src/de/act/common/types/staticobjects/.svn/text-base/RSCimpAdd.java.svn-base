package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.List;

public class RSCimpAdd implements Serializable{

    private Long id;
    private String ca_id;
    private Long add_id;
    private String addType;
    private String sitaAdd;
    private Boolean emailPlusSita;
    private RSVad validation;
    private List<RSCimpPref> preferences;

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCa_id() {
        return ca_id;
    }

    public void setCa_id(String ca_id) {
        this.ca_id = ca_id;
    }

    public Long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(Long add_id) {
        this.add_id = add_id;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getSitaAdd() {
        return sitaAdd;
    }

    public void setSitaAdd(String sitaAdd) {
        this.sitaAdd = sitaAdd;
    }

    public Boolean getEmailPlusSita() {
        return emailPlusSita;
    }

    public void setEmailPlusSita(Boolean emailPlusSita) {
        this.emailPlusSita = emailPlusSita;
    }

    public RSVad getValidation() {
        return validation;
    }

    public void setValidation(RSVad validation) {
        this.validation = validation;
    }

    public List<RSCimpPref> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<RSCimpPref> preferences) {
        this.preferences = preferences;
    }

    public String getVersion(String cimpName) {
        if (preferences != null) {
            for (RSCimpPref p : preferences) {
                if (cimpName.equals(p.getRsCimp().getName()))
                    return p.getRsCimp().getVersion();
            }
        }
        return null;
    }

}
