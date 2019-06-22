package com.yc.shopping.bean;

import java.sql.Timestamp;

public class Appraise {
    private Integer appraiseid;

    private String username;

    private Integer orderinfoid;

    private String pscore;

    private Timestamp createtime;

    private String content;

    public Integer getAppraiseid() {
        return appraiseid;
    }

    public void setAppraiseid(Integer appraiseid) {
        this.appraiseid = appraiseid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getOrderinfoid() {
        return orderinfoid;
    }

    public void setOrderinfoid(Integer orderinfoid) {
        this.orderinfoid = orderinfoid;
    }

    public String getPscore() {
        return pscore;
    }

    public void setPscore(String pscore) {
        this.pscore = pscore == null ? null : pscore.trim();
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}