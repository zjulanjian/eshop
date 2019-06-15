package com.bj186.fms.pojo;

import java.util.Date;

public class InterestTable {
    private Integer interestid;

    private String deposittype;

    private String cycle;

    private Date time;

    private Double interestvalue;

    public Integer getInterestid() {
        return interestid;
    }

    public void setInterestid(Integer interestid) {
        this.interestid = interestid;
    }

    public String getDeposittype() {
        return deposittype;
    }

    public void setDeposittype(String deposittype) {
        this.deposittype = deposittype == null ? null : deposittype.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getInterestvalue() {
        return interestvalue;
    }

    public void setInterestvalue(Double interestvalue) {
        this.interestvalue = interestvalue;
    }
}