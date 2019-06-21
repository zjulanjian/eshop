package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permissionID);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionID);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}