package com.bj186.fms.mapper;

import com.bj186.fms.pojo.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleID);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer userRoleID);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}