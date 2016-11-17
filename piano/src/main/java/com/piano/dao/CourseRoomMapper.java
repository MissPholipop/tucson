package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.CourseRoom;
@Resource
public interface CourseRoomMapper {
    int deleteByPrimaryKey(Integer cRoomId);

    int insert(CourseRoom record);

    int insertSelective(CourseRoom record);

    CourseRoom selectByPrimaryKey(Integer cRoomId);

    int updateByPrimaryKeySelective(CourseRoom record);

    int updateByPrimaryKey(CourseRoom record);
}