package com.spring.yxd.user.service.impl;

import com.spring.yxd.user.dataobject.UserInfo;
import com.spring.yxd.user.repository.UserInfoRepository;
import com.spring.yxd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨贤达
 * @date 2018/7/1 18:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository repository;

    /**
     * 通过 openid 来查询用户信息
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
