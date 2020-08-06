package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "referencedata", schema = "mob104", catalog = "")
public class ReferencedataEntity {
    private long refId;
    private String refCode;
    private String refValue;

    @Id
    @Column(name = "RefID")
    public long getRefId() {
        return refId;
    }

    public void setRefId(long refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "RefCode")
    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    @Basic
    @Column(name = "RefValue")
    public String getRefValue() {
        return refValue;
    }

    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferencedataEntity that = (ReferencedataEntity) o;
        return refId == that.refId &&
                Objects.equals(refCode, that.refCode) &&
                Objects.equals(refValue, that.refValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, refCode, refValue);
    }
}
