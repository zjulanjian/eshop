package com.bj186.fms.pojo;

import java.util.Date;

public class Fund {
    private Integer fundid;

    private String fundname;

    private Date createtime;

    private Double unitnetvalue;

    private Double cumulativenetvalue;

    private Double dailygrowthrate;

    private Double monthlygrowthrate;

    private Double yearlygrowthrate;

    private Double feesrate;

    private String fundtype;

    public Integer getFundid() {
        return fundid;
    }

    public void setFundid(Integer fundid) {
        this.fundid = fundid;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname == null ? null : fundname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getUnitnetvalue() {
        return unitnetvalue;
    }

    public void setUnitnetvalue(Double unitnetvalue) {
        this.unitnetvalue = unitnetvalue;
    }

    public Double getCumulativenetvalue() {
        return cumulativenetvalue;
    }

    public void setCumulativenetvalue(Double cumulativenetvalue) {
        this.cumulativenetvalue = cumulativenetvalue;
    }

    public Double getDailygrowthrate() {
        return dailygrowthrate;
    }

    public void setDailygrowthrate(Double dailygrowthrate) {
        this.dailygrowthrate = dailygrowthrate;
    }

    public Double getMonthlygrowthrate() {
        return monthlygrowthrate;
    }

    public void setMonthlygrowthrate(Double monthlygrowthrate) {
        this.monthlygrowthrate = monthlygrowthrate;
    }

    public Double getYearlygrowthrate() {
        return yearlygrowthrate;
    }

    public void setYearlygrowthrate(Double yearlygrowthrate) {
        this.yearlygrowthrate = yearlygrowthrate;
    }

    public Double getFeesrate() {
        return feesrate;
    }

    public void setFeesrate(Double feesrate) {
        this.feesrate = feesrate;
    }

    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype == null ? null : fundtype.trim();
    }
}