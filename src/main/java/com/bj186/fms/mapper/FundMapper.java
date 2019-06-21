package com.bj186.fms.mapper;

import com.alibaba.fastjson.JSONObject;
import com.bj186.fms.pojo.Fund;

import java.util.List;
import java.util.Map;

public interface FundMapper {
    int deleteByPrimaryKey(Integer fundID);

    int insert(Fund record);

    int insertSelective(Fund record);

    Fund selectByPrimaryKey(Integer fundID);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);

    List<Fund> selectAll();

    List<JSONObject> selectFundsByPage(Map<String, Object> map);
}