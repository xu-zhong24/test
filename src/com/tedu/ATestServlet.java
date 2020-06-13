package com.tedu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ATestServlet")
public class ATestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
}
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out=response.getWriter();


        System.out.println("ATestServlet.doGet()...");
        //往request对象的map集合存入数据
        request.setAttribute("name","刘德华");
        /*
        将请求转发给ATestServlet.由ATestServlet进行响应。需要注意的是
        （1)进行转发的两个资源（A和B)必须属于同一个web应用，否则转发会失败！
        (2)转发的路劲中不能出现当前web应用的访问路劲，因为服务器会帮我们加上
        （3）因为转发时的路劲中不能出现当前的web应用的访问路劲，因为服务器只会创建一个request
        ATestServlet：http://localhost:8080/day10/ATestServlet
         BTestServlet:http://loacalhost:8080/day10/BTestServlet
         */


