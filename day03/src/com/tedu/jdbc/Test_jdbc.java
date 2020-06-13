package com.tedu.jdbc;

import java.sql.*;

public class Test_jdbc {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.注册数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库连接
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8",
                    "root", "root1234");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //3.获取传输器
        Statement stat = null;
        try {
            stat = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //4.发送SQL到服务器执行并返回执行结果
        String sql = "select * from account";
        ResultSet rs = stat.executeQuery( sql );
        //5.处理结果
        while( rs.next() ) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(id+" : "+name+" : "+money);
        }
        //6.释放资源
        rs.close();
        stat.close();
        conn.close();
        System.out.println("TestJdbc.main()....");


    }


}
