package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.ClsRoom;
@Resource
public interface ClsRoomMapper {
    int deleteByPrimaryKey(Integer roomId);

    int insert(ClsRoom record);

    int insertSelective(ClsRoom record);

    ClsRoom selectByPrimaryKey(Integer roomId);

    int updateByPrimaryKeySelective(ClsRoom record);

    int updateByPrimaryKey(ClsRoom record);
}