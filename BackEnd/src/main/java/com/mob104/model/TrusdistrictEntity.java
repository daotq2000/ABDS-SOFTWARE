package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trusdistrict", schema = "mob104", catalog = "")
public class TrusdistrictEntity {
    private int trustDistrictId;
    private String name;
    private String description;
    private boolean isActive;
    private long trustRegionId;

    @Id
    @Column(name = "TrustDistrictID")
    public int getTrustDistrictId() {
        return trustDistrictId;
    }

    public void setTrustDistrictId(int trustDistrictId) {
        this.trustDistrictId = trustDistrictId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "isActive")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "TrustRegionID")
    public long getTrustRegionId() {
        return trustRegionId;
    }

    public void setTrustRegionId(long trustRegionId) {
        this.trustRegionId = trustRegionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrusdistrictEntity that = (TrusdistrictEntity) o;
        return trustDistrictId == that.trustDistrictId &&
                isActive == that.isActive &&
                trustRegionId == that.trustRegionId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustDistrictId, name, description, isActive, trustRegionId);
    }
}
