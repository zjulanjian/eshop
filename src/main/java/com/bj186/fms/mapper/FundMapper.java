package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Fund;

import java.util.List;

public interface FundMapper {
    int deleteByPrimaryKey(Integer fundid);

    int insert(Fund record);

    int insertSelective(Fund record);

    Fund selectByPrimaryKey(Integer fundid);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);

    List<Fund> selectAll();
}