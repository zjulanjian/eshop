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
    <title>userList</title>
</head>
<body>
    ${userList}
        <table border="1">
            <c:forEach items = "${userList}" var="user">
                <tr>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
