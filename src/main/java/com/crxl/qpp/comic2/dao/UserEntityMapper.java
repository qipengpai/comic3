package com.crxl.qpp.comic2.dao;

import com.crxl.qpp.comic2.entity.UserEntity;

public interface UserEntityMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}