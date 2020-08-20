package com.tzword.house.web.controller;

import com.tzword.house.biz.service.MailService;
import com.tzword.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private MailService mailService;

    @RequestMapping("/sendEmail")
    public String sendMail(){
        mailService.sendMail("工作周报20200818","尊敬的领导，附件为本周的工作周报，请查收","328058739@qq.com","328058739@qq.com");
        return "发送成功";
    }

    @RequestMapping("/hello1")
    public void getHello(){
        User user = new User();

        if (null == user.getEmail()){
            throw new IllegalArgumentException();
        }
    }
}
