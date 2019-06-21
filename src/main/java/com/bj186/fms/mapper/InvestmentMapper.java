package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Investment;

public interface InvestmentMapper {
    int deleteByPrimaryKey(Integer investmentID);

    int insert(Investment record);

    int insertSelective(Investment record);

    Investment selectByPrimaryKey(Integer investmentID);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);
}