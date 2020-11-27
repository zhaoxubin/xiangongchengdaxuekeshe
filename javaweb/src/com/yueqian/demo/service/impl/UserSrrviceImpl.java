package com.yueqian.demo.service.impl;

import com.yueqian.demo.bin.UserInfo;
import com.yueqian.demo.dao.UserDao;
import com.yueqian.demo.dao.impl.UserDaoImpl;
import com.yueqian.demo.service.UserService;

public class UserSrrviceImpl implements UserService {

    @Override
    public boolean login(UserInfo userInfo) {
        UserDao userDao = new UserDaoImpl();
        boolean flag = userDao.login(userInfo);
        return flag;
    }

    @Override
    public boolean regist(UserInfo userInfo) {
        UserDao userDao = new UserDaoImpl();
        boolean flag = userDao.regist(userInfo);
        return flag;
    }
}
