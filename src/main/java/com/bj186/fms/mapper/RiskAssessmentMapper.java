package com.bj186.fms.mapper;

import com.bj186.fms.pojo.RiskAssessment;

public interface RiskAssessmentMapper {
    int deleteByPrimaryKey(Integer rAssessmentID);

    int insert(RiskAssessment record);

    int insertSelective(RiskAssessment record);

    RiskAssessment selectByPrimaryKey(Integer rAssessmentID);

    int updateByPrimaryKeySelective(RiskAssessment record);

    int updateByPrimaryKeyWithBLOBs(RiskAssessment record);

    int updateByPrimaryKey(RiskAssessment record);
}