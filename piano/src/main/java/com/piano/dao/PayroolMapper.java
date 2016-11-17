package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.Payrool;
@Resource
public interface PayroolMapper {
    int deleteByPrimaryKey(Integer sallyId);

    int insert(Payrool record);

    int insertSelective(Payrool record);

    Payrool selectByPrimaryKey(Integer sallyId);

    int updateByPrimaryKeySelective(Payrool record);

    int updateByPrimaryKey(Payrool record);
}