<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/5/18
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
<form action="./addOrUpdate" method="post">
<%--    如果是新增页面,''sring类型能不能转成int类型--%>
    <input type="hidden" name="sid" value="${user.id}">
    <input type="text" name="username" placeholder="用户名" value="${user.username}"/><br/>
    <input type="password" name="password" placeholder="密码" value="${user.password}"><br/>
    <input type="submit">
</form>

</body>
</html>
