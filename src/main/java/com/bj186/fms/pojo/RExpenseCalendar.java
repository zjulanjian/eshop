package com.bj186.fms.pojo;

import java.util.Date;

public class RExpenseCalendar {
    private Integer recid;

    private Integer raccountid;

    private Long capital;

    private Date createtime;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
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