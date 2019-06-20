package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Bid;

public interface BidMapper {
    int deleteByPrimaryKey(Integer bidid);

    int insert(Bid record);

    int insertSelective(Bid record);

    Bid selectByPrimaryKey(Integer bidid);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
}