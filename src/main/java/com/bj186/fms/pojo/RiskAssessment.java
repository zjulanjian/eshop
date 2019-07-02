package com.bj186.fms.pojo;

import java.util.Date;

public class RiskAssessment {
    private Integer rAssessmentID;

    private Integer companyID;

    private String businessConditions;

    private Date timeOfEstablished;

    private String riskIndicator;

    private String sourceOfIncome;

    private String riskLevel;

    private byte[] creditReport;

    public Integer getrAssessmentID() {
        return rAssessmentID;
    }

    public void setrAssessmentID(Integer rAssessmentID) {
        this.rAssessmentID = rAssessmentID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getBusinessConditions() {
        return businessConditions;
    }

    public void setBusinessConditions(String businessConditions) {
        this.businessConditions = businessConditions == null ? null : businessConditions.trim();
    }

    public Date getTimeOfEstablished() {
        return timeOfEstablished;
    }

    public void setTimeOfEstablished(Date timeOfEstablished) {
        this.timeOfEstablished = timeOfEstablished;
    }

    public String getRiskIndicator() {
        return riskIndicator;
    }

    public void setRiskIndicator(String riskIndicator) {
        this.riskIndicator = riskIndicator == null ? null : riskIndicator.trim();
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome == null ? null : sourceOfIncome.trim();
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public byte[] getCreditReport() {
        return creditReport;
    }

    public void setCreditReport(byte[] creditReport) {
        this.creditReport = creditReport;
    }
}