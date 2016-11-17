package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.PDesc;
@Resource
public interface PDescMapper {
    int deleteByPrimaryKey(Integer descId);

    int insert(PDesc record);

    int insertSelective(PDesc record);

    PDesc selectByPrimaryKey(Integer descId);

    int updateByPrimaryKeySelective(PDesc record);

    int updateByPrimaryKey(PDesc record);
}