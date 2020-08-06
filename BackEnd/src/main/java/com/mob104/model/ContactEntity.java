package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "mob104", catalog = "")
public class ContactEntity {
    private long contactId;
    private String firstname;
    private Integer managerId;

    @Id
    @Column(name = "ContactID")
    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "ManagerID")
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactEntity that = (ContactEntity) o;
        return contactId == that.contactId &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(managerId, that.managerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, firstname, managerId);
    }
}
