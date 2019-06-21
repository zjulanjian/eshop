package com.bj186.fms.pojo;

import java.util.Date;

public class MonthCalendar {
    private Integer mCalendarID;

    private Integer cAccountID;

    private String expenseType;

    private String gno;

    private Long capital;

    private Date createTime;

    public Integer getmCalendarID() {
        return mCalendarID;
    }

    public void setmCalendarID(Integer mCalendarID) {
        this.mCalendarID = mCalendarID;
    }

    public Integer getcAccountID() {
        return cAccountID;
    }

    public void setcAccountID(Integer cAccountID) {
        this.cAccountID = cAccountID;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType == null ? null : expenseType.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}