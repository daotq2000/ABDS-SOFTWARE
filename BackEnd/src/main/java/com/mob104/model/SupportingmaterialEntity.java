package com.mob104.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "supportingmaterial", schema = "mob104", catalog = "")
public class SupportingmaterialEntity {
    private int supportingMaterialId;
    private int orgId;
    private int userId;
    private String url;
    private String description;
    private String type;
    private String addBy;
    private Date addDate;

    @Id
    @Column(name = "SupportingMaterialID")
    public int getSupportingMaterialId() {
        return supportingMaterialId;
    }

    public void setSupportingMaterialId(int supportingMaterialId) {
        this.supportingMaterialId = supportingMaterialId;
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
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "addBy")
    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    @Basic
    @Column(name = "addDate")
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupportingmaterialEntity that = (SupportingmaterialEntity) o;
        return supportingMaterialId == that.supportingMaterialId &&
                orgId == that.orgId &&
                userId == that.userId &&
                Objects.equals(url, that.url) &&
                Objects.equals(description, that.description) &&
                Objects.equals(type, that.type) &&
                Objects.equals(addBy, that.addBy) &&
                Objects.equals(addDate, that.addDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportingMaterialId, orgId, userId, url, description, type, addBy, addDate);
    }
}
