<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-04
  Date: 14/11/18
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update data</title>
</head>
<body>

<form method="post" action="<c:out value="Edit"/>" >
    <tr>
        <td>Name</td>
        <td><input type="text" name="name"  /></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><input type="number" name="age"/></td>
        <input type =hidden name ="id" value="${id}">
    </tr>
    <input type =submit value="Update">
</form>
</body>
</html>
