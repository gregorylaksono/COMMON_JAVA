package de.act.common.types.staticobjects;

import java.io.Serializable;

public class RSCimpPref implements Serializable {

    private Long id;
    private Long cimp_add_id;
    private Long cimp_id;
    private RSCimp rsCimp;
    private Boolean send;
    private Boolean receive;
    private RSVad validation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCimp_add_id() {
        return cimp_add_id;
    }

    public void setCimp_add_id(Long cimp_add_id) {
        this.cimp_add_id = cimp_add_id;
    }

    public Long getCimp_id() {
        return cimp_id;
    }

    public void setCimp_id(Long cimp_id) {
        this.cimp_id = cimp_id;
    }

    public RSCimp getRsCimp() {
        return rsCimp;
    }

    public void setRsCimp(RSCimp rsCimp) {
        this.rsCimp = rsCimp;
    }

    public Boolean getSend() {
        return send;
    }

    public void setSend(Boolean send) {
        this.send = send;
    }

    public Boolean getReceive() {
        return receive;
    }

    public void setReceive(Boolean receive) {
        this.receive = receive;
    }

    public RSVad getValidation() {
        return validation;
    }

    public void setValidation(RSVad validation) {
        this.validation = validation;
    }

    public String getName() {
        return rsCimp != null ? rsCimp.getName() : null;
    }

    public String getVersion() {
        return rsCimp != null ? rsCimp.getVersion() : null;
    }

    public String getNameVersion() {
        return rsCimp != null ? rsCimp.getName() + "/" + rsCimp.getVersion() : null;
    }

}
