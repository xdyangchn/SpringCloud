package com.spring.yxd.user.service;

import com.spring.yxd.user.dataobject.UserInfo;

/**
 * @author 杨贤达
 * @date 2018/7/1 18:36
 */
public interface UserService {

    /**
     * 通过 openid 来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
