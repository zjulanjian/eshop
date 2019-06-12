package com.bj186.crm.mapper;

import com.bj186.crm.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}