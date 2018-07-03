package com.spring.yxd.order.enums;

import lombok.Getter;

/**
 * Created by 杨贤达
 * 2018/6/16 17:00
 */
@Getter
public enum  PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
