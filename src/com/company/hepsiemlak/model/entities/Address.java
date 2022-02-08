package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;

public class Address extends DateAudit {

    // Parametre sayısı fazla olduğu için Builder Design Pattern uygulanacak. UNUTMA !!!!
    private Long id;

    private AuthUser user;

    private Advert advert;

    private String country;

    private String town;

    private String phone;

    public Address(Long id, AuthUser user, Advert advert, String country, String town, String phone) {
        this.id = id;
        this.user = user;
        this.advert = advert;
        this.country = country;
        this.town = town;
        this.phone = phone;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
