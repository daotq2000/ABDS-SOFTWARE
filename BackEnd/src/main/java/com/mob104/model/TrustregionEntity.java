package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trustregion", schema = "mob104", catalog = "")
public class TrustregionEntity {
    private long trustRegionId;
    private String name;
    private String description;
    private boolean isActive;
    private long countryId;

    @Id
    @Column(name = "TrustRegionID")
    public long getTrustRegionId() {
        return trustRegionId;
    }

    public void setTrustRegionId(long trustRegionId) {
        this.trustRegionId = trustRegionId;
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
    @Column(name = "CountryID")
    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrustregionEntity that = (TrustregionEntity) o;
        return trustRegionId == that.trustRegionId &&
                isActive == that.isActive &&
                countryId == that.countryId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustRegionId, name, description, isActive, countryId);
    }
}
