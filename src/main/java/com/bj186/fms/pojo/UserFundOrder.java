package com.bj186.fms.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;


public class UserFundOrder {
    private Integer uFundOrderID;

    private Integer userID;

    private Integer fundID;

    private Double amount; //交易金额

    private Double fees; //交易费用

    private String createTime;

    private Integer status; //订单状态

    public Integer getuFundOrderID() {
        return uFundOrderID;
    }

    public void setuFundOrderID(Integer uFundOrderID) {
        this.uFundOrderID = uFundOrderID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getFundID() {
        return fundID;
    }

    public void setFundID(Integer fundID) {
        this.fundID = fundID;
    }

    public Double getAmount() {
        return amount;
    }

    public synchronized void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}