package com.crxl.qpp.comic2.dao;

import com.crxl.qpp.comic2.entity.Administrators;

public interface AdministratorsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Administrators record);

    int insertSelective(Administrators record);

    Administrators selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Administrators record);

    int updateByPrimaryKey(Administrators record);
}