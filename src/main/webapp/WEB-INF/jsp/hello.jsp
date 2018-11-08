<%--
  Created by IntelliJ IDEA.
  User: Major
  Date: 2018/11/8
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%--默认EL表达式的忽略是true的，需要修改为 false--%>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的 jsp 页面</title>

</head>
<body>
网址: <a target="_blank" href="${url}">点击跳转</a>
<p/>
名字: ${name}
<p/>

<img width=317 height=300 src="image/img_09.jpg">


</body>
</html>
