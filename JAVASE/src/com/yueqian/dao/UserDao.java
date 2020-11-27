package com.yueqian.dao;

import com.yueqian.bean.UserInfo;

/*
* Dao层的接口，持久层
* */
public interface UserDao {
   public void jdbcMethod(String username,String password);
   public void regist(UserInfo userInfo);
}
