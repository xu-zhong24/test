package com.tedu.req;
/**
 * 测试request 获取请求参数
 * getparameter
 * get parameter
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Servlet")
public class Testparam extends HttpServlet {
    private static final long serialVersionUID = 2721724247960474274L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //获取请求中的用户名（getparameter)
        String user = request.getParameter("user");
        System.out.println("user=" + user);
        //获取请求中的爱好（getparameterValues)
        String[] like = request.getParameterValues("like")
        System.out.println(
                Arrays.toString(like)

        );
        out.write("测试request获取请求参数...");

    }

}
