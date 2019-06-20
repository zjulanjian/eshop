package com.bj186.fms.pojo;

import java.util.Date;

public class CompanyDetail {
    private Integer companyid;

    private Double capital;

    private String industry;

    private Date registertime;

    private String creditlevel;

    private String legalpersonname;

    private String legalpersonidnumber;

    private String guaranteecompany;

    private byte[] license;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
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

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getCreditlevel() {
        return creditlevel;
    }

    public void setCreditlevel(String creditlevel) {
        this.creditlevel = creditlevel == null ? null : creditlevel.trim();
    }

    public String getLegalpersonname() {
        return legalpersonname;
    }

    public void setLegalpersonname(String legalpersonname) {
        this.legalpersonname = legalpersonname == null ? null : legalpersonname.trim();
    }

    public String getLegalpersonidnumber() {
        return legalpersonidnumber;
    }

    public void setLegalpersonidnumber(String legalpersonidnumber) {
        this.legalpersonidnumber = legalpersonidnumber == null ? null : legalpersonidnumber.trim();
    }

    public String getGuaranteecompany() {
        return guaranteecompany;
    }

    public void setGuaranteecompany(String guaranteecompany) {
        this.guaranteecompany = guaranteecompany == null ? null : guaranteecompany.trim();
    }

    public byte[] getLicense() {
        return license;
    }

    public void setLicense(byte[] license) {
        this.license = license;
    }
}