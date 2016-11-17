package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.OrderDesc;
@Resource
public interface OrderDescMapper {
    int deleteByPrimaryKey(Integer detailId);

    int insert(OrderDesc record);

    int insertSelective(OrderDesc record);

    OrderDesc selectByPrimaryKey(Integer detailId);

    int updateByPrimaryKeySelective(OrderDesc record);

    int updateByPrimaryKey(OrderDesc record);
}