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
    <title>登录页面</title>
  </head>
  <body>
  <center>
    <form action="/javaweb/LoginServlet" method="post">
      账号:<input type="text" name="account" placeholder="请输入账号"> <br>
      密码:<input type="password" name="password" placeholder="请输入密码"> <br>
      <input type="submit" value="登录"> <input type="reset">
    </form>
  </center>
  </body>
</html>
