package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "town", schema = "mob104", catalog = "")
public class TownEntity {
    private long townId;
    private long countyId;
    private long country;
    private String townName;

    @Id
    @Column(name = "TownID")
    public long getTownId() {
        return townId;
    }

    public void setTownId(long townId) {
        this.townId = townId;
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
    @Column(name = "Country")
    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    @Basic
    @Column(name = "TownName")
    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TownEntity that = (TownEntity) o;
        return townId == that.townId &&
                countyId == that.countyId &&
                country == that.country &&
                Objects.equals(townName, that.townName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(townId, countyId, country, townName);
    }
}
