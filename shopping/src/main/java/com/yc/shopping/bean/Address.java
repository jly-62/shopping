package com.yc.shopping.bean;

public class Address {
    private Integer addressid;

    private Integer uid;

    private String address;

    private Short province;

    private Short city;

    private Short district;

    private String street;

    private String tel;

    private String addressee;

    private String isdefault;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrict() {
        return district;
    }

    public void setDistrict(Short district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee == null ? null : addressee.trim();
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault == null ? null : isdefault.trim();
    }
}