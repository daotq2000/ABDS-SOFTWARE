package com.mob104.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "premise", schema = "mob104", catalog = "")
public class PremiseEntity {
    private long premiseId;
    private String premiseName;
    private String locationName;
    private String knowas;
    private Date locationstatusDate;
    private String cityTown;
    private String country;
    private String nationCountry;
    private boolean primaryLocation;
    private boolean locationManager;
    private boolean stNetworkConnectivity;
    private String locationDescription;
    private String genaralFaxNumber;
    private String minisecondNumber;
    private boolean isNew;
    private Date flagDate;
    private String address;
    private String phoneNumber;
    private String projectCode;
    private boolean isActive;
    private boolean specialShop;
    private long serviceId;

    @Id
    @Column(name = "PremiseID")
    public long getPremiseId() {
        return premiseId;
    }

    public void setPremiseId(long premiseId) {
        this.premiseId = premiseId;
    }

    @Basic
    @Column(name = "premiseName")
    public String getPremiseName() {
        return premiseName;
    }

    public void setPremiseName(String premiseName) {
        this.premiseName = premiseName;
    }

    @Basic
    @Column(name = "locationName")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "knowas")
    public String getKnowas() {
        return knowas;
    }

    public void setKnowas(String knowas) {
        this.knowas = knowas;
    }

    @Basic
    @Column(name = "locationstatusDate")
    public Date getLocationstatusDate() {
        return locationstatusDate;
    }

    public void setLocationstatusDate(Date locationstatusDate) {
        this.locationstatusDate = locationstatusDate;
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
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    @Column(name = "primaryLocation")
    public boolean isPrimaryLocation() {
        return primaryLocation;
    }

    public void setPrimaryLocation(boolean primaryLocation) {
        this.primaryLocation = primaryLocation;
    }

    @Basic
    @Column(name = "locationManager")
    public boolean isLocationManager() {
        return locationManager;
    }

    public void setLocationManager(boolean locationManager) {
        this.locationManager = locationManager;
    }

    @Basic
    @Column(name = "stNetworkConnectivity")
    public boolean isStNetworkConnectivity() {
        return stNetworkConnectivity;
    }

    public void setStNetworkConnectivity(boolean stNetworkConnectivity) {
        this.stNetworkConnectivity = stNetworkConnectivity;
    }

    @Basic
    @Column(name = "locationDescription")
    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    @Basic
    @Column(name = "genaralFaxNumber")
    public String getGenaralFaxNumber() {
        return genaralFaxNumber;
    }

    public void setGenaralFaxNumber(String genaralFaxNumber) {
        this.genaralFaxNumber = genaralFaxNumber;
    }

    @Basic
    @Column(name = "minisecondNumber")
    public String getMinisecondNumber() {
        return minisecondNumber;
    }

    public void setMinisecondNumber(String minisecondNumber) {
        this.minisecondNumber = minisecondNumber;
    }

    @Basic
    @Column(name = "isNew")
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Basic
    @Column(name = "flagDate")
    public Date getFlagDate() {
        return flagDate;
    }

    public void setFlagDate(Date flagDate) {
        this.flagDate = flagDate;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "projectCode")
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
    @Column(name = "specialShop")
    public boolean isSpecialShop() {
        return specialShop;
    }

    public void setSpecialShop(boolean specialShop) {
        this.specialShop = specialShop;
    }

    @Basic
    @Column(name = "ServiceID")
    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PremiseEntity that = (PremiseEntity) o;
        return premiseId == that.premiseId &&
                primaryLocation == that.primaryLocation &&
                locationManager == that.locationManager &&
                stNetworkConnectivity == that.stNetworkConnectivity &&
                isNew == that.isNew &&
                isActive == that.isActive &&
                specialShop == that.specialShop &&
                serviceId == that.serviceId &&
                Objects.equals(premiseName, that.premiseName) &&
                Objects.equals(locationName, that.locationName) &&
                Objects.equals(knowas, that.knowas) &&
                Objects.equals(locationstatusDate, that.locationstatusDate) &&
                Objects.equals(cityTown, that.cityTown) &&
                Objects.equals(country, that.country) &&
                Objects.equals(nationCountry, that.nationCountry) &&
                Objects.equals(locationDescription, that.locationDescription) &&
                Objects.equals(genaralFaxNumber, that.genaralFaxNumber) &&
                Objects.equals(minisecondNumber, that.minisecondNumber) &&
                Objects.equals(flagDate, that.flagDate) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(projectCode, that.projectCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(premiseId, premiseName, locationName, knowas, locationstatusDate, cityTown, country, nationCountry, primaryLocation, locationManager, stNetworkConnectivity, locationDescription, genaralFaxNumber, minisecondNumber, isNew, flagDate, address, phoneNumber, projectCode, isActive, specialShop, serviceId);
    }
}
