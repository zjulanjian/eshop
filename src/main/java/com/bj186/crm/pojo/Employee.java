package com.bj186.crm.pojo;

public class Employee {
    private Integer eEid;

    private String eUsername;

    private Integer dDid;

    public Integer geteEid() {
        return eEid;
    }

    public void seteEid(Integer eEid) {
        this.eEid = eEid;
    }

    public String geteUsername() {
        return eUsername;
    }

    public void seteUsername(String eUsername) {
        this.eUsername = eUsername == null ? null : eUsername.trim();
    }

    public Integer getdDid() {
        return dDid;
    }

    public void setdDid(Integer dDid) {
        this.dDid = dDid;
    }
}