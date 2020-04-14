package com.tzword.house.web.controller;

import com.tzword.house.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello1")
    public void getHello(){
        User user = new User();
        if (null == user.getEmail()){
            throw new IllegalArgumentException();
        }
    }
}
