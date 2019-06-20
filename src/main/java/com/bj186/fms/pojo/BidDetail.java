package com.bj186.fms.pojo;

import java.util.Date;

public class BidDetail {
    private Integer biddetiailid;

    private Integer bidid;

    private String projectname;

    private String description;

    private Double totalfunds;

    private Double unitprice;

    private Integer totalquantity;

    private Date createtime;

    private Date endtime;

    private Integer purchasedquantity;

    private Integer remainingquantity;

    private String qualificationcertificate;

    public Integer getBiddetiailid() {
        return biddetiailid;
    }

    public void setBiddetiailid(Integer biddetiailid) {
        this.biddetiailid = biddetiailid;
    }

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getTotalfunds() {
        return totalfunds;
    }

    public void setTotalfunds(Double totalfunds) {
        this.totalfunds = totalfunds;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(Integer totalquantity) {
        this.totalquantity = totalquantity;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getPurchasedquantity() {
        return purchasedquantity;
    }

    public void setPurchasedquantity(Integer purchasedquantity) {
        this.purchasedquantity = purchasedquantity;
    }

    public Integer getRemainingquantity() {
        return remainingquantity;
    }

    public void setRemainingquantity(Integer remainingquantity) {
        this.remainingquantity = remainingquantity;
    }

    public String getQualificationcertificate() {
        return qualificationcertificate;
    }

    public void setQualificationcertificate(String qualificationcertificate) {
        this.qualificationcertificate = qualificationcertificate == null ? null : qualificationcertificate.trim();
    }
}