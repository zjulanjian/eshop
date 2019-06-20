package com.bj186.fms.pojo;

import java.util.Date;

public class FExpenseCalendar {
    private Integer fecalendarid;

    private Integer faccountid;

    private Long capital;

    private Date createtime;

    public Integer getFecalendarid() {
        return fecalendarid;
    }

    public void setFecalendarid(Integer fecalendarid) {
        this.fecalendarid = fecalendarid;
    }

    public Integer getFaccountid() {
        return faccountid;
    }

    public void setFaccountid(Integer faccountid) {
        this.faccountid = faccountid;
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