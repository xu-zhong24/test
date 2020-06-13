package com.tedu.req;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "TestScop")
public class TestScope02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        //
        System.out.println("TestScope02.doGet()...");
        //从request对象的map集合中取出数据（数组）
        String[] names=(String[])request.getAttribute("names");
        System.out.println(
                Arrays.toString(names)
        );
        //做出响应
        out.write("测试对象（转发+域对象带数据到目的地...");

    }
}
