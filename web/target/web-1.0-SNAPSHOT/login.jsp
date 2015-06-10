<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>

<form action="authoriz" align="center" method="post">
    <p>
        <br>Input your login and password<br>
        login:<br><input name="email" placeholder="email"><br>
        password:<br><input type="password" name="password" placeholder="password"><br>
        <br>
        <font color="#dc143c"><core:out value="${message}"></core:out></font><br>
        <a href="index.jsp">Войти без авторизации</a><br>
        <input type="submit">
    </p>
</form>
</body>
</html>