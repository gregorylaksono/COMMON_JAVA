package de.act.common.types;

import java.io.Serializable;
import java.util.Set;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RateUld implements Serializable {

    private static final long serialVersionUID = 9142756159731424358L;
    private long         uldId     = -1L;
    private String       uldRate   = null;
    private boolean      packaging = false;
    private boolean      exclusive = true;
    private double       height    = 0.0;
    private Set<Integer> indices   = null;

    public boolean isExclusive() {
        return this.exclusive;
    }

    public void setExclusive(final boolean exclusive) {
        this.exclusive = exclusive;
    }

    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(final double height) {
        this.height = height;
    }

    public Set<Integer> getIndices() {
        return this.indices;
    }

    public void setIndices(final Set<Integer> indices) {
        this.indices = indices;
    }

    public boolean isPackaging() {
        return this.packaging;
    }

    public void setPackaging(final boolean packaging) {
        this.packaging = packaging;
    }

    public long getUldId() {
        return this.uldId;
    }

    public void setUldId(final long uldId) {
        this.uldId = uldId;
    }
    
    public String getUldRate() {
        return this.uldRate;
    }

    public void setUldRate(String uldRate) {
        this.uldRate = uldRate;
    }
} // class RateUld
