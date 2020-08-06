package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "mob104", catalog = "")
public class CountryEntity {
    private long countryId;
    private String countryName;

    @Id
    @Column(name = "CountryID")
    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "CountryName")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return countryId == that.countryId &&
                Objects.equals(countryName, that.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, countryName);
    }
}
