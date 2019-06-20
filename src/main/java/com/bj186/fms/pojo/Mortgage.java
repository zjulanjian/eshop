package com.bj186.fms.pojo;

public class Mortgage {
    private Integer bidid;

    private byte[] estate;

    private byte[] car;

    private byte[] stock;

    private byte[] bond;

    private byte[] others;

    public Integer getBidid() {
        return bidid;
    }

    public void setBidid(Integer bidid) {
        this.bidid = bidid;
    }

    public byte[] getEstate() {
        return estate;
    }

    public void setEstate(byte[] estate) {
        this.estate = estate;
    }

    public byte[] getCar() {
        return car;
    }

    public void setCar(byte[] car) {
        this.car = car;
    }

    public byte[] getStock() {
        return stock;
    }

    public void setStock(byte[] stock) {
        this.stock = stock;
    }

    public byte[] getBond() {
        return bond;
    }

    public void setBond(byte[] bond) {
        this.bond = bond;
    }

    public byte[] getOthers() {
        return others;
    }

    public void setOthers(byte[] others) {
        this.others = others;
    }
}