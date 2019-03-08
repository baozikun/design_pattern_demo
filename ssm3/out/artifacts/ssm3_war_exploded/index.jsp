<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>个人网上银行</title>
</head>
<body>
<div id="main">
    <form action="${ctx}/account/login" method="post" onsubmit="return check()">
    <h1>个人网上银行</h1>
    卡号：<input type="text" name="cardNo"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录网上银行">
    </form>
</div>
<script src="${ctx}/static/jquery/jquery-3.3.1.js"></script>
<script>
    function check() {
        debugger;
        var cardNo = $('input[name=cardNo]').val();
        if(cardNo.length !== 16){
            alert("卡号长度必须为16位");
            return false;
        }
        var password = $('input[name=password]').val();
        if (password.length !== 6){
            alert("密码长度必须为6位");
            return false;
        }
        return true;
    }

    var errorMsg = '${errorMsg}';
    if (errorMsg != null && errorMsg != undefined && errorMsg != '') {
        alert(errorMsg);
    }
</script>
</body>
</html>
