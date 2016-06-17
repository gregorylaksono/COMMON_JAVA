package de.act.common.types;

import java.io.Serializable;

public class WgtVol implements Serializable {

    /**
     * @author Martin Sachs
     * @since 1.0 - 11.10.2006
     */
    private static final long serialVersionUID = 6724430454247408261L;
    private double wgt = 0.0;
    private double vol = 0.0;

    public WgtVol(double wgt, double vol) {
	   this();
	   this.wgt = wgt;
	   this.vol = vol;
    }

    public WgtVol() {
	   super();
    }

    public double getVol() {
        return this.vol;
    }

    public void setVol(Double vol) {
        if (vol == null) {
            this.vol = 0.0;
        } 
        else if (vol.isNaN() || vol.isInfinite()) {
            throw new IllegalArgumentException("Illegal volume value: " + vol);
        } 
        else {
            this.vol = vol.doubleValue();
        }
    }

    public double getWgt() {
        return this.wgt;
    }

    public void setWgt(Double wgt) {
        if (wgt == null) {
            this.wgt = 0.0;
        } 
        else if (wgt.isNaN() || wgt.isInfinite()) {
            throw new IllegalArgumentException("Illegal volume value: " + wgt);
        } 
        else {
            this.wgt = wgt.doubleValue();
        }
    }
}
