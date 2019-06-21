package com.bj186.fms.pojo;

import java.util.Date;

public class RExpenseCalendar {
    private Integer reCalendarID;

    private Integer rAccountID;

    private Long capital;

    private Date createTime;

    public Integer getReCalendarID() {
        return reCalendarID;
    }

    public void setReCalendarID(Integer reCalendarID) {
        this.reCalendarID = reCalendarID;
    }

    public Integer getrAccountID() {
        return rAccountID;
    }

    public void setrAccountID(Integer rAccountID) {
        this.rAccountID = rAccountID;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}