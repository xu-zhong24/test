package com.tedu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Servlet2")
public class TestServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //处理响应正文乱码（保证显示在浏览器上中文数据是没有乱码的）
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //处理post提交中文参数乱码问题（保证在获取post提交参数时没有乱码
        request.setCharacterEncoding("utf-8");
        //获取reg.html表单中提交过来的参数
        //1.获取用户名（username)
        String username=request.getParameter("user");
        System.out.println("user"+user);
        //3.获取性别（gender)
        String gender=request.getParameter("gender");
        System.out.println("gender"+gender);
        //获取爱好
        String[] like=request.getParameterValues("like");
        System.out.println(
                Arrays.toString(like)
        );
        //获取城市
        String city=request.getParameter("city");
        System.out.println("city");

        //获取自我描述

    }
}
