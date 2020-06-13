<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: time  guoke
  Date: 2020/6/12
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--jsp表达式符号(可以写java代码，但是不能写以分号结尾的语句
jsp表达式中可以书写；常量，变量，表达式
作用：计算表达式，将计算的结果输出到浏览器中
-->
<%= new Date() %>
<%= 100+123%>
<%="Hello"%>
<hr/>

<!--2.脚本片段（可以书写若干java语句）
作用是；是在翻译后的servlet中，将脚本中的java语句复制粘贴到Servlet中对应的位置执行！
-->
<%
  for(int i=0;i<5;i++){
      System.out.println("hello,jsp...");

  }
%>

 <% for(int i=0;i<5;i++){%>

 Hello jsp~~~~<br/>
<% } %>

<hr/>
<!--3.jsp注释-->

<%--
 <%   out.write("aaaaa<br/>");//第一行被JSP注释给注释了，JSP注释的内容不会参与翻译，也不会执行，更不会发送给浏览器，也不会在浏览器上显示。
--%>

<%// out.write("bbbbb<br/>"); %>//第二行被Java注释给注释了，放在脚本片段中的内容会参与翻译，会将其中的Java代码复制到翻译后的Servlet中，但由于代码被注释了，所以不会执行，也不会发送给浏览器，更不会在浏览器上显示。

<!--
<% out.write("ccccc<br/>"); %>//浏览器对于hml内容没有显示第三行被html注释给注释了，html注释在JSP中是模板元素，注释本身会发送给浏览器，注释中的脚本片段会参与翻译，其中的java代码也会执行，也会将内容（ccccc）发送给浏览器，但由于发送到浏览器后的ccccc被html注释包裹，因此也不会显示在浏览器上。
-->





</body>
</html>
