package com.spring.yxd.order.enums;

import lombok.Getter;

/**
 * Created by 杨贤达
 * 2018/6/16 16:57
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
