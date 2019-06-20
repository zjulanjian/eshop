package com.bj186.fms.pojo;

import java.util.Date;

public class RExpenseCalendar {
    private Integer recalendarid;

    private Integer raccountid;

    private Long capital;

    private Date createtime;

    public Integer getRecalendarid() {
        return recalendarid;
    }

    public void setRecalendarid(Integer recalendarid) {
        this.recalendarid = recalendarid;
    }

    public Integer getRaccountid() {
        return raccountid;
    }

    public void setRaccountid(Integer raccountid) {
        this.raccountid = raccountid;
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