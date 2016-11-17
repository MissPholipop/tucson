package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.OrderState;
@Resource
public interface OrderStateMapper {
    int deleteByPrimaryKey(Integer stateId);

    int insert(OrderState record);

    int insertSelective(OrderState record);

    OrderState selectByPrimaryKey(Integer stateId);

    int updateByPrimaryKeySelective(OrderState record);

    int updateByPrimaryKey(OrderState record);
}