package com.hoangchuong.newsite.model;

import java.sql.Timestamp;

public class News extends AbstractModel{
    private String title;
    private String thumbNail;
    private String shortDescription;
    private String content;
    private Long categoryId;

    public News(Long id, Timestamp createdDate, Timestamp modifiedDate, String createdBy, String modifiedBy, String title, String thumbNail, String shortDescription, String content, Long categoryId) {
        super(id, createdDate, modifiedDate, createdBy, modifiedBy);
        this.title = title;
        this.thumbNail = thumbNail;
        this.shortDescription = shortDescription;
        this.content = content;
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
