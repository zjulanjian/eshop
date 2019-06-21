package com.bj186.fms.pojo;

import java.util.Date;

public class CurrencyInfo {
    private Integer currencyInfoID;

    private String currencyGroup;

    private Double buyin;

    private Double sellout;

    private Double maxRate;

    private Double middleRate;

    private Double minRate;

    private Date createTime;

    public Integer getCurrencyInfoID() {
        return currencyInfoID;
    }

    public void setCurrencyInfoID(Integer currencyInfoID) {
        this.currencyInfoID = currencyInfoID;
    }

    public String getCurrencyGroup() {
        return currencyGroup;
    }

    public void setCurrencyGroup(String currencyGroup) {
        this.currencyGroup = currencyGroup == null ? null : currencyGroup.trim();
    }

    public Double getBuyin() {
        return buyin;
    }

    public void setBuyin(Double buyin) {
        this.buyin = buyin;
    }

    public Double getSellout() {
        return sellout;
    }

    public void setSellout(Double sellout) {
        this.sellout = sellout;
    }

    public Double getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(Double maxRate) {
        this.maxRate = maxRate;
    }

    public Double getMiddleRate() {
        return middleRate;
    }

    public void setMiddleRate(Double middleRate) {
        this.middleRate = middleRate;
    }

    public Double getMinRate() {
        return minRate;
    }

    public void setMinRate(Double minRate) {
        this.minRate = minRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}