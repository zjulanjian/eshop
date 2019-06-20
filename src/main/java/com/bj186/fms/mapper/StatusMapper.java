package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Status;

public interface StatusMapper {
    int deleteByPrimaryKey(Integer statusid);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Integer statusid);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}