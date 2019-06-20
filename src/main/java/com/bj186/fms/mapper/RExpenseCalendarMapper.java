package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RExpenseCalendar;

public interface RExpenseCalendarMapper {
    int deleteByPrimaryKey(Integer recalendarid);

    int insert(RExpenseCalendar record);

    int insertSelective(RExpenseCalendar record);

    RExpenseCalendar selectByPrimaryKey(Integer recalendarid);

    int updateByPrimaryKeySelective(RExpenseCalendar record);

    int updateByPrimaryKey(RExpenseCalendar record);
}