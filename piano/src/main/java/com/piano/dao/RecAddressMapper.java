package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.RecAddress;
@Resource
public interface RecAddressMapper {
    int deleteByPrimaryKey(Integer adrId);

    int insert(RecAddress record);

    int insertSelective(RecAddress record);

    RecAddress selectByPrimaryKey(Integer adrId);

    int updateByPrimaryKeySelective(RecAddress record);

    int updateByPrimaryKey(RecAddress record);
}