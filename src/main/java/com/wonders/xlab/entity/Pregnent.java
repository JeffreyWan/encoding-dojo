package com.wonders.xlab.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jeffrey on 2015/4/15.
 */
public class Pregnent implements Serializable{


    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 地址
     */
    private String address;
    /**
     * 电话
     */
    private String tel;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 所属医院
     */
    private String hospital;
    /**
     * 孕妇病例简单描述(高龄产妇，例行检查等)
     */
    private String diseaseDesc;
    /**
     * 头像url
     */
    private String iconUrl;
    /**
     * 登录密码
     */
    private String password;

    /**
     * 通知token令牌
     */
    private String notificationToken;

    /** app平台（ios，android） */
    private String appPlatform;

    /**
     * 孕妇怀孕初始日期
     */
    private Date pregnantStartDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDiseaseDesc() {
        return diseaseDesc;
    }

    public void setDiseaseDesc(String diseaseDesc) {
        this.diseaseDesc = diseaseDesc;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotificationToken() {
        return notificationToken;
    }

    public void setNotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public String getAppPlatform() {
        return appPlatform;
    }

    public void setAppPlatform(String appPlatform) {
        this.appPlatform = appPlatform;
    }

    public Date getPregnantStartDate() {
        return pregnantStartDate;
    }

    public void setPregnantStartDate(Date pregnantStartDate) {
        this.pregnantStartDate = pregnantStartDate;
    }
}
