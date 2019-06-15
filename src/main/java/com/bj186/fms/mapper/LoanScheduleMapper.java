package com.bj186.fms.mapper;

import com.bj186.fms.pojo.LoanSchedule;

public interface LoanScheduleMapper {
    int insert(LoanSchedule record);

    int insertSelective(LoanSchedule record);
}