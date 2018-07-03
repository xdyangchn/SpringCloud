package com.spring.yxd.product.exception;

import com.spring.yxd.product.enums.ResultEnum;

/**
 * Created by 杨贤达
 * 2018/6/17 18:35
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
