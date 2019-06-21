package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Integer resourceID);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer resourceID);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}