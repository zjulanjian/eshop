package com.bj186.fms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.entity.PurchasedFunds;
import com.bj186.fms.mapper.FundMapper;
import com.bj186.fms.mapper.UserFundOrderMapper;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.pojo.UserFundOrder;
import com.bj186.fms.service.FundService;
import com.bj186.fms.utils.CommonUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("fundService")
public class FundServiceImpl implements FundService {

    @Resource
    private FundMapper fundMapper;
    @Resource
    private UserFundOrderMapper userFundOrderMapper;

    @Override
    public List<Fund> selectAll() {
        return fundMapper.selectAll();
    }

    @Override
    public List<Fund> selectFundsByPage(Map<String,Object> map) {
        return fundMapper.selectFundsByPage(map);
    }

    @Override
    public List<PurchasedFunds> selectPurchasedFundsByPage(Map<String,Object> map) {
        return fundMapper.selectPurchasedFundsByPage(map);
    }

    @Override
    public JSONObject selectFundsByPage(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
       return null;
    }

    @Override
    public Fund selectFundByID(Integer fundID) {
        return fundMapper.selectFundByID(fundID);
    }

    @Override
    public synchronized Integer insertUserFundOrder(Map<String, Object> map) {
        return userFundOrderMapper.insertUserFundOrder(map);
    }

    @Override
    public Integer selectOrderByUserID(Integer userID) {
        return userFundOrderMapper.selectOrderByUserID(userID);
    }

    @Override
    public UserFundOrder selectFundOrderByID(Integer uFundOrderID) {
        return userFundOrderMapper.selectByPrimaryKey(uFundOrderID);
    }

    @Override
    public void updateFundOrder(UserFundOrder userFundOrder) {
        userFundOrderMapper.updateByPrimaryKey(userFundOrder);
    }

}
