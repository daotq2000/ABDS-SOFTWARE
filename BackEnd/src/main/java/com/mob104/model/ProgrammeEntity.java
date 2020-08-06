package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "programme", schema = "mob104", catalog = "")
public class ProgrammeEntity {
    private long programmeId;
    private String programeName;
    private String description;
    private boolean isactive;
    private long contactId;

    @Id
    @Column(name = "ProgrammeID")
    public long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(long programmeId) {
        this.programmeId = programmeId;
    }

    @Basic
    @Column(name = "programeName")
    public String getProgrameName() {
        return programeName;
    }

    public void setProgrameName(String programeName) {
        this.programeName = programeName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "isactive")
    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
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
        ProgrammeEntity that = (ProgrammeEntity) o;
        return programmeId == that.programmeId &&
                isactive == that.isactive &&
                contactId == that.contactId &&
                Objects.equals(programeName, that.programeName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programmeId, programeName, description, isactive, contactId);
    }
}
