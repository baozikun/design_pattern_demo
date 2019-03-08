<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2018/12/7
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>修改电子文档</title>
</head>
<body>
<form action="${ctx}/entry/update" method="post" id="subForm">
    <input type="hidden" name="categoryId" value="${categoryId}">
    <input type="hidden" name="id" value="${entry.id}">
    <table>
        <thead>
          <tr>
              <th>
                  修改电子文档
              </th>
          </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                文档编号
            </td>
            <td>
                ${entry.id}
            </td>
        </tr>
        <tr>
            <td>文档名称<span>(*)</span></td>
            <td>
                <input type="text" name="title" value="${entry.title}">
            </td>
        </tr>
        <tr>
            <td>文档摘要</td>
            <td>
               <textarea name="summary">
                   ${entry.summary}
               </textarea>
            </td>
        </tr>
        <tr>
            <td>上传人</td>
            <td>
                <input type="text" name="uploadUser" value="${entry.uploadUser}">
            </td>
        </tr>
        <tr>
            <td>上传时间<span>(*)</span></td>
            <td>
                <input type="text" name="createDate" value="<fmt:formatDate value="${entry.createDate}"></fmt:formatDate>">（yyyy-MM-dd）
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
