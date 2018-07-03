package com.spring.yxd.product.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by 杨贤达
 * 2018/6/16 13:45
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
