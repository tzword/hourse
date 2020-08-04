package com.tzword.house.web.intercepor;

import com.tzword.house.common.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author jianghy
 * @Description: 用户拦截器
 * @date 2020/8/4 14:52
 */
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String reqUri = httpServletRequest.getRequestURI();
        if (reqUri.startsWith("/static") || reqUri.startsWith("/error")){
            return true;
        }
        HttpSession session = httpServletRequest.getSession(true);
        User user = (User) session.getAttribute("loginUser");
        if (user != null){
            UserContext.setUser(user);
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        UserContext.remove();
    }
}
