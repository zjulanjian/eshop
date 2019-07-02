package com.bj186.fms.service;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.pojo.UserFundOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FundService {

    //查询所有的基金
    List<Fund> selectAll();

    //查询一页基金
    List<JSONObject> selectFundsByPage(Map<String,Object> map);

    //查询一页基金
    JSONObject selectFundsByPage(JSONObject jsonObject);

    //根据ID查询一个基金
    Fund selectFundByID(Integer fundID);

    //插入一条订单
    Integer insertUserFundOrder(Map<String,Object> map);

    //获取订单号
    Integer selectOrderByUserID(Integer userID);

    //根据订单号查询订单
    UserFundOrder selectFundOrderByID(Integer uFundOrderID);
}
