<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/3
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .left{
            float:left;
        }
        .clearfix::after{
            content: ".";
            display: block;
            height: 0;
            visibility: hidden;
            clear: both;
        }
    </style>
</head>
<body>
<div>
    <div>
        <div>
            问题：${questions.title}
        </div>
        <div>
            问题描述：${questions.detailDesc}
        </div>
    </div>

    <div class="clearfix">
        <div class="left">
            网友的回答：
        </div>
        <div class="left">
            <c:forEach items="${questions.answers}" var="obj">
                <div>
                    <div><fmt:formatDate value="${obj.ansDate}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></div>
                    <div>${obj.ansContent}</div>
                </div>
            </c:forEach>
        </div>
    </div>

    <div class="clearfix">
        <div class="left">我来回答</div>
        <div class="left">
            <form action="" method="post">
                <textarea name="ansContent"></textarea>
                <input type="submit" value="提交答案"><br>
                <a href="${ctx}/">返回首页</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>
