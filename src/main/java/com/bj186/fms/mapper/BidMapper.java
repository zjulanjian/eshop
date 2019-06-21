package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Bid;

public interface BidMapper {
    int deleteByPrimaryKey(Integer bidID);

    int insert(Bid record);

    int insertSelective(Bid record);

    Bid selectByPrimaryKey(Integer bidID);

    int updateByPrimaryKeySelective(Bid record);

    int updateByPrimaryKey(Bid record);
}