package com.bj186.fms.mapper;

import com.bj186.fms.pojo.MonthCalendar;

public interface MonthCalendarMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MonthCalendar record);

    int insertSelective(MonthCalendar record);

    MonthCalendar selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MonthCalendar record);

    int updateByPrimaryKey(MonthCalendar record);
}