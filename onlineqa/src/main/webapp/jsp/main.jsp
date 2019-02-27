<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2019/2/14
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>在线问答</h1>
    <div><a href="">我要提问</a></div>
    <table>
        <thead>
        <tr>
            <th>序号</th>
            <th>问题</th>
            <th>回答次数</th>
            <th>最后修改时间</th>
        </tr></thead>
        <tbody>
        <c:forEach items="${questions}" var="obj" varStatus="status">
           <tr>
               <td>${status.index}</td>
               <td>${obj.title}</td>
               <td>${obj.answerCount}</td>
               <td><fmt:formatDate value="${obj.lastModified}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
           </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
