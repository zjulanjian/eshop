<%--
  Created by IntelliJ IDEA.
  User: James
  Date: 2019/6/10
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %> <!--禁止忽略EL表达式-->

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()+":"
            + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>user</title>
</head>
<body>
    <h2>这是单个用户信息页面</h2>
    <h3 style="color:green;">
    从ModelAndView中获取到的值: ${user} <br/>
    从ModelAttribute中获取到的值: ${girl} <br/>
    利用Session: 从Session中获取到的值: ${sessionScope.get("sessionName")} <br/>
    利用Request: 从Session中获取到的值: ${requestScope.get("sessionName")} <br/>

    </h3>
</body>
</html>
