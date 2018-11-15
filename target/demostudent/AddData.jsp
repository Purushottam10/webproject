<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: dz-gg-04
  Date: 1/11/18
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>AddData</title>
</head>
<body>
            <%-- <form action="AddStudent",method ="get">--%>
                  <form method="get" action="<c:out value="AddStudent"/>" >
                      <input type="submit"value="save" />

        <table>

                        <tr>
                            <td>Name</td>
                            <td><input type="text" name="name"  /></td>
                        </tr>
                            <tr>
                                <td>Age</td>
                                <td><input type="number" name="age"<%-- value="${product.name}"--%> /></td>
                            </tr>

        </table>
                  </form>
                <%--<input type="submit"value="save" />
              </form>--%>
</body>
</html>



