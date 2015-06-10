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
    <input type="hidden" name="operation" value="registration">
    <input type="hidden" name="role" value="0">
    <tr>
      <td>
        name:
      </td>
      <td>
        <input name="name">
        </select>
      </td>
    </tr>

    <tr>
      <td>
        lastname:
      </td>
      <td>
        <input name="lastname">
      </td>
    </tr>

    <tr>
      <td>
        email:
      </td>
      <td>
        <input name="email">
      </td>
    </tr>

    <tr>
      <td>
        password:
      </td>
      <td>
        <input name="password">
      </td>
    </tr>
  </table>
  <input type="submit" align="middle">
</form>
</body>
</html>