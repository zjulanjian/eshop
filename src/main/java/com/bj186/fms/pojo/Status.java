package com.bj186.fms.pojo;

public class Status {
    private Integer statusid;

    private String bidstatus;

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getBidstatus() {
        return bidstatus;
    }

    public void setBidstatus(String bidstatus) {
        this.bidstatus = bidstatus == null ? null : bidstatus.trim();
    }
}