package com.bj186.fms.mapper;

import com.bj186.fms.pojo.CompanyCertification;

public interface CompanyCertificationMapper {
    int deleteByPrimaryKey(Integer cCertificationID);

    int insert(CompanyCertification record);

    int insertSelective(CompanyCertification record);

    CompanyCertification selectByPrimaryKey(Integer cCertificationID);

    int updateByPrimaryKeySelective(CompanyCertification record);

    int updateByPrimaryKey(CompanyCertification record);
}