<%@ page import="com.dz.model.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c:" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>DisplayData</title>
</head>
<body>

            <form method="get" action="AddData.jsp">
            <input type="submit" value="Add">
            </form>
         <form method="get" action="<c:out value= "Display"/>" >
            <input type="submit" value="show" />
         </form>

            <table>
                <div align="center"></div>
                <caption><h2>List of student</h2></caption>
                <tr>
                    <th>ID     &nbsp;<th>
                    <th>Name   &nbsp;</th>
                    <th>Age    &nbsp; </th>
                    <th>Delete &nbsp;</th>
                    <th>Update &nbsp;</th>

                </tr>

                <c:forEach  items="${studentlist}" var="display">

                  <table>
                    <tr>
                        <td><c:out value="${display.id}" /> </td>
                        <td><c:out value="${display.name}" /></td>
                        <td><c:out value="${display.age}" /></td>

                        <td><a href="/delete?id=<c:out value='${display.id}' />"> Delete</a></td>

                        <td><a href="Update?id=<c:out value='${display.id}' /> ">; Update</a>&nbsp; &nbsp;</td>
                            &nbsp; &nbsp; &nbsp; &nbsp;

                    </tr>
                   </table>
                </c:forEach>



</body>
</html>
