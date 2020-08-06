package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "mob104", catalog = "")
public class AddressEntity {
    private long addressId;
    private String postCode;
    private long townId;
    private long countyId;
    private long countryId;

    @Id
    @Column(name = "AddressID")
    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "PostCode")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
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
        AddressEntity that = (AddressEntity) o;
        return addressId == that.addressId &&
                townId == that.townId &&
                countyId == that.countyId &&
                countryId == that.countryId &&
                Objects.equals(postCode, that.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, postCode, townId, countyId, countryId);
    }
}
