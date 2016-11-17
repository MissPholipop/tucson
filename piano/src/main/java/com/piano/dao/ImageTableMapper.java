package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.ImageTable;
@Resource
public interface ImageTableMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ImageTable record);

    int insertSelective(ImageTable record);

    ImageTable selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ImageTable record);

    int updateByPrimaryKey(ImageTable record);
}