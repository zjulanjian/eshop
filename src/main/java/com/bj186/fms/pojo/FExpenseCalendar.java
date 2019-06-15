package com.bj186.fms.pojo;

import java.util.Date;

public class FExpenseCalendar {
    private Integer fecid;

    private Integer faccountid;

    private Long capital;

    private Date createtime;

    public Integer getFecid() {
        return fecid;
    }

    public void setFecid(Integer fecid) {
        this.fecid = fecid;
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