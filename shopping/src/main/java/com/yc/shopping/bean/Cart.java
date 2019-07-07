package com.yc.shopping.bean;

public class Cart {
    private Integer cartid;

    private Integer pid;

    private Integer uid;

    private Integer count;

    private Integer ischeck;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }
}