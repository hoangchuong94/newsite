package com.hoangchuong.newsite.model;

import java.sql.Timestamp;

public class Users extends AbstractModel {
    private String fullName;
    private String userName;
    private String userPassword;
    private int userStatus;
    private Long roleId;


    public Users(Long id, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy, String fullName, String userName, String userPassword, int userStatus, Long roleId) {
        super(id, createdDate, modifiedDate, createdBy, modifiedBy);
        this.fullName = fullName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userStatus = userStatus;
        this.roleId = roleId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
