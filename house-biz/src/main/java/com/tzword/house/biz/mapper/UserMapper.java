package com.tzword.house.biz.mapper;

import com.tzword.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUsers();
}
