package com.bj186.fms.mapper;

import com.bj186.fms.pojo.FExpenseCalendar;

public interface FExpenseCalendarMapper {
    int deleteByPrimaryKey(Integer fecid);

    int insert(FExpenseCalendar record);

    int insertSelective(FExpenseCalendar record);

    FExpenseCalendar selectByPrimaryKey(Integer fecid);

    int updateByPrimaryKeySelective(FExpenseCalendar record);

    int updateByPrimaryKey(FExpenseCalendar record);
}