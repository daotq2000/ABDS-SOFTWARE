package com.mob104.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "mob104", catalog = "")
public class UsersEntity {
    private int userid;
    private String accounts;
    private String email;
    private int role;
    private String passwords;

    @Id
    @Column(name = "USERID")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "ACCOUNTS")
    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ROLE")
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "PASSWORDS")
    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return userid == that.userid &&
                role == that.role &&
                Objects.equals(accounts, that.accounts) &&
                Objects.equals(email, that.email) &&
                Objects.equals(passwords, that.passwords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, accounts, email, role, passwords);
    }
}
