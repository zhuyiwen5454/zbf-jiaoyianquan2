package com.zbf.common.exception;

import lombok.Data;

/**
 * @author: LCG
 * 作者: LCG
 * 日期: 2020/9/9  17:45
 * 描述: 这里管理系统中所有的异常的状态
 */

public enum AllStatusEnum {
    //未登录
    NO_LOGIN("未登录",1001)
    //没有权限
    ,NO_AUTH("没有权限",1002)
    //登陆成功
    ,LOGIN_SUCCESS("登录成功",1006)
    //登录失败
    ,LOGIN_FAIRLE("登录失败",1003)
    //登出失败
    ,LOGINOUT_FAIRLE("登出失败",1004)
    //登出成功
    ,LOGINOUT_SUCCESS("登出成功",1005)
    //登陆过期
    ,TOKEN_HAS_EXPIRE("登录已过期，请重新登录",1007);
    ;

    /*信息*/
    private String msg;

    /*信息编码*/
    private int code;

    AllStatusEnum(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
