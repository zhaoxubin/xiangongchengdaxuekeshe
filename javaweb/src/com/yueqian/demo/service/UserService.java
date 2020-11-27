package com.yueqian.demo.service;

import com.yueqian.demo.bin.UserInfo;

public interface UserService {
    boolean login(UserInfo userInfo);
    boolean regist(UserInfo userInfo);
}
