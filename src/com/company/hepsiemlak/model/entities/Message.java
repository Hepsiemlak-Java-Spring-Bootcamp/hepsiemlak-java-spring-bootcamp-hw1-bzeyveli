package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;

import java.util.Date;

public class Message extends DateAudit {

    // Parametre sayısı fazla olduğu için Builder Design Pattern uygulanacak. UNUTMA !!!!
    private Long id;

   // private AuthUser user;
    private Long userId;

    private String title;

    private String description;

    private Date sendDate;

    private Date readDate;

    public Message(Long id, Long userId, String title, String description, Date sendDate, Date readDate) {

        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.sendDate = sendDate;
        this.readDate = readDate;
    }

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }
}
