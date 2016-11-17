package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.OrderTable;
@Resource
public interface OrderTableMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderTable record);

    int insertSelective(OrderTable record);

    OrderTable selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderTable record);

    int updateByPrimaryKey(OrderTable record);
}