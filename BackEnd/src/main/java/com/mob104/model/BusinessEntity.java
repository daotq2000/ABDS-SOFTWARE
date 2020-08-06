package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "business", schema = "mob104", catalog = "")
public class BusinessEntity {
    private long businessId;
    private String businessName;
    private String sic2007;
    private String sic2003;
    private String shortDepcription;
    private boolean coppyAddress;
    private String address1;
    private String cityTown;
    private String nationCountry;
    private String country;
    private String fullDescription;
    private String sicCode;
    private String phone;
    private String fax;
    private String email;
    private String website;
    private String charityNumber;
    private String companyNumber;

    @Id
    @Column(name = "BusinessID")
    public long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(long businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "BusinessName")
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "Sic2007")
    public String getSic2007() {
        return sic2007;
    }

    public void setSic2007(String sic2007) {
        this.sic2007 = sic2007;
    }

    @Basic
    @Column(name = "Sic2003")
    public String getSic2003() {
        return sic2003;
    }

    public void setSic2003(String sic2003) {
        this.sic2003 = sic2003;
    }

    @Basic
    @Column(name = "shortDepcription")
    public String getShortDepcription() {
        return shortDepcription;
    }

    public void setShortDepcription(String shortDepcription) {
        this.shortDepcription = shortDepcription;
    }

    @Basic
    @Column(name = "coppyAddress")
    public boolean isCoppyAddress() {
        return coppyAddress;
    }

    public void setCoppyAddress(boolean coppyAddress) {
        this.coppyAddress = coppyAddress;
    }

    @Basic
    @Column(name = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "cityTown")
    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    @Basic
    @Column(name = "nationCountry")
    public String getNationCountry() {
        return nationCountry;
    }

    public void setNationCountry(String nationCountry) {
        this.nationCountry = nationCountry;
    }

    @Basic
    @Column(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "fullDescription")
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Basic
    @Column(name = "sicCode")
    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "charityNumber")
    public String getCharityNumber() {
        return charityNumber;
    }

    public void setCharityNumber(String charityNumber) {
        this.charityNumber = charityNumber;
    }

    @Basic
    @Column(name = "companyNumber")
    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessEntity that = (BusinessEntity) o;
        return businessId == that.businessId &&
                coppyAddress == that.coppyAddress &&
                Objects.equals(businessName, that.businessName) &&
                Objects.equals(sic2007, that.sic2007) &&
                Objects.equals(sic2003, that.sic2003) &&
                Objects.equals(shortDepcription, that.shortDepcription) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(cityTown, that.cityTown) &&
                Objects.equals(nationCountry, that.nationCountry) &&
                Objects.equals(country, that.country) &&
                Objects.equals(fullDescription, that.fullDescription) &&
                Objects.equals(sicCode, that.sicCode) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(email, that.email) &&
                Objects.equals(website, that.website) &&
                Objects.equals(charityNumber, that.charityNumber) &&
                Objects.equals(companyNumber, that.companyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, businessName, sic2007, sic2003, shortDepcription, coppyAddress, address1, cityTown, nationCountry, country, fullDescription, sicCode, phone, fax, email, website, charityNumber, companyNumber);
    }
}
