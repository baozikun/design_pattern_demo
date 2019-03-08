
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="${ctx}/user/login" method="post">
    <table>
        <thead>用户登陆</thead>
        <tr>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td colspan="">
                <input type="submit" value="登陆">
                <input type="button" value="注册" id="sign">
            </td>
        </tr>
    </table>
</form>
<script src="${ctx}/static/jquery/jquery-3.3.1.js"></script>
<script>
    $(function () {
        $('#sign').click(function () {
            window.location = "${ctx}/jsp/sign.jsp"
        })
    })
</script>
</body>
</html>
