<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/5/18
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
<a href="add.jsp">新增</a>
<form action="" method="post">
    <input name="username" placeholder="用户名">
    <input type="submit" name="查询">
</form>
<table>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="row">
        <tr>
            <td>${row.username}</td>
            <td>${row.password}</td>
            <td><a href="selectByID?id=${row.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
