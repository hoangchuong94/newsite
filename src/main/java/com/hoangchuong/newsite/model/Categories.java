package com.hoangchuong.newsite.model;

import java.sql.Timestamp;

public class Categories extends AbstractModel{
    private String nameCategory;


    public Categories(Long id, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy) {
        super(id, createdDate, modifiedDate, createdBy, modifiedBy);
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
