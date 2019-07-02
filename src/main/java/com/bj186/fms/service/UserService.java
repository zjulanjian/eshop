package com.bj186.fms.service;

import com.bj186.fms.pojo.User;


public interface UserService {

    //查询用户的交易密码
    String selectTransactionPassword(Integer userID);

    //根据编号查询用户名
    String selectUserNameByID(Integer userID);

    //查询用户
    User selectUserByID(Integer userID);

    //更新用户数据
    Integer updateUser(User user);
}
