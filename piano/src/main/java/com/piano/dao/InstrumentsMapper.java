package com.piano.dao;

import javax.annotation.Resource;

import com.piano.entity.Instruments;
@Resource
public interface InstrumentsMapper {
    int deleteByPrimaryKey(Integer insId);

    int insert(Instruments record);

    int insertSelective(Instruments record);

    Instruments selectByPrimaryKey(Integer insId);

    int updateByPrimaryKeySelective(Instruments record);

    int updateByPrimaryKeyWithBLOBs(Instruments record);

    int updateByPrimaryKey(Instruments record);
}