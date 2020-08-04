package com.tzword.house.common.result;

import com.google.common.collect.Maps;

import java.util.Map;

public class ResultMsg {
    public static String errorMsgKey = "errorMsg";
    public static String successMsgKey = "successMsg";

    private String errorMsg;
    private String successMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public boolean isSuccess(){
       return errorMsg == null;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getSuccessMsg() {
        return successMsg;
    }

    public void setSuccessMsg(String successMsg) {
        this.successMsg = successMsg;
    }

    public static ResultMsg errorMsg(String msg){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setErrorMsg(msg);
        return resultMsg;
    }

    public static ResultMsg successMsg(String msg){
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setSuccessMsg(msg);
        return resultMsg;
    }

    public Map<String,String> asMap(){
        Map<String,String> map = Maps.newHashMap();
        map.put(successMsgKey,successMsg);
        map.put(errorMsgKey,errorMsg);
        return map;
    }
}
