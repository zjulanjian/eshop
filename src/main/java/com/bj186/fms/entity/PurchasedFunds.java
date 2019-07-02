package com.bj186.fms.entity;



public class PurchasedFunds {

    private Integer uFundOrderID; //用户基金订单编号
    private Integer userID; //用户编号
    private String userName; //用户名
    private Integer fundID; //基金编号
    private Double amount; //购买金额
    private String createTime; //购买时间
    private String fundName; //基金名
    private Double unitNetValue; //基金的单位净值
    private String fundType; //基金类型

    public Integer getUFundOrderID() {
        return uFundOrderID;
    }

    public void setUFundOrderID(Integer uFundOrderID) {
        this.uFundOrderID = uFundOrderID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public Double getUnitNetValue() {
        return unitNetValue;
    }

    public void setUnitNetValue(Double unitNetValue) {
        this.unitNetValue = unitNetValue;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }
}
