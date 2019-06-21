package com.bj186.fms.pojo;

import java.util.Date;

public class Investment {
    private Integer investmentID;

    private Integer userID;

    private Integer bidID;

    private Date investTime;

    private Double amount;

    private String status;

    public Integer getInvestmentID() {
        return investmentID;
    }

    public void setInvestmentID(Integer investmentID) {
        this.investmentID = investmentID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getBidID() {
        return bidID;
    }

    public void setBidID(Integer bidID) {
        this.bidID = bidID;
    }

    public Date getInvestTime() {
        return investTime;
    }

    public void setInvestTime(Date investTime) {
        this.investTime = investTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}