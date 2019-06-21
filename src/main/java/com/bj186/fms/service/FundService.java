package com.bj186.fms.service;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.pojo.Fund;

import java.util.List;
import java.util.Map;

public interface FundService {

    //查询所有的基金
    List<Fund> selectAll();

    //查询一页基金
    List<JSONObject> selectFundsByPage(Map<String,Object> map);

    //查询一页基金
    JSONObject selectFundsByPage(JSONObject jsonObject);

}
