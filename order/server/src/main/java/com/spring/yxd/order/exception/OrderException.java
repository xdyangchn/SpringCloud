package com.spring.yxd.order.exception;

import com.spring.yxd.order.enums.ResultEnum;

/**
 * Created by 杨贤达
 * 2018/6/16 19:16
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
