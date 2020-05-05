package com.tzword.house.web.controller;

import com.tzword.house.common.model.User;
import com.tzword.house.biz.service.UserService;
import com.tzword.house.common.result.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/register")
    public String register(User user){
        ResultMsg validate = UserHelper.validate(user);
        return null;
    }
}
