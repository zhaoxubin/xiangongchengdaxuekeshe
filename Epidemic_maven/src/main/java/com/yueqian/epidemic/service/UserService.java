package com.yueqian.epidemic.service;

import com.yueqian.epidemic.bean.UserInfo;
import org.springframework.stereotype.Component;


public interface UserService {
    UserInfo login(UserInfo userInfo);
}
