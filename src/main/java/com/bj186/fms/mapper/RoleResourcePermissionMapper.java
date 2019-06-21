package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RoleResourcePermission;

public interface RoleResourcePermissionMapper {
    int deleteByPrimaryKey(Integer rrPermissionID);

    int insert(RoleResourcePermission record);

    int insertSelective(RoleResourcePermission record);

    RoleResourcePermission selectByPrimaryKey(Integer rrPermissionID);

    int updateByPrimaryKeySelective(RoleResourcePermission record);

    int updateByPrimaryKey(RoleResourcePermission record);
}