package com.tzword.house.web.intercepor;

import com.tzword.house.common.model.User;

/**
 * @author jianghy
 * @Description: theadlocal
 * @date 2020/8/4 16:47
 */
public class UserContext {
    private static final ThreadLocal<User> USER_THREAD_LOCAL = new ThreadLocal<>();

    public static void setUser(User user){
        USER_THREAD_LOCAL.set(user);
    }

    public static void getUser(){
        USER_THREAD_LOCAL.get();
    }

    public static void remove(){
        USER_THREAD_LOCAL.remove();
    }
}
