package com.yc.shopping.bean;

public class Region {
    private Integer regionid;

    private Integer parentid;

    private String regionname;

    private Byte regiontype;

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public Byte getRegiontype() {
        return regiontype;
    }

    public void setRegiontype(Byte regiontype) {
        this.regiontype = regiontype;
    }
}