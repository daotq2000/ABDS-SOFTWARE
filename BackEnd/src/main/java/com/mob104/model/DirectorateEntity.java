package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "directorate", schema = "mob104", catalog = "")
public class DirectorateEntity {
    private long directorateId;
    private int orgId;
    private long contactId;

    @Id
    @Column(name = "DirectorateID")
    public long getDirectorateId() {
        return directorateId;
    }

    public void setDirectorateId(long directorateId) {
        this.directorateId = directorateId;
    }

    @Basic
    @Column(name = "OrgID")
    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
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
        DirectorateEntity that = (DirectorateEntity) o;
        return directorateId == that.directorateId &&
                orgId == that.orgId &&
                contactId == that.contactId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorateId, orgId, contactId);
    }
}
