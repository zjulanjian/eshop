package com.bj186.fms.mapper;

import com.bj186.fms.pojo.FExpenseCalendar;

public interface FExpenseCalendarMapper {
    int deleteByPrimaryKey(Integer fecalendarid);

    int insert(FExpenseCalendar record);

    int insertSelective(FExpenseCalendar record);

    FExpenseCalendar selectByPrimaryKey(Integer fecalendarid);

    int updateByPrimaryKeySelective(FExpenseCalendar record);

    int updateByPrimaryKey(FExpenseCalendar record);
}