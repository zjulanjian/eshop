package com.bj186.fms.mapper;

import com.bj186.fms.pojo.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String idnumber);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String idnumber);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}