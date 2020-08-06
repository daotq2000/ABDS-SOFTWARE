package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "govofficeregion", schema = "mob104", catalog = "")
public class GovofficeregionEntity {
    private long govOfficeRegionId;
    private String govOfficeRegionName;
    private boolean isActive;
    private long countyId;
    private long countryId;

    @Id
    @Column(name = "GovOfficeRegionID")
    public long getGovOfficeRegionId() {
        return govOfficeRegionId;
    }

    public void setGovOfficeRegionId(long govOfficeRegionId) {
        this.govOfficeRegionId = govOfficeRegionId;
    }

    @Basic
    @Column(name = "GovOfficeRegionName")
    public String getGovOfficeRegionName() {
        return govOfficeRegionName;
    }

    public void setGovOfficeRegionName(String govOfficeRegionName) {
        this.govOfficeRegionName = govOfficeRegionName;
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
    @Column(name = "CountyID")
    public long getCountyId() {
        return countyId;
    }

    public void setCountyId(long countyId) {
        this.countyId = countyId;
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
        GovofficeregionEntity that = (GovofficeregionEntity) o;
        return govOfficeRegionId == that.govOfficeRegionId &&
                isActive == that.isActive &&
                countyId == that.countyId &&
                countryId == that.countryId &&
                Objects.equals(govOfficeRegionName, that.govOfficeRegionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(govOfficeRegionId, govOfficeRegionName, isActive, countyId, countryId);
    }
}
