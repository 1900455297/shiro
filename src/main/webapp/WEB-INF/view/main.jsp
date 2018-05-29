<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/25
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>主页面</h1>
    <a href="/logout">登出</a>
    <br>
    <shiro:hasPermission name="employee:list">
        <a href="/employee/list">员工列表</a>
    </shiro:hasPermission>
    <br>
    <shiro:hasPermission name="department:list">
        <a href="/department/list">部门列表</a>
    </shiro:hasPermission>

</body>
</html>
