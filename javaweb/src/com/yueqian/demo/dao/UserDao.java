package com.yueqian.demo.dao;

import com.yueqian.demo.bin.UserInfo;

public interface UserDao {
    boolean login(UserInfo userInfo);
    boolean regist(UserInfo userInfo);
}
