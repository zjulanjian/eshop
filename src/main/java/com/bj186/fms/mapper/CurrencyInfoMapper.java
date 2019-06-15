package com.bj186.fms.mapper;

import com.bj186.fms.pojo.CurrencyInfo;

public interface CurrencyInfoMapper {
    int deleteByPrimaryKey(Integer ciid);

    int insert(CurrencyInfo record);

    int insertSelective(CurrencyInfo record);

    CurrencyInfo selectByPrimaryKey(Integer ciid);

    int updateByPrimaryKeySelective(CurrencyInfo record);

    int updateByPrimaryKey(CurrencyInfo record);
}