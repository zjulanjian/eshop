package com.bj186.fms.service;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.pojo.Fund;

import java.util.List;

public interface FundService {

    //查询所有的基金
    List<Fund> selectAll();
}
