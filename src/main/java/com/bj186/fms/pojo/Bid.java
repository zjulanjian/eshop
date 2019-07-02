package com.bj186.fms.pojo;

import java.util.Date;

public class Bid {
    private Integer bidID;

    private Integer companyID;

    private Date createTime;

    private Date endTime;

    private Double amount;

    public Integer getBidID() {
        return bidID;
    }

    public void setBidID(Integer bidID) {
        this.bidID = bidID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getAmount() {
        return amount;
    }

    public synchronized void setAmount(Double amount) {
        this.amount = amount;
    }
}