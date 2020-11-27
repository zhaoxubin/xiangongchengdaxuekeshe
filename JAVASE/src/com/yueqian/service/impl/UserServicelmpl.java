package com.yueqian.service.impl;


import com.yueqian.bean.UserInfo;
import com.yueqian.dao.UserDao;
import com.yueqian.dao.impl.UserDaolmpl;
import com.yueqian.service.UserSrevice;

/*
* 服务层的接口
* */
public class UserServicelmpl implements UserSrevice {
    @Override
    public void jdbcMethod(String username, String password) {
        UserDao userDao = new UserDaolmpl();
        userDao.jdbcMethod(username,password);
    }

    @Override
    public void regist(UserInfo userInfo) {
        UserDao userDao = new UserDaolmpl();
        userDao.regist(userInfo);
    }
}
