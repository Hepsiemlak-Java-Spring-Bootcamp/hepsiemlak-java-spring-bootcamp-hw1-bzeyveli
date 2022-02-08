package com.company.hepsiemlak.model.entities;

import com.company.hepsiemlak.audits.DateAudit;
import com.company.hepsiemlak.model.enums.RoleType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AuthUser extends DateAudit {

    // Parametre sayısı fazla olduğu için Builder Design Pattern uygulanacak. UNUTMA !!!!

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Boolean isDeleted;

    private List<RoleType> roles = new ArrayList<>();  // Bireysel veya Kurumsal   Db' de rol_id yazması yeterli  Liste kullanmaya gerek kalmaz

    private Set<Favorite> favoriteList = new HashSet<>();  // Gerek yok ama deneme amaçlı ekledim. Db de ayrı bir tabloda bulunuyor

    private List<Advert> advertList = new ArrayList<>();  // Gerek yok ama deneme amaçlı ekledim. Db de ayrı bir tabloda bulunuyor

    private List<Message> messageList;

    public AuthUser(Long id, String firstName, String lastName, String email, String password, Boolean isDeleted, List<RoleType> roles, Set<Favorite> favoriteList, List<Advert> advertList, List<Message> messageList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isDeleted = isDeleted;
        this.roles = roles;
        this.favoriteList = favoriteList;
        this.advertList = advertList;
        this.messageList = messageList;
    }

    public AuthUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<RoleType> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleType> roles) {
        this.roles = roles;
    }

    public Set<Favorite> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(Set<Favorite> favoriteList) {
        this.favoriteList = favoriteList;
    }

    public List<Advert> getAdvertList() {
        return advertList;
    }

    public void setAdvertList(List<Advert> advertList) {
        this.advertList = advertList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
