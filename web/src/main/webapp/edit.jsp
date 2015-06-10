<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="pageBean" class="data.Page" scope="request"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Редактирование страницы</title>
</head>
<body>
<form action="control" accept-charset="utf-8">
    <p>
        <input type="hidden" name="operation" value="editwrite">
        <%--<input type="hidden" name="id" value="<%= request.getParameter("id") %>">--%>
        <input type="hidden" name="id" value=<jsp:getProperty name="pageBean" property="id"/>>
    <table>
        <tr>
            <td>Parentid(раздел):</td>
            <td><input name="parentid" VALUE=<jsp:getProperty name="pageBean" property="parentid"/>><br></td>
        </tr>

        <tr>
            <td>user:</td>
            <td><input name="user" VALUE=<jsp:getProperty name="pageBean" property="user"/>></td>
        </tr>

        <tr>
            <td>date:</td>
            <td><input name="date" VALUE=<jsp:getProperty name="pageBean" property="date"/>></td>
        </tr>

        <tr>
            <td>title:</td>
            <td><input name="title" VALUE=<jsp:getProperty name="pageBean" property="title"/>></td>
        </tr>

        <tr>
            <td>title4menu:</td>
            <td><input name="title4menu" VALUE=<jsp:getProperty name="pageBean" property="title4menu"/>></td>
        </tr>
        <tr>
            <td valign="top">maintext:</td>
            <td><textarea rows="15" cols="80" name="maintext"><jsp:getProperty name="pageBean" property="maintext"/></textarea></td>
        </tr>
    </table>
    <input type="submit">
    </p>
</form>
</body>
</html>