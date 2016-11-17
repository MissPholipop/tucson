package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.PType;
@Resource
public interface PTypeMapper {
    int deleteByPrimaryKey(Integer pTypeId);

    int insert(PType record);

    int insertSelective(PType record);

    PType selectByPrimaryKey(Integer pTypeId);

    int updateByPrimaryKeySelective(PType record);

    int updateByPrimaryKey(PType record);
}