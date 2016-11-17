package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.TechCls;
@Resource
public interface TechClsMapper {
    int deleteByPrimaryKey(Integer teachClsId);

    int insert(TechCls record);

    int insertSelective(TechCls record);

    TechCls selectByPrimaryKey(Integer teachClsId);

    int updateByPrimaryKeySelective(TechCls record);

    int updateByPrimaryKey(TechCls record);
}