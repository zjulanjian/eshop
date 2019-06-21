package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RExpenseCalendar;

public interface RExpenseCalendarMapper {
    int deleteByPrimaryKey(Integer reCalendarID);

    int insert(RExpenseCalendar record);

    int insertSelective(RExpenseCalendar record);

    RExpenseCalendar selectByPrimaryKey(Integer reCalendarID);

    int updateByPrimaryKeySelective(RExpenseCalendar record);

    int updateByPrimaryKey(RExpenseCalendar record);
}