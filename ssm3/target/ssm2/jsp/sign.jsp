
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="${ctx}/user/sign" method="post">
    <table>
        <thead>用户注册</thead>
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
                <input type="submit" value="确认">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
