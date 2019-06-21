package com.bj186.fms.mapper;

import com.bj186.fms.pojo.CreditCard;

public interface CreditCardMapper {
    int deleteByPrimaryKey(Integer cAccountID);

    int insert(CreditCard record);

    int insertSelective(CreditCard record);

    CreditCard selectByPrimaryKey(Integer cAccountID);

    int updateByPrimaryKeySelective(CreditCard record);

    int updateByPrimaryKey(CreditCard record);
}