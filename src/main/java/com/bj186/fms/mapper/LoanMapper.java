package com.bj186.fms.mapper;

import com.bj186.fms.pojo.Loan;

public interface LoanMapper {
    int deleteByPrimaryKey(Integer loanid);

    int insert(Loan record);

    int insertSelective(Loan record);

    Loan selectByPrimaryKey(Integer loanid);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}