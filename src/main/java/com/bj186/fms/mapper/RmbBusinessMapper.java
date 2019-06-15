package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RmbBusiness;

public interface RmbBusinessMapper {
    int deleteByPrimaryKey(Integer raccountid);

    int insert(RmbBusiness record);

    int insertSelective(RmbBusiness record);

    RmbBusiness selectByPrimaryKey(Integer raccountid);

    int updateByPrimaryKeySelective(RmbBusiness record);

    int updateByPrimaryKey(RmbBusiness record);
}