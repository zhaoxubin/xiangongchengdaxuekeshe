package com.yueqian.web;

import com.yueqian.bean.UserInfo;
import com.yueqian.service.impl.UserServicelmpl;
import com.yueqian.service.UserSrevice;

import java.util.Scanner;

/*
* 数据的获取与调用service层
* */
public class Main {
    public static void main(String[] args) {
        //login();
        regist();
    }

    private static void regist() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.next();
        System.out.println("请输入密码");
        String password = scan.next();
        System.out.println("请输入昵称");
        String nikeName = scan.next();
        UserInfo userInfo = new UserInfo();
        userInfo.setCount(username);
        userInfo.setPassword(password);
        userInfo.setUser_Name(nikeName);
        UserSrevice userSrevice = new UserServicelmpl();
        userSrevice.regist(userInfo);
    }

    public static void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.next();
        System.out.println("请输入密码");
        String password = scan.next();
        UserSrevice userSrevice = new UserServicelmpl();
        userSrevice.jdbcMethod(username,password);
    }
}
