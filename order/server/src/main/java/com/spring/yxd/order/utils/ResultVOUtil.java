package com.spring.yxd.order.utils;

import com.spring.yxd.order.VO.ResultVO;

/**
 * Created by 杨贤达
 * 2018/6/16 19:49
 */
public class ResultVOUtil {

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }
}
