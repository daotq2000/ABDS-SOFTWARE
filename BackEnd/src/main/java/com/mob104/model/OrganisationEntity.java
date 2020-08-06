package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organisation", schema = "mob104", catalog = "")
public class OrganisationEntity {
    private int orgId;
    private String orgname;
    private String address1;
    private boolean isActive;
    private String shortDepcription;
    private String cityTown;
    private String country;
    private long contactId;
    private String nationCountry;
    private Boolean preferenceOrg;
    private boolean exInternet;
    private String sicCode;
    private String fullDescription;
    private String phone;
    private String fax;
    private String website;
    private String charityNumber;
    private String companyNumber;
    private String email;

    @Id
    @Column(name = "OrgID")
    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "Orgname")
    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
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
    @Column(name = "isActive")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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
    @Column(name = "cityTown")
    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
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
    @Column(name = "ContactID")
    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
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
    @Column(name = "preferenceOrg")
    public Boolean getPreferenceOrg() {
        return preferenceOrg;
    }

    public void setPreferenceOrg(Boolean preferenceOrg) {
        this.preferenceOrg = preferenceOrg;
    }

    @Basic
    @Column(name = "exInternet")
    public boolean isExInternet() {
        return exInternet;
    }

    public void setExInternet(boolean exInternet) {
        this.exInternet = exInternet;
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
    @Column(name = "fullDescription")
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
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

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganisationEntity that = (OrganisationEntity) o;
        return orgId == that.orgId &&
                isActive == that.isActive &&
                contactId == that.contactId &&
                exInternet == that.exInternet &&
                Objects.equals(orgname, that.orgname) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(shortDepcription, that.shortDepcription) &&
                Objects.equals(cityTown, that.cityTown) &&
                Objects.equals(country, that.country) &&
                Objects.equals(nationCountry, that.nationCountry) &&
                Objects.equals(preferenceOrg, that.preferenceOrg) &&
                Objects.equals(sicCode, that.sicCode) &&
                Objects.equals(fullDescription, that.fullDescription) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(website, that.website) &&
                Objects.equals(charityNumber, that.charityNumber) &&
                Objects.equals(companyNumber, that.companyNumber) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, orgname, address1, isActive, shortDepcription, cityTown, country, contactId, nationCountry, preferenceOrg, exInternet, sicCode, fullDescription, phone, fax, website, charityNumber, companyNumber, email);
    }
}
