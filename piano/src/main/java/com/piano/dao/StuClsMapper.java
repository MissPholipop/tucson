package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.StuCls;
@Resource
public interface StuClsMapper {
    int deleteByPrimaryKey(Integer learnId);

    int insert(StuCls record);

    int insertSelective(StuCls record);

    StuCls selectByPrimaryKey(Integer learnId);

    int updateByPrimaryKeySelective(StuCls record);

    int updateByPrimaryKey(StuCls record);
}