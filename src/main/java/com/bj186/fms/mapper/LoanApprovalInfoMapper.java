package com.bj186.fms.mapper;

import com.bj186.fms.pojo.LoanApprovalInfo;

public interface LoanApprovalInfoMapper {
    int insert(LoanApprovalInfo record);

    int insertSelective(LoanApprovalInfo record);
}