package com.bj186.fms.mapper;

import com.bj186.fms.pojo.InterestTable;

public interface InterestTableMapper {
    int deleteByPrimaryKey(Integer interestID);

    int insert(InterestTable record);

    int insertSelective(InterestTable record);

    InterestTable selectByPrimaryKey(Integer interestID);

    int updateByPrimaryKeySelective(InterestTable record);

    int updateByPrimaryKey(InterestTable record);
}