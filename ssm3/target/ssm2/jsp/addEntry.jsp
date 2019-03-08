<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2018/12/7
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加电子文档</title>
</head>
<body>
<form action="${ctx}/entry/add" method="post" id="subForm">
    <input type="hidden" name="categoryId" value="${categoryId}">
    <table>
        <thead>
          <tr>
              <th>
                  增加电子文档
              </th>
          </tr>
        </thead>
        <tbody>
        <tr>
            <td>文档名称<span>(*)</span></td>
            <td>
                <input type="text" name="title">
            </td>
        </tr>
        <tr>
            <td>文档摘要</td>
            <td>
               <textarea name="summary">
               </textarea>
            </td>
        </tr>
        <tr>
            <td>上传人</td>
            <td>
                <input type="text" name="uploadUser">
            </td>
        </tr>
        <tr>
            <td>上传时间<span>(*)</span></td>
            <td>
                <input type="text" name="createDate">（yyyy-MM-dd）
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交" id="subBtn">
                <input type="button" value="返回">
            </td>
        </tr>
        </tbody>
    </table>
</form>
<%--<script src="${ctx}/static/jquery/jquery-3.3.1.js"></script>
<script>
    $(function(){
        $('#subBtn').click(function () {
            //获取表单内容
            var form_submit = document.getElementById("subForm");
            if ("subForm"== null) {
                alert("数据不能为空");
            }
            $("form").submit(function(e){
                alert("数据已提交");
            });

        })
    })
</script>--%>
</body>
</body>
</html>
