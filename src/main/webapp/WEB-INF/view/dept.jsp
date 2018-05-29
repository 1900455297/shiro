<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/28
  Time: 14:35
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
    <title>dept</title>
</head>
<body>
    <shiro:hasPermission name="department:save">
        <a href="/department/save">部门增加</a>
    </shiro:hasPermission>

    <shiro:hasPermission name="department:delete">
        <a href="/department/delete">部门删除</a>
    </shiro:hasPermission>

    <shiro:hasPermission name="department:update">
        <a href="/department/update">部门修改</a>
    </shiro:hasPermission>
</body>
</html>
