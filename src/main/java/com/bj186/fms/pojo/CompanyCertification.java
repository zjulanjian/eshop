package com.bj186.fms.pojo;

public class CompanyCertification {
    private Integer cCertificationID;

    private Integer companyID;

    private String status;

    public Integer getcCertificationID() {
        return cCertificationID;
    }

    public void setcCertificationID(Integer cCertificationID) {
        this.cCertificationID = cCertificationID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}