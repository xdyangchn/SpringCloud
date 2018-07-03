package com.spring.yxd.user.enums;

import lombok.Getter;

/**
 * Created by 杨贤达
 * 2018/6/16 19:19
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1, "登录失败"),
    ROLE_ERROR(2, "角色权限有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
