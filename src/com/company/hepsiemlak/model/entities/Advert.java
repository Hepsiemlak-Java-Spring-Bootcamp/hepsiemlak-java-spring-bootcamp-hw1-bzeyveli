package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;

import java.util.Arrays;

public class Advert extends DateAudit {

    // Parametre sayısı fazla olduğu için Builder Design Pattern uygulanacak. UNUTMA !!!!

    private Long id;

    private String title;

    private Long userId;

    private String[] pictureList = new String[5];

    private Float price;

    private int displayTime;

    private String country;

    private String desciption;  // 2+1 , 3+1, ...

    public Advert(Long id, String title, Long userId, String[] pictureList, Float price, int displayTime, String country, String desciption) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.pictureList = pictureList;
        this.price = price;
        this.displayTime = displayTime;
        this.country = country;
        this.desciption = desciption;
    }

    public Advert() {
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String[] getPictureList() {
        return pictureList;
    }

    public void setPictureList(String[] pictureList) {
        this.pictureList = pictureList;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(int displayTime) {
        this.displayTime = displayTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", pictureList=" + Arrays.toString(pictureList) +
                ", price=" + price +
                ", displayTime=" + displayTime +
                ", country='" + country + '\'' +
                '}';
    }
}
