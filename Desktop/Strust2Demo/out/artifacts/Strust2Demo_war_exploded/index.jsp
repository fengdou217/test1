<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/23
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<h1>hello world from struts2</h1>
<form action="loginaction" method="post">

    <input type="text" name="username" placeholder="请输入姓名:"/>
    <input type="password" name="password" placeholder="请输入密码:"/>
    <input type="submit" value="Login"/>
</form>


<%--<s:form action="loginaction" method="post">--%>
<%--    <s:textfield name="username" label="Name" size="20" />--%>
<%--    <s:textfield name="age" label="Age" size="20" />--%>
<%--    <s:submit name="submit" label="Submit" align="center" />--%>
<%--</s:form>--%>
</body>
</html>
