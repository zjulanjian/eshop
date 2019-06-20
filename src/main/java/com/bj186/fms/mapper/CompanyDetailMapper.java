package com.bj186.fms.mapper;

import com.bj186.fms.pojo.CompanyDetail;

public interface CompanyDetailMapper {
    int insert(CompanyDetail record);

    int insertSelective(CompanyDetail record);
}