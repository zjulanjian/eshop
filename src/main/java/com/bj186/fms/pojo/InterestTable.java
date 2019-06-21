package com.bj186.fms.pojo;

import java.util.Date;

public class InterestTable {
    private Integer interestID;

    private String depositType;

    private String cycle;

    private Date time;

    private Double interestValue;

    public Integer getInterestID() {
        return interestID;
    }

    public void setInterestID(Integer interestID) {
        this.interestID = interestID;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType == null ? null : depositType.trim();
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

    public Double getInterestValue() {
        return interestValue;
    }

    public void setInterestValue(Double interestValue) {
        this.interestValue = interestValue;
    }
}