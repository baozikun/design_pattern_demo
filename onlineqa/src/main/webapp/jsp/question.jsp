<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/28
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>我要提问</h2>
<div>
    <a href="/">返回首页</a>
</div>
<div>
    <form action="${ctx}/question/add" method="post">
        问题： <input type="text" name="title"><br>
        问题描述： <textarea name="detailDesc"></textarea><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
