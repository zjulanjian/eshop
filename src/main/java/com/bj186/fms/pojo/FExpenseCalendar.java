package com.bj186.fms.pojo;

import java.util.Date;

public class FExpenseCalendar {
    private Integer feCalendarID;

    private Integer fAccountID;

    private Long capital;

    private Date createTime;

    public Integer getFeCalendarID() {
        return feCalendarID;
    }

    public void setFeCalendarID(Integer feCalendarID) {
        this.feCalendarID = feCalendarID;
    }

    public Integer getfAccountID() {
        return fAccountID;
    }

    public void setfAccountID(Integer fAccountID) {
        this.fAccountID = fAccountID;
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