package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "county", schema = "mob104", catalog = "")
public class CountyEntity {
    private long countyId;
    private long countryId;
    private String countyName;

    @Id
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

    @Basic
    @Column(name = "CountyName")
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountyEntity that = (CountyEntity) o;
        return countyId == that.countyId &&
                countryId == that.countryId &&
                Objects.equals(countyName, that.countyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countyId, countryId, countyName);
    }
}
