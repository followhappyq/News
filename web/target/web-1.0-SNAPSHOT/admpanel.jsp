<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="pageBean" class="data.Page" scope="request"/>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<jsp:include page="/page">
  <jsp:param name="sect" value="${param.sect}"/>
  <jsp:param name="subsect" value="${param.subsect}"/>
</jsp:include>
<fmt:requestEncoding value="UTF-8"/>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Заголовок страницы -->
  <title>
    <jsp:getProperty name="pageBean" property="title"/>
  </title>
</head>

<body>
<table width="100%" cellspacing="0" cellpadding="10" border="0">
  <tr>
    <td width="100%">
      <!-- Шапка сайта -->
      <h1 align="center">NEWS</h1>
    </td>
  </tr>
</table>

<table width="100%" cellspacing="0" cellpadding="10" border="0">
  <tr>
    <td width="25%" valign="bottom">
      <!-- "На главную" -->
      <ul><li><a href=\>На главную</a></li></ul>
    </td>
    <td width="75%" align="right" valign="top" colspan="2">
      <!-- Поле авторизации -->
      <jsp:include page="authoriz.jsp"></jsp:include><br>
      ROOT ACCEPTED
    </td>
  </tr>

  <tr>
    <td width="25%" valign="top">
      <!-- Поле менюшки -->
      <jsp:include page="/menu">
        <jsp:param name="sect" value="main"/>
      </jsp:include>
      <ul>
        <core:forEach var="page1" items="${result}">
          <li>
            <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>><core:out value="${page1.title4menu}"/></a>
            <font size="1">
              <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>&operation=edit>[Edit]</a>
              <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>&operation=delete>[Delete]</a>
            </font>
          </li>
          <jsp:include page="/menu">
            <jsp:param name="sect" value="${page1.id}"/>
          </jsp:include>
          <ul>
            <core:forEach var="page2" items="${result}">
              <li>
                <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>&subsect=<core:out value="${page2.id}"/>><core:out value="${page2.title4menu}"/></a>
                <font size="1">
                  <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>&subsect=<core:out value="${page2.id}"/>&operation=edit>[Edit]</a>
                  <a href=\admpanel.jsp?sect=<core:out value="${page1.id}"/>&subsect=<core:out value="${page2.id}"/>&operation=delete>[Delete]</a>
                </font>
              </li>
            </core:forEach>
          </ul>
        </core:forEach>
      </ul>
    </td>

    <td width="65%" align="left" valign="top">
      <!-- Поле основного текста --->
      <core:choose>
        <core:when test="${param.operation.equals('edit')}">
          <jsp:include page="/edit.jsp"/>
        </core:when>
        <core:when test="${param.operation.equals('delete')}">
          <jsp:forward page="/control"/>
        </core:when>
        <core:otherwise>
          <p align="center"><h2><jsp:getProperty name="pageBean" property="title"/></h2></p>
          <p><jsp:getProperty name="pageBean" property="maintext"/></p>
          <br><p align="right"><i><jsp:getProperty name="pageBean" property="date"/> - <jsp:getProperty name="pageBean" property="user"/></i></p>
        </core:otherwise>
      </core:choose>
    </td>

    <td width="10%" align="left" valign="top">
      <!-- Пустое поле -->
      <core:import url="empty.html" charEncoding="UTF-8"/>
    </td>
  </tr>
</table>
</body>

</html>