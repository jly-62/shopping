package com.yc.shopping.bean;

public class Adminuser {
    private Integer id;

    private String aname;

    private String apwd;

    private String email;

    private String tel;

    private String gender;

    private String header;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }
}