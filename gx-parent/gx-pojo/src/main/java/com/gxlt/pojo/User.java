package com.gxlt.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userid;

    private String username;

    private String password;

    private String sex;

    private String email;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    private String emaill;

    public String getEmaill() {
        this.emaill=email;
        return emaill;
    }
    private String idd;

    public String getIdd() {
        this.idd=userid;
        return idd;
    }
}