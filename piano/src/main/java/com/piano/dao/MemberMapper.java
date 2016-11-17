package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.Member;
@Resource
public interface MemberMapper {
    int deleteByPrimaryKey(Integer memId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memId);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKeyWithBLOBs(Member record);

    int updateByPrimaryKey(Member record);
}