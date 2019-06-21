package com.bj186.fms.pojo;

public class Status {
    private Integer statusID;

    private String bidStatus;

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus == null ? null : bidStatus.trim();
    }
}