package com.mob104.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "service", schema = "mob104", catalog = "")
public class ServiceEntity {
    private long serviceId;
    private String serviceName;
    private String shortDescription;
    private String subType;
    private String clientDescription;
    private Date serviceStart;
    private Date serviceEnd;
    private boolean serviceEntendable;
    private boolean serviceActive;
    private String fullDescription;
    private String deptCode;
    private String deliverDescription;
    private String contractCode;
    private String contractValue;
    private boolean contractPayment;
    private boolean serviceTimelimit;
    private long contactId;

    @Id
    @Column(name = "ServiceID")
    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "serviceName")
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Basic
    @Column(name = "shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "subType")
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    @Basic
    @Column(name = "clientDescription")
    public String getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    @Basic
    @Column(name = "serviceStart")
    public Date getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(Date serviceStart) {
        this.serviceStart = serviceStart;
    }

    @Basic
    @Column(name = "serviceEnd")
    public Date getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(Date serviceEnd) {
        this.serviceEnd = serviceEnd;
    }

    @Basic
    @Column(name = "serviceEntendable")
    public boolean isServiceEntendable() {
        return serviceEntendable;
    }

    public void setServiceEntendable(boolean serviceEntendable) {
        this.serviceEntendable = serviceEntendable;
    }

    @Basic
    @Column(name = "serviceActive")
    public boolean isServiceActive() {
        return serviceActive;
    }

    public void setServiceActive(boolean serviceActive) {
        this.serviceActive = serviceActive;
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
    @Column(name = "deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "deliverDescription")
    public String getDeliverDescription() {
        return deliverDescription;
    }

    public void setDeliverDescription(String deliverDescription) {
        this.deliverDescription = deliverDescription;
    }

    @Basic
    @Column(name = "contractCode")
    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    @Basic
    @Column(name = "contractValue")
    public String getContractValue() {
        return contractValue;
    }

    public void setContractValue(String contractValue) {
        this.contractValue = contractValue;
    }

    @Basic
    @Column(name = "contractPayment")
    public boolean isContractPayment() {
        return contractPayment;
    }

    public void setContractPayment(boolean contractPayment) {
        this.contractPayment = contractPayment;
    }

    @Basic
    @Column(name = "serviceTimelimit")
    public boolean isServiceTimelimit() {
        return serviceTimelimit;
    }

    public void setServiceTimelimit(boolean serviceTimelimit) {
        this.serviceTimelimit = serviceTimelimit;
    }

    @Basic
    @Column(name = "ContactID")
    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceEntity that = (ServiceEntity) o;
        return serviceId == that.serviceId &&
                serviceEntendable == that.serviceEntendable &&
                serviceActive == that.serviceActive &&
                contractPayment == that.contractPayment &&
                serviceTimelimit == that.serviceTimelimit &&
                contactId == that.contactId &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(shortDescription, that.shortDescription) &&
                Objects.equals(subType, that.subType) &&
                Objects.equals(clientDescription, that.clientDescription) &&
                Objects.equals(serviceStart, that.serviceStart) &&
                Objects.equals(serviceEnd, that.serviceEnd) &&
                Objects.equals(fullDescription, that.fullDescription) &&
                Objects.equals(deptCode, that.deptCode) &&
                Objects.equals(deliverDescription, that.deliverDescription) &&
                Objects.equals(contractCode, that.contractCode) &&
                Objects.equals(contractValue, that.contractValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName, shortDescription, subType, clientDescription, serviceStart, serviceEnd, serviceEntendable, serviceActive, fullDescription, deptCode, deliverDescription, contractCode, contractValue, contractPayment, serviceTimelimit, contactId);
    }
}
