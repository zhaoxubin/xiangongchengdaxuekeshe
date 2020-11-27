package com.yueqian.demo;
/*
* 进行业务逻辑处理,创建UserDao对象，调用对象方法
* */
public class UserService {
    public void jdbcMethod(String username, String password){
        UserDao userDao = new UserDao();
        userDao.jdbcMethod(username,password);
    }
}
