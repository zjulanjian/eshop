package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Mortgage;

public interface MortgageMapper {
    int insert(Mortgage record);

    int insertSelective(Mortgage record);
}