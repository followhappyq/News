<%--
  Created by IntelliJ IDEA.
  User: ragexe
  Date: 17.05.2015
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<%--<head>--%>
    <%--<title></title>--%>
<%--</head>--%>
<fmt:requestEncoding value="UTF-8"/>
<body>
<core:choose>
  <core:when test="${sessionScope.login == null}">
    Привет, Гость. Чтобы добавить новость, необходимо <a href="login.jsp">авторизоваться</a>
    <br><i><a href="reg.jsp">Регистрация</a></i>
  </core:when>
  <core:otherwise>
    Привет, <core:out value="${sessionScope.login}"/>
    <core:if test="${sessionScope.role == 1}">
      <br><a href="admpanel.jsp">Капитанская рубка</a>
    </core:if>
    <br><i><a href="logout">Выйти</a></i>
  </core:otherwise>
</core:choose>
</body>
</html>
