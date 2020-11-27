package com.yueqian.demo;

import java.sql.*;
import java.util.Scanner;

public class Main {
    //1导入依赖jar包

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.next();
        System.out.println("请输入密码");
        String password = scan.next();
        UserService userService = new UserService();
        userService.jdbcMethod(password,username);
    }

}

