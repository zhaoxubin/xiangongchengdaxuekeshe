package com.yueqian.service;

import com.yueqian.bean.UserInfo;
import com.yueqian.dao.UserDao;

/*
* 服务层的接口
* */
public interface UserSrevice extends UserDao {
    public void jdbcMethod(String username,String password);

    public void regist(UserInfo userInfo);
}
