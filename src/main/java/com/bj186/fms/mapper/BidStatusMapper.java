package com.bj186.fms.mapper;

import com.bj186.fms.pojo.BidStatus;

public interface BidStatusMapper {
    int insert(BidStatus record);

    int insertSelective(BidStatus record);
}