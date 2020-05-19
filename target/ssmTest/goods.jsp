<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangli
  Date: 2020-05-14
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>商品名</th>
        <th>商品类型</th>
        <th>售出价格</th>
        <th>售入价格</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="row">
        <tr>
            <td>${row.goods_name}</td>
            <td>${row.goods_type}</td>
            <td>${row.buy_price}</td>
            <td>${row.sell_price}</td>
            <td><a href="./delById?id=${row.goods_id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
