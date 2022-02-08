package com.company.hepsiemlak.model.entities;

public class Favorite {

    private Long id;

    //private AuthUser user;
    private Long userId;

    //private Advert advert;
    private Long advertId;

    public Favorite(Long id, Long userId, Long advertId) {
        this.id = id;
        this.userId = userId;
        this.advertId = advertId;
    }

    public Favorite() {
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

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }
}
