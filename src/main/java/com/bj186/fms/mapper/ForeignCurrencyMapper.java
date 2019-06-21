package com.bj186.fms.mapper;

import com.bj186.fms.pojo.ForeignCurrency;

public interface ForeignCurrencyMapper {
    int deleteByPrimaryKey(Integer fAccountID);

    int insert(ForeignCurrency record);

    int insertSelective(ForeignCurrency record);

    ForeignCurrency selectByPrimaryKey(Integer fAccountID);

    int updateByPrimaryKeySelective(ForeignCurrency record);

    int updateByPrimaryKey(ForeignCurrency record);
}