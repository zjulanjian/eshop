package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RmbBusiness;

public interface RmbBusinessMapper {
    int deleteByPrimaryKey(Integer rAccountID);

    int insert(RmbBusiness record);

    int insertSelective(RmbBusiness record);

    RmbBusiness selectByPrimaryKey(Integer rAccountID);

    int updateByPrimaryKeySelective(RmbBusiness record);

    int updateByPrimaryKey(RmbBusiness record);
}