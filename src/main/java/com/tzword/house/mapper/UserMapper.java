package com.tzword.house.mapper;

import com.tzword.house.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUsers();
}
