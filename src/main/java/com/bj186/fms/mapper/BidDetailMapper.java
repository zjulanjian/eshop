package com.bj186.fms.mapper;

import com.bj186.fms.pojo.BidDetail;

public interface BidDetailMapper {
    int deleteByPrimaryKey(Integer bidDetiailID);

    int insert(BidDetail record);

    int insertSelective(BidDetail record);

    BidDetail selectByPrimaryKey(Integer bidDetiailID);

    int updateByPrimaryKeySelective(BidDetail record);

    int updateByPrimaryKey(BidDetail record);
}