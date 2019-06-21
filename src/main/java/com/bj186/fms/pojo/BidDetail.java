package com.bj186.fms.pojo;

import java.util.Date;

public class BidDetail {
    private Integer bidDetiailID;

    private Integer bidID;

    private String projectName;

    private String description;

    private Double totalFunds;

    private Double unitPrice;

    private Integer totalQuantity;

    private Date createTime;

    private Date endTime;

    private Integer purchasedQuantity;

    private Integer remainingQuantity;

    private String qualificationCertificate;

    public Integer getBidDetiailID() {
        return bidDetiailID;
    }

    public void setBidDetiailID(Integer bidDetiailID) {
        this.bidDetiailID = bidDetiailID;
    }

    public Integer getBidID() {
        return bidID;
    }

    public void setBidID(Integer bidID) {
        this.bidID = bidID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(Double totalFunds) {
        this.totalFunds = totalFunds;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
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

    public Integer getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(Integer purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }

    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public String getQualificationCertificate() {
        return qualificationCertificate;
    }

    public void setQualificationCertificate(String qualificationCertificate) {
        this.qualificationCertificate = qualificationCertificate == null ? null : qualificationCertificate.trim();
    }
}