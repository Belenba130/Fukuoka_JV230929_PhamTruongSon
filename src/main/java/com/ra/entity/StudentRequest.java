package com.ra.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Date;

public class StudentRequest {
    private int id;
    private String name;
    private Boolean sex;
    private String phoneNumber;
    private String imageUrl;
    private Date birthday;
    private String address;
    private MultipartFile img;

    public StudentRequest() {
    }

    public StudentRequest(int id, String name, Boolean sex, String phoneNumber, String imageUrl, Date birthday, String address, MultipartFile img) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.birthday = birthday;
        this.address = address;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
