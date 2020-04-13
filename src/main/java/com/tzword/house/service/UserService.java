package com.tzword.house.service;

import com.tzword.house.mapper.UserMapper;
import com.tzword.house.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.selectUsers();
    }
}
