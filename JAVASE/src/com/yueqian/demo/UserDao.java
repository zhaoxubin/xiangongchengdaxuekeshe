package com.yueqian.demo;

import java.sql.*;

/*
* 该类负责操作数据库逻辑
* */

public class UserDao {
    public  void jdbcMethod(String username,String password) {
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
            ps.setString(1,username);
            ps.setString(2,password);
            //7.执行语句
            resultSet = ps.executeQuery();
            //8,处理结果
      /*  while(resultSet.next()){


        }*/
            if(resultSet != null && resultSet.next()){
                String account = resultSet.getString(2);
                String passwordStr = resultSet.getString("password");
                String user_name = resultSet.getString("user_name");
                System.out.println(account);
                System.out.println(passwordStr);
                System.out.println(user_name);
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
    }
}
