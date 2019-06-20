package com.bj186.fms.mapper;

import com.bj186.fms.pojo.CreditCard;

public interface CreditCardMapper {
    int deleteByPrimaryKey(Integer caccountid);

    int insert(CreditCard record);

    int insertSelective(CreditCard record);

    CreditCard selectByPrimaryKey(Integer caccountid);

    int updateByPrimaryKeySelective(CreditCard record);

    int updateByPrimaryKey(CreditCard record);
}