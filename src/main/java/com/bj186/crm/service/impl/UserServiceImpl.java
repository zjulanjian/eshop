package com.bj186.crm.service.impl;

import com.bj186.crm.mapper.UserMapper;
import com.bj186.crm.pojo.User;
import com.bj186.crm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUserById(Integer uid) {

        return userMapper.selectByPrimaryKey(uid);
    }
}
