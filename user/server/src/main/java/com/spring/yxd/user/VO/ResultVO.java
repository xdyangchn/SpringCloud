package com.spring.yxd.user.VO;

import lombok.Data;

/**
 * Created by 杨贤达
 * 2018/6/16 19:48
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
