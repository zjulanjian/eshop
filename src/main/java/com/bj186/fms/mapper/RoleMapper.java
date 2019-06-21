package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleID);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleID);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}