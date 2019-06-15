package com.bj186.fms.pojo;

import java.util.Date;

public class MonthCalendar {
    private Integer mid;

    private Integer caccountid;

    private String expensetype;

    private String gno;

    private Long capital;

    private Date createtime;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCaccountid() {
        return caccountid;
    }

    public void setCaccountid(Integer caccountid) {
        this.caccountid = caccountid;
    }

    public String getExpensetype() {
        return expensetype;
    }

    public void setExpensetype(String expensetype) {
        this.expensetype = expensetype == null ? null : expensetype.trim();
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno == null ? null : gno.trim();
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}