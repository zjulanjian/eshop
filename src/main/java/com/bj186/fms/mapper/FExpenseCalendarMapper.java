package com.bj186.fms.mapper;

import com.bj186.fms.pojo.FExpenseCalendar;

public interface FExpenseCalendarMapper {
    int deleteByPrimaryKey(Integer feCalendarID);

    int insert(FExpenseCalendar record);

    int insertSelective(FExpenseCalendar record);

    FExpenseCalendar selectByPrimaryKey(Integer feCalendarID);

    int updateByPrimaryKeySelective(FExpenseCalendar record);

    int updateByPrimaryKey(FExpenseCalendar record);
}