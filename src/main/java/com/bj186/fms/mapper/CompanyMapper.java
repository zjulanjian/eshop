package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer companyID);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer companyID);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}