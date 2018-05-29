<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/25
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>

    ${errorMsg}
    <form href="/login" method="post">
        用户名:<input type="text" name="username">
        <br>
        密码:<input type="password" name="password">
        <br>
        <input type="submit">
    </form>
</body>
</html>
