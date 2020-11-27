package com.yueqian.demo.dao.impl;

import com.yueqian.demo.bin.UserInfo;
import com.yueqian.demo.dao.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(UserInfo userInfo) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            //2.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epidemic","root","1234");
            //4.创建sql语句
            String sql = "select * from users where account=? and PASSWORD=?";
            //5.获取执行对象
            ps = conn.prepareStatement(sql);
            //6.使用执行对象给？赋值
            ps.setString(1,userInfo.getCount());
            ps.setString(2,userInfo.getPassword());
            //7.执行语句
            resultSet = ps.executeQuery();
            //8,处理结果
      /*  while(resultSet.next()){


        }*/
            if(resultSet != null && resultSet.next()){
                return true;
            }else{
                return false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //9关闭资源
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public boolean regist(UserInfo userInfo) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epidemic","root","1234");
            String sql = "Insert into users(account,PASSWORD,user_name) values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userInfo.getCount());
            preparedStatement.setString(2,userInfo.getPassword());
            preparedStatement.setString(3,userInfo.getUser_Name());
            int  resultSet = preparedStatement.executeUpdate();
            if(resultSet != 0){
                return true;
            }else{
                return false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
