package com.yc.shopping.bean;

import java.sql.Timestamp;

public class Orders {
    private Integer oid;

    private Integer uid;

    private Integer pid;

    private Double price;

    private Integer addressid;

    private Timestamp createdate;

    private Timestamp paydate;

    private String payment;

    private Timestamp cenceldate;

    private Timestamp senddate;

    private Timestamp confirmdate;

    private Integer stock;

    private Integer status;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Timestamp getPaydate() {
        return paydate;
    }

    public void setPaydate(Timestamp paydate) {
        this.paydate = paydate;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Timestamp getCenceldate() {
        return cenceldate;
    }

    public void setCenceldate(Timestamp cenceldate) {
        this.cenceldate = cenceldate;
    }

    public Timestamp getSenddate() {
        return senddate;
    }

    public void setSenddate(Timestamp senddate) {
        this.senddate = senddate;
    }

    public Timestamp getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Timestamp confirmdate) {
        this.confirmdate = confirmdate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}