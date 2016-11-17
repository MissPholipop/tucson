package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.Sally;
@Resource
public interface SallyMapper {
    int deleteByPrimaryKey(Integer salId);

    int insert(Sally record);

    int insertSelective(Sally record);

    Sally selectByPrimaryKey(Integer salId);

    int updateByPrimaryKeySelective(Sally record);

    int updateByPrimaryKey(Sally record);
}