package com.spring.yxd.user.utils;

import java.util.Random;

/**
 * Created by 杨贤达
 * 2018/6/16 17:51
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间戳 + 随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
