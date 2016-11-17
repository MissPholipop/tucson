package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.Roomstate;
@Resource
public interface RoomstateMapper {
    int deleteByPrimaryKey(Integer rStateId);

    int insert(Roomstate record);

    int insertSelective(Roomstate record);

    Roomstate selectByPrimaryKey(Integer rStateId);

    int updateByPrimaryKeySelective(Roomstate record);

    int updateByPrimaryKey(Roomstate record);
}