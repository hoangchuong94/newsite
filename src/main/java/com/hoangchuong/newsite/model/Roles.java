package com.hoangchuong.newsite.model;

import java.sql.Timestamp;

public class Roles extends AbstractModel {

    private String roleName;

    public Roles(Long id, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy, String roleName) {
        super(id, createdDate, modifiedDate, createdBy, modifiedBy);
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
