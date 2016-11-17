package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.UserType;
@Resource
public interface UserTypeMapper {
    int deleteByPrimaryKey(Integer uTypeId);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer uTypeId);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}