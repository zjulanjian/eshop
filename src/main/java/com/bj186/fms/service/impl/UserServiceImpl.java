package com.bj186.fms.service.impl;

import com.bj186.fms.mapper.UserMapper;
import com.bj186.fms.pojo.User;
import com.bj186.fms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String selectTransactionPassword(Integer userID) {
        return userMapper.selectByPrimaryKey(userID).getTransactionPassword();
    }

    @Override
    public String selectUserNameByID(Integer userID) {
        return userMapper.selectByPrimaryKey(userID).getUsername();
    }

    @Override
    public User selectUserByID(Integer userID) {
        return userMapper.selectByPrimaryKey(userID);
    }

    @Override
    public synchronized Integer updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
