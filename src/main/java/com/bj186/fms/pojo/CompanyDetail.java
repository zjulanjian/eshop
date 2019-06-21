package com.bj186.fms.pojo;

import java.util.Date;

public class CompanyDetail {
    private Integer companyID;

    private Double capital;

    private String industry;

    private Date registerTime;

    private String creditLevel;

    private String legalPersonName;

    private String legalPersonIDNumber;

    private String guaranteeCompany;

    private byte[] license;

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public String getLegalPersonIDNumber() {
        return legalPersonIDNumber;
    }

    public void setLegalPersonIDNumber(String legalPersonIDNumber) {
        this.legalPersonIDNumber = legalPersonIDNumber == null ? null : legalPersonIDNumber.trim();
    }

    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany == null ? null : guaranteeCompany.trim();
    }

    public byte[] getLicense() {
        return license;
    }

    public void setLicense(byte[] license) {
        this.license = license;
    }
}