package com.yc.shopping.bean;

public class Orderinfo {
    private Integer orderinfoid;

    private Integer oid;

    private Double orderprice;

    private Double payprice;

    private Integer count;

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public Double getPayprice() {
        return payprice;
    }

    public void setPayprice(Double payprice) {
        this.payprice = payprice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}