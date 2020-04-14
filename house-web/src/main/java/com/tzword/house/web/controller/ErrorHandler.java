package com.tzword.house.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 通过异常拦截器对错误进行拦截
 * 如果不设置拦截器（404页面，500页面直接把页面放在resource/templates/下面就可以直接跳转过去）
 */
@ControllerAdvice
public class ErrorHandler {
    public static final Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @ExceptionHandler(value = {Exception.class,RuntimeException.class})
    public String error500(HttpServletRequest request,Exception e){
        logger.error(e.getMessage(),e);
        logger.error(request.getRequestURL()+" 500");
        return "error/500";
    }
}
