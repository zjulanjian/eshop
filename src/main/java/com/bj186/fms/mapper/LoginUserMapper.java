package com.bj186.fms.mapper;

import com.bj186.fms.pojo.LoginUser;

public interface LoginUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(LoginUser record);

    int insertSelective(LoginUser record);

    LoginUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(LoginUser record);

    int updateByPrimaryKey(LoginUser record);
}