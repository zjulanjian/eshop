package com.bj186.fms.pojo;

import java.util.Date;

public class Investment {
    private Integer investmentid;

    private Integer userid;

    private Integer bidid;

    private Date investtime;

    private Double amount;

    private String status;

    public Integer getInvestmentid() {
        return investmentid;
    }

    public void setInvestmentid(Integer investmentid) {
        this.investmentid = investmentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public Date getInvesttime() {
        return investtime;
    }

    public void setInvesttime(Date investtime) {
        this.investtime = investtime;
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