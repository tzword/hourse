package com.tzword.house.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author jianghy
 * @Description: 邮件服务
 * @date 2020/8/3 10:43
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    public void sendMail(String title, String text, String email, String ccEmail){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //发送的主题
        simpleMailMessage.setSubject(title);
        //发送的账号
        simpleMailMessage.setFrom(from);
        //抄送的账号
//        simpleMailMessage.setCc(ccEmail);
        //接收的账号
        simpleMailMessage.setTo(email);
        //发送的内容
        simpleMailMessage.setText(text);
        javaMailSender.send(simpleMailMessage);
        System.out.println("发送成功");
    }

}
