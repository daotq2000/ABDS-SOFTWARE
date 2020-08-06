package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team", schema = "mob104", catalog = "")
public class TeamEntity {
    private long teamId;
    private String teamName;
    private long departmentId;
    private long contactId;
    private String shortDepcription;
    private String address1;
    private String postcode;
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
    @Column(name = "TeamID")
    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "teamName")
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Basic
    @Column(name = "DepartmentID")
    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
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
    @Column(name = "shortDepcription")
    public String getShortDepcription() {
        return shortDepcription;
    }

    public void setShortDepcription(String shortDepcription) {
        this.shortDepcription = shortDepcription;
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
    @Column(name = "postcode")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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
        TeamEntity that = (TeamEntity) o;
        return teamId == that.teamId &&
                departmentId == that.departmentId &&
                contactId == that.contactId &&
                Objects.equals(teamName, that.teamName) &&
                Objects.equals(shortDepcription, that.shortDepcription) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(postcode, that.postcode) &&
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
        return Objects.hash(teamId, teamName, departmentId, contactId, shortDepcription, address1, postcode, cityTown, nationCountry, country, fullDescription, sicCode, phone, fax, email, website, charityNumber, companyNumber);
    }
}
