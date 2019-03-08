<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    卡号：${account.cardNo} <a href="${ctx}/account/loginOut">退出</a>
</div>
<div>
    <div>
        <div><a href="${ctx}/account/balance/${account.cardNo}">查询余额</a></div>
        <div><a href="${ctx}/account/transferTo">转账</a></div>
        <div><a href="${ctx}/transactionRecord/index">查询交易记录</a></div>
        <div><a href="">修改密码</a></div>
    </div>
    <div>
        <c:if test="${page eq 'balance'}">
            <jsp:include page="balance.jsp"></jsp:include>
        </c:if>
        <c:if test="${page eq 'transfer'}">
            <jsp:include page="transfer.jsp"></jsp:include>
        </c:if>
        <c:if test="${page eq 'record'}">
            <jsp:include page="record.jsp"></jsp:include>
        </c:if>
    </div>
</div>
</body>
</html>
