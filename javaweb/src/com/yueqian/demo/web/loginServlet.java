package com.yueqian.demo.web;

import com.yueqian.demo.bin.UserInfo;
import com.yueqian.demo.service.UserService;
import com.yueqian.demo.service.impl.UserSrrviceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // System.out.println("dopost");
        String account = request.getParameter("account");
        System.out.println(account);
        String password = request.getParameter("password");
        System.out.println(password);
        UserInfo userInfo = new UserInfo();
        userInfo.setCount(account);
        userInfo.setPassword(password);
        UserService userService = new UserSrrviceImpl();
        boolean flag = userService.login(userInfo);
        if(flag){
           // System.out.println("登录成功");
            /*//请求转发
            request.setAttribute("loginedUser",userInfo.getCount());
            request.getRequestDispatcher("/main.jsp").forward(request,response);*/
            //重定向
            HttpSession session =  request.getSession();
            session.setAttribute("loginedUser",userInfo.getCount());
            response.sendRedirect(request.getContextPath() + "/main.jsp");
        }else{
           // System.out.println("登陆失败");
           /* //请求转发
            request.getRequestDispatcher("/login.jsp").forward(request,response);*/
            //重定向
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // System.out.println("doget");
        this.doPost(request,response);
    }
}
