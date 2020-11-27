package com.yueqian.epidemic.service.impl;

import com.yueqian.epidemic.bean.UserInfo;
import com.yueqian.epidemic.mapper.UserMapper;
import com.yueqian.epidemic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserInfo login(UserInfo userInfo) {
        UserInfo loginedUser = userMapper.login(userInfo);
        return loginedUser;
    }
}
