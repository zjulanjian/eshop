package com.bj186.fms.pojo;

import java.util.Date;

public class UserFundOrder {
    private Integer uFundOrderID;

    private Integer roleID;

    private Integer fundID;

    private Double amount;

    private Date createTime;

    public Integer getuFundOrderID() {
        return uFundOrderID;
    }

    public void setuFundOrderID(Integer uFundOrderID) {
        this.uFundOrderID = uFundOrderID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
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

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}