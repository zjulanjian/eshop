package com.bj186.fms.mapper;

import com.bj186.fms.pojo.BidDetail;

public interface BidDetailMapper {
    int deleteByPrimaryKey(Integer biddetiailid);

    int insert(BidDetail record);

    int insertSelective(BidDetail record);

    BidDetail selectByPrimaryKey(Integer biddetiailid);

    int updateByPrimaryKeySelective(BidDetail record);

    int updateByPrimaryKey(BidDetail record);
}