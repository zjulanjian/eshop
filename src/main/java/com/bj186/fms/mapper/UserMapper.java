package com.bj186.fms.mapper;

import com.bj186.fms.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userID);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}