package com.bj186.fms.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Fund {
    private Integer fundID;

    private String fundName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String createTime;

    private Double unitNetValue;

    private Double cumulativeNetValue;

    private Double dailyGrowthRate;

    private Double monthlyGrowthRate;

    private Double yearlyGrowthRate;

    private Double feesRate;

    private String fundType;

    public Integer getFundID() {
        return fundID;
    }

    public void setFundID(Integer fundID) {
        this.fundID = fundID;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Double getUnitNetValue() {
        return unitNetValue;
    }

    public void setUnitNetValue(Double unitNetValue) {
        this.unitNetValue = unitNetValue;
    }

    public Double getCumulativeNetValue() {
        return cumulativeNetValue;
    }

    public void setCumulativeNetValue(Double cumulativeNetValue) {
        this.cumulativeNetValue = cumulativeNetValue;
    }

    public Double getDailyGrowthRate() {
        return dailyGrowthRate;
    }

    public void setDailyGrowthRate(Double dailyGrowthRate) {
        this.dailyGrowthRate = dailyGrowthRate;
    }

    public Double getMonthlyGrowthRate() {
        return monthlyGrowthRate;
    }

    public void setMonthlyGrowthRate(Double monthlyGrowthRate) {
        this.monthlyGrowthRate = monthlyGrowthRate;
    }

    public Double getYearlyGrowthRate() {
        return yearlyGrowthRate;
    }

    public void setYearlyGrowthRate(Double yearlyGrowthRate) {
        this.yearlyGrowthRate = yearlyGrowthRate;
    }

    public Double getFeesRate() {
        return feesRate;
    }

    public void setFeesRate(Double feesRate) {
        this.feesRate = feesRate;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    @Override
    public String toString() {
        return "Fund{" +
                "fundID=" + fundID +
                ", fundName='" + fundName + '\'' +
                ", createTime=" + createTime +
                ", unitNetValue=" + unitNetValue +
                ", cumulativeNetValue=" + cumulativeNetValue +
                ", dailyGrowthRate=" + dailyGrowthRate +
                ", monthlyGrowthRate=" + monthlyGrowthRate +
                ", yearlyGrowthRate=" + yearlyGrowthRate +
                ", feesRate=" + feesRate +
                ", fundType='" + fundType + '\'' +
                '}';
    }
}