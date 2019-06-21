package com.bj186.fms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.mapper.FundMapper;
import com.bj186.fms.pojo.Fund;
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

    @Override
    public List<Fund> selectAll() {
        return fundMapper.selectAll();
    }

    @Override
    public List<JSONObject> selectFundsByPage(Map<String,Object> map) {
        return fundMapper.selectFundsByPage(map);
    }

    @Override
    public JSONObject selectFundsByPage(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
       /* int count = fundMapper.countFund(jsonObject);
        List<JSONObject> list = fundMapper.selectFundsByPage2(jsonObject);
        return CommonUtil.successPage(jsonObject, list, count);*/
       return null;
    }
}
