<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="control" accept-charset="utf-8">
    <table>
        <input type="hidden" name="operation" value="addwrite">
        <tr>
            <td>
                Категория:
            </td>
            <td>
                <select size="1" name="parentid">
                    <jsp:include page="/menu">
                        <jsp:param name="sect" value="main"/>
                    </jsp:include>
                    <option selected disabled>Выберите категорию</option>
                    <core:forEach var="page" items="${result}">
                        <option value="${page.id}">${page.title}</option>
                    </core:forEach>
                </select>
            </td>
        </tr>

        <tr>
            <td>
                id:
            </td>
            <td>
                <input name="id">
            </td>
        </tr>

        <tr>
            <td>
                user:
            </td>
            <td>
                <input name="user">
            </td>
        </tr>

        <tr>
            <td>
                date:
            </td>
            <td>
                <input name="date">
            </td>
        </tr>

        <tr>
            <td>
                title:
            </td>
            <td>
                <input name="title">
            </td>
        </tr>

        <tr>
            <td>
                title4menu:
            </td>
            <td>
                <input name="title4menu">
            </td>
        </tr>

        <tr>
            <td valign="top">
                maintext:
            </td>
            <td>
                <textarea rows="15" cols="80" name="maintext"></textarea>
            </td>
        </tr>
    </table>
    <input type="submit" align="middle">
</form>
</body>
</html>