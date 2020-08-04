package com.tzword.house.web.controller;

import com.tzword.house.common.model.User;
import com.tzword.house.common.result.ResultMsg;
import org.apache.commons.lang3.StringUtils;

public class UserHelper {
    public static ResultMsg validate(User account){
        if (StringUtils.isBlank(account.getEmail())){
            return ResultMsg.errorMsg("邮箱有误");
        }
        return null;
    }
}
