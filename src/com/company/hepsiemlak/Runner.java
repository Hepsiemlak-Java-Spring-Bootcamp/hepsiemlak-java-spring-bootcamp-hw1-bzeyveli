package com.company.hepsiemlak;

import com.company.hepsiemlak.model.entities.Advert;
import com.company.hepsiemlak.model.entities.AuthUser;
import com.company.hepsiemlak.model.entities.Favorite;
import com.company.hepsiemlak.model.entities.Message;
import com.company.hepsiemlak.model.enums.RoleType;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        List<RoleType> typeList = new ArrayList<>();
        typeList.add(RoleType.CORPORATE);
        AuthUser authUser = new AuthUser(1L, "bekir", "zeyveli", "zeyveli44@gmail.com", "123457", false, typeList, null, null, null);

        // Ayrı bir metoda alabiliriz
        System.out.println("***************************************");
        System.out.println("Sistemde bulunan bütün mesajların başlıkları ve bu mesajlardaki kullanıcıların kimler olduğunun listelenmesi");
        System.out.println("***************************************");
        List<Message> messageList = getMessageAll();
        for (Message message : messageList) {
            System.out.println("message Title : " + message.getTitle() + ", Sender of message Id : " + message.getUserId());
        }

        // Ayrı bir metoda alabiliriz
        System.out.println("***************************************");
        System.out.println("ayse.sari@gmail.com mail adresine sahip kullanıcısının favori ilanlari listelenmesi");
        System.out.println("***************************************");
        // ayse.sari@gmail.com mail adresine ait kullanıcının favoriler tablosundaki ilan Id'sini bulalım
        Set<Favorite> favorites = getFavoriteAll();
        AuthUser ayse = new AuthUser(2L, "Ayse", "Sarı", "ayse.sari@gmail.com", "10000", false, typeList, favorites, null, null);
        List<Advert> list = getAdvertList(ayse);
        for (Advert advert : list) {
            if (advert.getId() == 2L) {
                System.out.println(advert);
            }
        }

        // Ayrı bir metoda alabiliriz
        System.out.println("***************************************");
        System.out.println("İstanbul'da bulunan, 2+1 ve 3+1, fiyatı 3000tl altında olan ilanların listelenmesi");
        System.out.println("***************************************");
        List<Advert> listIstanbul = getAdvertList(ayse);
        for(Advert advert: listIstanbul){
            if((advert.getDesciption().equals("2+1") || advert.getDesciption().equals("3+1")) && advert.getPrice() <3000){
                System.out.println(advert);
            }
        }

    }

    public static List<Advert> getAdvertList(AuthUser user) {
        Advert advert = new Advert(1L, "Acil Satılık", user.getId(), getPictureList(), 10000F, 180000, "İstanbul","2+1");
        Advert advert2 = new Advert(2L, "Kiralık", user.getId(), getPictureList(), 1500f, 180000, "Malatya","3+1");
        Advert advert3 = new Advert(2L, "Acil Satılık", user.getId(), getPictureList(), 2900F, 180000, "İstanbul", "2+1");
        Advert advert4 = new Advert(4L, "Kiralık", user.getId(), getPictureList(), 18001F, 180000, "İstanbul", "3+1");
        Advert advert5 = new Advert(5L, "Acil Satılık", user.getId(), getPictureList(), 2989F, 180000, "İstanbul", "4+1");
        List<Advert> advertList = new ArrayList<>();
        advertList.add(advert);
        advertList.add(advert2);
        advertList.add(advert3);
        advertList.add(advert4);
        advertList.add(advert5);
        return advertList;
    }

    public static Set<Favorite> getFavoriteAll() {
        Favorite favorite = new Favorite(1L, 1L, 1L);
        Favorite favorite1 = new Favorite(2L, 2L, 2L);
        Favorite favorite2 = new Favorite(3L, 1L, 2L);
        Set<Favorite> favorites = new HashSet<>();
        favorites.add(favorite);
        favorites.add(favorite1);
        favorites.add(favorite2);
        return favorites;
    }

    private static String[] getPictureList() {
        String[] pictureList = new String[2];
        pictureList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        pictureList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        return pictureList;
    }

    public static List<Message> getMessageAll() {
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(1L, 1L, "Ahmet", "Selam Nasılsın", new Date(), new Date()));   // Date gecici olarak bu şekilde yazıldı. Düzenleneccek
        messageList.add(new Message(1L, 2L, "Mehmet", "Selam Nasılsın", new Date(), new Date()));
        messageList.add(new Message(1L, 3L, "Osman", "Selam Nasılsın", new Date(), new Date()));
        messageList.add(new Message(1L, 4L, "Ayşe", "Selam Nasılsın", new Date(), new Date()));
        return messageList;
    }

}
