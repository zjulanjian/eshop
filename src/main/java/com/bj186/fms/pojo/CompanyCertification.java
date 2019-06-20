package com.bj186.fms.pojo;

public class CompanyCertification {
    private Integer ccertificationid;

    private Integer companyid;

    private String status;

    public Integer getCcertificationid() {
        return ccertificationid;
    }

    public void setCcertificationid(Integer ccertificationid) {
        this.ccertificationid = ccertificationid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}