package com.bj186.crm.mapper;

import com.bj186.crm.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orderdetailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orderdetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}