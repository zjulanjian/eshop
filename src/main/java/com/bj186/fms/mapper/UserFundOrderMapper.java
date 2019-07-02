package com.bj186.fms.mapper;

import com.bj186.fms.pojo.UserFundOrder;

public interface UserFundOrderMapper {
    int deleteByPrimaryKey(Integer uFundOrderID);

    int insert(UserFundOrder record);

    int insertSelective(UserFundOrder record);

    UserFundOrder selectByPrimaryKey(Integer uFundOrderID);

    int updateByPrimaryKeySelective(UserFundOrder record);

    int updateByPrimaryKey(UserFundOrder record);
}