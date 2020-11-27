<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/18
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>注册页面</title>
  </head>
  <body>
  <center>
    <form action="/javaweb/RegistServlet" method="post">
      请输入账号:<input type="text" name="account" placeholder="请输入账号"> <br>
      请输入密码:<input type="password" name="password" placeholder="请输入密码"> <br>
      请输入昵称:<input type="text" name="user_name" placeholder="请输入昵称"> <br>
      <input type="submit" value="注册"> <input type="reset">
    </form>
  </center>
  </body>
</html>
