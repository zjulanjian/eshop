package com.bj186.fms.mapper;

import com.bj186.fms.pojo.LoginUserInfo;

public interface LoginUserInfoMapper {
    int insert(LoginUserInfo record);

    int insertSelective(LoginUserInfo record);
}